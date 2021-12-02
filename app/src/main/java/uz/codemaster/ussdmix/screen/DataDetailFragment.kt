package uz.codemaster.ussdmix.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.data_detail_dialog.*
import uz.codemaster.ussdmix.R
import android.content.Intent
import android.net.Uri
import uz.codemaster.ussdmix.model.*


class DataDetailFragment : BottomSheetDialogFragment(){

    lateinit var data: Any

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.data_detail_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        when(data){
            is InternetModel -> {
                val item = data as InternetModel
                tvTitle.text = "${item?.title}\n" +
                        "Hajmi: ${item?.volume}\n" +
                        "Narxi: ${item?.price}\n" +
                        "${item?.comment}"

                cardViewActivation.setOnClickListener {
                    callUSSD(item.ussd)
                }

            }
            is TarifModel -> {
                val item = data as TarifModel
                tvTitle.text = "${item?.title}\n" +
                        "Hajmi: ${item?.volume}\n" +
                        "Narxi: ${item?.price}\n" +
                        "${item?.comment}"

                cardViewActivation.setOnClickListener {
                    callUSSD(item.ussd)
                }

            }
            is MinuteModel -> {
                val item = data as MinuteModel
                tvTitle.text = "${item?.title}\n" +
                        "Hajmi: ${item?.volume}\n" +
                        "Narxi: ${item?.price}\n" +
                        "${item?.comment}"

                cardViewActivation.setOnClickListener {
                    callUSSD(item.ussd)
                }

            }
            is BaseModel -> {
                val item = data as BaseModel
                tvTitle.text = "${item?.title}\n" +
                        "Hajmi: ${item?.volume}\n" +
                        "Narxi: ${item?.price}\n" +
                        "${item?.comment}"

                cardViewActivation.setOnClickListener {
                    callUSSD(item.ussd)
                }

            }
            is AdventageModel -> {
                val item = data as AdventageModel
                tvTitle.text = "${item?.title}\n"

                cardViewActivation.setOnClickListener {
                    callUSSD(item.ussd)
                }

            }
            is ServiceModel -> {
                val item = data as ServiceModel
                tvTitle.text = "${item?.title}\n" +
                        "Narxi: ${item?.price}\n" +
                        "${item?.comment}"

                cardViewActivation.setOnClickListener {
                    callUSSD(item.ussd)
                }

            }
        }
    }

    fun callUSSD(code: String){
        val ussd = code.replace("#", Uri.encode("#"))
        startActivityForResult(Intent("android.intent.action.CALL", Uri.parse("tel:$ussd")), 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1){
            dismiss()
        }
    }
}