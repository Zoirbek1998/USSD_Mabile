package uz.codemaster.ussdmix.screen

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*
import uz.codemaster.ussdmix.BuildConfig
import uz.codemaster.ussdmix.R

import uz.codemaster.ussdmix.utils.Constants
import uz.codemaster.ussdmix.view.SnapCenterListener
import uz.codemaster.ussdmix.view.adapter.OperatorListAdapter
import uz.codemaster.ussdmix.view.adapter.OperatorListener


class MainActivity : AppCompatActivity() {

    val items = mutableListOf(
        R.drawable.uzmobile2,
        R.drawable.ums2,
        R.drawable.beeline2,
        R.drawable.ucell2

    )
    var operator = Constants.OPERATOR_UZMOBILE

    val adapterOperator = OperatorListAdapter(
        items,
        object : OperatorListener {
            override fun onClickItem(index: Int) {

            }

        })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val constraintLayout =
            findViewById<View>(R.id.constraintLayout) as ConstraintLayout

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapterOperator


        recyclerView.addOnScrollListener(SnapCenterListener(object : SnapCenterListener.CenterChangeListener {
            override fun onCenterViewChange(view: View?, position: Int) {
                operator = position
                pagerIndicator.setSelected(position)
                setImgButtonColors(position)
                setBackgroundImages(position)

            }
        }))
        UzmobileColor()
        cardViewInternet.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(Constants.EXTRA_TYPE, Constants.CATEGORY_INTERNET)
            intent.putExtra(Constants.EXTRA_OPERATOR_TYPE, operator)
            startActivity(intent)


        }

        cardViewTarrif.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(Constants.EXTRA_TYPE, Constants.CATEGORY_TARIF)
            intent.putExtra(Constants.EXTRA_OPERATOR_TYPE, operator)
            startActivity(intent)
        }

        cardViewMinutes.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(Constants.EXTRA_TYPE, Constants.CATEGORY_MINUTES)
            intent.putExtra(Constants.EXTRA_OPERATOR_TYPE, operator)
            startActivity(intent)
        }

        cardViewSMS.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(Constants.EXTRA_TYPE, Constants.CATEGORY_SMS)
            intent.putExtra(Constants.EXTRA_OPERATOR_TYPE, operator)
            startActivity(intent)
        }

        cardViewAdven.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(Constants.EXTRA_TYPE, Constants.CATEGORY_ADVEN)
            intent.putExtra(Constants.EXTRA_OPERATOR_TYPE, operator)
            startActivity(intent)
        }

        cardViewServices.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(Constants.EXTRA_TYPE, Constants.CATEGORY_SERVICES)
            intent.putExtra(Constants.EXTRA_OPERATOR_TYPE, operator)
            startActivity(intent)
        }

        imgShare.setOnClickListener {
            val shareBody = "USSD so'rovlar https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID
            val sharingIntent = Intent(android.content.Intent.ACTION_SEND)
            sharingIntent.type = "text/plain"
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Do'stim bilan ulashish")
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody)
            startActivity(
                Intent.createChooser(
                    sharingIntent, "Do'stim bilan ulashish"

                )
            )
        }

        cardViewBalance.setOnClickListener {
            when(operator){
                Constants.OPERATOR_BEELINE -> callUSSD("*102#")
                Constants.OPERATOR_UZMOBILE -> callUSSD("*107#")
                Constants.OPERATOR_UCELL -> callUSSD("*100#")
                Constants.OPERATOR_UMS -> callUSSD("*100#")
//                Constants.OPERATOR_PERFECTUM -> callUSSD("9*1")
            }
        }


        cardViewTraffic.setOnClickListener {
            when(operator){
                Constants.OPERATOR_BEELINE -> callUSSD("*103#")
                Constants.OPERATOR_UZMOBILE -> callUSSD("*107#")
                Constants.OPERATOR_UCELL -> callUSSD("*107#")
                Constants.OPERATOR_UMS -> callUSSD("*102#")
//                Constants.OPERATOR_PERFECTUM -> callUSSD("9*6")
            }
        }

        setImgButtonColors(0)

    }
