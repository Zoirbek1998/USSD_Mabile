package uz.codemaster.ussdmix.screen

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_data.*
import kotlinx.android.synthetic.main.activity_data.recyclerView
import uz.codemaster.ussdmix.R
import uz.codemaster.ussdmix.model.CategoryModel
import uz.codemaster.ussdmix.utils.Constants
import uz.codemaster.ussdmix.view.adapter.DataListAdapter
import uz.codemaster.ussdmix.view.adapter.DataListener

class DataActivity : AppCompatActivity(), DataListener {

    var extraType = Constants.CATEGORY_INTERNET

    var extraOperatorType = Constants.OPERATOR_BEELINE
    lateinit var items: List<CategoryModel>

    lateinit var adapter: DataListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

      ////////////////Changing back image in activity_data/////////////////
        val constraintLayout2 =
            findViewById<View>(R.id.constraintLayout2) as ConstraintLayout
        ////////////////Changing back image in activity_data/////////////////





        extraType = intent.getIntExtra(Constants.EXTRA_TYPE, Constants.CATEGORY_INTERNET)
        extraOperatorType = intent.getIntExtra(Constants.EXTRA_OPERATOR_TYPE, Constants.OPERATOR_BEELINE)
        items = Constants.getItems(extraOperatorType, extraType)

        getBackgroundImageForDataActivity(extraOperatorType);



        items.forEach {
            tabLayout.addTab(tabLayout.newTab().setText(it.title))
        }

        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }
            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
                adapter = DataListAdapter(items.get(p0?.position!!).items.toMutableList(), extraType, extraOperatorType, this@DataActivity)
                recyclerView.adapter = adapter
            }
        })

        if (items.size == 1){
            tabLayout.visibility = View.GONE
        }

        tvService.text = Constants.getServiceText(extraType)
        imgOperator.setImageResource(Constants.getOperatorImage(extraOperatorType))

        imageView2.setOnClickListener { finish() }

        recyclerView.layoutManager = LinearLayoutManager(this)

        if (items.size > 0) {
            adapter = DataListAdapter(items.get(0).items.toMutableList(), extraType, extraOperatorType,this)
            recyclerView.adapter = adapter
        }

    }

    override fun onClickItem(data: Any) {
        if (permissionCheck()) {
            var fragment = DataDetailFragment()
            fragment.data = data
            fragment.show(supportFragmentManager, "fragment")
        }
    }

    fun permissionCheck(): Boolean{
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 1)
            return false
        }

        return true
    }
    ////////////////Changing back image in activity_data/////////////////
    fun getBackgroundImageForDataActivity(position: Int) {
        constraintLayout2.setBackgroundResource(Constants.getBackgroundImageForDataActivity(position))

        if (Build.VERSION.SDK_INT >= 21) {
            when (position) {
                0 -> UzmobileColor()
                1 -> MobiUzColor()
                2 -> BeelineColor()
                3 -> UcellColor()
                else -> { // Note the block
                    print("sdfsd")
                }
            }

        }


    }
    ////////////////Changing back image in activity_data/////////////////


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