//    private fun onSetRecyclerView() {
//
//        val layoutManager =
//            CenterZoomLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.adapter
//        // Scroll to the position we want to snap to
//        layoutManager.scrollToPosition(4 / 2)
//        // Wait until the RecyclerView is laid out.
//        recyclerView.post { // Shift the view to snap  near the center of the screen.
//            // This does not have to be precise.
//            val dx = (recyclerView.width - recyclerView.getChildAt(0).width) / 2
//            recyclerView.scrollBy(-dx, 0)
//            // Assign the LinearSnapHelper that will initially snap the near-center view.
//            val snapHelper = LinearSnapHelper()
//            snapHelper.attachToRecyclerView(recyclerView)
//        }
//    }
    fun callUSSD(code: String){
        if (permissionCheck()) {
            val ussd = code.replace("#", Uri.encode("#"))
            startActivityForResult(Intent("android.intent.action.CALL", Uri.parse("tel:$ussd")), 1)
        }
    }
///////////Changing back image and color of statusbar and navbar////////////////////////////////////
    fun setBackgroundImages(position: Int){

    constraintLayout.setBackgroundResource(Constants.getBackgroundImage(position))




    if (Build.VERSION.SDK_INT >= 21) {
        when (position) {
            0 -> UzmobileColor()
            1 -> MobiUzColor()
            2 -> BeelineColor()
            3 -> UcellColor()
            else -> { // Note the block
               print("Android versiyasi yetarli emas")
            }
        }

    }
}

///////////Changing back image and color of statusbar and navbar////////////////////////////////////

    fun setImgButtonColors(position: Int){

        val fadein =AnimationUtils.loadAnimation(applicationContext, R.anim.fadein)
        cardViewInternet.setAnimation(fadein)
        cardViewTarrif.setAnimation(fadein)
        cardViewMinutes.setAnimation(fadein)
        cardViewSMS.setAnimation(fadein)
        cardViewAdven.setAnimation(fadein)
        cardViewServices.setAnimation(fadein)

        imgInternet.setColorFilter(ContextCompat.getColor(this@MainActivity, Constants.getOperatorColors(position)))
        imgTariff.setColorFilter(ContextCompat.getColor(this@MainActivity, Constants.getOperatorColors(position)))
        imgMinutes.setColorFilter(ContextCompat.getColor(this@MainActivity, Constants.getOperatorColors(position)))
        imgSMS.setColorFilter(ContextCompat.getColor(this@MainActivity, Constants.getOperatorColors(position)))
        imgAdven.setColorFilter(ContextCompat.getColor(this@MainActivity, Constants.getOperatorColors(position)))
        imgService.setColorFilter(ContextCompat.getColor(this@MainActivity, Constants.getOperatorColors(position)))
        cardViewTraffic.setCardBackgroundColor(ContextCompat.getColor(this, Constants.getOperatorColors(position)))
        cardViewBalance.setCardBackgroundColor(ContextCompat.getColor(this, Constants.getOperatorColors(position)))
    }


    fun permissionCheck(): Boolean{
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 1)
            return false
        }

        return true
    }

    fun MobiUzColor(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setNavigationBarColor(ContextCompat.getColor(applicationContext, R.color.c_ums))
            window.setStatusBarColor(ContextCompat.getColor(applicationContext, R.color.c_ums))
        };
    }
    fun BeelineColor(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setNavigationBarColor(ContextCompat.getColor(applicationContext, R.color.c_beeline))
            window.setStatusBarColor(ContextCompat.getColor(applicationContext, R.color.c_beeline))
        };
    }

    fun UzmobileColor(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setNavigationBarColor(ContextCompat.getColor(applicationContext, R.color.c_uzmobile))
            window.setStatusBarColor(ContextCompat.getColor(applicationContext, R.color.c_uzmobile))
        };
    }
    fun UcellColor(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setNavigationBarColor(ContextCompat.getColor(applicationContext, R.color.c_ucell))
            window.setStatusBarColor(ContextCompat.getColor(applicationContext, R.color.c_ucell))
        };
    }
}
