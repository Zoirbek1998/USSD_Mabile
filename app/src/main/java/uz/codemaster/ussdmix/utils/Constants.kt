package uz.codemaster.ussdmix.utils

import uz.codemaster.ussdmix.R
import uz.codemaster.ussdmix.model.*

class Constants {
    companion object{
        const val OPERATOR_UZMOBILE = 0
        const val OPERATOR_UMS = 1
        const val OPERATOR_BEELINE = 2
        const val OPERATOR_UCELL = 3
        const val CATEGORY_INTERNET = 0
        const val CATEGORY_TARIF = 1
        const val CATEGORY_MINUTES = 2
        const val CATEGORY_SMS = 3
        const val CATEGORY_ADVEN = 4
        const val CATEGORY_SERVICES = 5
        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_OPERATOR_TYPE = "extra_operator_type"

        fun getOperatorColors(operator: Int): Int{
            when(operator){
                OPERATOR_BEELINE -> return R.color.c_beeline
                OPERATOR_UZMOBILE -> return R.color.c_uzmobile
                OPERATOR_UCELL -> return R.color.c_ucell
                OPERATOR_UMS -> return R.color.c_ums

            }

            return R.color.colorPrimary
        }
//Changing background image////////////////////////////////
        fun getBackgroundImage(operator: Int): Int{
            when(operator){
                OPERATOR_BEELINE -> return R.drawable.beeline_back
                OPERATOR_UZMOBILE -> return R.drawable.uzmobile_back
                OPERATOR_UCELL -> return R.drawable.ucell_back
                OPERATOR_UMS -> return R.drawable.ums_back

            }

            return R.drawable.beeline
        }
        ////////////////////////////////////////////
        //Changing background image////////////////////////////////

        fun getBackgroundImageForDataActivity(operator: Int): Int{
            when(operator){
                OPERATOR_BEELINE -> return R.drawable.beeline_back
                OPERATOR_UZMOBILE -> return R.drawable.uzmobile_back
                OPERATOR_UCELL -> return R.drawable.ucell_back
                OPERATOR_UMS -> return R.drawable.ums_back

            }

            return R.drawable.beeline
        }
        ////////////////////////////////////////////





        fun getOperatorImage(operator: Int): Int{
            when(operator){
                OPERATOR_BEELINE -> return R.drawable.beeline
                OPERATOR_UZMOBILE -> return R.drawable.uzmobile
                OPERATOR_UCELL -> return R.drawable.ucell
                OPERATOR_UMS -> return R.drawable.mobiuz

            }

            return R.drawable.beeline
        }

        fun getServiceText(service: Int): String{
            when(service){
                CATEGORY_INTERNET -> return "Internet"
                CATEGORY_TARIF -> return "Tariflar"
                CATEGORY_MINUTES -> return "Daqiqalar"
                CATEGORY_SMS -> return "SMS"
                CATEGORY_ADVEN -> return "Foydali"
                CATEGORY_SERVICES -> return "Xizmatlar"
            }
            return ""
        }

        fun getItems(operator: Int, category: Int): List<CategoryModel>{
            when(operator){
                OPERATOR_BEELINE -> {
                    when(category){
                        CATEGORY_INTERNET -> {
                            return listOf(
                                CategoryModel("KUN", listOf(
                                    InternetModel("Kun 10", "900 so'm", "10+100 MB", "Kun 10MB + 100MB TAS-IX.\nUlanish uchun hisobdagi minimal mablag' miqdori 1000 so'm", "*110*1*14#"),
                                    InternetModel("Kun 20", "1 500 so'm", "20+200 MB", "Kun 10MB + 200MB TAS-IX.\nUlanish uchun hisobdagi minimal mablag' miqdori 1600 so'm", "*110*1*15#"),
                                    InternetModel("Kun 30", "1 900 so'm", "30+30 MB", "100% bonus ijtimoiy tarmoqlar va messenjerlarga(30 MB).\nUlanish uchun hisobdagi minimal mablag' miqdori 2000 so'm", "*110*0*16#"),
                                    InternetModel("Kun 150", "4 900 so'm", "150+150 MB", "100% bonus ijtimoiy tarmoqlar va messenjerlarga(150 MB).\nUlanish uchun hisobdagi minimal mablag' miqdori 5000 so'm", "*110*0*17#")
                                )),
                                CategoryModel("HAFTALIK", listOf(
                                    InternetModel("100 MB", "6 900 so'm", "100 MB", "", "*110*0*18#"),
                                    InternetModel("400 MB", "11 900 so'm", "400 MB", "", "*110*0*19#")
                                )),
                                CategoryModel("OY", listOf(
                                    InternetModel("Internet 1000 MB", "10 000 so'm", "1000 MB", "Zo'r internet! Zo'r narxlar!", "*1*1*4036#"),
                                    InternetModel("Internet 3000 MB", "20 000 so'm", "3000 MB", "Zo'r internet! Zo'r narxlar!", "*1*2*4036#"),
                                    InternetModel("Internet 6000 MB", "30 000 so'm", "6000 MB", "Zo'r internet! Zo'r narxlar!", "*1*3*4036#"),
                                    InternetModel("Internet 9000 MB", "40 000 so'm", "9000 MB", "Zo'r internet! Zo'r narxlar!", "*1*4*4036#"),
                                    InternetModel("Internet 12 000 MB", "50 000 so'm", "12 000 MB", "Zo'r internet! Zo'r narxlar!", "*1*5*4036#"),
                                    InternetModel("Internet 15 000 MB", "60 000 so'm", "15 000 MB", "Zo'r internet! Zo'r narxlar!", "*1*6*4036#"),
                                    InternetModel("Internet 20 000 MB", "70 000 so'm", "20 000 MB", "Zo'r internet! Zo'r narxlar!", "*1*7*4036#"),
                                    InternetModel("Internet 30 000 MB", "90 000 so'm", "30 000 MB", "Zo'r internet! Zo'r narxlar!", "*1*8*4036#")

                                )),
//                                CategoryModel("SUPER OY", listOf(
//                                    InternetModel("700 MB", "14 900 so'm", "700 MB", "", "*110*0*40#"),
//                                    InternetModel("2 000 MB", "22 900 so'm", "2 000 MB", "", "*110*0*41#"),
//                                    InternetModel("5 000 MB", "39 900 so'm", "5 000 MB", "", "*110*0*42#"),
//                                    InternetModel("10 000 MB", "59 900 so'm", "10 000 MB", "", "*110*0*43#"),
//                                    InternetModel("15 000 MB", "79 900 so'm", "15 000 MB", "", "*110*0*44#"),
//                                    InternetModel("25 000 MB", "99 000 so'm", "25 000 MB", "", "*110*0*45#"),
//                                    InternetModel("50 000 MB", "149 000 so'm", "149 000 MB", "", "*110*0*46#"),
//                                    InternetModel("199 000 MB", "199 000 so'm", "100 000 MB", "", "*110*0*47#")
//                                )),
                                CategoryModel("4G Paketlar", listOf(
                                    InternetModel("4G Kun", "10 000 so'm", "5 000 MB", "Paket faqat 4G tarmog\'ida amal qiladi va 2G/3G tarmoqlarida sarflanmaydi", "*110*58#"),
                                    InternetModel("4G Oy", "50 000 so'm", "25 000 MB", "Paket faqat 4G tarmog\'ida amal qiladi va 2G/3G tarmoqlarida sarflanmaydi", "*110*59#")
                                ))

                            )
                        }
                        CATEGORY_TARIF -> {
                            return listOf(
                                CategoryModel("Aktiv Tariflar", listOf(
                                    TarifModel("Zo'r 2",  "20 000 so'm",  "30 kun",  "ZO'R! Cheksiz daqiqalar! Haqiqatdan ham ko'p MB va SMS!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 20 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 2000 daqiqa O‘zbekiston bo‘yicha daqiqalar\n" +
                                            "● 2 000 MB mobil internet\n" +
                                            "● 2000 SMS O'zbekiston bo'yicha barcha yo'nalishlar uchun kiritilgan SMS paketi\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to'lovining yechilish sanasini aniqlash *202#\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 20 250 so'm\n" +
                                            "●  Balansingizda bir oylik abonent to’lovini yechish uchun yetarli mablag’ bo’lmaganda:\n" +
                                            "●  Kunlik abonent to’lovi 2000 so'm/kun\n" +
                                            "●  O'zbekiston bo'yicha daqiqalar 100 daq/kun\n" +
                                            "●  O'zbekiston bo'yicha SMS 100sms/kun\n" +
                                            "●  Internet barcha yo’nalishlarga 100mb/kun\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin. \n" +
                                            "●  «Perezagruzka» xizmatining narxi har bir so'rov uchun 2000 so'm",   "*110*36#"),
                                    TarifModel("Zo'r 6",  "35 000 so'm",  "30 kun",  "ZO'R! Cheksiz daqiqalar! Haqiqatdan ham ko'p MB va SMS!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 35 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● VIP O‘zbekiston bo‘yicha daqiqalar\n" +
                                            "● 6 000 MB mobil internet\n" +
                                            "● 5000 SMS O'zbekiston bo'yicha barcha yo'nalishlar uchun kiritilgan SMS paketi\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to'lovining yechilish sanasini aniqlash *202#\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 35 250 so'm\n" +
                                            "●  Balansingizda bir oylik abonent to’lovini yechish uchun yetarli mablag’ bo’lmaganda:\n" +
                                            "●  Kunlik abonent to’lovi 2000 so'm/kun\n" +
                                            "●  O'zbekiston bo'yicha daqiqalar 100 daq/kun\n" +
                                            "●  O'zbekiston bo'yicha SMS 100sms/kun\n" +
                                            "●  Internet barcha yo’nalishlarga 100mb/kun\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin. \n" +
                                            "●  «Perezagruzka» xizmatining narxi har bir so'rov uchun 2000 so'm",   "*110*60#"),
                                    TarifModel("Zo'r 10",  "50 000 so'm",  "30 kun",  "ZO'R! Cheksiz daqiqalar! Haqiqatdan ham ko'p MB va SMS!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 50 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● VIP O‘zbekiston bo‘yicha daqiqalar\n" +
                                            "● 10 000 MB mobil internet\n" +
                                            "● 5000 SMS O'zbekiston bo'yicha barcha yo'nalishlar uchun kiritilgan SMS paketi\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to'lovining yechilish sanasini aniqlash *202#\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 50 250 so'm\n" +
                                            "●  Balansingizda bir oylik abonent to’lovini yechish uchun yetarli mablag’ bo’lmaganda:\n" +
                                            "●  Kunlik abonent to’lovi 2000 so'm/kun\n" +
                                            "●  O'zbekiston bo'yicha daqiqalar 100 daq/kun\n" +
                                            "●  O'zbekiston bo'yicha SMS 100sms/kun\n" +
                                            "●  Internet barcha yo’nalishlarga 100mb/kun\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin. \n" +
                                            "●  «Perezagruzka» xizmatining narxi har bir so'rov uchun 2000 so'm",   "*110*38#"),
                                    TarifModel("Zo'r 15",  "70 000 so'm",  "30 kun",  "ZO'R! Cheksiz daqiqalar! Haqiqatdan ham ko'p MB va SMS!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 70 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● VIP O‘zbekiston bo‘yicha daqiqalar\n" +
                                            "● 15 000 MB mobil internet\n" +
                                            "● 5000 SMS O'zbekiston bo'yicha barcha yo'nalishlar uchun kiritilgan SMS paketi\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to'lovining yechilish sanasini aniqlash *202#\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 70 250 so'm\n" +
                                            "●  Balansingizda bir oylik abonent to’lovini yechish uchun yetarli mablag’ bo’lmaganda:\n" +
                                            "●  Kunlik abonent to’lovi 2000 so'm/kun\n" +
                                            "●  O'zbekiston bo'yicha daqiqalar 100 daq/kun\n" +
                                            "●  O'zbekiston bo'yicha SMS 100sms/kun\n" +
                                            "●  Internet barcha yo’nalishlarga 100mb/kun\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin. \n" +
                                            "●  «Perezagruzka» xizmatining narxi har bir so'rov uchun 2000 so'm",   "*110*39#"),
                                    TarifModel("Status Silver New", "90 000 so'm",  "30 kun",  "Suhbat erkinligiga intiling! Erkin suhbatdan baxra oling, hissiyotlarni muloqot orqali yetkazing!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida va O‘zbekiston bo‘yicha cheksiz qo‘ng‘iroqlar\n" +
                                            "● 5000 SMS xabarlar barcha yo‘nalishlar uchun\n" +
                                            "● 20 000 MB mobil internet\n" +
                                            "● 100 MB Roumingda VEON hududida foydalanish uchun kiritilgan MB paketi\n" +
                                            "● 210 500 SO'M Bepul «Oltin» raqam\n" +
                                            "● 90 250 so‘m Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori \n" +
                                            "● 0 so‘m  Bepul yoqtirilgan xizmat- «Xabardor bo’l» \n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi maxalliy SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  «Status Gold» va «Status Gold+», «Status Platinum» va «Status Platinum+» tariflaridan o‘tish narxi - 2,000 so‘m\n" +
                                            "●  Boshqa tariflardan o‘tish narxi - 0 so‘m\n" +
                                            "●  «Status NEW» - bu individual yondashuv va xizmat ko’rsatish, imtiyozlar, hamda muloqot uchun kerakli bo’lgan barcha qo’shimcha xizmatlar kiritilgan maxsus tariflardir.\n" +
                                            "Biz sizga quyidagi imtiyozlarni taqdim etishdan xursandmiz:\n" +
                                            "- Operatorlar bilan atigi 10 soniya ichida bog'lanish! Eksklyuziv alohida raqam - 0777 orqali, kecha va kunduz mijozlarni qo'llab quvvatlash markazi bilan bog'lanish.\n" +
                                            " - Xalqaro qo'ng'iroqlarga maxsus imkoniyatlar - Rossiya, Qozog'iston, Turkmaniston, Tojikiston va Qirg'iziston davlatlariga 50% chegirma.\n" +
                                            "- Roumingda VEON hududida muloqot uchun maxsus imkoniyatlar.\n" +
                                            "- Avvaldan yoqilgan bepul xizmatlar - 'Xabardor bo'l/Bog'lanish mumkin'.\n" +
                                            "- Maxsus ro'yxatdan'Oltin' raqam tanlash.\n" +
                                            "- Kompaniya ochiq ofislarida maxsus xizmat ko'rsatish joyi va maxsus menedjer. \n" +
                                            "●  «Perezagruzka» xizmatini ulab daqiqa va MB paketlarning yangidan taqdim etish imkoniyatingiz mavjud",  "*110*3#"),
                                    TarifModel("Status Gold New",  "130 000 so'm",  "30 kun",  "Agar siz cheksizlikni yoqtirsangiz! Imkoniyatlaringiz chegarasi yo‘q, qo‘ng‘iroqlarning ham!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida va O‘zbekiston bo‘yicha cheksiz qo‘ng‘iroqlar\n" +
                                            "● 10 000 SMS xabarlar barcha yo‘nalishlar uchun\n" +
                                            "● 30 000 MB mobil internet\n" +
                                            "● 50 Daq/oy  Roumingda VEON hududida kirish/chiqish qo’ng’iroqlari uchun daqiqalar paketi** \n" +
                                            "● 250 MB Roumingda VEON hududida foydalanish uchun kiritilgan MB paketi** \n" +
                                            "● 50%  Roumingda VEON hududida kiruvchi qo’ng’iroqlarga chegirma \n" +
                                            "● 421 000 so'm  Bepul «Oltin» raqam \n" +
                                            "● 130 250 so'm   Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori  \n" +
                                            "● 0 so'm   Bepul yoqtirilgan xizmatlar - «Xabardor bo’l», «AntiAON»  \n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi maxalliy SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  «Status Platinum» va «Status Platinum+» tariflaridan o‘tish narxi - 2,000 so‘m\n" +
                                            "●  Boshqa tariflardan o‘tish narxi - 0 so‘m\n" +
                                            "●  Qo‘ng‘iroqlarning texnologik chegarasi oyiga 45,000 daqiqa\n" +
                                            "●  «Status NEW» - bu individual yondashuv va xizmat ko’rsatish, imtiyozlar, hamda muloqot uchun kerakli bo’lgan barcha qo’shimcha xizmatlar kiritilgan maxsus tariflardir.\n" +
                                            "Biz sizga quyidagi imtiyozlarni taqdim etishdan xursandmiz:\n" +
                                            "- Operatorlar bilan atigi 10 soniya ichida bog'lanish! Eksklyuziv alohida raqam - 0777 orqali, kecha va kunduz mijozlarni qo'llab quvvatlash markazi bilan bog'lanish.\n" +
                                            "- Roumingda maxsus imkoniyatlar - VEON hududida kiruvchi qo'ng'iroqlarga 50% chegirma.\n" +
                                            "- Xalqaro qo'ng'iroqlarga maxsus imkoniyatlar - barcha davlatlariga chiquvchi qo'ng'iroqlarga 50% chegirma (asosiy narxidan).\n" +
                                            "- Avvaldan yoqilgan bepul xizmatlar - 'AntiAON', 'Xabardor bo'l/Bog'lanish mumkin'.\n" +
                                            "- Maxsus ro'yxatdan 'Oltin' raqam tanlash.\n" +
                                            "- Kompaniya ochiq ofislarida maxsus xizmat ko'rsatish joyi va maxsus menedjer. \n" +
                                            "●  «Perezagruzka» xizmatini ulab daqiqa va MB paketlarning yangidan taqdim etish imkoniyatingiz mavjud",  "*110*2#"),
                                    TarifModel("Status Platinum New",  "189 000 so'm",  "30 kun",  "Agar Siz har doim eng yaxshisini olishga o‘rgangan bo‘lsangiz - cheksiz qo‘ng‘iroqlar!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida va O‘zbekiston bo‘yicha cheksiz qo‘ng‘iroqlar\n" +
                                            "● 10 000 SMS xabarlar barcha yo‘nalishlar uchun\n" +
                                            "● 100 000 MB mobil internet\n" +
                                            "● 100 Daq/oy  Roumingda VEON hududida kirish/chiqish qo’ng’iroqlari uchun daqiqalar paketi** \n" +
                                            "● 500 MB  Roumingda VEON hududida foydalanish uchun kiritilgan MB paketi** \n" +
                                            "● 100 Daq/oy   Barcha xalqaro qo'ng'iroqlar uchun kiritilgan daqiqalar paketi  \n" +
                                            "● 1 263 000 so'm  Bepul «Oltin» raqam \n" +
                                            "● 189 250 so'm   Tarifga o'tish uchun hisobdagi minimal mablag’ miqdori  \n" +
                                            "● 0 so'm   Bepul yoqtirilgan xizmatlar - «Xabardor bo’l», «AntiAON»  \n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi maxalliy SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Boshqa tariflardan o‘tish narxi - 0 so‘m\n" +
                                            "●  «Status NEW» - bu individual yondashuv va xizmat ko’rsatish, imtiyozlar, hamda muloqot uchun kerakli bo’lgan barcha qo’shimcha xizmatlar kiritilgan maxsus tariflardir Biz sizga quyidagi imtiyozlarni taqdim etishdan xursandmiz\n"+
                                            "- Operatorlar bilan atigi 10 soniya ichida bog'lanish! Eksklyuziv alohida raqam - 0777 orqali, kecha va kunduz mijozlarni qo'llab quvvatlash markazi bilan bog'lanish.\n"+
                                            "- Xalqaro qo'ng'iroqlarga maxsus imkoniyatlar - barcha davlatlariga chiquvchi qo'ng'iroqlarga 50% chegirma (asosiy narxidan).\n"+
                                            "- Roumingda VEON hududida muloqot uchun maxsus imkoniyatlar.\n"+
                                            "- Avvaldan yoqilgan bepul xizmatlar - 'AntiAON', 'Xabardor bo'l/Bog'lanish mumkin'.\n"+
                                            "- Maxsus ro'yxatdan 'Oltin' raqam tanlash.\n"+
                                            "- Kompaniya ochiq ofislarida maxsus xizmat ko'rsatish joyi va maxsus menedjer. \n" +
                                            "●  «Perezagruzka» xizmatini ulab daqiqa va MB paketlarning yangidan taqdim etish imkoniyatingiz mavjud",  "*110*1#"),
                                    TarifModel("Allo",  "15 000 so'm",  "30 kun",  "Ko'p suhbatlashishni xush ko'rasizmi?«Allo»ga ulaning yoki o'ting  \n"+
                                            "\n" +
                                            "\n" +
                                            "● 15 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 600 daqiqa O‘zbekiston bo‘yicha daqiqalar\n" +
                                            "● 600 SMS O'zbekiston bo'yicha barcha yo'nalishlar uchun kiritilgan SMS paketi\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to'lovining yechilish sanasini aniqlash *202#\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 15 250 so'm\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin. \n",  "*110*40#"),
                                    TarifModel("Kunlik",  "600 so'm",  "kunlik",  "«Kunlik» tarifiga ulaning! Har kuni DAQIQALAR va MEGABAYTLAR!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 600 so'm Kunlik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 60 daqiqa O‘zbekiston bo‘yicha daqiqalar\n" +
                                            "● 60 MB mobil internet\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to'lovining yechilish sanasini aniqlash *202#\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 20 250 so'm\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin. \n",   "*110*580#"),
                                    TarifModel("Oson 10",  "10 000 so'm",  "30 kun",  "«OSON 10» TARIFI!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 10 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 10 daqiqa O‘zbekiston bo‘yicha daqiqalar\n" +
                                            "● 10 SMS O'zbekiston bo'yicha barcha yo'nalishlar uchun kiritilgan SMS paketi\n" +
                                            "● 10 MB mobil internet\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to'lovining yechilish sanasini aniqlash *202#\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 10 250 so'm\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin.",   "*110*61#"),
                                    TarifModel("1 GB",  "10 000 so'm",  "30 kun",  "Pastga qarang! ProINTERNETga bu yerda ulanasiz!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 10 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 1 GB mobil internet\n" +
                                            "●  Tarifga kiritilgan trafik hech qachon kuymaydi!\n" +
                                            "●  Tarifning abonent to'lovi qarzga yechilmaydi!\n" +
                                            "●  Keraksiz xizmatlar yo'q!\n" +
                                            "●  Faqat internet!\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 12 250 so'm\n" +
                                            "●  «1 GB» va «3 GB» tariflariga faqat Beeline Uzbekistan ilovasida o'tish mumkin\n" +
                                            "●  «1 GB» va «3 GB» tariflariga boshqa tarifdan o'tganda, avval yoqilgan xizmat yoki " +
                                            "paketlar bo'yicha trafik mavjud bo'lsa, u kuyib ketmaydi. Shu bilan birga ushbu trafikni" +
                                            " uzaytirish imkoni yo'q. Trafikning amal qilish muddati o'zgarmaydi. Rouming bo'yicha yoki " +
                                            "xalqaro SMS paketlar mavjud bo'lsa, «1 GB» va «3 GB» tariflariga o'tganda ular kuyadi.\n" +
                                            "●  Ushbu tarifga  «Bravo Online» va «Bravo Mix» tariflaridan o'tganda, faqat 16 000 so'm " +
                                            "va undan yuqori to'lov uchun berilgan bonuslar qoladi.\n" +
                                            "«1 GB» tarifiga «Kunlik», «Bayramga marhamat», «Bravo Online», «Bravo Ooo!», " +
                                            "«Bravo Vodiy», «Qo'shnilar+», «Smartphone» tariflaridan o'tish - 0 so'm, boshqa tariflardan o'tish - 2000 so'm.\n" +
                                            "●  «Perezagruzka» xizmati 0 so'm\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin.",   ""),
                                    TarifModel("3 GB",  "25 000 so'm",  "30 kun",  "Pastga qarang! ProINTERNETga bu yerda ulanasiz!\n"+
                                            "\n" +
                                            "\n" +
                                            "● 25 000 so'm Oylik abonent to’lovi\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 3 GB mobil internet\n" +
                                            "●  Tarifga kiritilgan trafik hech qachon kuymaydi!\n" +
                                            "●  Tarifning abonent to'lovi qarzga yechilmaydi!\n" +
                                            "●  Keraksiz xizmatlar yo'q!\n" +
                                            "●  Faqat internet!\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 100 so‘m chiquvchi  SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 100 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Ulanish uchun hisobdagi minimal mablag' miqdori 27 250 so'm\n" +
                                            "●  «1 GB» va «3 GB» tariflariga faqat Beeline Uzbekistan ilovasida o'tish mumkin\n" +
                                            "●  «1 GB» va «3 GB» tariflariga boshqa tarifdan o'tganda, avval yoqilgan xizmat yoki " +
                                            "paketlar bo'yicha trafik mavjud bo'lsa, u kuyib ketmaydi. Shu bilan birga ushbu trafikni" +
                                            " uzaytirish imkoni yo'q. Trafikning amal qilish muddati o'zgarmaydi. Rouming bo'yicha yoki " +
                                            "xalqaro SMS paketlar mavjud bo'lsa, «1 GB» va «3 GB» tariflariga o'tganda ular kuyadi.\n" +
                                            "●  Ushbu tarifga  «Bravo Online» va «Bravo Mix» tariflaridan o'tganda, faqat 16 000 so'm " +
                                            "va undan yuqori to'lov uchun berilgan bonuslar qoladi.\n" +
                                            "«1 GB» tarifiga «Kunlik», «Bayramga marhamat», «Bravo Online», «Bravo Ooo!», " +
                                            "«Bravo Vodiy», «Qo'shnilar+», «Smartphone» tariflaridan o'tish - 0 so'm, boshqa tariflardan o'tish - 2000 so'm.\n" +
                                            "●  Tarifga kiritilgan internet-trafik tugaganda abonent «Perezagruzka» xizmatidan foydalanishi mumkin.\n" +
                                            "●  «Perezagruzka» xizmati 0 so'm\n" +
                                            "●  «Perezagruzka» xizmatini yoqtirish orqali siz tarif rejangiz bo'yicha taqdim etiladigan daqiqa, SMS va MB paketlarini muddatidan avval olishingiz mumkin.",   ""),
                                    TarifModel("Click+", "15 000 so'm","30 kun", "Internet uchun yaxshi tarif reja! Oylik bepul internet paketlar hamda 1 MB trafik narxi 85 so‘m. \n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL INTERNET PAKETLAR\n" +
                                            "● 1 GB internet trafik\n" +
                                            "● 1 GB Facebook, Odnoklassniki, Telegram, WhatsApp va Viber uchun\n" +
                                            "● 1 GB «TAS-IX» hududiga kiradigan saytlar uchun\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 85 so‘m O‘zbekiston bo‘ylab SMS-xabarlar\n" +
                                            "● 500 so‘m xalqaro SMS-xabarlar\n" +
                                            "● 85 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Boshqa tariflardan o‘tish narxi - 0 so‘m\n" +
                                            "●  Tarif rejasida ovozli aloqa xizmati taqdim etilmaydi",  "*110*22#"),
                                    TarifModel("Welcome", "30 000 so'm","30 kun", "Go‘zal vatanimiz - O‘zbekistonga kelgan xorijiy sayyohlar uchun manfaatli tarif rejasi!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 1,00 daqiqa tarmoq ichida va O‘zbekiston bo‘yicha qo‘ng‘iroqlar\n" +
                                            "● 3,000 MB internet trafik\n" +
                                            "● 1,000 MB Telegram, WhatsApp va Viber messenjerlari uchun\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m Tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 125 so‘m O‘zbekiston bo‘ylab chiqish qo‘ng‘iroqlari\n" +
                                            "● 120 so‘m O‘zbekiston bo‘ylab SMS-xabarlar\n" +
                                            "● 630 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Ushbu tarifga ulanish imkoniyati faqat O‘zbekistonga kelgan xorijiy sayyohlar uchun amal qiladi\n" +
                                            "●  Ulanish uchun Beeline savdo va xizmat ko‘rsatish ofislariga murojaat qiling",  ""),
                                    TarifModel("G‘alaba!", "0 so'm","30 kun", "Urush faxriylari uchun imtiyozli tarif, har oyda O‘zbekiston bo‘ylab 300 daqiqa va SMS bepul!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 300 daqiqa tarmoq ichida va O‘zbekiston bo‘yicha qo‘ng‘iroqlar\n" +
                                            "● 300 SMS xabarlar barcha yo‘nalishlar uchun\n" +
                                            "● 30 daqiqa bayram kunlari – 21 mart, 9 may, 1 sentyabr va 31 dekabrda abonentlarga Qozog‘iston, Tojikiston, Qirg‘iziston, Turkmaniston va Rossiyaga xalqaro qo‘ng‘iroqlarni amalga oshirish uchun 7 kunga bepul 30 daqiqa\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84.2 so‘m tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 126.3 so‘m O‘zbekiston bo‘ylab chiqish qo‘ng‘iroqlari\n" +
                                            "● 84.2 so‘m O‘zbekiston bo‘ylab SMS-xabarlar\n" +
                                            "● 421 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga Beeline sotuv va xizmat ko‘rsatish ofislarida yangi ulanish uchun faqat 1941-1945 yillardagi urush faxriylari va mehnat fronti qatnashchilari, pasport va urush yoki mehnat fronti qatnashchisi guvohnomasini ko‘rsatib, ulanishlari mumkin\n" +
                                            "●  Bitta guvohnomaga faqat bitta abonent raqami ulanadi\n" +
                                            "●  Tarifga boshqa tariflardan o‘tish yopiq\n" +
                                            "●  Tarifga kiritilgan daqiqalar va sms oyning har birinchi kunida taqdim etiladi va keyingi oyga o‘tmaydi",  ""),
                                    TarifModel("Bolajon", "11 500 so'm","30 kun", "Farzandingiz uchun kerakli Internet! Bolajonlar uchun xavfsiz internet, ular uchun eng yaxshisi!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 500 daqiqa tarmoq ichida va O‘zbekiston bo‘yicha qo‘ng‘iroqlar\n" +
                                            "● 1,500 MB internet trafik\n" +
                                            "● 1,000 MB Telegram, WhatsApp va Viber messenjerlari uchun\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 85 so‘m tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 125 so‘m O‘zbekiston bo‘ylab chiqish qo‘ng‘iroqlari\n" +
                                            "● 85 so‘m O‘zbekiston bo‘ylab SMS-xabarlar\n" +
                                            "● 630 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif bolalar uchun mo‘ljallangan, ushbu tarifdagi raqamlar ota-onaning birini nomiga ro‘yxatdan o‘tkaziladi\n" +
                                            "●  Ushbu tarifda Internet-resurslardan foydalanish cheklangan. Foydalanish mumkin bo‘lgan internet resurslar ro‘yxati bilan beeline.uz saytida tanishing\n" +
                                            "●  \"Bolajon\" tarifini boshqa tarifga o‘zgartirish uchun raqam egasi Kompaniya rasmiy ofilsariga pasport bilan murojaat qilibariza qoldirishi kerak",  "*110*538#")

                                )),
                                CategoryModel("Arxiv", listOf(
                                    TarifModel("Yangi XIT",  "17 777 so'm",  "30 kun",  "Yangi «Yangi XIT» tarifi! Beeline eng zo’r xitlari! Ko’p internet! Ko’p daqiqalar!\n" +
                                            "\n" +
                                            "\n" +
                                            "● 16 000 so'm Oylik abonent to’lovi chegirma bilan*\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 300 daqiqa tarmoq ichida\n" +
                                            "● 300 daqiqa O‘zbekiston bo‘yicha boshqa mobil operatorlariga\n" +
                                            "● 1000 MB mobil internet\n" +
                                            "● 30 SMS O'zbekiston bo'yicha barcha yo'nalishlar uchun kiritilgan SMS paketi\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 120 so‘m chiquvchi maxalliy SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 630 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  «Erkin muloqot», «Erkin muloqot Maxi», «Bir Oy» tariflari, «Yangi SUPER XIT», «Yangi MEGA XIT», «Yangi TOP XIT», «Status» va «Status+» turkumidagi tarif rejalardan o‘tish narxi - 2,000 so‘m\n" +
                                            "●  Boshqa tariflardan o‘tish narxi - 0 so‘m\n" +
                                            "●  Beeline TV va Beeline Music uchun 30 kunlik promo-muddat «XIT» tarifiga kiritilgan\n" +
                                            "●  «Perezagruzka» xizmatini ulab daqiqa va MB paketlarning yangidan taqdim etish imkoniyatingiz mavjud",   "*110*36#"),

                                    TarifModel("Yangi Mega XIT",  "44 444 so'm",  "30 kun",  "Tarif va internetingizni yangilang! \n" +
                                            "\n" +
                                            "\n" +
                                            "● 40 000 so'm Oylik abonent to’lovi chegirma bilan*\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 1,000 O‘zbekiston bo‘yicha mobil operatorlariga\n" +
                                            "● 6,000 MB mobil internet\n" +
                                            "● 1,000 SMS xabarlar barcha yo‘nalishlar uchun\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 120 so‘m chiquvchi maxalliy SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 630 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  «Bir Oy», «Yangi TOP XIT» tariflari, «Status» va «Status+» turkumidagi tarif rejalaridan o‘tish narxi - 2,000 so‘m\n" +
                                            "●  Boshqa tariflardan o‘tish narxi - 0 so‘m\n" +
                                            "●  Beeline TV va Beeline Music uchun 30 kunlik promo-muddat tarifga kiritilgan\n" +
                                            "●  «Perezagruzka» xizmatini ulab daqiqa va MB paketlarning yangidan taqdim etish imkoniyatingiz mavjud", "*110*38#"),
                                    TarifModel("Yangi Top XIT",  "59 999 so'm",  "30 kun",  "Smartfoningiz uchun munosib tarif! Onlayn bo‘ling, internetdan zavq oling, TOP muloqotda bo‘ling! \n" +
                                            "\n" +
                                            "\n" +
                                            "● 55 000 Oylik abonent to’lovi chegirma bilan*\n" +
                                            "BEPUL PAKETLAR\n" +
                                            "● 5,000 daqiqa O‘zbekiston bo‘yicha mobil operatorlariga\n" +
                                            "● 12,000 MB mobil internet\n" +
                                            "● 5,000 SMS xabarlar barcha yo‘nalishlar uchun\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 100 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 120 so‘m chiquvchi maxalliy SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 630 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  «Status» va «Status+» turkumidagi tarif rejalardan o‘tish narxi - 2,000 so‘m\n" +
                                            "●  Boshqa tariflardan o‘tish narxi - 0 so‘m\n" +
                                            "●  Beeline TB va Beeline Music uchun 30 kunlik promo-muddat tarifga kiritilgan\n" +
                                            "●  «Perezagruzka» xizmatini ulab daqiqa va MB paketlarning yangidan taqdim etish imkoniyatingiz mavjud",   "*110*39#")

                                ))
                            )
                        }
                        CATEGORY_MINUTES -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    MinuteModel("Extra", "10 000~25 000 so'm", "Daq+MB", "\"Extra 200 MB va 200 daqiqa\" *110*500# - 10000 so'm. \"Extra 400 MB va 400 daqiqa\" *110*501# - 18000 so'm. \"Extra 600 MB va 600 daqiqa\" *110*502# - 25000 so'm. Xizmat Status, Status+, Bir Oy, Erkin muloqot, Bravo MIX, XIT, SUPER XIT, MEGA XIT va TOP XIT tariflarida amal qiladi. Amal qilish muddati - 30 kun.", "*111*1*5*3*1#"),
                                    MinuteModel("Erkin muloqot", "8 377,9 so'm", "Daq+MB+SMS", "“Erkin muloqot” bu tarmoq ichida 500 daqiqa va 500 SMS O'zbekiston bo'yicha, hamda 200 MB internetga +200 MB ijtim.tarmoqlar va messenjerlar uchun! Barchasi 15 kunga atigi 8377,9 so'm evaziga! Xizmat «Erkin muloqot», «Bir Oy», «Klik», «Click+», «Bolajon», «Status» va «Status+» turkumidagi tariflaridan tashqari barcha oldindan to'lov tizimi abonentlariga amal qiladi. Kod: *110*230#.", "*111*1*5*3*2#"),
                                    MinuteModel("Erkin muloqot+", "12 587,9 so'm", "Daq+MB+SMS", "“Erkin muloqot+” bu O’zbekiston bo’yicha 500 daqiqa va SMS hamda 200 MB internetga +200 MB ijtimoiy tarmoqlar va messenjerlar uchun! Barchasi 15 kunga atigi 12587,9 so'm evaziga! Xizmat «Erkin muloqot», «Bir Oy», «Klik», «Click+», «Bolajon», «Status» va «Status+» turkumidagi tariflaridan tashqari barcha oldindan to'lov tizimi abonentlariga amal qiladi. Kod: *110*225#.", "*111*1*5*3*3#"),
                                    MinuteModel("Mega hafta", "14 735 so'm", "Daq+MB+SMS", "\"Mega hafta\" xizmatini yoqish: *110*99*2#. Abonent to'lovi haftasiga 14735 so'm. 400 daqiqa tarmoq ichida, 300 daqiqa O'zbekiston bo'ylab, 700 sms O'zbekiston bo'ylab, 20 MB internet trafik. Tekshirish: *100# - Mb va daqiqalar; *105# - SMS. Hisobda kamida 14945,5 so'm bo'lishi kerak. Batafsil ma'lumot 06056.", "*111*1*5*3*4#")
                                ))
                            )
                        }
                        CATEGORY_SMS ->     {
                            return listOf(
                                CategoryModel("", listOf(
                                    BaseModel("SMS non-stop", "1 300 so'm/kun", "250 ta", "250 SMS sutkaga beriladi", "*110*151#"),
                                    BaseModel("20 SMS", "500 so'm/kun", "20 ta", "600 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*161#"),
                                    BaseModel("50 SMS", "1 000 so'm/kun", "50 ta", "1 100 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*162#"),
                                    BaseModel("100 SMS", "5 262.5 so'm/30 kun", "100 ta", "5 473 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*044#"),
                                    BaseModel("500 SMS", "13 682.5 so'm/30 kun", "500 ta", "13 893 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*045#"),
                                    BaseModel("1000 SMS", "22 102.5 so'm/30 kun", "1000 ta", "22 313 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*046#"),
                                    BaseModel("25 Xalqaro SMS lar", "5 262.5 so'm/30 kun", "25 ta", "5 473 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*041#"),
                                    BaseModel("50 Xalqaro SMS lar", "8 420 so'm/30 kun", "50 ta", "8 630.5 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*042#"),
                                    BaseModel("100 Xalqaro SMS lar", "12 630 so'm/30 kun", "100 ta", "12 840.5 so'm ulanish uchun hisobdagi minimal summa miqdori", "*110*043#")
                                ))
                            )
                        }
                        CATEGORY_ADVEN -> {
                            return listOf(
                                CategoryModel("USSD kodlar", listOf(
                                    AdventageModel("Balansni tekshirish", "*102#"),
                                    AdventageModel("Internet paket qoldig'ini ko'rish", "*103#"),
                                    AdventageModel("Raqamni aniqlash", "*148#"),
                                    AdventageModel("Ishonchli to'lov (qarz olish)", "*141#"),
                                    AdventageModel("Daqiqalar qoldig'ini ko'rish", "*106#"),
                                    AdventageModel("SMS paket qoldig'ini ko'rish", "*105#"),
                                    AdventageModel("Mening barcha raqamlarim", "*303#"),
                                    AdventageModel("Mening tarif rejam", "*110*05#"),
                                    AdventageModel("Mening xizmatlarim", "*110*09#"),
                                    AdventageModel("Ijtimoiy tarmoqlar paketi qoldig'ini aniqlash", "*101#"),
                                    AdventageModel("Internet sozlamalarini olish", "*22#"),
                                    AdventageModel("Rossiyaga qo'ng'iroqlar daqiqa qoldig'i", "*112#"),
                                    AdventageModel("Dollar kursi", "*110*00#"),
                                    AdventageModel("Qurilma IMEI kodi", "*#06#"),
                                    AdventageModel("IMEIni ro'yxatdan o'tkazish", "**1170#"),
                                    AdventageModel("Pereadresatsiyani tekshirish", "*#67#"),
                                    AdventageModel("Kutib turishni faollashtirish", "*43#"),
                                    AdventageModel("Telefon ma'lumotlari", "*#*#4636#*#*")
                                )),
                                CategoryModel("Zaruriy xizmatlar", listOf(
                                    AdventageModel("O't o'chirish xizmati", "101"),
                                    AdventageModel("Militsiya", "102"),
                                    AdventageModel("Tez yordam", "103"),
                                    AdventageModel("Gaz avariyasi xizmati", "104"),
                                    AdventageModel("Qutqaruv xizmati", "1050")
                                )),
                                CategoryModel("Qisqa raqamlar", listOf(
                                    AdventageModel("Prezident virtual qabulxonasi", "1000"),
                                    AdventageModel("Interaktiv davlat xizmatlari portali", "1006"),
                                    AdventageModel("Adliya vazirligi", "1008"),
                                    AdventageModel("Bosh prokuratura", "1007"),
                                    AdventageModel("Temir yo'l ma'lumotxonasi", "1005"),
                                    AdventageModel("Dorixona ma'lumotnomasi", "1142"),
                                    AdventageModel("Aloqa operatorlari ko'dlari", "1192"),
                                    AdventageModel("Xotin-qizlar qo'mitasi", "1146"),
                                    AdventageModel("Toshshahartransxizmat", "1062")
                                ))
                            )
                        }
                        CATEGORY_SERVICES -> {
                            return  listOf(
                                CategoryModel("", listOf(
                                    ServiceModel("Beeline TV", "«Beeline TV» onlayn-kinoteatrida cheksiz internet 499 so‘mdan!", "Faqat Beeline abonentlari uchun! Beeline TV xizmatidan foydalanish uchun cheksiz trafik taqdim etiladi! Paketdagi internet-trafikni sarflamagan holda, televideniye, minglab filmlar, seriallar, multfilmlar va sevimli konsertlarni tomosha qiling! Va yana - Beeline TV uchun o‘z hisobidan to‘lash imkoniyati!\n" +
                                            "\n" +
                                            "                                                                                                                              Beeline TV imkoniyatlari:\n" +
                                            "                                                                                                                              - Telekanallar, filmlar, konsertlar va seriallarning prevyusi\n" +
                                            "                                                                                                                              - Telekanallarni kechiktirib tomosha qilish funksiyasi\n" +
                                            "                                                                                                                              - Mobil ilovada tasvir sifatini tanlash imkoniyati\n" +
                                            "                                                                                                                              - Ota-ona nazorati\n" +
                                            "                                                                                                                              - Beeline mobil tarmog‘ida limitsiz internet-trafik", "*6#"),
                                    ServiceModel("Qadamlar uchun Giglar", "«Qadamlar uchun Giglar» aksiyaning ishtirokchisiga aylanganingizda me'yoriy kunlik qadamlar bajariladigan bo’lsa har kuni 100 MB internet-trafikka ega bo’lishingiz mumkin.", "Faqat Beeline abonentlari uchun! Beeline TV xizmatidan foydalanish uchun cheksiz trafik taqdim etiladi! Paketdagi internet-trafikni sarflamagan holda, televideniye, minglab filmlar, seriallar, multfilmlar va sevimli konsertlarni tomosha qiling! Va yana - Beeline TV uchun o‘z hisobidan to‘lash imkoniyati!\n" +
                                            "\n" +
                                            "                                                                                                                             Aksiya ishtirokchisiga aylanish uchun Siz quyidagilarni bajarishingiz kerak:\n" +
                                            "                                                                                                                              - Beeline Uzbekistan mobil ilovasini yuklab olish kerak;\n" +
                                            "                                                                                                                              - Aksiya sahifasida shartlarni qabul qilish kerak; \n" +
                                            "                                                                                                                              - iOS qurilmalari uchun Health Kit («Salomatlik») yoki Android qurilmalari uchun «GoogleFit» ilovalarni o’rnatib qadamlar ma'lumotidan foydalanishga rozilik bildirish kerak;\n" +
                                            "                                                                                                                              - «Ishtirok etish» tugmasini bosish kerak.", ""),

                                    ServiceModel("Beeline Music", "Internet trafikni sarflamagan holda sevimli musiqangizni tinglashda bahramand bo‘ling", "Beeline o‘z abonentlariga «Beeline Music» xizmatidan foydalanish uchun cheksiz trafikni taqdim etadi!\n" +
                                            "\n" +
                                            "                                                                                                                                                        Bu degani, xizmat orqali musiqani tinglaganda, Beeline abonentlaridan paketdagi internet trafikdan va internet xizmati uchun hisobdan mablag‘ sarflanmaydi.\n" +
                                            "\n" +
                                            "                                                                                                                                                        Narxi:  499 so‘m/kun\n" +
                                            "                                                                                                                                                                     9 999 so‘m/oy\n" +
                                            "\n" +
                                            "                                                                                                                                                        Trafik: cheksiz\n" +
                                            "\n" +
                                            "                                                                                                                                                        Birinchi ulanishda, maxsus promo-muddat amal qilib – musiqalarni bepul tinglashingiz mumkin!\n" +
                                            "\n" +
                                            "                                                                                                                                                        Yuklab olish:\n" +
                                            "\n" +
                                            "                                                                                                                                                        App Store Batafsil\n" +
                                            "                                                                                                                                                        Play Market Batafsil\n" +
                                            "                                                                                                                                                        APK-ga havola Yuklab olish\n" +
                                            "                                                                                                                                                        USSD-so‘rov *9#", "*9#"),
                                    ServiceModel("Yandex.Musiqa", "'Yandex.Musiqa'ni tinglang va internet trafik haqida qayg‘urmang!", "Beeline o‘z abonentlariga «Yandex.Music» xizmatidan foydalanish uchun cheksiz trafik taqdim etadi!\n" +
                                            "\n" +
                                            "Bu degani, xizmat orqali musiqani tinglaganda, Beeline abonentlaridan paketdagi internet trafik sarflanmaydi va internet xizmati uchun hisobdan mablag‘ sarflanmaydi.\n" +
                                            "\n" +
                                            "Birinchi ulanishda, maxsus promo-muddat amal qilib – musiqalarni bepul tinglashingiz mumkin! Promo-muddat joriy kunning oxirigacha amal qiladi (maksimal vaqti 24 soat).\n" +
                                            "\n" +
                                            "Narxi: 499 so‘m/kuniga; 14 999 so‘m/oyiga\n" +
                                            "Trafik: cheksiz\n" +
                                            "\n" +
                                            "Yuklab olish:\n" +
                                            "\n" +
                                            "App Store: Batafsil\n" +
                                            "Play Market: Batafsil\n" +
                                            "APK-ga havola: Yuklab olish\n" +
                                            "USSD-so‘rov: *4#", "*4#"),
                                    ServiceModel("Perezagruzka", "Siz ushbu xizmatdan foydalanib, tarif rejani qayta ishga tushirib daqiqalar, SMS va MB to‘liq hajmda paketlarni olishingiz mumkin", "Agarda Sizda tarif rejangiz bo‘yicha taqdim etilgan trafik yakunlansa, unda Siz ushbu xizmatdan foydalanib, tarif rejani qayta ishga tushirib daqiqalar, SMS va MB to‘liq hajmda paketlarni olishingiz mumkin.\n" +
                                            "\n" +
                                            "Ushbu xizmat faqat «Status», «XIT», «Status +» turkumidagi tariflar va «Bir Oy», «Erkin muloqot», «Bravo Mix» va «Click+» tarif rejalarida mavjud.", "*5#"),
                                    ServiceModel("Ishonchli to‘lov", "\"Beeline\" hisobingizdagi mablag‘ni vaqtincha ko‘paytiradi va siz aloqada bo‘lasiz", "«Ishonchli to‘lov» - bu garchi sizning hisobingizdagi pul tugagan va o‘z vaqtida hisobni to‘ldirishning imkoni bo‘lmagan taqdirda ham hamisha aloqada qolishning yana bir imkoniyati. \n" +
                                            "\n" +
                                            "Endi siz vaziyatga tobe bo‘lmaysiz va chetdan yordam kutmasdan, siz hamisha va qayerda bo‘lmang, hamma joyda o‘z hisobingizni to‘ldira olasiz.\n" +
                                            "\n" +
                                            "Ishonchli to‘lov xizmati uchun abonent to‘lovi va taqdim etilgan mablag‘ miqdori hisobingizdan avtomatik ravishda yechib olinadi.\n" +
                                            "\n" +
                                            "Muvaffaqiyatli so‘rov uchun xizmat narxi 1200 so‘m.", "*141#"),
                                    ServiceModel("Do It!", "Chinakam cheksiz tungi Internet!", "Kunlik foydalanish uchun to‘lov 12,630 so‘m.\n" +
                                            "\n" +
                                            "Cheksiz Internet, soat 01:00 dan 08:59 gacha taqdim etiladi;Abonent to‘lovi, soat 01:00 dan 08:59 gacha bo‘lgan vaqt oralig‘ida faqat 1 Mb.dan ortiq Internetdan foydalangan kun uchun abonent to‘lovi yechiladi;Xizmat «Status +», «Status», «Bir oy», «Bolajon» va «Erkin muloqot» tarif rejalar turkumidan tashqari, oldindan to‘lov tizimining barcha abonentlari uchun amal qiladi;Tungi foydalanish vaqtida, Mb paketidan sarflanmaydi;«Do It» xizmatini ulaganda, «Hamma tarmoqda» xizmatiga ulanish ko‘zda tutilmagan;", "*100500#"),
                                    ServiceModel("SMS non-stop", "«SMS non-stop» xizmati bilan siz kuniga 250 ta mahalliy SMS olasiz.", "«SMS non-stop» xizmati bilan siz kuniga 250 ta mahalliy SMS olasiz. Kunlik abonent to‘lovi 1300 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish kod *110*150#", "*110*151#"),
                                    ServiceModel("O‘zimning raqamlarim", "Siz bir nechta Beeline raqamlaridan foydalanasiz va ularni qaysi biri sizning nomingizga rasmiylashtirilganligini bilmoqchimisiz?", "Siz bir nechta Beeline raqamlaridan foydalanasiz va ularni qaysi biri sizning nomingizga rasmiylashtirilganligini bilmoqchimisiz?\n" +
                                            "\n" +
                                            "Yangi «O‘zimning raqamlarim» xizmati bilan bu judayam oson va butunlay tekin!\n" +
                                            "\n" +
                                            "Agar siz pasportingizni almashtirgan bo‘lsangiz, amaldagi Ommaviy shartnomaga muvofiq bu haqda Kompaniyani xabardor qilishingiz, hamda \"Beeline\" ning istalgan sotish va xizmat ko‘rsatish ofislarining biriga murojaat qilishingiz zarur.\n" +
                                            "\n" +
                                            "Abonent ma’lumotlariga o‘zgartirish kiritish maqsadida Kompaniya xodimiga yangi pasportingizni taqdim qilishingiz kerak.", "*303#"),
                                    ServiceModel("Xabardor bo‘l", "Agar sizning telefoningiz eng kerak vaqtda o‘chib qolsa, siz biror  bir qo‘ng‘iroqni o‘tkazib yubormaysiz", "Agar sizning telefoningiz eng kerak vaqtda o‘chib qolsa, siz biror  bir qo‘ng‘iroqni o‘tkazib yubormaysiz. Sizga qo‘ng‘iroq qilishgan raqamlari SMS-xabar orqali keladi.\n" +
                                            "\n" +
                                            "Kunlik abonent to‘lovi 240 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish kodi - *110*050#", "*110*051#"),
                                    ServiceModel("Xabardor bo'l", "Sizga qo‘ng‘iroq qilgan abonentlar hamisha sizning telefoningiz tarmoqda paydo bo‘lganligidan va siz bilan yana aloqa bog‘lash mumkinligidan xabardor qilinadi.", "Raqamingiz o‘chirilgan yoki xizmat doirasidan tashqarida bo‘lgan holatlarda \"Bog‘lanish mumkin\" xizmati raqamingizga kiruvchi qo‘ng‘iroqlarni qayd qilib boradi va raqamingiz ishga tushgan vaqtda sizga qo‘ng‘iroq qilgan raqamlarga sizning raqamingiz endi tarmoqda ekanligi haqida sms keladi.\n" +
                                            "\n" +
                                            "Kunlik abonent to‘lovi 240 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish kodi - *110*052#", "*110*051#"),
                                    ServiceModel("Bog‘lanish mumkin", "Abonentga kiruvchi qo‘ng‘iroqlar uchun odatdagi chaqiruv gudoklari o‘rniga har xil ohanglar va tovushlar o‘rnatish imkoniyatini taqdim etadi.", "Abonentga kiruvchi qo‘ng‘iroqlar uchun odatdagi chaqiruv gudoklari o‘rniga har xil ohanglar va tovushlar o‘rnatish imkoniyatini taqdim etadi.\n" +
                                            "\n" +
                                            "Abonent to‘lovi 210 so‘m/kun.\n" +
                                            "\n" +
                                            "Xizmatga ulanish narxi 842 so‘m.\n" +
                                            "\n" +
                                            "Xizmatga ulanish narxi 842 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni yoqish kodi - *110*311#\n" ,"*110*310#"),
                                    ServiceModel("Raqamni antianiqlagich", "Qo‘ng‘iroq chog‘ida Antianiqlash sizning raqamingizni, hatto suhbatdoshda Raqamni aniqlash xizmati o‘rnatilgan taqdirda ham, sir saqlaydi.", "“Telefon raqamini antianiqlash” xizmati sizga maxfiylikni saqlashga va Beeline abonentlarining istalgan telefon raqamiga chiquvchi qo‘ng‘iroqlar chog‘ida o‘zingizning telefon raqamingizni aniqlashni taqiqlashga imkon beradi.\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish kodi - *110*070#\n" +
                                            "\n" +
                                            "Xizmatga ulanish narxi 421 so‘m\n" +
                                            "\n" +
                                            " \n" +
                                            "\n" +
                                            "Kunlik abonent to‘lovi 421 so‘m/kun", "*110*071#"))
                                ))
                        }
                    }
                }

                OPERATOR_UZMOBILE -> {
                    when(category){
                        CATEGORY_INTERNET -> {
                            return listOf(

                                CategoryModel("KUNLIK", listOf(
                                    InternetModel("100MB", "3 000 so'm", "100 MB", "Faollashtirilgandan so’ng 24 soat davomida", "*147*10043*45114#"),
                                    InternetModel("300MB", "6 000 so'm", "300 MB", "Faollashtirilgandan so’ng 24 soat davomida", "*147*10050*45114#"),
                                    InternetModel("600MB", "9 000 so'm", "600 MB", "Faollashtirilgandan so’ng 24 soat davomida", "*147*10051*45114#")
                                )),
                                CategoryModel("OYLIK", listOf(
                                    InternetModel("500 MB", "10 000 so'm", "500 MB", "30 kun", "*147*10072*45114#"),
                                    InternetModel("1 500 MB", "15 000 so'm", "1500 MB", "30 kun", "*147*10073*45114#"),
                                    InternetModel("3 000 MB", "24 000 so'm", "3000 MB", "30 kun", "*147*10074*45114#"),
                                    InternetModel("5 000 MB", "32 000 so'm", "5000 MB", "30 kun", "*147*10075*45114#"),
                                    InternetModel("8 000 MB", "41 000 so'm", "8000 MB", "30 kun", "*147*10076*45114#"),
                                    InternetModel("12 000 MB", "50 000 so'm", "12000 MB", "30 kun", "*147*10077*45114#"),
                                    InternetModel("20 000 MB", "65 000 so'm", "20000 MB", "30 kun", "*147*10078*45114#"),
                                    InternetModel("30 000 MB", "75 000 so'm", "30000 MB", "30 kun", "*147*10079*45114#"),
                                    InternetModel("50 000 MB", "85 000 so'm", "50000 MB", "30 kun", "*147*10080*45114#"),
                                    InternetModel("75 000 MB", "110 000 so'm", "75000 MB", "30 kun", "*147*10150*45114#")
                                )),
                                CategoryModel("TAS-IX", listOf(
                                    InternetModel("TAS-IX 2 GB", "15 000 so'm", "2048 MB", "Amal qilish muddati 90 kun", "*147*10068*45114#"),
                                    InternetModel("TAS-IX 10 GB", "40 000 so'm", "10 240 MB", "Amal qilish muddati 90 kun", "*147*10069*45114#"),
                                    InternetModel("TAS-IX 15 GB", "50 000 so'm", "15 360  MB", "Amal qilish muddati 90 kun", "*147*10070*45114#")
                                 )),
                                CategoryModel("KUNLIK NON-STOP", listOf(
                                    InternetModel("100 MB non stop", "Ulanish narxi(1 499 so'm)", "Kunlik to'lov(1 499 so'm)", "kunlik soat 07:00 dan 18:59 gacha", "*121*1*6*1*1#"),
                                    InternetModel("300 MB non stop", "Ulanish narxi(2 999 so'm)", "Kunlik to'lov(2 999 so'm)", "kunlik soat 07:00 dan 18:59 gacha", "*121*1*6*2*1#"),
                                    InternetModel("600 MB non stop", "Ulanish narxi(4 499 so'm)", "Kunlik to'lov(4 499 so'm)", "kunlik soat 07:00 dan 18:59 gacha", "*121*1*6*3*1#")
                                )),
                                CategoryModel("OYLIK NON-STOP", listOf(
                                    InternetModel("3 000 MB non-stop", "Birinchi oy(24 000 so'm)", "Keyingi oylardan(21 600)", "Har 30 kun", "*147*10055*45114#"),
                                    InternetModel("5 000 MB non-stop", "Birinchi oy(32 000 so'm)", "Keyingi oylardan(28 800)", "Har 30 kun", "*147*10056*45114#"),
                                    InternetModel("8 000 MB non-stop", "Birinchi oy(41 000 so'm)", "Keyingi oylardan(36 900)", "Har 30 kun", "*147*10057*45114#"),
                                    InternetModel("12 000 MB non-stop", "Birinchi oy(50 000 so'm)", "Keyingi oylardan(45 000)", "Har 30 kun", "*147*10151*45114#"),
                                    InternetModel("20 000 MB non-stop", "Birinchi oy(65 000 so'm)", "Keyingi oylardan(58 500)", "Har 30 kun", "*147*10152*45114#"),
                                    InternetModel("30 000 MB non-stop", "Birinchi oy(75 000 so'm)", "Keyingi oylardan(67 500)", "Har 30 kun", "*147*10153*45114#"),
                                    InternetModel("50 000 MB non-stop", "Birinchi oy(80 000 so'm)", "Keyingi oylardan(76 500)", "Har 30 kun", "*147*10154*45114#")
                                )),
                                CategoryModel("Constructor", listOf(
                                    InternetModel("100 MB", "6 310 so'm", "100 MB", "Ushbu paketni xarid qilish uchun balansingizda kamida 7 310 so'm", "*147*10129*45114#"),
                                    InternetModel("500 MB", "21 050 so'm", "500 MB", "Ushbu paketni xarid qilish uchun balansingizda kamida 22 050 so'm", "*147*10133*45114#"),
                                    InternetModel("1 000 MB", "27 360 so'm", "1000 MB", "Ushbu paketni xarid qilish uchun balansingizda kamida 28 360 so'm", "*147*10132*45114#"),
                                    InternetModel("2 000 MB", "46 310 so'm", "2000 MB", "Ushbu paketni xarid qilish uchun balansingizda kamida 47 310 so'm", "*147*10131*45114#"),
                                    InternetModel("4 000 MB", "71 570 so'm", "4000 MB", "Ushbu paketni xarid qilish uchun balansingizda kamida 72 570 so'm", "*147*10130*45114#")

                                  ))
                            )
                        }
                        CATEGORY_TARIF -> {
                            return listOf(
                                CategoryModel("UNITS", listOf(
                                    TarifModel("UNITS 700", "7 000 so'm","7 kun", "700 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 7 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*1#"),
                                    TarifModel("UNITS 1500", "15 000 so'm","15 kun", "1500 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 15 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*2#"),
                                    TarifModel("UNITS 4000", "20 000 so'm","30 kun", "4000 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 20 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*3#"),
                                    TarifModel("UNITS 8000", "35 000 so'm","30 kun", "8000 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 35 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*4#"),
                                    TarifModel("UNITS 11 000", "45 000 so'm","30 kun", "11 000 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 45 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*5#"),
                                    TarifModel("UNITS 14 000", "55 000 so'm","30 kun", "14 000 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 55 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*6#"),
                                    TarifModel("UNITS 18 000", "65 000 so'm","30 kun", "18 000 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 65 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*7#"),
                                    TarifModel("UNITS 22 000", "75 000 so'm","30 kun", "22 000 UNITS\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 75 000 so‘m  abonent to‘lovi\n" +
                                            "● 1 daqiqa - 1 UNIT\n" +
                                            "● 1 SMS - 1 UNIT\n" +
                                            "● 1 MB - 1 UNIT \n"+
                                            "● Tarif rejaning (TR) hisob-kitob davri – tanlangan opsiyaga qarab –- 7, 15 yoki 30 kun.\n"+
                                            "● Barcha Units resurslarini sarf etib boʻlinganda, chiquvchi qoʻngʻiroqlar, SMS va Internetga kirish bloklanadi. Imkoniyat quyidagi hollarda tiklanadi:\n"+
                                            "● Hisob-kitob davri kelganda abonent toʻlovi (AT) toʻlangandan soʻng;\n"+
                                            "● “Restart” xizmati faollashtirilganda (abonent toʻlovi yechib olinadi, AT yechib olingandan soʻng, tanlangan TRga muvofiq resurslar taqdim etiladi)\n"+
                                            "● Tarif toʻplamlari ichida oʻtishlar – bepul.\n",  "*777*8#")

                                )),
                                CategoryModel("Faol Muloqot", listOf(
                                    TarifModel("Oddiy 10", "10 000 so'm","30 kun", "Barchasi oddiy - barchasi o‘n! Oyiga 10 daqiqa, 10 megabayt, 10 ta sms, undan oshig‘i atigi 10 so‘m!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 10 daqiqa tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 10 daqiqa O‘zbekistonning boshqa operatorlariga\n" +
                                            "● 10 MB mobil internet\n" +
                                            "● 10 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 10 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 10 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 10 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasi jismoniy va yuridik shaxslar uchun, 2019-yil 1-fеvraldan 31-dekabrga qadar taqdim etiladi\n" +
                                            "●  Intеrnеt tarifikatsiyasi kvanti 1 Kb\n" +
                                            "●  Tarif rejasidan boshqa tarif rejasiga o‘tish narxi – bеpul\n" +
                                            "●  «Oddiy 10» tarif rejasiga o‘tish narxi - 10 000 so‘m\n" +
                                            "●  Tarif reja doirasida kuniga bittadan 200 tagacha SMS narxi – 10 so‘m, kuniga 200tadan ortiq SMS narxi – 84 so‘m",  "*111*1*11*12#"),
                                    TarifModel("OnLime", "49 900 so'm","30 kun", "Jozibador tarif yoqimli narxlarda\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 2,000 daqiqa tarmoq ichida\n" +
                                            "● 1,000 daqiqa O‘zbekistonning boshqa operatorlariga\n" +
                                            "● 10,000 MB mobil internet\n" +
                                            "● 1,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 280 so‘m 1 MB Internet-trafik uchun\n" +
                                            "TARIF REJASINI O‘ZGARTIRISH\n" +
                                            "●  «Uzmobile VIP», «Uzmobile 1200», «Uzmobile 4000», «Flash», «Royal» tarif rejalaridan o‘tish - 4,200 so‘m\n" +
                                            "●  \"Ishbilarmon\" tarif rejasidan o‘tish - 10,000 so‘m\n" +
                                            "●  Boshqa barcha tarif rejalaridan o‘tish - 0 so‘m",  "*111*1*11*1*1#"),
                                    TarifModel("Street", "39 900 so'm","30 kun", "Do‘stlar bilan muloqot qiling, uyda ham ko‘chada ham onlayn bo‘ling!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 1,500 daqiqa tarmoq ichida\n" +
                                            "● 750 daqiqa O‘zbekistonning boshqa operatorlariga\n" +
                                            "● 6,500 MB mobil internet\n" +
                                            "● 750 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 160 so‘m 1 MB Internet-trafik uchun\n" +
                                            "TARIF REJASINI O‘ZGARTIRISH\n" +
                                            "●  «Uzmobile VIP», «Uzmobile 1200», «Uzmobile 4000», «Flash», «Royal» tarif rejalaridan o‘tish - 4,200 so‘m\n" +
                                            "●  \"Ishbilarmon\" tarif rejasidan o‘tish - 10,000 so‘m\n" +
                                            "●  Boshqa barcha tarif rejalaridan o‘tish - 0 so‘m",  "*111*1*11*1*1#"),
                                   TarifModel("Street Upgrade”", "119 700 so'm","90 kun", "Do‘stlar bilan muloqot qiling, uyda ham ko‘chada ham onlayn bo‘ling!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 6000 daqiqa tarmoq ichida\n" +
                                            "● 3000 daqiqa O‘zbekistonning boshqa operatorlariga\n" +
                                            "● 26 000 MB mobil internet\n" +
                                            "● 3000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 280 so‘m 1 MB Internet-trafik uchun\n" +
                                            "TARIF REJASINI O‘ZGARTIRISH\n" +
                                            "●  «Uzmobile VIP», «Uzmobile 1200», «Uzmobile 4000», «Flash», «Royal» tarif rejalaridan o‘tish - 4,200 so‘m\n" +
                                            "●  \"Ishbilarmon\" tarif rejasidan o‘tish - 10,000 so‘m\n" +
					    "●  Ushbu TR abonentlari uchun “RESTART”, “Foydali almashinuv” va “Internet-trafik o‘tkazmasi” xizmatlari mavjud.\n" +
                                            "●  Boshqa barcha tarif rejalaridan o‘tish - 0 so‘m",  "*111*1*11*4*1#"),
				   TarifModel("Flash Upgrade”", "209 700 so'm","90 kun", "Do‘stlar bilan muloqot qiling, uyda ham ko‘chada ham onlayn bo‘ling!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 8000 daqiqa tarmoq ichida\n" +
                                            "● 6000 daqiqa O‘zbekistonning boshqa operatorlariga\n" +
                                            "● 64 000 MB mobil internet\n" +
                                            "● 3000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 280 so‘m 1 MB Internet-trafik uchun\n" +
                                            "TARIF REJASINI O‘ZGARTIRISH\n" +
                                            "●  «Uzmobile VIP», «Uzmobile 1200», «Uzmobile 4000», «Flash», «Royal» tarif rejalaridan o‘tish - 4,200 so‘m\n" +
                                            "●  \"Ishbilarmon\" tarif rejasidan o‘tish - 10,000 so‘m\n" +
					    "●  Ushbu TR abonentlari uchun “RESTART”, “Foydali almashinuv” va “Internet-trafik o‘tkazmasi” xizmatlari mavjud.\n" +
                                            "●  Boshqa barcha tarif rejalaridan o‘tish - 0 so‘m",  "*111*1*11*5*1#"),
                                    TarifModel("Flash", "69 900 so'm","30 kun", "Yorqin taassurotlarni kashf etish uchun daqiqalar va internet paketlar!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 2,000 daqiqa tarmoq ichida\n" +
                                            "● 1,500 daqiqa O‘zbekistonning boshqa operatorlariga\n" +
                                            "● 16,000 MB mobil internet\n" +
                                            "● 1,500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 160 so‘m 1 MB Internet-trafik uchun\n" +
                                            "TARIF REJASINI O‘ZGARTIRISH\n" +
                                            "●  «Uzmobile VIP», «Uzmobile 4000», «Street», «Royal» tarif rejalaridan o‘tish - 4,200 so‘m\n" +
                                            "●  «Ishbilarmon» tarif rejasidan o‘tish - 10,000 so‘m\n" +
                                            "●  Boshqa barcha tarif rejalaridan o‘tish - 0 so‘m",  "*111*1*11*2*1#"),
                                    TarifModel("Ishbilarmon", "99 000 so'm","30 kun", "Ishbilarmon bo‘ling, biznes qiling! Muloqotni soqqali ishlar uchun sarflang!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP qo‘ng‘iroqlar tarmoq ichida va O‘zbekistonning boshqa operatorlariga\n" +
                                            "● 25,000 Mb Internet-trafik limiti\n" +
                                            "● 3,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 0 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "BOSHQA SHARTLAR\n" +
                                            "●  45,000 daqiqalik texnologik chegaradan so‘ng barcha chiquvchi qo‘ng‘iroqlar bloklanadi\n" +
                                            "●  Tarif rejasiga ulanish - 0 so‘m\n" +
                                            "●  “Ishbilarmon” tarif rejasidan boshqa tarif rejasiga o‘tish narxi - 10,000 so‘m",  "*111*1*11*10#"),
                                    TarifModel("Royal", "149 900 so'm","30 kun", "Yashash yaxshi, shoxona yashash undan ham yaxshi, VIP tarifda hammasi yaxshi!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP qo‘ng‘iroqlar tarmoq ichida va O‘zbekistonning boshqa operatorlariga\n" +
                                            "● VIP mobil internet\n" +
                                            "● 5,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 0 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 0 so‘m 1 MB Internet-trafik uchun\n" +
                                            "BOSHQA SHARTLAR\n" +
                                            "●  45,000 daqiqalik texnologik chegaradan so‘ng barcha chiquvchi qo‘ng‘iroqlar bloklanadi\n" +
                                            "●  100,000 Mb trafikdan so‘ng joriy billing davr uchun internet tezligi 128 kb/s gacha pasaytiriladi\n" +
                                            "●  Tarif rejasiga ulanish - 0 so‘m",  "*111*1*11*3*1#")
                                    
                                  


                                )),
                                CategoryModel("Imtiyozli", listOf(
                                    TarifModel("Ta'lim", "34 900 so'm","30 kun", "Ta'lim olishning chegarasi yo‘q!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 300 daqiqa barcha chiqish qo‘ng‘iroqlari\n" +
                                            "● 1000 daqiqa tarif reja doirasida \n" +
                                            "● 8 000 Mb mobil internet\n" +
                                            "● 500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 40 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 40 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  “TA‘LIM” tarif rejasi (bundan buyon matnda TR deb yuritiladi) oliy va o‘rta maxsus o‘quv yurtlari (institutlar, universitetlar, litseylar, kollejlar) talabalari va o‘qituvchilari, shuningdek maktab o‘qituvchilari uchun mo‘ljallangan. Ulanishda talabalar talabalik guvohnomasini va o‘qituvchilar esa guvohnomalarini taqdim etishlari kerak.\n"+
                                            "●  Boshqa tarif rejalaridan mazkur tarif rejasiga faqatgina UZTELECOM savdo va xizmat ko‘rsatish ofislarida tegishli hujjatlarni taqdim etgan holda o‘tish va ulanish mumkin. Ushbu TRga dilerlik xizmat ko‘rsatish nuqtasi orqali ulanish yopiq.\n"+
                                            "●  Abonentlarga nominal qiymati 5 000, 8 000 va 12 000 MB bo'lgan maxsus Internet-paketlar taklif etiladi, ular odatdagi Internet-paketlardan 20% gacha arzonroq hisoblanadi.\n"+
                                            "Quyidagi tarif rejalardan “TA‘LIM”tarif rejasiga o‘tish qiymati:\n" +
                                            "●  “Aloqachi”, “Bolajon”, “C1”, “C2”, “C3”, “C4”, “Constructor”, “Ezoz”, “MAKTAB”, “Salom”, “Salom Plus”, “Step”, “Taʼlim”, “Traffic”, “Yoshlar”, “Oddiy 10” -  0 so‘m\n"+
                                            "●  “Flash”, “Flash Upgrade”, “Komfort”, “Onlime”, “Royal”, “Street”, “Street Upgrade”, “Uzmobile 1200”, “Uzmobile 4000”, “Uzmobile VIP” - 4 200 so‘m\n"+
                                            "●  “Ishbilarmon” - 10 000 so‘m;\n",

                                            ""),
                                    TarifModel("Maktab", "29 900 so'm","30 kun", "O'quvchilar uchun tarif reja!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 200 daqiqa barcha chiqish qo‘ng‘iroqlari\n" +
                                            "● 500 daqiqa tarif reja doirasida \n" +
                                            "● 5 000 Mb mobil internet\n" +
                                            "● 500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 40 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 40 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Boshqa tarif rejalaridan mazkur TRga ulanish faqat UZTELECOM sotuv va xizmat ko‘rsatish ofislarida tegishli hujjatlarni taqdim etgan holda amalga oshiriladi. Ushbu TRga dilerlik xizmat ko‘rsatish nuqtasi orqali ulanish imkoniyati mavjud emas.\n"+
                                            "●  Ushbu TRda “TA‘LIM” maxsus Internet-to‘plamlar guruhiga ulanishlar mavjud.\n"+
                                            "●  Ushbu TRdagi abonentlarga foydalanilishi tariflanmaydigan Internet-resurslar ro‘yxatida belgilangan Internet-resurslarga kirish imkoniyati beriladi.\n"+
                                            "Quyidagi tarif rejalardan “MAKTAB” TRga o‘tish narxi:\n" +
                                            "●  “Aloqachi”, “Bolajon”, “C1”, “C2”, “C3”, “C4”, “Constructor”, “Ezoz”, “MAKTAB”, “Salom”, “Salom Plus”, “Step”, “Taʼlim”, “Traffic”, “Yoshlar”, “Oddiy 10” -  0 so‘m\n"+
                                            "●  “Flash”, “Flash Upgrade”, “Komfort”, “Onlime”, “Royal”, “Street”, “Street Upgrade”, “Uzmobile 1200”, “Uzmobile 4000”, “Uzmobile VIP” - 4 200 so‘m\n"+
                                            "●  “Ishbilarmon” - 10 000 so‘m;\n",

                                        ""),
                                    TarifModel("Bolajon", "18 000 so'm","30 kun", "Bilim olishning chegarasi yo‘q! Farzandlar uchun foydali internetga yo‘l oching!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 200 daqiqa barcha chiqish qo‘ng‘iroqlari\n" +
                                            "● 2,000 Mb \"Ziyonet\" tarmog‘i doirasida berilgan trafik limiti\n" +
                                            "● 200 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 20 so‘m tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 40 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 20 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 8 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Trafik tarifikatsiyasi APN ziyonet.uzmobile.uz",  ""),
                                    TarifModel("Yoshlar", "5 000 so'm","30 kun", "O‘zbekiston Yoshlar Ittifoqi a’zolari uchun imtiyozli tarif rejasi\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 500 daqiqa tarif ichida bepul chiqish qo‘ng‘iroqlari\n" +
                                            "● 25 so‘m O‘zbekiston bo‘ylab chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 25 so‘m tarmoq ichida chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 25 so‘m tarif ichida chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 25 so‘m 1 MB Internet trafigi\n" +
                                            "● 25 so‘m 1 ta SMS-xabar narxi\n" +
                                            "● 500 so‘m 1 ta xalqaro SMS-xabar narxi\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejaga faqat jismoniy shaxslar ulanishi mumkin va faqat O‘zbekiston Yoshlar Ittifoqi a’zolari uchun mo‘ljallangan\n" +
                                            "●  «Yoshlar» tarif rejasi 30 yoshgacha bo‘lgan abonеntlar uchun taqdim etiladi\n" +
                                            "●  Yoshlar Ittifoqi taqdim etgan reyestr asosida amalga oshiriladi\n" +
                                            "●  Tarif rejasiga boshqa tarif rejalaridan o‘tish mumkin emas\n" +
                                            "●  «Yoshlar» tarif rejasiga: C1, C2, C3, C4, Salom, Salom Plus, Step, Traffic, UZCARD GSM, UzMobile M2M, Uzmobile 1200, Uzmobile 4000, Uzmobile VIP tarif rejalaridan o‘tish mumkin\n" +
                                            "●  Tarif rejasiga ulanish operatorning savdo va dilerlik ofislarida amalga oshiriladi",  "")

                                )),
                                CategoryModel("M2M", listOf(
                                    TarifModel("UZCARD GSM", "6 310 so'm","30 kun", "Banklararo «UzCard» to‘lov tizimiga ulangan tadbirkorlik obyektlari uchun tarif rejasi\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 250 MB bepul mobil internet trafigi\n" +
                                            "● 280 so‘m 1 MB Internet trafigi\n" +
                                            "● 126 so‘m kirish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 126 so‘m O‘zbekiston bo‘ylab chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 126 so‘m tarmoq ichida chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 84 so‘m 1 ta SMS-xabar narxi\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet trafigini tariflash kvanti - 16 Kb\n" +
                                            "●  Tarif reja faqat Banklararo «UzCard» to‘lov tizimiga ulangan tadbirkorlik obektlar uchun taqdim etiladi\n" +
                                            "●  «Uzmobile M2M basic», «M2M basic for Corporate», «Uzmobile M2M» va «HUMO GSM» tarif rejalaridan/ga o‘tish imkoniyati mavjud\n" +
                                            "●  Tarif rejasini o‘zgartirish narxi - 4200 so‘m\n" +
                                            "●  Tarif rejasiga ulanish operatorning savdo va dilerlik ofislarida amalga oshiriladi",  ""),
                                    TarifModel("HUMO GSM", "6 310 so'm","30 kun", "Banklararo «HUMO» to‘lov tizimiga ulangan tadbirkorlik obyektlari uchun tarif rejasi\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
                                            "● 250 MB bepul mobil internet trafigi\n" +
                                            "● 280 so‘m 1 MB Internet trafigi\n" +
                                            "● 126 so‘m kirish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 126 so‘m O‘zbekiston bo‘ylab chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 126 so‘m tarmoq ichida chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 84 so‘m 1 ta SMS-xabar narxi\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet trafigini tariflash kvanti - 16 Kb\n" +
                                            "●  Tarif reja faqat Banklararo «UZCARD» to‘lov tizimiga ulangan tadbirkorlik obyektlar uchun taqdim etiladi\n" +
                                            "●  «Uzmobile M2M basic», «М2М basic for Corporate», «Uzmobile M2M» va «UZCARD GSM» tarif rejalaridan/ga o‘tish imkoniyati mavjud\n" +
                                            "●  Tarif rejasini o‘zgartirish narxi - 4200 so‘m\n" +
                                            "●  Tarif rejasiga ulanish operatorning savdo va dilerlik ofislarida amalga oshiriladi",  ""),
                                    TarifModel("Uzmobile M2M", "6 310 so'm","30 kun", "Banklararo «UzCard» to‘lov tizimiga ulangan tadbirkorlik obyektlari uchun tarif rejasi\n" +
                                            "\n" +
                                            "\n" +
                                            "TARIF NARXLARI\n" +
					    "● 250 MB  mobil internet\n" +
                                            "● 150 daqiqa bepul mobil internet trafigi\n" +
                                            "● 126 so‘m kirish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 280 so‘m 1 MB Internet trafigi\n" +
                                            "● 126 so‘m O‘zbekiston bo‘ylab chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 126 so‘m tarmoq ichida chiqish qo‘ng‘iroqlari 1 daqiqasi\n" +
                                            "● 84 so‘m 1 ta SMS-xabar narxi\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet trafigini tariflash kvanti - 16 Kb\n" +
                                            "●  Tarif reja faqat Banklararo «UzCard» to‘lov tizimiga ulangan tadbirkorlik obektlar uchun taqdim etiladi\n" +
                                            "●  «Uzmobile M2M basic», «M2M basic for Corporate», «Uzmobile M2M» va «HUMO GSM» tarif rejalaridan/ga o‘tish imkoniyati mavjud\n" +
                                            "●  Tarif rejasini o‘zgartirish narxi - 4200 so‘m\n" +
                                            "●  Tarif rejasiga ulanish operatorning savdo va dilerlik ofislarida amalga oshiriladi",  "")

                                ))
                            )
                        }
                        CATEGORY_MINUTES -> {
                            return listOf(
                                CategoryModel("Oylik", listOf(
                                    MinuteModel("100 daq", "4 000 so'm", "100 daqiqa", "", "*111*1*3*1#"),
                                    MinuteModel("300 daq", "10 000 so'm", "300 daqiqa", "", "*111*1*3*2#"),
                                    MinuteModel("600 daq", "16 000 so'm", "600 daqiqa", "", "*111*1*3*3#"),
                                    MinuteModel("1200 daq", "24 000 so'm", "1200 daqiqa", "", "*111*1*3*4#")
                                )),
                                CategoryModel("Foydali almashtiruv", listOf(
                                    MinuteModel("100 daq/mb", "2 000 so'm", "100 daqiqa/100 mb", "100 Daqiqani 100 MBga almashtirish.\nAmal qilish muddati 5 kun", "*545*1*1#"),
                                    MinuteModel("200 daq/mb", "3 000 so'm", "200 daqiqa/200 mb", "200 Daqiqani 100 MBga almashtirish.\nAmal qilish muddati 5 kun", "*545*1*2#"),
                                    MinuteModel("500 daq/mb", "6 000 so'm", "500 daqiqa/500 mb", "500 Daqiqani 500 MBga almashtirish.\nAmal qilish muddati 5 kun", "*545*1*3#"),
                                    MinuteModel("100 mb/daq", "1 000 so'm", "100 mb/100 daqiqa", "100 MBni 100 daqiqaga almashtirish.\nAmal qilish muddati 5 kun", "*545*2*1#"),
                                    MinuteModel("200 mb/daq", "2 000 so'm", "200 mb/200 daqiqa", "200 MBni 200 daqiqaga almashtirish.\nAmal qilish muddati 5 kun", "*545*2*2#"),
                                    MinuteModel("500 mb/daq", "5 000 so'm", "500 mb/500 daqiqa", "500 MBni 500 daqiqaga almashtirish.\nAmal qilish muddati 5 kun", "*545*2*3#")

                                    ))
                            )
                        }
                        CATEGORY_SMS -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    BaseModel("50 SMS Kunlik", "420 so'm", "50 ta SMS", "1 kun", "*111*1*19*1*1#"),
                                    BaseModel("100 SMS Kunlik", "840 so'm", "100 ta SMS", "1 kun", "*111*1*19*2*1#"),
                                    BaseModel("10 SMS", "420 so'm", "10 ta SMS", "30 kun", "*111*1*1*1#"),
                                    BaseModel("50 SMS", "1 680 so'm", "50 ta SMS", "30 kun", "*111*1*1*2#"),
                                    BaseModel("200 SMS", "5 200 so'm", "200 ta SMS", "30 kun", "*111*1*1*3#"),
                                    BaseModel("500 SMS", "9 500 so'm", "500 ta SMS", "30 kun", "*111*1*1*4#"),
                                    BaseModel("Xalqaro SMS 10", "5 050 so'm", "10 ta SMS", "30 kun", "*111*1*2*1#"),
                                    BaseModel("Xalqaro SMS 20", "9 260 so'm", "20 ta SMS", "30 kun", "*111*1*2*2#"),
                                    BaseModel("Xalqaro SMS 30", "12 630 so'm", "30 ta SMS", "30 kun", "*111*1*2*3#"),
                                    BaseModel("Xalqaro SMS 40", "15 150 so'm", "40 ta SMS", "30 kun", "*111*1*2*4#"),
                                    BaseModel("Xalqaro SMS 50", "16 840 so'm", "50 ta SMS", "30 kun", "*111*1*2*5#")
                                ))
                            )

                        }
                        CATEGORY_ADVEN -> {
                            return listOf(
                                CategoryModel("USSD kodlar", listOf(
                                    AdventageModel("Limit va balansni tekshirish", "*107#"),
                                    AdventageModel("Hisobni boshqarish", "*100#"),
                                    AdventageModel("Mening raqamaim", "*100*4#"),
                                    AdventageModel("Trafik, minut, sms qoldig'ini ko'rish", "*100*2#"),
                                    AdventageModel("Abonent raqamlari ro'yxati", "*100*5#"),
                                    AdventageModel("4G LTE ni yoqish", "*111*2*7*1#"),
                                    AdventageModel("4G LTE ni o'chirish", "*111*2*7*2#"),
                                    AdventageModel("Qurilma IMEI kodi", "*#06#"),
                                    AdventageModel("Pereadresatsiyani tekshirish", "*#67#"),
                                    AdventageModel("Kutib turishni faollashtirish", "*43#"),
                                    AdventageModel("Telefon ma'lumotlari", "*#*#4636#*#*")
                                )),
                                CategoryModel("Zaruriy xizmatlar", listOf(
                                    AdventageModel("O't o'chirish xizmati", "101"),
                                    AdventageModel("Militsiya", "102"),
                                    AdventageModel("Tez yordam", "103"),
                                    AdventageModel("Gaz avariyasi xizmati", "104"),
                                    AdventageModel("Qutqaruv xizmati", "1050")
                                )),
                                CategoryModel("Qisqa raqamlar", listOf(
                                    AdventageModel("Prezident virtual qabulxonasi", "1000"),
                                    AdventageModel("Interaktiv davlat xizmatlari portali", "1006"),
                                    AdventageModel("Adliya vazirligi", "1008"),
                                    AdventageModel("Bosh prokuratura", "1007"),
                                    AdventageModel("Temir yo'l ma'lumotxonasi", "1005"),
                                    AdventageModel("Dorixona ma'lumotnomasi", "1142"),
                                    AdventageModel("Aloqa operatorlari ko'dlari", "1192"),
                                    AdventageModel("Xotin-qizlar qo'mitasi", "1146"),
                                    AdventageModel("Toshshahartransxizmat", "1062")
                                ))
                            )
                        }
                        CATEGORY_SERVICES -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    ServiceModel("Limitsiz ovoz", "Ushbu xizmat abonentlarga GSM va CDMA tarmoqlari ichida bepul qo‘ng‘iroqlarni amalga oshirish imkonini beradi.",
                                        "Xizmat abonent to‘lovi, kuniga 210 so‘mXizmatni faollashtirish narxi 0 so‘mXizmatni o‘chirish *111*1*15*2# " +
                                                "Xizmat faqat jismoniy shaxs, GSM abonentlari uchun amal qiladi.Limitsiz optsiyadan foydalanishda paket bo‘yicha trafik sarflanmaydi." +
                                                "Xizmatni faollashtirish/faollashtirishdan uzish narxi – bepul. Xizmatni faollashtirish dalili bo‘yicha kundalik abonent to‘lovi hisobga olinadi. Abonent hisobida xizmat uchun abonent to‘lovini amalga oshirishga yetarli mablag‘ bo‘lmaganida, xizmatning amal qilishi to‘xtatib qo‘yiladi.Xizmat abonent UZMOBILE amal qilish zonasida bo‘lganida amal qiladi.", "*111*1*15*1#"),
                                    ServiceModel("Chaqiruvni kutish", "Bir qo‘ng‘iroq davomida boshqa qo‘ng‘iroqqa javob berishga imkon beradi", "«Chaqiruvni kutish» (ikkinchi liniya) xizmati bir qo‘ng‘iroq davomida boshqa qo‘ng‘iroqqa javob berishga imkon beradi.\n" +
                                            "\n" +
                                            "Xizmat narxi 0 so‘m.\n" +
                                            "\n" +
                                            "Chaqiruvni kutish rejimida muloqot har bir qo‘ng‘iroq uchun alohida hisoblanadi va tarif rejasi asosida narxlanadi.", "*43#"),
                                    ServiceModel("Qabul qilinmagan qo'ng'iroq", " Ushbu xizmat orqali telefoni o‘chiq bo‘lganda yoki tarmoqdan tashqari bo‘lgan hollarda qabul qilinmagan qo‘ng‘iroqlar haqida ma’lumotga ega bo‘lishlari mumkin.", "Telefon o‘chirilgan yoki xizmat ko‘rsatish doirasidan tashqari bo‘lgandan keyin, abonent tarrmoqqa qaytsa, 0771 qisqa raqamidan quyidagicha SMS-xabar keladi:\n" +
                                            "\n" +
                                            "Xizmat narxi 40 so‘m.\n"+
                                            "Xizmatni faollashtirish: *111*1*4*1#\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish: *111*1*4*2#\n", "*111#"),
                                            ServiceModel("Tungi internet", "Abonentlariga cheklanmagan tungi internet xizmatidan foydalanishga imkon beradi", "Mazkur xizmat Pre-paid tizim abonentlariga cheklanmagan tungi internet xizmatidan foydalanishga imkon beradi. Har bir abonent o‘ziga mos xizmatning “Tun”, \"7 tun\" yoki “30 tun” turidan birini tanlashi mumkin.\n" +
                                            "\n" +
                                            "Xizmat narxi:\n" +
                                            "\n" +
                                            "Tun - 6,300 so‘m -*111*1*18*1#\n" +
                                            "\n" +
                                            "7 Tun - 31,500 so‘m -*111*1*18*3#\n" +
                                            "\n" +
                                            "30 Tun - 99,000 so‘m -*111*1*18*2#\n" +
                                            "\n" +
                                            "Shartlari:\n" +
                                            "\n" +
                                            "Kunlik cheklanmagan tezlikdagi (abonent foydalanayotgan hududga qarab) internet trafigi chegarasi 12 000 МB ni tashkil etadi. Agar uzatilgan va qabul qilingan ma’lumotlar bir sutkada 12 000 MB dan ortsa, Internet tezligi 64 Kbit/sekundgacha pasayadi.«Tun» xizmati faollashgandan so‘ng tungi soat 01:00 dan ertalabgi soat 07:59 ga qadar amal qiladi. Agar abonent “Tun” xizmatini soat 00:00dan so‘ng, lekin soat 08:00 gacha faollashtirgan bo‘lsa, faollashtirgan kundanoq xizmatdan foydalana oladi. Agarda, abonent xizmatni 08:00 dan 00:00 gacha faollashtirsa, xizmatdan keyingi kun soat 01:00dan 08:00 gacha foydalana oladi.«7 tun» xizmati, faollashtirish sanasidan qat’iy nazar, 7 sutka amal qiladi.«30 tun» xizmati, faollashtirish sanasidan qat’iy nazar, 31 sutka amal qiladi.Abonent bir vaqtning o‘zida xizmatning faqat bir turini faollashtirishi mumkin.“Tungi Internet” xizmatning “Tun”, “7 tun” va “30 tun” turlari faollashtirilganda xizmat haqqi bir marta olinadi.", "*111*1*18*1#"),
                                    ServiceModel("Tungi qo‘ng‘iroqlar", "Tarmoq ichida bepul tungi qo‘ng‘iroqlar xizmati", "Xizmatni faollashtirishdan keyin, tarmoq (GSM/CDMA) ichida qo‘ng‘iroqlar, shuningdek, «O‘zbektelekom» va uning filiallari liniyalarida qayd etilgan raqamlarga chiquvchi qo‘ng‘iroqlar (xizmat amal qilish davrida) narxlanmaydi.\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish narxi 420 so‘m, abonent to‘lovi kuniga 42 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish: *111*1*16*1#\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish: *111*1*16*2#\n" +
                                            "\n" +
                                            "Xizmatni tekshirish: *111*1*16*3#\n" +
                                            "\n" +
                                            "Xizmatning amal qilish muddati: har kuni 22:00 dan 07: 00 gachaXizmat barcha abonentlar, jismoniy va yuridik shaxslarga taqdim etiladi (M2M Basic tarif rejasi abonentlaridan tashqari). Xizmatni amal qilish hududi – O‘zbekiston Respublikasi, UZMOBILE GSM standarti tarmog‘i.Agar abonent Xizmatdan uzilsa, unda oldindan hisobga olingan to‘lovlar abonent hisobiga qaytarilmaydi.", "*111*1*16*1#"),
                                    ServiceModel("ZiyoNet", "Yoshlarga va o‘sib kelayotgan avlodga ta’limga oid manbaalardan foydalanishni tashkillashtirish", "«ZiyoNet» xizmatining maqsadi - yoshlarga va o‘sib kelayotgan avlodga ta’limga oid manbaalardan foydalanishni tashkillashtirish.\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish narxi 420 so‘m, abonent to‘lovi kuniga 210 so‘m, ZiyoNET manbaalariga 1 MB trafik uchun narx 8 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish: *111*1/2/3*16*1#\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish: *111*1/2/3*16*2#\n" +
                                            "\n" +
                                            "Xizmatni tekshirish: *111*1/2/3*16*3#\n" +
                                            "\n" +
                                            "Xizmat barcha abonentlar, jismoniy va yuridik shaxslarga taqdim etiladi. Xizmatni amal qilish hududi – O‘zbekiston Respublikasi, UZMOBILE GSM standarti tarmog‘i.Agar abonent Xizmatdan uzilsa, unda oldindan hisobga olingan to‘lovlar abonent hisobiga qaytarilmaydi.Raqam, tarif rejalari almashtirilganida xizmatni taqdim etish shartlari o‘zgarmaydi", "*111*2*12*1#"),
                                    ServiceModel("Oila uchun", "Guruh ichida barcha chiquvchi qo‘ng‘iroqlar – 0,00 so‘m", "Guruh ichida barcha chiquvchi qo‘ng‘iroqlar – 0,00 so‘m\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish narxi 2,100 so‘m, abonent to‘lovi kuniga 420 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish: *111*1*17*1*1#\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish: *111*1*17*1*2#\n" +
                                            "\n" +
                                            "Xizmatni tekshirish: *111*1*17*1*3#\n" +
                                            "\n" +
                                            "Trafik - Cheklanmagan;Oila uchun xizmatiga, GSM tarmog‘i hamma tarif rejalaridagi jismoniy shaxslar ulanishi mumkin;Xizmatni faollashtirishda guruh ichidagi barcha chiquvchi qo‘ng‘iroqlar – 0,00 so‘m, kiritilgan daqiqa limiti sarflanmaydi. Bir shartnoma asosida rasmiylashtirilgan barcha raqamlar guruh bo‘lib hisoblanadi;Raqam, tarif rejalari almashtirilganida xizmatni taqdim etish shartlari o‘zgarmaydi;Xizmatdan foydalanishda tarif rejasi yoki paketga kiritilgan ovozli trafik /limit sarflanmaydi;", "*111*1*17*1*1#"),
                                    ServiceModel("YHQ jarimalari haqida xabar xizmati", "GSM jismoniy va yuridik shaxslar abonentlar uchun yo‘l harakati qoidalarini buzganlik xabarnomalarini olish xizmati.", "GSM jismoniy va yuridik shaxslar abonentlar uchun yo‘l harakati qoidalarini buzganlik xabarnomalarini olish xizmati.\n" +
                                            "\n" +
                                            "YHQ buzilishi haqidagi 1 SMS narxi - 210,52 so‘m\n" +
                                            "\n" +
                                            "YHQ buzilishi mavjud emasligi haqidagi 1 SMS narxi - 84.21 so‘m\n" +
                                            "\n" +
                                            "Xizmatni boshqarish:\n" +
                                            "O‘z YHQ buzilishlari haqida xabar olish uchun quyidagi axborot bilan bepul SMS jo ’natish zarur: \n" +
                                            "8860 raqamiga «avtomobilning davlat raqami oрaliq bo‘sh joy qoldirish tex. pasport seriyasi va raqami» (Masalan: 01R999XY AAC5447770).\n" +
                                            "\n" +
                                            "Abonent soro‘v jo‘natgan vaqtdan boshlab soro‘viga javoban nechta to‘lovi amalga oshirilmagan qoida buzilishlar bo‘lsa, shuncha sonli pulli SMS-xabar oladi.\n" +
                                            "\n" +
                                            "Qoida buzish mavjud bo‘lmaganda javoban pullik quyidagi matnli SMS-xabar keladi: \n" +
                                            "«Sizda qoida buzish mavjud emas».", ""),
                                    ServiceModel("Shaxsiy raqam uzatilishini taqiqlash", "Yashirin raqamdan qo‘ng‘iroqlar amalga oshirishga ruxsat beradi", "Mazkur xizmat yashirin raqamdan qo‘ng‘iroqlar amalga oshirishga ruxsat beradi, ya’ni qo‘ng‘iroq qabul qilayotgan abonent, qo‘ng‘iroqni amalga oshirayotgan abonentning telefon raqamini ko‘ra olmaydi. \n" +
                                            "\n" +
                                            "Qo‘ng‘iroq qabul qilayotgan abonent telefonida raqam o‘rniga “Raqam yashirilgan”, “Maxfiy raqam” yoki telefon apparati turiga ko‘ra, shunga o‘xshash yozuv chiqadi. \n" +
                                            "\n" +
                                            "Xizmat abonent to‘lovi oyiga 8400 so‘m.\n" +
                                            "\n" +
                                            "Xizmatni kompaniya ofislarida yoqtirish mumkin.", "*111*1*6#")
                                ))
                            )
                        }
                    }
                }

                OPERATOR_UCELL -> {
                    when(category){
                        CATEGORY_INTERNET -> {
                            return listOf(
                            CategoryModel("OYLIK", listOf(
                                    InternetModel("To'plam 1 GB", "8 900 so'm", "1024 MB", "", "*558*555*3*1*20247#"),
                                    InternetModel("To'plam 1.5 GB", "13 000 so'm", "1536 MB", "", "*558*555*3*2*20247#"),
                                    InternetModel("To'plam 2 GB", "15 000 so'm", "2048 MB", "", "*558*555*3*3*20247#"),
                                    InternetModel("To'plam 4 GB", "25 000 so'm", "4096 MB", "", "*558*555*3*4*20247#"),
                                    InternetModel("To'plam 7 GB", "35 000 so'm", "7168 MB", "", "*558*555*3*5*20247#"),
                                    InternetModel("To'plam 13 GB", "55 000 so'm", "13 312 MB", "", "*558*555*3*6*20247#"),
                                    InternetModel("To'plam 20 GB", "65 000 so'm", "20 480 MB", "", "*558*555*3*7*20247#"),
                                    InternetModel("To'plam 30 GB", "75 000 so'm", "30 720 MB", "", "*558*555*3*8*20247#"),
                                    InternetModel("To'plam 50 GB", "85 000 so'm", "51 200 MB", "", "*558*555*3*9*20247#"),
                                    InternetModel("To'plam 80 GB", "115 000 so'm", "81 920 MB", "", "*558*555*3*10*20247#"),
                                    InternetModel("To'plam 90 GB", "135 000 so'm", "92 160 MB", "", "*558*555*3*11*20247#"),
                                    InternetModel("To'plam 135 GB", "188 000 so'm", "138 240 MB", "", "*558*555*3*12*20247#")
                                )),
                                CategoryModel("AKSIYA", listOf(
                                    InternetModel("300 MB", "5 000 so'm", "300 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("1 GB", "8 000 so'm", "1 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("2 GB", "15 000 so'm", "2 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("3 GB", "20 000 so'm", "3 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("6 GB", "30 000 so'm", "6 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("10 GB", "50 000 so'm", "10 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("2 GB", "10 000 so'm", "2 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("3 GB", "15 000 so'm", "3 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("6 GB", "27 000 so'm", "6 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#"),
                                    InternetModel("10 GB", "50 000 so'm", "10 000 MB", "«COSMO», «Kayfiyat» va «Tantana Unlim» tariflar tizimi uchu" , "*255#")
                                )),
                                CategoryModel("Soatbay", listOf(
                                  
                                    InternetModel("5GB", "3 000 so'm", "1 soatga", "Xizmatning amal qilish davri 14:00-19:00", "*616#")
                                )),
                                CategoryModel("KUNLIK", listOf(
                                    InternetModel("To‘plam 5", "390 so'm", "5 MB", "", "*555*1*1*1#"),
                                    InternetModel("To‘plam 10", "550 so'm", "10 MB", "", "*555*1*2*1#"),
                                    InternetModel("To‘plam 20", "790 so'm", "20 MB", "", "*555*1*3*1#"),
                                    InternetModel("To‘plam 35", "1 190 so'm", "35 MB", "", "*555*1*4*1#"),
                                    InternetModel("To‘plam 55", "1 890 so'm", "55 MB", "", "*555*1*5*1#"),
                                    InternetModel("To‘plam 100", "2 790 so'm", "100 MB", "", "*555*1*6*1#"),
                                    InternetModel("To‘plam 130", "3 790 so'm", "130 MB", "", "*555*1*7*1#"),
                                    InternetModel("To‘plam 160", "4 490 so'm", "160 MB", "", "*555*1*8*1#"),
                                    InternetModel("To‘plam 200", "4 990 so'm", "200 MB", "", "*555*1*9*1#")
                                )),

                                CategoryModel("TUNGI", listOf(
                                    InternetModel("To‘plam 5GB", "20 000 so'm", "5120 MB", "Xizmatdan foydalanish davri: 01:00-09:00\n30kun", "*616#"),
                                    InternetModel("To‘plam 20 GB", "45 000 so'm", "20 480 MB", "Xizmatdan foydalanish davri: 01:00-09:00\n30kun", "*616#")
                                )),
                                CategoryModel("HAFTALIK", listOf(
                                    InternetModel("Haftalik 80 to‘plami", "8 420 so'm", "80 MB", "", "*555*2*1*1#"),
                                    InternetModel("Haftalik 160 to‘plami", "12 630 so'm", "160 MB", "", "*555*2*2*1#"),
                                    InternetModel("Haftalik 320 to‘plami", "16 840 so'm", "320 MB", "", "*555*2*3*1#")
                                )),
                                CategoryModel("TAS IX", listOf(
                                    InternetModel("TAS IX 8GB to‘plami", "10 000 so'm", "8 000 MB", "", "*616#"),
                                    InternetModel("TAS IX 14GB to‘plami", "15 000 so'm", "14 000 MB", "", "*616#"),
                                    InternetModel("TAS IX 20GB to‘plami", "20 000 so'm", "20 000 MB", "", "*616#")
                                ))
                            )
                        }
                        CATEGORY_TARIF -> {
                            return listOf(
                                CategoryModel("OYLIK", listOf(
//                                    TarifModel("Azizlarim", "7 000 so'm","30 kun", "Yaqinlaringizga g‘amxo‘rlik qiling, guruhga birlashing, umumiy hisobdan foydalaning.\n" +
//                                            "\n" +
//                                            "\n" +
//                                            "TARIF NARXLARI\n" +
//                                            "● 7,000 so‘m oylik abonent to‘lovi\n" +
//                                            "● 25 so‘m guruh ichidagi chiquvchi qo‘ng‘iroqlar\n" +
//                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
//                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
//                                            "● 25 so‘m guruh ichidagi chiquvchi SMSlar\n" +
//                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
//                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
//                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
//                                            "SHARTLAR\n" +
//                                            "●  Tarif maxsus xizmat opsiyalariga ega, quyida tanishing\n" +
//                                            "●  Opsiyalardagi bepul daqiqalar va internet paketlarining amal qilish muddati joriy yilning oxirigacha\n" +
//                                            "●  Tarif rejasi faqat yangi ulanishlar uchun ochiq, amaldagi abonentlar mazkur tarif rejasiga o‘ta olmaydilar\n" +
//                                            "●  Bitta pasport ma’lumotlari asosida \"Azizlarim\" tarif rejasidagi faqat 5 ta abonent raqamini ulash mumkin\n" +
//                                            "●  Turli pasportlar ma’lumotlari asosida ulangan abonent raqamlari \"Azizlarim\" tarif rejasidagi bitta guruhda bo‘la olmaydilar\n" +
//                                            "1-OPSIYA\n" +
//                                            "● 65,255 so‘m oylik abonent to‘lovi\n" +
//                                            "● 1,000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlar bepul limiti\n" +
//                                            "● 1,000 guruh ichida chiquvchi qo‘ng‘iroqlar bepul limiti\n" +
//                                            "● 1,5 GB bepul internet paketi\n" +
//                                            "2-OPSIYA\n" +
//                                            "● 110,302 so‘m oylik abonent to‘lovi\n" +
//                                            "● 5,000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlar bepul limiti\n" +
//                                            "● 5,000 guruh ichida chiquvchi qo‘ng‘iroqlar bepul limiti\n" +
//                                            "● 5 GB bepul internet paketi\n" +
//                                            "3-OPSIYA\n" +
//                                            "● 151,560 so‘m oylik abonent to‘lovi\n" +
//                                            "● 10,000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlar bepul limiti\n" +
//                                            "● 10,000 guruh ichida chiquvchi qo‘ng‘iroqlar bepul limiti\n" +
//                                            "● 10 GB bepul internet paketi",  "*141#"),
                                    TarifModel("Student", "10 000 so'm","30 kun", "Biz bilan hatto o‘qish va o‘rganish ham osonlashadi! O‘rgan student!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 500 daqiqa tarif ichida chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 200 daqiqa O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlariga\n" +
                                            "● 500 MB mobil internet tarfik\n" +
                                            "● 500 MB Facebook, Telegram, WhatsApp uchun\n" +
                                            "● 1000 MB TAS-IX uchun\n" +
                                            "● 1 500 MB tungi vaqt (01:00-09:00) uchun trafik\n" +
                                            "● 200 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida va tarif ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  «Student» tarif rejasi abonentlari boshqa ochiq tarif rejalariga o‘ta olmaydilar\n" +
                                            "●  Tarif rejasi faqat yangi ulanishlar uchun amal qiladi.\n" +
                                            "●  Tarif rejasiga faqat O‘zbekiston Respublikasining barcha o‘quv yurtlari (litseylar, kollejlar, institutlar, universitetlar, akademiyalar va h.k.) hamda akkreditatsiyadan o‘tgan o‘quv yurtlarining filiallari talabalarigina ulanishlari mumkin\n" +
                                            "●  Tarif rejasiga ulanish uchun, pasportni hamda o‘quv yurtida ta’lim olayotganini tasdiqlovchi amaldagi hujjatni taqdim etish lozim\n" +
                                            "●  Bitta pasport ma’lumotlariga «Student» tarif rejasidagi bittagina raqam ulatish mumkin.",  ""),
//                                    TarifModel("Baxtli 25+", "31 575 so'm","30 kun", "Oyiga 31575 so‘m evaziga biryo‘la barchasini oling va qulay muloqot qiling.\n" +
//                                            "\n" +
//                                            "\n" +
//                                            "OYLIK BEPUL PAKETLAR\n" +
//                                            "● 750 daqiqa O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlariga\n" +
//                                            "● 750 SMS xabarlar\n" +
//                                            "● 750 MB mobil internet tarfik\n" +
//                                            "● 500 Facebook, Telegram, WhatsApp uchun internet-trafik\n" +
//                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
//                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
//                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
//                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
//                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
//                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
//                                            "SHARTLAR\n" +
//                                            "●  Tarifga o‘tish narxi (\"Aniq+\" va \"Omadli +\" tariflaridan tashqari) - 0 so‘m\n" +
//                                            "●  Tarif doirasidagi daqiqa/SMS/MBlar limiti abonent to‘lovi yechilganidan keyin to‘liq hajmda belgilanadi va kalendar oyining oxiriga qadar amalda bo‘ladi\n" +
//                                            "●  Taqdim etilgan limitlar keyingi kalendar oyiga o‘tmaydi.",  "*877#"),
                                    TarifModel("Yaxshi kayfiyat",  "13 000 so'm", "30 kun",  "Qulay narxlarda maksimum muloqot orqali suhbat quring, kayfiyatni ko‘taring!\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● 750 daqiqa tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 75 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 300 MB internet trafik\n" +
                                        "● 1000 MB Facebook, Telegram,WhatsApp uchun trafik\n" +
                                        "● 15 daqiqa tarmoq ichidagi chiquvchi qo‘ng‘iroqlarning kunlik limiti\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                        "●  Tarif rejasiga yangidan ulanish yoki boshqa tarifdan o‘tish mumkin\n" +
                                        "●  Tushunmovchiliklarning oldini olish uchun tarif rejasi doirasidagi limitlardan foydalanishdan avval oldindan *102# va *103# USSD-so‘rovlari yordamida limitlar belgilanganligini tekshirib olishni tavsiya etamiz",  "*120#"),
                                    TarifModel("Zo‘r kayfiyat",  "20 000 so'm",  "30 kun",  "Tarifning zo‘ri - kayfiyatning zo‘ri! Qulay narxlarda maksimum muloqot!\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● 1 000 daqiqa tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 150 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 500 MB internet trafik\n" +
                                        "● 1,500 MB Facebook, Telegram,WhatsApp uchun trafik\n" +
                                        "● 25 daqiqa tarmoq ichidagi chiquvchi qo‘ng‘iroqlarning kunlik limiti\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                        "●  Tarif rejasiga yangidan ulanish yoki boshqa tarifdan o‘tish mumkin\n" +
                                        "●  Tushunmovchiliklarning oldini olish uchun tarif rejasi doirasidagi limitlardan foydalanishdan avval oldindan *102# va *103# USSD-so‘rovlari yordamida limitlar belgilanganligini tekshirib olishni tavsiya etamiz",  "*120#"),
                                    TarifModel( "A’lo kayfiyat", "25 000 so'm", "30 kun",  "Internet va muloqot uchun barchasi mujassam, a’lo kayfiyat hamroh bo‘lsin!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 1,200 daqiqa tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 200 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 1,200 MB internet trafik\n" +
                                            "● 2,000 MB Facebook, Telegram,WhatsApp uchun trafik\n" +
                                            "● 33 daqiqa tarmoq ichidagi chiquvchi qo‘ng‘iroqlarning kunlik limiti\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                            "●  Tarif rejasiga yangidan ulanish yoki boshqa tarifdan o‘tish mumkin\n" +
                                            "●  Tushunmovchiliklarning oldini olish uchun tarif rejasi doirasidagi limitlardan foydalanishdan avval oldindan *102# va *103# USSD-so‘rovlari yordamida limitlar belgilanganligini tekshirib olishni tavsiya etamiz",   "*120#"),
                                    TarifModel("Superkayfiyat", "35 000 so'm","30 kun", "Kayfiyatni super darajaga ko‘taramiz, qulay narxlarda barchasi maksimum!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 1,500 daqiqa tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 500 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 200 SMS xabarlar\n" +
                                            "● 1,500 MB internet trafik\n" +
                                            "● 1,500 MB Facebook, Telegram,WhatsApp uchun trafik\n" +
                                            "● 500 MB tungi (01:00-09:00) internet trafik\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                            "●  Tarif rejasiga yangidan ulanish yoki boshqa tarifdan o‘tish mumkin\n" +
                                            "●  Tushunmovchiliklarning oldini olish uchun tarif rejasi doirasidagi limitlardan foydalanishdan avval oldindan *102# va *103# USSD-so‘rovlari yordamida limitlar belgilanganligini tekshirib olishni tavsiya etamiz",  "*120#"),
                                    TarifModel("Tantana", "15 000 so'm","30 kun", "Har kuni sevimlilarimiz bilan muloqot bayrami! Tantanalar mavsumi boshlandi!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 1000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 1000 O‘zbekiston bo‘yicha chiquvchi SMSlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga o‘tish - 0 so‘m\n" +
                                            "●  «Katta Tantana», «Super Tantana» «A’lo kayfiyat», «Superkayfiyat» tarif rejalaridan, «Active» tariflaridan - 2 105 so‘m\n" +
                                            "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                            "●  Restart xizmati «Kayfiyat», Active va «Tantana» tariflar tizimlaridagi abonentlar uchun amal qiladi",  "*120#"),
                                    TarifModel("Katta Tantana", "20 000 so'm","30 kun", "Katta tantanaga tayyormisiz? Suhbat erkinligini his eting, muloqotni boshlang!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 1500 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 1500 O‘zbekiston bo‘yicha chiquvchi SMSlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga o‘tish - 0 so‘m\n" +
                                            "●  «Super Tantana», «Superkayfiyat» tarif rejalaridan, «Active» tariflaridan- 2 105 so‘m\n" +
                                            "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                            "●  Restart xizmati «Kayfiyat», Active va «Tantana» tariflar tizimlaridagi abonentlar uchun amal qiladi",  "*120#"),
                                    TarifModel("Super Tantana", "30 000 so'm","30 kun", "Yaqinlaringizga yanada yaqinroq bo‘ling, super tantana bilan barchasi a’lo!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 3000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 3000 O‘zbekiston bo‘yicha chiquvchi SMSlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga o‘tish - 0 so‘m\n" +
                                            "●  «Active» tariflaridan - 2 105 so‘m\n" +
                                            "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                            "●  Restart xizmati «Kayfiyat», Active va «Tantana» tariflar tizimlaridagi abonentlar uchun amal qiladi",  "*120#"),
                                    TarifModel("Tantana Unlim", "30 000 so'm","30 kun", "Yaqinlaringizga yanada yaqinroq bo‘ling, super tantana bilan barchasi a’lo!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● Cheksiz O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 300 O‘zbekiston bo‘yicha chiquvchi SMSlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga o‘tish - 0 so‘m\n" +
                                            "●  «Active» tariflaridan - 2 105 so‘m\n" +
                                            "●  Oylik abonent to‘lovi har oyda kalendar oyining 1-sanasiga bog‘lanmagan holda yechiladi\n" +
                                            "●  Restart xizmati «Kayfiyat», Active va «Tantana» tariflar tizimlaridagi abonentlar uchun amal qiladi",  "*120#"),
                                    TarifModel("Active 45",  "45 000 so'm",  "30 kun",  "Imtiyozlar olish uchun o‘zgacha bo‘lish shart emas, shunchaki aktiv bo‘ling!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 2,500 daqiqa tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 2,000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 6 GB internet trafik\n" +
                                            "● 1,000 MB tungi (01:00-09:00) internet trafik\n" +
                                            "● 2,000 MB ijtimoiy tarmoqlar uchun internet trafik\n" +
                                            "● 500 O‘zbekiston bo‘yicha chiquvchi SMSlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  “Active 70” va “Active 100” tariflaridan “Active 45” tarifiga o‘tish narxi – 2105 so‘m\n" +
                                            "●  \"2GB\" internet-to‘plamni ulash - *255#, narxi 10,000 so‘m\n" +
                                            "●  Texnik cheklanma – oyiga 45000 daqiqa\n" +
                                            "●  \"Active\" tarif rejalariga yangidan ulanish ham, boshqa tarifdan o‘tish ham mumkin",  "*120#"),
                                    TarifModel("Active 70",  "70 000 so'm",  "30 kun",  "Faollikda davom eting, aktiv muloqot uchun barchasini taqdim etamiz! \n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 4,000 daqiqa tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 4,000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 10,000 MB internet trafik\n" +
                                            "● 2,000 MB tungi (01:00-09:00) internet trafik\n" +
                                            "● 4,000 MB ijtimoiy tarmoqlar uchun internet trafik\n" +
                                            "● 500 O‘zbekiston bo‘yicha chiquvchi SMSlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga o‘tish narxi 0 so‘m\n" +
                                            "●  “Active 70” va “Active 100” tariflaridan “Active 45” tarifiga o‘tish narxi – 2105 so‘m\n" +
                                            "●  \"2GB\" internet-to‘plamni ulash - *255#, narxi 10,000 so‘m\n" +
                                            "●  Texnik cheklanma – oyiga 45000 daqiqa\n" +
                                            "●  \"Active\" tarif rejalariga yangidan ulanish ham, boshqa tarifdan o‘tish ham mumkin",  "*120#"),
                                    TarifModel("Active 100",  "100 000 so'm",  "30 kun",  "100% aktivlikka erishing! Cheksiz imkoniyatlar cheklanmagan qo‘ng‘iroqlar bilan!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● VIP O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 12,000 MB internet trafik\n" +
                                            "● 2,000 MB tungi (01:00-09:00) internet trafik\n" +
                                            "● 10,000 MB ijtimoiy tarmoqlar uchun internet trafik\n" +
                                            "● 3,000 O‘zbekiston bo‘yicha chiquvchi SMSlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga o‘tish narxi 0 so‘m\n" +
                                            "●  “Active 70” va “Active 100” tariflaridan “Active 45” tarifiga o‘tish narxi – 2105 so‘m\n" +
                                            "●  \"2GB\" internet-to‘plamni ulash - *255#, narxi 10,000 so‘m\n" +
                                            "●  Texnik cheklanma – oyiga 45000 daqiqa\n" +
                                            "●  \"Active\" tarif rejalariga yangidan ulanish ham, boshqa tarifdan o‘tish ham mumkin",  "*120#"),
                                    TarifModel("Cosmo 16",  "16 000 so'm",  "30 kun", "Cosmosdagidek tasurotlarga ega bo'ling\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 1000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 200 SMS O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 2 000 MB internet trafik\n",  "*120#"),
                                    TarifModel("Cosmo 23",  "23 000 so'm",  "30 kun",  "Cosmosdagidek tasurotlarga ega bo'ling\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 1500 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 300 SMS O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 3 000 MB internet trafik\n" ,  "*120#"),
                                    TarifModel("Cosmo 28",  "28 000 so'm",  "30 kun",  "Cosmosdagidek tasurotlarga ega bo'ling\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 2000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 500 SMS O‘zbekiston bo‘yicha\n" +
                                            "● 5 000 MB internet trafik\n",  "*120#"),
                                    TarifModel("Uchar Internet", "22 000 so'm",  "30 kun",  "Maksimal tezlikdagi internetdan bahra oling!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● 2 GB internet trafik\n" +
                                            "● 3 GB ijtimoiy tarmoqlar uchun internet trafik\n" +
                                            "● Limitlar tugaganidan keyin 64 kbit/s gacha tezlikda cheksiz internet taqdim etiladi",  "*120#"),
                                    TarifModel("Minnatdormiz!", "0 so'm","30 kun", "Urush faxriylari uchun imtiyozli tarif rejasi! Biz ulardan cheksiz minnatdormiz!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 60 daqiqa O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 126 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 84 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  \"Minnatdormiz!\" tarifiga ulanish kompaniya ofislarida, 1941-1945-yillardagi urush faxriysining maxsus guvohnomasi yoki mehnat fronti qatnashchisining guvohnomasi hamda pasport taqdim etilganida amalga oshiriladi.\n" +
                                            "●  Afg‘oniston hududidagi jangovar harakatlar ishtirokchilari ham yangidan ulanishlari yoki o‘tishlari mumkin\n" +
                                            "●  Bitta pasport ma’lumotlariga \"Minnatdormiz!\" tarif rejasiga bittagina raqam ulatish mumkin.",  "")
                                )),
                                CategoryModel("KUNLIK", listOf(
                                    TarifModel("Oddiy", "380 so'm","1 kun", "Muloqot qilish juda oson! Muloqot qurish juda ham oddiy!\n" +
                                            "\n" +
                                            "\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● 150 TAS-IX, Facebook, Telegram, WhatsApp uchun kunlik internet-trafik\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 94 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 126 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga o‘tish narxi - 2,105 so‘m\n" +
                                            "●  Abonent istalgan Prepaid tarif rejasidan \"Oddiy\" tarif rejasiga o‘tganida, shu vaqtning o‘zidayoq kunlik abonent to‘lovi hisobdan yechiladi",  "*120#"),
                                    TarifModel("Yangi ijobiy", "525 so'm","1 kun", "Muloqot uchun yanada ko‘proq bonuslar! Ijobiy suhbatlarni kashf eting!\n" +
                                            "\n" +
                                            "\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● 10 MB mobil internet tarfik\n" +
                                            "● 100 Facebook, Telegram, WhatsApp uchun internet-trafik\n" +
                                            "HISOBNI TO‘LDIRISH EVAZIGA BEPUL LIMITLAR\n" +
                                            "●  6,000-10,000 so‘m uchun tarmoq ichida 60 daqiqa\n" +
                                            "●  10,000-15,000 so‘m uchun tarmoq ichida 200 daq. + TAS-IX, Facebook, Telegram, WhatsApp uchun 400 MB\n" +
                                            "●  15,000-20,000 so‘m uchun tarmoq ichida 400 daq. + TAS-IX, Facebook, Telegram, WhatsApp uchun 800 MB\n" +
                                            "●  20,000-30,000 so‘m uchun tarmoq ichida 600 daq. + TAS-IX, Facebook, Telegram, WhatsApp uchun 1200 MB\n" +
                                            "●  30,000 dan oshiq so‘m uchun tarmoq ichida 800 daq. + TAS-IX, Facebook, Telegram, WhatsApp uchun 1600 MB\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga o‘tish narxi - 2,105 so‘m\n" +
                                            "●  Bonus mablag‘lar har bir muvaffaqiyatli amalga oshgan hisob to‘ldirish uchun belgilanadi\n" +
                                            "●  Abonent to‘plashi mumkin bo‘lgan bonus daqiqalarning eng katta miqdori – 3000 daqiqa\n" +
                                            "●  Mazkur tarif rejasidan boshqasiga o‘tilganida ТAS-IX, Facebook, Telegram, WhatsApp uchun bonusli MBlar saqlanib qoladi va yangi o‘tilgan tarif reja shartlariga binoan sarflanadi",  "*120#"),
                                    TarifModel("Baxtli 25", "1 052 so'm","1 kun", "Har kungi yoqimli muloqot uchun! Baxtli lahzalarning qadriga yeting!\n" +
                                            "\n" +
                                            "\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● 25 daqiqa O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlariga\n" +
                                            "● 25 MB mobil internet tarfik\n" +
                                            "● 25 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida va tarif ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga o‘tish narxi - 0 so‘m\n" +
                                            "●  “Aniq”, “Aniq+”, “Omadli”, “Omadli+”, “Baxtli 25+” tarif rejalari uchun, “Tantana”, “Kayfiyat” va “Active” tarif rejalari tizimlari uchun “Baxtli 25” tarifiga o‘tish narxi - 2,105 so‘m\n" +
                                            "●  Kundalik belgilangan limitlar oy oxiriga qadar mavjud bo‘ladi",  "*120#"),
                                    TarifModel("Yengil hafta", "5 000 so'm","7 kun", "Qulay narxda yengil muloqot haftasi! Haftani doimo ijobiy kayfiyatda boshlang!\n" +
                                            "\n" +
                                            "\n" +
                                            "HAFTALIK BEPUL PAKETLAR\n" +
                                            "● 200 daqiqa O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlariga\n" +
                                            "● 200 MB mobil internet tarfik\n" +
                                            "● 200 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga o‘tish narxi – 0 so‘m\n" +
                                            "●  \"Superkayfiyat\" tarifidan o‘tish narxi – 2105 so‘m\n" +
                                            "●  Tarif rejasida haftalik abonent to‘lovining yechilishi hamda daqiqalar, SMS va MBlarning belgilanishi ulanish/o‘tish kunidan boshlab, har 7 kunda amalga oshadi\n" +
                                            "●  Quyidagi tarif rejalaridan o‘tish mumkin emas: \"Baxtli 25\", \"Baxtli 25+\", \"Kayfiyat\" (\"Superkayfiyat\"dan tashqari) va \"Active\".",  "*120#"))),
//
                                CategoryModel("SPECIAL", listOf(
                                    TarifModel("Special 35",  "35 000 so'm",  "30 kun",  "Hamma uchun Special! 2,000 daqiqa va 5 GB internet trafik sizga yetarlimi?\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● 2500 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 1000 SMS xabarlar\n" +
                                        "● 7 000 MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Active tariflar tizimidan, Special Mix, Special Super, Special X, Special 55, Special 80 va Special 125 tarif rejalaridan o‘tish narxi - 2105 so‘m\n" +
                                        "●  Qolgan tarif rejalaridan o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),
                                     TarifModel("Special 45",  "45 000 so'm",  "30 kun",  "Hamma uchun Special! 2,500 daqiqa va 8 GB internet trafik sizga yetarlimi?\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● 3000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 2000 SMS xabarlar\n" +
                                        "● 9 000 MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Active tariflar tizimidan, Special Mix, Special Super, Special X, Special 55, Special 80 va Special 125 tarif rejalaridan o‘tish narxi - 2105 so‘m\n" +
                                        "●  Qolgan tarif rejalaridan o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),
                                    TarifModel("Special 55",  "55 000 so'm",  "30 kun",  "9 GB internet trafik va 3,000 daqiqa O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlariga nima deysiz?\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● 4000 daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 3000 SMS xabarlar\n" +
                                        "● 12 000 MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Special 55 tarif rejasiga Active 70, Active 100, Special Super, Special X, Special 80 va Special 125 tarif rejalaridan o‘tish narxi - 2105 so‘m\n" +
                                        "●  Qolgan tarif rejalaridan o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),
                                    TarifModel("Special 70",  "80 000 so'm",  "30 kun",  "3,500 daqiqalik chiqish qo‘ng‘iroqlari hamda 16 GB internet trafikni kutib oling!\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● Cheksiz O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 4000 SMS xabarlar\n" +
                                        "● 16 000 MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Special 80 tarif rejasiga Active 100, Special X va Special 125 tarif rejalaridan o‘tish narxi - 2105 so‘m\n" +
                                        "●  Qolgan tarif rejalaridan o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),
                                     TarifModel("Special 80",  "80 000 so'm",  "30 kun",  "7,000 daqiqalik chiqish qo‘ng‘iroqlari hamda 18 GB internet trafikni kutib oling!\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● Cheksiz daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 5000 SMS xabarlar\n" +
                                        "● 18 000 MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Special 80 tarif rejasiga Active 100, Special X va Special 125 tarif rejalaridan o‘tish narxi - 2105 so‘m\n" +
                                        "●  Qolgan tarif rejalaridan o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),
                                     TarifModel("Special 100",  "100 000 so'm",  "30 kun",  "Cheksiz  chiqish qo‘ng‘iroqlari hamda 25 GB internet trafikni kutib oling!\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● Cheksiz muloqot O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 5000 SMS xabarlar\n" +
                                        "● 25 000 MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Special 80 tarif rejasiga Active 100, Special X va Special 125 tarif rejalaridan o‘tish narxi - 2105 so‘m\n" +
                                        "●  Qolgan tarif rejalaridan o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),
                                    TarifModel("Special 125",  "125 000 so'm",  "30 kun",  "O‘zbekiston bo‘yicha CHEKSIZ chiqish qo‘ng‘iroqlariga ega bo‘ling!\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● Cheksiz muloqot O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 5000 SMS xabarlar\n" +
                                        "● 35 000 MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                        "SHARTLAR\n" +
                                        "●  Chiquvchi qo‘ng‘iroqlarning bir oylik texnologik limiti - 45,000 daqiqa\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Tarif rejasiga o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),
                                    TarifModel("Special Unlim Turbo",  "150 000 so'm",  "30 kun",  "Cheksiz Inernet va O‘zbekiston bo‘yicha CHEKSIZ chiqish qo‘ng‘iroqlariga ega bo‘ling!\n" +
                                            "\n" +
                                            "\n" +
                                            "BEPUL OYLIK PAKETLAR\n" +
                                            "● Cheksiz muloqot O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 5000 SMS xabarlar\n" +
                                            "● Cheksiz MB internet trafik\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 350 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Chiquvchi qo‘ng‘iroqlarning bir oylik texnologik limiti - 45,000 daqiqa\n" +
                                            "●  To'liq tezlikda 100GB, to'liq tezlikda taqdim etilgan limit tugaganidan so'ng, internet tezligi 128kbit/soniyagacha qilib belgilanadi.\n" +
                                            "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                            "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                            "●  Tarif rejasiga o‘tish narxi - 0 so‘m\n" +
                                            "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#"),

                                    TarifModel("Special Unlim",  "139 000 so'm",  "30 kun",  "Cheksiz Inernet va O‘zbekiston bo‘yicha CHEKSIZ chiqish qo‘ng‘iroqlariga ega bo‘ling!\n" +
                                        "\n" +
                                        "\n" +
                                        "BEPUL OYLIK PAKETLAR\n" +
                                        "● Cheksiz daqiqa O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 5 000 SMS xabarlar\n" +
                                        "● Cheksiz MB internet trafik\n" +
                                        "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                        "● 95 so‘m tarmoq ichida chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 125 so‘m O‘zbekiston bo‘yicha chiquvchi qo‘ng‘iroqlar\n" +
                                        "● 80 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                        "● 505.2 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                        "SHARTLAR\n" +
                                        "●  Chiquvchi qo‘ng‘iroqlarning bir oylik texnologik limiti - 45,000 daqiqa\n" +
                                        "●  To'liq tezlikda 50GB, to'liq tezlikda taqdim etilgan limit tugaganidan so'ng, internet tezligi 128kbit/soniyagacha qilib belgilanadi.\n" +
                                        "●  Tarif rejasida Restart xizmatidan foydalanish mumkin\n" +
                                        "●  «2 GB» aksiyasi doirasida 10,000 so‘mga 2 GB hajmidagi internet-to‘plamni 30.07.2019 dan to 26.12.2019 gacha sotib olish mumkin, internet-to‘plamini faollashtirish - *255#\n" +
                                        "●  Tarif rejasiga o‘tish narxi - 0 so‘m\n" +
                                        "●  02.10.2019-y. dan Special 35, Special 55, Special 80 va Special 125 tarif rejalari abonentlari faqat mazkur tariflar tizimiga hamda Active tarif rejalariga o‘tishlari mumkin bo‘ladi, boshqa tarif rejalarga o‘tish imkoniyati bo‘lmaydi",  "*120#")
                                )))


                        }
                        CATEGORY_MINUTES -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    MinuteModel("Qulay daqiqalar 200", "4 000 so'm", "Begim kunlari uchun(O‘zbekiston bo‘yicha 100 daqiqa)", "Dam olish kunlari uchun(O‘zbekiston bo‘yicha +100 daqiqa)", "*130#"),
                                    MinuteModel("Qulay daqiqalar 600", "8 000 so'm", "Begim kunlari uchun(O‘zbekiston bo‘yicha 300 daqiqa)", "Dam olish kunlari uchun(O‘zbekiston bo‘yicha +300 daqiqa)", "*130#"),
                                    MinuteModel("Qulay daqiqalar 1200", "12 000 so'm", "Begim kunlari uchun(O‘zbekiston bo‘yicha 600 daqiqa)", "Dam olish kunlari uchun(O‘zbekiston bo‘yicha +600 daqiqa)", "*130#")
                                ))
                            )
                        }
                        CATEGORY_SMS -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    BaseModel("50 SMS", "1 684 so'm", "50 ta", "", "*147*1*1#"),
                                    BaseModel("150 SMS", "4 210 so'm", "150 ta", "", "*147*1*2#"),
                                    BaseModel("500 SMS", "10 525 so'm", "500 ta", "", "*147*1*3#"),
                                    BaseModel("Kunlik SMS-to‘plam 25", "631.5 so'm", "25 ta", "", "*148*1*1#"),
                                    BaseModel("Kunlik SMS-to‘plam 40", "842 so'm", "40 ta", "", "*148*1*2#"),
                                    BaseModel("Kunlik SMS-to‘plam 75", "1 263 so'm", "75 ta", "", "*148*1*3#")
                                ))
                            )
                        }
                        CATEGORY_ADVEN -> {
                            return listOf(
                                CategoryModel("USSD kodlar", listOf(
                                    AdventageModel("Balansni tekshirish", "*100#"),
                                    AdventageModel("Shaxsiy raqamni aniqlash", "*150#"),
                                    AdventageModel("Internet paket qoldig'ini ko'rish", "*102#"),
                                    AdventageModel("Bonus paket qoldig'ini ko'rish", "*165#"),
                                    AdventageModel("Daqiqalar qoldig'ini ko'rish", "*103#"),
                                    AdventageModel("SMS paket qoldig'ini ko'rish", "*104#"),
                                    AdventageModel("Mobil avans (qarz olish)", "*911#"),
                                    AdventageModel("Mobil internetni yoqish", "*111*0011#"),
                                    AdventageModel("Internet paketlar menyusi", "*111*1*9#"),
                                    AdventageModel("So'nggi to'lov", "*111*015#"),
                                    AdventageModel("Mening xarajatlarim", "*111*025#"),
                                    AdventageModel("GOOD'OK ni o'chirish", "*111*0140#"),
                                    AdventageModel("4G LTE ni yoqish", "*222*1#"),
                                    AdventageModel("4G LTE ni o'chirish", "*222*0#"),
                                    AdventageModel("4G LTE ni tekshirish", "*222*#"),
                                    AdventageModel("Qurilma IMEI kodi", "*#06#"),
                                    AdventageModel("Pereadresatsiyani tekshirish", "*#67#"),
                                    AdventageModel("Kutib turishni faollashtirish", "*43#"),
                                    AdventageModel("Telefon ma'lumotlari", "*#*#4636#*#*")
                                )),
                                CategoryModel("Zaruriy xizmatlar", listOf(
                                    AdventageModel("O't o'chirish xizmati", "101"),
                                    AdventageModel("Militsiya", "102"),
                                    AdventageModel("Tez yordam", "103"),
                                    AdventageModel("Gaz avariyasi xizmati", "104"),
                                    AdventageModel("Qutqaruv xizmati", "1050")
                                )),
                                CategoryModel("Qisqa raqamlar", listOf(
                                    AdventageModel("Prezident virtual qabulxonasi", "1000"),
                                    AdventageModel("Interaktiv davlat xizmatlari portali", "1006"),
                                    AdventageModel("Adliya vazirligi", "1008"),
                                    AdventageModel("Bosh prokuratura", "1007"),
                                    AdventageModel("Temir yo'l ma'lumotxonasi", "1005"),
                                    AdventageModel("Dorixona ma'lumotnomasi", "1142"),
                                    AdventageModel("Aloqa operatorlari ko'dlari", "1192"),
                                    AdventageModel("Xotin-qizlar qo'mitasi", "1146"),
                                    AdventageModel("Toshshahartransxizmat", "1062")
                                ))
                            )
                        }
                        CATEGORY_SERVICES -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    ServiceModel("Special-tarifni o'zgartirish", "Special tarif rejalaridan boshqa tarif rejalariga o'tish uchun maxsus ussd ko'dni yuboring", "", "*277#"),
                                    ServiceModel("Active-tarifni o'zgartirish", "Active tarif rejalaridan boshqa tarif rejalariga o'tish uchun maxsus ussd ko'dni yuboring", "", "*140#"),
                                    ServiceModel("Tilni tanlash", "Ucellning barcha xizmatlaridan o‘zingizga qulay bo‘lgan tilda foydalaning", "Endi siz USSD va SMS habarlarning qabul qilish tilini o‘zingiz tanlashingiz mumkin.\n" +
                                            "\n" +
                                            "O‘z tilingizni tanlash uchun *220# raqamiga USSD so‘rov yuboring.\n" +
                                            "\n" +
                                            "Xizmat BEPUL taqdim etiladi.\n" +
                                            "\n" +
                                            "Izoh: Tilni bir kunda faqat 3 bora o‘zgartirish mumkin.", "*220#"),
                                    ServiceModel("Mening raqamlarim", "O‘zingizning pasportingizga qaysi raqamlar rasmiylashtirilganligini unutib qo‘ydingizmi?", "Endi Siz *360# qisqa raqamiga so‘rov yuborib, bu ma’lumotni tez va osonlik bilan olishingiz mumkin. Javoban Sizga quyidagicha xabar keladi:\n" +
                                            "\n" +
                                            "\"Pasportingizga rasmiylashtirilgan raqam(lar) ro‘yxati:\n" +
                                            "\"raqam\" - \"status\" (aktiv/bloklangan); “hisob XXX”; “xizmatlar XXX”.\n" +
                                            "Agar siz pasportingizni almashtirgan bo‘lsangiz, Ucell Kompaniyasiga xabar berishingizni iltimos qilamiz. www.ucell.uz/ek9\"\n" +
                                            "\n" +
                                            "*Rasmiylashtirilgan raqam(lar) faqatgina, so‘rov yuborilgan abonent raqami rasmiylashtirilgan pasport ma’lumotlariga ko‘ra taqdim etiladi.", "*360#"),
                                    ServiceModel("Tungi Internet", "\"Tungi Internet\" aksiyasi – bu atigi 7 990 so‘m evaziga tungi soat 1:00 dan 9:00 gacha Internetdan foydalanishimkoniyatidir", "Ucelldan \"Tungi Internet\" aksiyasi – bu atigi 7 990 so‘m evaziga tungi soat 1:00 dan 9:00 gacha Internetdan foydalanish imkoniyatidir.\n" +
                                            "\n" +
                                            "Ulanish narxi – 7 990 so‘m\n" +
                                            "\n" +
                                            "Faollashtirish: *616#\n" +
                                            "\n" +
                                            "Bekor qilish: *616*3*1#\n" +
                                            "\n" +
                                            "\"Tezlikni oshirish\" funksiyasi faollashtirish: *616*5#\n" +
                                            "\n" +
                                            "*616# raqamiga USSD-so‘rov jo‘natgandan so‘ng 2 xil opsiyadan birini tanlash imkoniyati bo‘ladi:\n" +
                                            "\n" +
                                            "Barcha tarmoqlarda (2G/3G/4G) Sizga maksimal tezlikdagi 10 000 MB taqdim etiladi. Berilgan trafik limiti tugaganidan so‘ng, Internet tezligi 64 Kb/soniyaga teng bo‘ladi;Faqat 4G tarmog‘i uchun Sizga maksimal tezlikdagi 20 000 MB taqdim etiladi. Berilgan trafik limiti tugaganidan so‘ng, Internet tezligi 64 Kb/soniyaga teng bo‘ladi.\n" +
                                            "\n" +
                                            "Muhim!\n" +
                                            "\n" +
                                            "\"Faqat 4G tarmog‘i uchun\" kiritilgan opsiyadan faqatgina 4G tarmog‘ida foydalanish mumkin; agar SIM-karta 3G yoki 2G tarmoqlariga ulansa, Internet xizmatlari abonentning tarif rejasiga muvofiq narxlanadi. Internet uchun qo‘shimcha xarajatlarning oldini olish maqsadida, qurilma sozlamalarida parametrlarni \"Faqat 4G\" tarzida o‘rnatishni qattiq tavsiya qilamiz.", "*616#"),
                                    ServiceModel("Raqamni yashirish", "Endi siz “Raqamni yashirish” xizmatini faollashtirilmagan holda raqamingizni yashirib qo‘ng‘iroq qilish imkoniayiga egasiz.", "Endi siz “Raqamni yashirish” xizmatini faollashtirilmagan holda raqamingizni yashirib qo‘ng‘iroq qilish imkoniayiga egasiz.\n" +
                                            "\n" +
                                            "Narxi - 252.6 so‘m/daqiqa.\n" +
                                            "\n" +
                                            "Buning uchun “9*” (9 raqami va \"*\" belgisini) abonent raqami oldidan terishingiz lozim: 9*998YYххххххх. Qo‘ng‘iroq qabul qilayotgan abonentga yashirin raqamdan qo‘ng‘iroq bo‘ladi.\n" +
                                            "\n" +
                                            "Xizmatdan foydalangan holda qo‘ng‘iroqning har daqiqasi - 252.6 so‘m tashkil etadi.", ""),
                                    ServiceModel("Men kimman?", "Endi siz zarurat tug‘ilgan vaqtda o‘z raqamingiz va boshqa foydali ma‘lumotlarni *450# raqamiga USSD so‘rov yuborib bilib olishingiz mumkin", "Endi siz zarurat tug‘ilgan vaqtda o‘z raqamingiz va boshqa foydali ma’lumotlarni *450#raqamiga USSD so‘rov yuborib bilib olishingiz mumkin.\n" +
                                            "\n" +
                                            "*450# raqamiga yuborilgan 1 ta omadli so‘rov narxi - 42.1 so‘m\n" +
                                            "\n" +
                                            "Bloklangan holatda so‘rovning narxi - 0 so‘m.\n" +
                                            "\n" +
                                            "*450# raqamiga jo‘natilgan so‘rovga abonentlar quyidagi ma’lumotlarni olishlari mumkin:\n" +
                                            "\n" +
                                            "so‘rov yuborilgan abonent raqami;SIM-karta nomiga rasmiylashtirilgan abonentning FIO;ushbu  raqam uchun amalda bo‘lgan tarif rejasi;oylik abonent to‘lovi yechiladigan sana (“Baxtli 25+”; hamda “Kayfiyat/Kayfiyat BN”, “Active/Active BN” va «Tantana» tarif rejalari tizimlari uchun);so‘rov yuborish vaqtiga ko‘ra raqam holati;ushbu raqam tegishli bo‘lgan tizim.", "*450#"),
                                    ServiceModel("Qo‘ng‘iroqlar filtri", "\"Qo‘ng‘iroqlar filtri\" xizmati Qora ro‘yxatga kiritilgan raqamlardan kelayotgan qo‘ng‘iroqlarni bloklash imkoniyatini beradi.", "\"Qo‘ng‘iroqlar filtri\" xizmati Qora ro‘yxatga kiritilgan raqamlardan kelayotgan qo‘ng‘iroqlarni bloklash yoki Oq ro‘yxatga kiritilgan raqamlardan boshqa barcha raqamlarni bloklash imkoniyatini beradi.\n" +
                                            "\n" +
                                            "Agar bloklangan abonent sizga qo‘ng‘iroq qilishga urunsa u \"Chaqirilayotgan abonent hozir javob bera olmaydi\" degan xabarni oladi.\n" +
                                            "\n" +
                                            "Oddiy rejasining narxi - 336.8 so‘m kuniga.\n" +
                                            "\n" +
                                            "Biznes rejasining narxi - 842 so‘m kuniga.\n" +
                                            "\n" +
                                            "Oddiy rejasini ishga tushirish: *988*1*1#\n" +
                                            "\n" +
                                            "Biznes rejasini ishga tushirish:*988*1*2#\n" +
                                            "\n" +
                                            "Asosiy funksiyalar:\n" +
                                            "\n" +
                                            "*988*1*1# - Oddiy xizmat rejasini ulash;*988*1*2# - Business xizmat rejasini ulash;*988*2*1# - Xizmatni o‘chirish;*988*3# - Xizmat holatini tekshirish;*988*4# - Xizmat haqida ma’lumot.\n" +
                                            "\n" +
                                            "Xizmatni qo‘shimcha funksiyalari:\n" +
                                            "\n" +
                                            "*988*5*1# - Qora ro‘yxatni yoqish;*988*5*2# - Oq ro‘yxatni yoqish;*988*5*3# - raqamni Qora yoki Oq ro‘yxatga qo‘shish;*988*5*4# - raqamni Qora yoki Oq ro‘yxatdan o‘chirish;*988*5*5# - raqamni ro‘yxatlardan qaysi biridaligini tekshirish.", "*111*2*5#"),
                                    ServiceModel("O‘tkazib yuborilgan qo‘ng‘iroqlar", "Sizga kim qo‘ng‘iroq qilganidan boxabar bo‘ling!", "*977# raqamiga USSD-so‘rov yuborib, o‘tkazib yuborilgan qo‘ng‘iroqlar haqida qay tartibda xabar topishni o‘zingiz tanlang!\n" +
                                            "\n" +
                                            "Agar Sizning telefoningiz xizmat ko‘rsatish tarmog‘idan tashqarida yoki o‘chirilgan bo‘lsa, Siz tarmoqqa qaytishingiz bilan xizmat yordamida SMS-xabar orqali quyidagi ma’lumotlarni qabul qilasiz:\n" +
                                            "\n" +
                                            "o‘tkazib yuborilgan qo‘ng‘iroqlarning umumiy soni;har bir raqam bo‘yicha alohida qoldirilgan qo‘ng‘iroqlarning soni;so‘nggi qo‘ng‘iroq qilgan raqamlarning vaqti va sanasi.\n" +
                                            "\n" +
                                            "Xizmatga ulanish - 0 so‘m\n" +
                                            "Kunlik abonent to‘lovi - 199 so‘m/kun", "*977#"),
                                    ServiceModel("Mobil avans", "Keyinchalik to‘lash sharti bilan Kompaniyadan hisobdagi mablag‘larni vaqtinchalik ko‘paytirishni so‘rashga imkon beruvchi xizmatdir", "Hisobda pul tugab, hisobni to‘ldirish imkoni bo‘lmasa ham \"Mobil avans\" xizmati bilan siz doimo aloqada bo‘lasiz. Ucell o‘z abonentlari haqida g‘amxo‘rlik qiladi – \"Mobil avans\" xizmatidan foydalanib, Kompaniyadan hisobingizga ma’lum miqdordagi mablag‘ni qo‘shib oling.\n" +
                                            "\n" +
                                            " 21050 so‘m. Xizmat haqi 2105 so‘m.\n" +
                                            "\n" +
                                            " 12630 so‘m. Xizmat haqi 1263 so‘m.\n" +
                                            "\n" +
                                            " 4210 so‘m. Xizmat haqi 842 so‘m.\n" +
                                            "\n" +
                                            " 2105 so‘m. Xizmat haqi 421 so‘m.", "*911#"),
                                    ServiceModel("Do'stim hisobidan qo'ng'iroq", "Xizmatdan foydalanish uchun...", "Xizmatdan foydalanish uchun do‘stingiz raqamidan oldinyulduzcha (*) raqamini tersangiz kifoya: *99893xxxxxxx yoki *99894xxxxxxx.\n" +
                                            "\n" +
                                            "Qabul qilayotgan abonentga sizning raqamdan qo‘ng‘iroq amalga oshiriladi va so‘zlashuvni uning hisobidan to‘lash taklif etiladi. Agar qabul qiluvchi abonent qo‘ng‘iroqni to‘lashga roz bo‘lsa 1 raqamini bosishi lozim. Agar qabul qiluvchi abonent qo‘ng‘iroqni to‘lashga rozi bo‘lmasa 2 raqamini yoki qo‘ng‘iroqni tugatish tugmasini bosishi lozim, bunda sizga qabul qiluvchi abonent qo‘n’giroqni rad etgani haqida xabar eshittiriladi.\n" +
                                            "\n" +
                                            "Ulanish muvaffaqiyatli amalga oshirilganda qo‘ng‘iroqning har bir daqiqasi 126.3 so‘m teng narxda narxlanadi.\n" +
                                            "\n" +
                                            "Bir kunda ushbu xizmat orqali 10 qo‘ng‘iroq amalga oshirish mumkin.Abonentlardan biri Roumingda bo‘lsa ushbu xizmat ishlamaydi.", ""),
                                    ServiceModel("Menga qo'ng'iroq qil", "Hisobingizda mablag‘ bo‘lmasa...", "Hisobingizda mablag‘ bo‘lmasa, sizga qayta qo‘ng‘iroq qilishlarini so‘rab O‘zbekiston Respublikasi hududidagi istalgan uyali aloqa operatori abonentiga USSD so‘rov yo‘llashingiz mumkin. \n" +
                                            "\n" +
                                            "Ushbu xizmatdan foydalanish usullari USSD so‘rovini quyidagi formatda yo‘llang:\n" +
                                            "\n" +
                                            "*125*998YYXXXXXXX#.\n" +
                                            "\n" +
                                            "Kuniga bepul so‘rovlar miqdori: 2\n" +
                                            "\n" +
                                            "Narxi: 42.1 so‘m/so‘rov (3-chi so‘rovdan boshlab).", ""),
                                    ServiceModel("Mobil o‘tkazma", "Do‘st qiyinchilikda tashlab ketmaydi!", "Agar do‘stingiz hisobida mablag‘ yetarli bo‘lmasa, unga yordam tariqasida kerakli mablag‘ni o‘zingizning hisobingizdan uning hisobiga o‘tkazishingiz mumkin. Shuningdek, aloqa xizmatlariga to‘lov o‘tkazish imkoningiz bo‘lmasa, do‘stingiz siz uchun hisobingizga mablag‘ o‘tkazishini so‘rashingiz mumkin.\n" +
                                            "\n" +
                                            "Xizmatdan foydalanish uchun: *650#\n" +
                                            "\n" +
                                            "Mablag‘ yuborish yoki qabul qilish ushun xizmatni ulash kerak emas.\n" +
                                            "\n" +
                                            "168.4 so‘m bitta muvaffaqiyatli pul o‘tkazishning narxi  (mablag‘ pul o‘tkazuvchi-abonent hisobidan ushlab qolinadi)", "*650#"),
                                    ServiceModel("Maksimal Internet", "Internet foydalanuvchilari uchun yangi taklif!", "Internet foydalanuvchilari uchun yangi taklif!\n" +
                                            "\n" +
                                            "1 MB narxi 09:00dan 01:00gacha - 84,2 so‘m;\n" +
                                            "\n" +
                                            "1 MB narxi 01:00dan 09:00gacha - 4,21 so‘m;\n" +
                                            "\n" +
                                            "Xizmatni ulash narxi: 631,5 so‘m\n" +
                                            "\n" +
                                            "Abonent to‘lovi: 631,5 so‘m kuniga\n" +
                                            "\n" +
                                            "Xizmatni yoqish *808#\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish *808*2#", "*808#")
                                ))
                            )
                        }
                    }
                }

                OPERATOR_UMS -> {
                    when(category){
                        CATEGORY_INTERNET -> {
                            return listOf(
                                CategoryModel("KUNLIK", listOf(
                                    InternetModel("Internet 200", "2000 so'm", "200 MB", "23.05.2021dan so'ng paket narxi 6000 so'm", "*102*1*200#"),
                                    InternetModel("Internet 300", "7000 so'm", "300 MB", "23.05.2021dan so'ng paket narxi 7000 so'm", "*102*1*300#"),
                                    InternetModel("Internet 500", "4000 so'm", "500 MB", "23.05.2021dan so'ng paket narxi 7500 so'm", "*102*1*500#"),
                                    InternetModel("Internet 1000", "5000 so'm", "1000 MB", "23.05.2021dan so'ng paket narxi 10000 so'm", "*102*1*1000#"),
                                    InternetModel("Internet 2000", "9000 so'm", "2000 MB", "23.05.2021dan so'ng paket narxi 14000 so'm", "**102*1*2000#"),
                                    InternetModel("Internet 3000", "12000 so'm", "3000 MB", "23.05.2021dan so'ng paket narxi 19000 so'm", "*102*1*3000#"),
                                    InternetModel("Internet 5000", "16500 so'm", "5000 MB", "23.05.2021dan so'ng paket narxi 24000 so'm", "*102*1*5000#"),
                                    InternetModel("Internet 10000", "25000 so'm", "10000 MB", "23.05.2021dan so'ng paket narxi 35000 so'm", "*102*1*10000#")
                                )),
                                CategoryModel("OYLIK",  listOf(
                                    InternetModel("300 MB", "8 000 so'm", "300 MB", "", "*171*019*1*011500325#"),
                                    InternetModel("500 MB", "9 000 so'm", "500 MB", "", "*171*019*7*011500325#"),
                                    InternetModel("1000 MB", "11 000 so'm", "1000 MB", "", "*171*019*2*011500325#"),
                                    InternetModel("2000 MB", "17 000 so'm", "2000 MB", "", "*171*019*5*011500325#"),
                                    InternetModel("3000 MB", "25 000 so'm", "3000 MB", "", "*171*019*3*011500325#"),
                                    InternetModel("5000 MB", "33 000 so'm", "5000 MB", "", "*171*019*4*011500325#"),
                                    InternetModel("10000 MB", "50 000 so'm", "10000 MB", "", "*171*019*6*011500325#"),
                                    InternetModel("20000 MB", "55 000 so'm", "20000 MB", "", "*171*019*8*011500325#"),
                                    InternetModel("30000 MB", "65 000 so'm", "30000 MB", "", "*171*019*9*011500325#"),
                                    InternetModel("50000 MB", "75 000 so'm", "50000 MB", "", "*171*019*10*011500325#")
                                )),
                                CategoryModel("TUNGI", listOf(
                                    InternetModel("Tungi to’plam 1 000", "5 000 so'm", "1000 MB", "", "*171*203*1000*011500325#"),
                                    InternetModel("Tungi to’plam 2 000", "9 500 so'm", "2000 MB", "", "*171*203*2000*011500325#"),
                                    InternetModel("Tungi to’plam 3 000", "12 500 so'm", "3000 MB", "", "*171*203*3000*011500325#"),
                                    InternetModel("Tungi to’plam 5 000", "17 000 so'm", "5000 MB", "", "*171*203*5000*011500325#"),
                                    InternetModel("Tungi to’plam 10 000", "22 000 so'm", "10000 MB", "", "*171*203*10000*011500325#"),
                                    InternetModel("Tungi to’plam 20 000", "33 000 so'm", "20000 MB", "", "**171*203*20000*011500325#"),
                                    InternetModel("Tungi to’plam 50 000", "44 000 so'm", "50000 MB", "", "*171*203*50000*011500325#")
                                )),
                                CategoryModel("Tungi DRIVE", listOf(
                                    InternetModel("Tungi Drive", "00:00-08:00", "Cheksiz", "", ""),
                                    InternetModel("Tungi DRIVE 1", "5 000 so'm", "Cheksiz", "Amal qilish muddati 1 kun\n23.05.2021dan so'ng paket narxi 10000 so'm", "*171*200*1*011500325*1#"),
                                    InternetModel("Tungi DRIVE 7", "20 000 so'm", "Cheksiz", "Amal qilish muddati 7 kun\n23.05.2021dan so'ng paket narxi 45000 so'm", "*171*200*7*011500325*1#"),
                                    InternetModel("Tungi DRIVE 30", "60 000 so'm", "Cheksiz", "Amal qilish muddati 30 kun\n23.05.2021dan so'ng paket narxi 120000 so'm", "*171*200*30*011500325*1#")
                                )),
                                CategoryModel("ONNET", listOf(
                                    InternetModel("OnNet 300 MB", "8 000 so'm(Birinchi oy uchun)", "300 MB", "Keyingi oylaradagi narhi(-10%)-7 200 so'm", "*171*202*300*011500325#"),
                                    InternetModel("OnNet 500 MB", "9 000 so'm(Birinchi oy uchun)", "500 MB", "Keyingi oylaradagi narhi(-10%)-8 100 so'm", "*171*202*500*011500325#"),
                                    InternetModel("OnNet 1000 MB", "11 000 so'm(Birinchi oy uchun)", "1000 MB", "Keyingi oylaradagi narhi(-10%)-9 900 so'm", "*171*202*1000*011500325#"),
                                    InternetModel("OnNet 2000 MB", "17 000 so'm(Birinchi oy uchun)", "2000 MB", "Keyingi oylaradagi narhi(-10%)-15 300 so'm", "*171*202*2000*011500325#"),
                                    InternetModel("OnNet 3000 MB", "25 000 so'm(Birinchi oy uchun)", "3000 MB", "Keyingi oylaradagi narhi(-10%)-22 500 so'm", "*171*202*3000*011500325#"),
                                    InternetModel("OnNet 5000 MB", "33 000 so'm(Birinchi oy uchun)", "5000 MB", "Keyingi oylaradagi narhi(-10%)-29 700 so'm", "*171*202*5000*011500325#"),
                                    InternetModel("OnNet 10000 MB", "50 000 so'm(Birinchi oy uchun)", "10000 MB", "Keyingi oylaradagi narhi(-10%)-45 000 so'm", "*171*202*10000*011500325#"),
                                    InternetModel("OnNet 20000 MB", "55 000 so'm(Birinchi oy uchun)", "20000 MB", "Keyingi oylaradagi narhi(-10%)-49 500so'm", "*171*202*20000*011500325#"),
                                    InternetModel("OnNet 30000 MB", "65 000 so'm(Birinchi oy uchun)", "30000 MB", "Keyingi oylaradagi narhi(-10%)-58 500 so'm", "*171*202*30000*011500325#"),
                                    InternetModel("OnNet 50000 MB", "75 000 so'm(Birinchi oy uchun)", "50000 MB", "Keyingi oylaradagi narhi(-10%)-67 500 so'm", "*171*202*50000*011500325#")
                                ))
                            )
                        }
                        CATEGORY_TARIF -> {
                            return listOf(
                                CategoryModel("FAOL MULOQOT UCHUN", listOf(
                                   
                                    TarifModel("Omad Plus", "12 000 so'm","30 kun", "Omadli insonlarning tanlovi ham omadlidir! O‘zingiz uchun yangi omadni kashf eting!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 400 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 500 MB mobil internet\n" +
                                            "● 400 SMS xabarlar\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● Kunlik to'lov 600 so'm\n" +
                                            "● 14 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 17 MB mobil internet\n" +
                                            "● 14 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 12 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 12 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 12 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga faqat 2019-yilning 11-iyulidan 31-oktabrigacha ulanish mumkin.\n" +
                                            "●  Faqat Qoraqalpog‘iston Respublikasi, Sirdaryo, Namangan, Xorazm va Toshkent viloyatlari abonentlari uchun\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Ajoyib, Chilla, Chilla Lite, Mini, Terminal, UMS bilan birga, Veteran, Asosiy, Standart, Optimal+, Qulay+, Connect, Yorqin, Premial, Ideal, VIP, Absolut, Absolut Year, Exclusive, Qulay Yillik+, Yorqin Yillik, Premial Yillik, Ideal Yillik, VIP Yillik tariflaridan o‘tish - 4210.35 so‘m",  "*111*044#"),
                                    TarifModel("Chilla Lite", "20 000 so'm","30 kun", "Chillada yana nima qilish mumkin? Dam olishdan zerikdingizmi? Muloqotni boshlang!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 3 000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 200 MB mobil internet\n" +
                                            "● 100 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Yangi \"Chilla Lite\" tarif rejasi endi Samarqand, Farg‘ona, Andijon, Buxoro, Guliston, Jizzax, Qarshi, Navoiy, Namangan, Nukus, Termiz, Urganch, Chirchiq, Yangiyo‘l, Shahrisabz, Qo‘qon va Denov shaharlarida mavjud!\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Chilla Lite» TRda «Gap ko‘p» xizmati ishlamaydi;\n" +
                                            "●  Abonent to`lovi ko`proq bo`lgan tarif rejalaridan \"Chilla Lite\" TRga o`tish narxi - 10000 so`m \n" +
                                            "●  Start, 777, Maxi New, Ultra, Perfect, Asosiy, Standart, Optimal, Optimal+, Qulay, Qulay+, Premial, Ideal, Perfect, VIP Maxi Year, 777 Year, Ultra Year, Absolut, Absolut Year, «Exclusive», Qulay Yillik, Qulay Yillik+, Premial Yillik, Ideal Yillik, VIP Yillik, Chilla tarif rejalaridan Chilla Lite tarif rejasiga o‘tib bo‘lmaydi\n" +
                                            "●  Tarifga ulanish davri 2019 yil 19 fevraldan 2019 yil 30 sentabr kuni oxirigacha\n" +
                                            "●  Ushbu tarifida Super 0 xizmatidan foydalanib bo‘lmaydi",  "*111*042#"),
                                    TarifModel("GAP yo'q", "35 000 so'm","30 kun", "Tarifga GAP yo'q" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 10 000 MB\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● 337 MB\n" +
                                            "● 1750 so'm kunlik to'lov\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 12 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 12 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 12 so‘m 1 MB Internet-trafik uchun\n" +"",
                                         "*111*100#"),

                                           TarifModel("GAP yo'q Pro", "75 000 so'm","30 kun", "Tarifga GAP yo'q" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 1000 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 35 000 MB\n" +
                                            "● 25 000 Tungi MB\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● 1167 MB\n" +
                                            "● 834 MB Tungi MB\n" +
                                            "● 3750 so'm kunlik to'lov\n" +
                                            "● Tungi to‘plam 00.00 dan 08.00 gacha\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 12 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 12 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 12 so‘m 1 MB Internet-trafik uchun\n" +"","*111*101#"),

                                    TarifModel("Yengil", "60 000 so'm","30 kun", "80 daqiqa chiqish qo‘ng‘iroqlari va 80MB mobil internet trafigi!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 80 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 80 MB mobil internet\n" +
                                            "● 80 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 8 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 8 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 8 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Faqat yangi ulanishlar uchun. \"Yengil\" tarif rejasiga ulanish marxi - 2000 so‘m\n" +
                                            "●  Tarif rejasiga 2021-yilning 30-iyun sanasigacha (shu jumladan) ulanish mumkin\n" +
                                            "●  Yengil» tarif rejasiga boshqa tariflardan o‘tish imkoniyati mavjud emas\n" +
                                            "●  Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi\n" +
                                            "●  Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                                            "\n" +
                                            "Internet paketlar va tariflarga oson ulaning - barcha USSD kodlar bir joyda!",  ""),
                                    TarifModel("Terminal +", "12 000 so'm","30 kun", "80 daqiqa chiqish qo‘ng‘iroqlari va 80MB mobil internet trafigi!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 300 MB mobil internet\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 50 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 50 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 126,31 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Terminal+» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  «Terminal +» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  Yengil tarif reajsidan «Terminal +» TRga o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Terminal +» tarif rejasida «Gap Ko‘p» xizmatidan foydalanish imkoniyati mavjud emas.\n" +
                                            "\n" +
                                            "Internet paketlar va tariflarga oson ulaning - barcha USSD kodlar bir joyda!",  "*111*112#")

                                )),
                                CategoryModel("CHEKSIZ MULOQOT", listOf(
                                    TarifModel("Mobi 20", "20 000 so'm","30 kun", "O‘zbekiston bo‘ylab 500 daqiqa chiqish qo‘ng‘iroqlari va " +
                                            "2 000 MB mobil internet trafigiga ega bo‘ling\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 500 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 2 000 MB mobil internet\n" +
                                            "● 500 SMS xabarlar\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● Kunlik to'lov 1000 so'm\n" +
                                            "● 17 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 67 MB mobil internet\n" +
                                            "● 17 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 42,10 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 42,10 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 126,31 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 20» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 20» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 20» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 20» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 20» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*120#"),
                                    TarifModel("Mobi 25", "25 000 so'm","30 kun", "O‘zbekiston bo‘ylab 750 daqiqa chiqish qo‘ng‘iroqlari va " +
                                            "3 500 MB mobil internet trafigiga ega bo‘ling\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 750 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 3 500 MB mobil internet\n" +
                                            "● 750 SMS xabarlar\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● Kunlik to'lov 1250 so'm\n" +
                                            "● 25 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 117 MB mobil internet\n" +
                                            "● 25 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 42,10 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 42,10 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 126,31 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 25» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 25» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 25» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 25» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 25» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*102#"),
                                    TarifModel("Mobi 30", "30 000 so'm","30 kun", "O‘zbekiston bo‘ylab 1000 daqiqa chiqish qo‘ng‘iroqlari va " +
                                            "5 000 MB mobil internet trafigiga ega bo‘ling\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 1 000 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 5 000 MB mobil internet\n" +
                                            "● 1 000 SMS xabarlar\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● Kunlik to'lov 1500 so'm\n" +
                                            "● 33 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 167 MB mobil internet\n" +
                                            "● 33 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 42,10 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 42,10 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 126,31 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 30» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 30» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 30» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 30» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 30» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*128#"),
                                    TarifModel("Mobi 40", "40 000 so'm","30 kun", "O‘zbekiston bo‘ylab 1200 daqiqa chiqish qo‘ng‘iroqlari va " +
                                            "8 000 MB mobil internet trafigiga ega bo‘ling\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 1 200 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 8 000 MB mobil internet\n" +
                                            "● 1 200 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84,2 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "KUNLIK BEPUL PAKETLAR\n" +
                                            "● Kunlik to'lov 2000 so'm\n" +
                                            "● 40 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 267 MB mobil internet\n" +
                                            "● 40 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 42,10 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 42,10 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 126,31 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 40» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 40» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 40» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 40» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 40» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*122#"),
                                    TarifModel("Mobi 50", "50 000 so'm","30 kun", "Tarmoq ichida cheksiz qo‘ng‘iroqlardan baxra oling, O‘zbekiston bo‘yicha esa 1500 daqiqa!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 1 500 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 10 000 MB mobil internet\n" +
                                            "● 1 500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84,2 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 42,10 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 42,10 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 126,31 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 50» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 50» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 50» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 50» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 50» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*129#"),
                                    TarifModel("Mobi 70", "70 000 so'm","30 kun", "Cheksiz qo‘ng‘iroqlar tarmoq ichida hamda 2,500 daqiqa O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlari\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 2 500 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 20 000 MB mobil internet\n" +
                                            "● 2 500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84,2 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 70» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 70» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 70» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 70» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 70» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*131#"),
                                    TarifModel("Mobi 90", "90 000 so'm","30 kun", "O‘zbekiston bo‘yicha 3,500 daqiqa va tarmoq ichida cheksiz chiqish qo‘ng‘iroqlari\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida chiqish qo‘ng‘iroqlari\n" +
                                            "● 3 500 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 65 000 MB mobil internet\n" +
                                            "● 3 500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84,2 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 90» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 90» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 90» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 90» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 90» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*132#"),
                                    TarifModel("Mobi 110", "110 000 so'm","30 kun", "25,000 MB mobil internet trafigi mayliku O‘zbekiston bo‘yicha VIP qo‘ng‘iroqlarga nima deysiz?\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlari\n" +
                                            "● 80 000 MB mobil internet\n" +
                                            "● 5 000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84,2 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 110» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 110» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 110» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 110» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 110» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*133#"),
                                    TarifModel("Mobi 150", "150 000 so'm","30 kun", "50 GB mobil internet trafigiga ega cheksiz qo‘ng‘iroqlar tarifiga ulaning, internetda ham erkin muloqot qiling!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP O‘zbekiston bo‘yicha chiqish qo‘ng‘iroqlari\n" +
                                            "● 100 000 MB mobil internet\n" +
                                            "● 10 000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84,2 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  «Mobi 150» tarif rejasiga yangi ulanganda yoki o‘tilganda Abonent to‘lovi hisob to‘ldirilgandan keyin darhol, to‘liqligicha yechib olinadi;\n" +
                                            "●  Abonent to‘lovi abonent hisobida uni to‘liq yechib olish uchun yetarli mablag‘ bor bo‘lgan holatda,har oyning birinchi marta faollashtirilgan kunida yechib olinadi.\n" +
                                            "●  Agar abonent to‘lovini yechib olish payti kelganda, uni to‘liq yechib olish uchun yetarli mablag‘ bo‘lmasa, abonentning hisobidagi mablag‘lardan har kunlik abonent to‘lovini yechishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                                            "●  Abonent hisobida abonent to‘lovini to‘liq miqdorda yechib olish uchun yetarli mablag‘ bo‘lsa, abonent to‘lovini oylik yechib olishga o‘tiladi. Abonet to‘lovini yechish sanasi 1 kalendar oyiga suriladi.\n" +
                                            "●  «Mobi 150» tarif rejasi va Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi – 0 so‘m.\n" +
                                            "●  «Mobi 150» tarif rejasiga abonent to‘lovi yuqoriroq bo‘lgan tarif rejalaridan o‘tish narxi - 10 000 so‘m\n" +
                                            "●  «Mobi 150» tarif rejasida «Gap ko‘p» xizmatini ulash mumkin. Ulanish narxi- 10 000 so‘m.\n" +
                                            "●  «Mobi 150» tarif rejasiga abonent to‘lovi pastroq bo‘lgan tarif rejalaridan o‘tish narxi - 4210,35 so‘m\n" +
                                            "●  Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                                            "●  Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                                            "●  Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 29 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 35000 so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                                            "●  Tarif rejasini 1 kunda faqat 1 marta o‘zgartirish mumkin",  "*111*134#")

                                )),
                                CategoryModel("IMTIYOZLI", listOf(
                                    TarifModel("O‘qituvchi 1", "16 000 so'm","30 kun", "Mehr nuri yog‘ar doim yuzingizdan ustozlar, yursam deyman shu tabarruk izingizdan ustozlar!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 2000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 100 SMS xabarlar\n" +
                                            "● 2000 MB mobil internet\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 1000 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Ulanish uchun Xalq ta’limi vazirligi tizimi ishchisi pasportining asl nusxasini, guvohnomasining ask nusxasini yoki Xalq ta’limi vazirligi tizimi ishchisi ekanligini tasdiqlovchi hujjat (ma’lumotnoma yoki buyruqdan ko‘chirma) taqdim etishi kerak\n" +
                                            "●  Faqat UMS’ning Xizmat ko‘rsatish markazlarida ushbu tarifga ulanish mumkin",  ""),
                                    TarifModel("O‘qituvchi 2", "30 000 so'm","30 kun", "Kim senga bir xarf o‘rgatmish ranj ila, aylamak bo‘lmas ado oning haqqin ming ganj ila!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 2 000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 5 000 MB internet trafik\n" +
                                            "● 100 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Ulanish uchun Xalq ta’limi vazirligi tizimi ishchisi pasportining asl nusxasini, guvohnomasining ask nusxasini yoki Xalq ta’limi vazirligi tizimi ishchisi ekanligini tasdiqlovchi hujjat (ma’lumotnoma yoki buyruqdan ko‘chirma) taqdim etishi kerak\n" +
                                            "●  Faqat UMSning Xizmat ko‘rsatish markazlarida ushbu tarifga ulanish mumkin",  ""),
                                    TarifModel("FAXRIY", "0 so'm","30 kun", "Tinchlik uchun jonini tikkan faxriylarimizga tazimdamiz, imtiyozli tariflarda muloqot taqdim etamiz!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 200 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 126.31 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Boshlang‘ich komplekt narxi – 5000 so‘m\n" +
                                            "●  Faqat 1941-1945 yillardagi urush qatnashchilari va mehnat fronti faxriylari bu tarif rejasiga ulanishlari yoki o‘tishlari mumkin.\n" +
                                            "●  Ulanish uchun kompaniya ofislariga murojaat qilib, pasport hamda Ikkinchi jahon urushi yoki mehnat fronti ishtirokchisining guvohnomasi ko‘rsatilishi kerak\n" +
                                            "●  Ushbu tarif rejasidan istalgan boshqa tarifga o‘tish mumkin\n" +
                                            "●  Foydalanilmagan daqiqalar keyingi davrga o‘tkazilmaydi",  ""),
                                    TarifModel("MobiUz bilan birga", "8 420 so'm","30 kun", "Mehrga muhtoj insonlanlar doimo etiborimizda, ular uchun imtiyozli tarif rejasi!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 300 daqiqa tarmoq ichida chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 300 SMS xabar\n" +
                                            "● 300 MB internet trafik\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84.21 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.21 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga ulanilgandagi boshlang‘ich to‘lov – 3 000 so‘m\n" +
                                            "●  Tarif rejasiga faqat imkoniyati cheklangan (1-guruh nogironligi bor) shaxslar ulanishlari yoki o‘tishlari mumkin\n" +
                                            "●  Ulanish yoki o‘tish uchun UMS ga qarashli ofislarning biriga murojaat qilib, abonent pasportining asl nusxasini va 1-guruh nogironligi ko‘rsatib o‘tilgan nafaqa daftarchasini taqdim etish kerak\n" +
                                            "●  Foydalanilmagan daqiqalar/SMS/MB kelasi davrga o‘tkazilmaydi\n" +
                                            "\n" +
                                            "Internet paketlar va tariflarga oson ulaning - barcha USSD kodlar bir joyda!",  "")
                                )),
                                CategoryModel("ARXIV", listOf(
                                    TarifModel("Ideal", "105 000 so'm","30 kun", "Erkin kommunikatsiya qilmoqchimisiz, ideal tanlov aynan shu tarifda mujassam!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida cheksiz chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 3,000 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 14,000 MB mobil internet\n" +
                                            "● 3,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 0 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 84.2 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Start, Terminal, Plus, Mini, Besh, Baraka, Ajoyib, Veteran, UMS bilan birga, Optima tarif rejalaridan o‘tish - bepul\n" +
                                            "●  Optimal, Optimal+, Standart, Super Optima, Optima 333, 555, 777, Maxi, Maxi New, Ultra, Perfect, Absolut va yillik tariflardan o‘tish - 4210.35 so‘m\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  Abonent to‘lovi har oyning 1-sanasida yechib olinadi",  "*171*135*011500201*1#"),
                                    TarifModel("VIP", "147 000 so'm","30 kun", "Imkoniyatlar cheksizdir, tasavvurning esa chegarasi yo‘q, muloqot esa cheklanmagan!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida va O‘zbekiston bo‘ylab cheksiz chiquvchi qo‘ng‘iroqlar\n" +
                                            "● 30,000 MB mobil internet\n" +
                                            "● 5,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 0 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  VIP tarif rejasiga ulanayotgan yangi abonentlar «Steel» yoki «Bronze» toifasidagi chiroyli raqamlarni bepul ulashlari mumkin.\n" +
                                            "●  Internet-trafikni narxlash kvanti 1 KB\n" +
                                            "●  Start, Mini, UMS bilan birga, Terminal, Gap bor, Optima, Optima 333, 555, Super Optima, 777 , Maxi, Maxi New, Ultra, Besh, Baraka, Veteran, Plus, Asosiy, Standart, Optimal, Optimal+, Qulay, Qulay+, Premial, Ideal tarif rejalaridan o‘tish narxi - bepul\n" +
                                            "●  Absolute va yillik tarif rejalaridan o‘tish - 4210.35\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  VIP tarif rejasidan boshqa tarif rejasiga o‘tish uchun kompaniya ofislariga murojaat qilish kerak",  "*171*141*011500201*1#"),
                                    TarifModel("Absolut", "631 552 so'm","30 kun", "Cheksizlik shaydolari uchun cheklanmagan muloqot onlariga ega ajoyib tarif!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● VIP tarmoq ichida va O‘zbekiston bo‘ylab cheksiz chiquvchi qo‘ng‘iroqlar\n" +
                                            "● VIP MB mobil internet\n" +
                                            "● 2,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 0 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 0 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  «Absolut» TR ga faqat UMS ning ofislarida ulanish yoki o‘tish mumkin.\n" +
                                            "●  Kalendar oy mobaynida foydalangan Internet-trafik hajmi 50000 MB ga yetganda Internet tarmog‘ining tezligi keyingi oyning 1-kuniga qadar soniyasiga 64 kilobaytgacha cheklab qo‘yiladi\n" +
                                            "●  Oyning qaysi kunida ulanishdan qat’iy nazar tarif rejasi uchun abonent to‘lovi kelasi oyning 1-sanasigacha to‘liq hajmda yechib olinadi\n" +
                                            "●  Ushbu tarifda konferents-aloqa xizmati taqdim etilmaydi",  ""),
                                    TarifModel("Premial", "63 000 so'm","30 kun", "Premium muloqotni amalga oshiruvchilarni ushbu tarif bilan taqdirlaymiz!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 1,500 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 7,000 MB mobil internet\n" +
                                            "● 1,500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 0 so‘m tarmoq ichida qo‘ng‘iroqlar\n" +
                                            "● 84.2 so‘m O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Start, Terminal, Plus, Mini, Besh, Baraka, Ajoyib, Veteran, UMS bilan birga, Optima tarif rejalaridan o‘tish - bepul\n" +
                                            "●  Optimal, Optimal+, Standart, Super Optima, Optima 333, 555, 777, Maxi, Maxi New, Ultra, Perfect, Absolut va yillik tariflardan o‘tish - 4210.35 so‘m\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  Abonent to‘lovi har oyning 1-sanasida yechib olinadi",  "*171*130*011500201*1#"),
                                    TarifModel("Asosiy", "21 000 so'm","30 kun", "Sizga faqat kerakli xajmdagi paketlar - asosiy ishingizdan chalg‘imang!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 500 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 500 MB mobil internet\n" +
                                            "● 500 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Start, Terminal, Plus, Mini, Besh, Baraka, Ajoyib, Veteran, UMS bilan birga, Optima tarif rejalaridan o‘tish - bepul\n" +
                                            "●  Optimal, Optimal+, Standart, Super Optima, Optima 333, 555, 777, Maxi, Maxi New, Ultra, Perfect, Absolut va yillik tariflardan o‘tish - 4210.35 so‘m\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  Abonent to‘lovi har oyning 1-sanasida yechib olinadi",  "*171*114*011500201*1#"),
                                    TarifModel("Standart", "25 000 so'm","30 kun", "Faoliyatingizda barchasi standartmi? Telefoningda ham aynan shu!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 700 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 1,000 MB mobil internet\n" +
                                            "● 700 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Start, Terminal, Plus, Mini, Besh, Baraka, Ajoyib, Veteran, UMS bilan birga, Optima tarif rejalaridan o‘tish - bepul\n" +
                                            "●  Optimal, Optimal+, Standart, Super Optima, Optima 333, 555, 777, Maxi, Maxi New, Ultra, Perfect, Absolut va yillik tariflardan o‘tish - 4210.35 so‘m\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  Abonent to‘lovini yechib olish tarifga ulanilgan/o‘tilgandan keyin bir sutka davomida amalga oshiriladi",  "*171*117*011500201*1#"),

                                    TarifModel("Chilla", "40 000 so'm","30 kun", "Chilla tariflari bilan samimiy muloqotdan baxra oling, oylik 10 ming daqiqa sizniki!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 10,000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 1,000 SMS xabarlar\n" +
                                            "● 1,000 MB mobil internet\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84.2 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarifga ulanish barcha abonentlar - jismoniy shaxslar uchun (Toshkent shahri abonentlaridan tashqari) amal qiladi\n" +
                                            "●  “Super 0” xizmati ishlamaydi.\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Qulay, Qulay+, Connect, Premial, Ideal, VIP, Premial Yillik, Ideal Yillik, VIP Yillik, Qulay Yillik, Qulay Yillik+, Ultra, Maxi, Maxi New, Perfect, Absolut, Year tariflardan o‘tish narxi - 8420.7 so‘m\n" +
                                            "●  Asosiy, Standart, Optimal, Optimal+, Chilla Lite, Terminal, Gap bor, Start, Optima, Veteran, Plus, Super Optima, Baraka, Besh, 777, 555, Optima 333, Ajoyib, UMS bilan birga tariflardan o‘tish narxi - 0 so‘m",  "*171*041*011500201#"),
                                    TarifModel("Qulay +", "42 000 so'm","30 kun", "Ekonom narxlardagi qulay tarifni qidiryabsizmi? Qulaylik narxga bog‘liq emasligini his eting!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 1,000 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 5,000 MB mobil internet\n" +
                                            "● 1,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti 1 KB\n" +
                                            "●  Start, Terminal, Plus, Mini, Besh, Baraka, Ajoyib, Veteran, UMS bilan birga, Optima tarif rejalaridan o‘tish - bepul\n" +
                                            "●  Optimal, Optimal+, Standart, Super Optima, Optima 333, 555, 777, Maxi, Maxi New, Ultra, Perfect, Absolut va yillik tariflardan o‘tish - 4210.35 so‘m\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  Abonent to‘lovi har oyning 1-sanasida yechib olinadi\n" +
                                            "\n" +
                                            "Internet paketlar va tariflarga oson ulaning - barcha USSD kodlar bir joyda!",  "*171*127*011500201*1#"),
                                    TarifModel("Optimal +", "33 000 so'm","30 kun", "Barcha natijalar plyusmi? Muloqotning optimal tariflaridanda ko‘proq! \n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 800 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 3,000 MB mobil internet\n" +
                                            "● 800 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Start, Terminal, Plus, Mini, Besh, Baraka, Ajoyib, Veteran, UMS bilan birga, Optima tarif rejalaridan o‘tish - bepul\n" +
                                            "●  Optimal, Optimal+, Standart, Super Optima, Optima 333, 555, 777, Maxi, Maxi New, Ultra, Perfect, Absolut va yillik tariflardan o‘tish - 4210.35 so‘m\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  Abonent to‘lovi har oyning 1-sanasida yechib olinadi\n" +
                                            "●  21.10.2019 dan boshlab \"BESH\", \"AJOYİB\", OPTİMAL+\" tarif rejalariga ulanish va o‘tish imkoniyati yopilgan\n" +
                                            "●  21.10.2019 gacha mazkur tarif rejalariga ulangan yoki o‘tgan abonentlar uchun tarif rejalari shartlari o‘zgarmaydi",  ""),
                                    TarifModel("Optimal", "33 000 so'm","30 kun", "Ish uslubingiz optimalmi, tarif rejangiz ham optimal bo‘lishi kerak!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 800 daqiqa O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 1,500 MB mobil internet\n" +
                                            "● 800 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 126.31 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.2 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421.04 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Internet-trafikni narxlash kvanti - 1 KB\n" +
                                            "●  Start, Terminal, Plus, Mini, Besh, Baraka, Ajoyib, Veteran, UMS bilan birga, Optima tarif rejalaridan o‘tish - bepul\n" +
                                            "●  Optimal, Optimal+, Standart, Super Optima, Optima 333, 555, 777, Maxi, Maxi New, Ultra, Perfect, Absolut va yillik tariflardan o‘tish - 4210.35 so‘m\n" +
                                            "●  Ushbu tarifida “Super 0” xizmati ishlaydi\n" +
                                            "●  Abonent to‘lovi har oyning 1-sanasida yechib olinadi",  ""),
                                    TarifModel("777", "42 103 so'm","30 kun", "Omadli raqamlarda omadli tarif rejasi, tarifdagi barcha paketlar 777!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 777 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 777 MB mobil internet\n" +
                                            "● 777 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 105.26 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.21 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga ulanilgandagi boshlang‘ich to‘lov – 5 000 so‘m\n" +
                                            "●  Abonent to‘lovini yechib olish “777” TRga ulanilgan/o‘tilgandan keyin bir sutka davomida amalga oshiriladi",  ""),
                                    TarifModel("MAXI new", "63 155 so'm","30 kun", "Muloqot uchun maksimal qulaylik, barchasi hali oldinda!\n" +
                                            "\n" +
                                            "\n" +
                                            "OYLIK BEPUL PAKETLAR\n" +
                                            "● 1,000 daqiqa tarmoq ichida va O‘zbekiston bo‘ylab chiquvchi qo‘ng‘iroqlarga\n" +
                                            "● 2,000 MB mobil internet\n" +
                                            "● 1,000 SMS xabarlar\n" +
                                            "BEPUL PAKETLAR LIMITIDAN OSHGANDA\n" +
                                            "● 84.21 so‘m tarmoq ichida va O‘zbekistonning boshqa mobil operatorlari, shaxar telefon raqamlariga\n" +
                                            "● 84.21 so‘m chiquvchi SMS-xabarlar barcha mobil operatorlarga\n" +
                                            "● 631.5 so‘m chiquvchi xalqaro SMS-xabarlarga\n" +
                                            "● 421 so‘m 1 MB Internet-trafik uchun\n" +
                                            "SHARTLAR\n" +
                                            "●  Tarif rejasiga ulanilgandagi boshlang‘ich to‘lov – 5 000 so‘m\n" +
                                            "●  «Start», «Optima», «Super Optima», «Plus», «Mini», «Veteran», «Besh», «Baraka», «Ajoyib», «Terminal», «Gap bor!», «Optima 333», «555», «777», «Connect» tarif rejalaridan o‘tish narxi – bepul\n" +
                                            "●  «Maxi», «Ultra», «Perfect», «Absolut» va yillik tarif rejalaridan o‘tish narxi – 4210,35 so‘m",  "")
                                ))
                            )
                        }
                        CATEGORY_MINUTES -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    MinuteModel("60 daqiqalik to‘plam", "4 000 so'm", "60 daqiqa", "616020 raqamiga 60", "*171*103*60*1*011500325#"),
                                    MinuteModel("120 daqiqalik to‘plam", "7 000 so'm", "120 daqiqa", "616020 raqamiga 120", "*171*103*120*1*011500325#"),
                                    MinuteModel("180 daqiqalik to‘plam", "10 000 so'm", "120 daqiqa", "616020 raqamiga 180", "*171*103*180*1*011500325#"),
                                    MinuteModel("300 daqiqalik to‘plam", "16 000 so'm", "300 daqiqa", "616020 raqamiga 300", "*171*103*300*1*011500325#"),
                                    MinuteModel("900 daqiqalik to‘plam", "37 000 so'm", "900 daqiqa", "616020 raqamiga 900", "*171*103*900*1*011500325#"),
                                    MinuteModel("1200 daqiqalik to‘plam", "45 000 so'm", "1200 daqiqa", "616020 raqamiga 1200", "*171*103*1200*1*011500325#"),
                                    MinuteModel("1800 daqiqalik to‘plam", "62 000 so'm", "1800 daqiqa", "616020 raqamiga 1800", "*171*103*1800*1*011500325#")
                                ))
                            )
                        }
                        CATEGORY_SMS -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    BaseModel("SMS 100", "4210,35 so'm", "100", "616018 raqamiga 100 sonini", " *104*100#"),
                                    BaseModel("SMS 300", "10104,84 so'm", "300", "616018 raqamiga 300 sonini", "*104*300#")
                                ))
                            )

                        }
                        CATEGORY_ADVEN -> {
                            return listOf(
                                CategoryModel("USSD kodlar", listOf(
                                    AdventageModel("IMEI kodni tekshirish", "*#06#"),
                                    AdventageModel("Balansni tekshirish", "*100#"),
                                    AdventageModel("Shaxsiy raqamni aniqlash", "*150#"),
                                    AdventageModel("Internet paket qoldig'ini ko'rish", "*102#"),
                                    AdventageModel("Bonus paket qoldig'ini ko'rish", "*165#"),
                                    AdventageModel("Daqiqalar qoldig'ini ko'rish", "*103#"),
                                    AdventageModel("SMS paket qoldig'ini ko'rish", "*104#"),
                                    AdventageModel("Mobil internetni yoqish", "*111*0011#"),
                                    AdventageModel("Internet paketlar menyusi", "*111*1*9#"),
                                    AdventageModel("So'nggi to'lov", "*111*015#"),
                                    AdventageModel("Mening xarajatlarim", "*111*025#"),
                                    AdventageModel("GOOD'OK ni o'chirish", "*111*0140#"),
                                    AdventageModel("4G LTE ni yoqish", "*222*1#"),
                                    AdventageModel("4G LTE ni o'chirish", "*222*0#"),
                                    AdventageModel("4G LTE ni tekshirish", "*222*#"),
                                    AdventageModel("Qurilma IMEI kodi", "*#06#"),
                                    AdventageModel("Pereadresatsiyani tekshirish", "*#67#"),
                                    AdventageModel("Kutib turishni faollashtirish", "*43#"),
                                    AdventageModel("Telefon ma'lumotlari", "*#*#4636#*#*")
                                )),
                                CategoryModel("Zaruriy xizmatlar", listOf(
                                    AdventageModel("O't o'chirish xizmati", "101"),
                                    AdventageModel("Militsiya", "102"),
                                    AdventageModel("Tez yordam", "103"),
                                    AdventageModel("Gaz avariyasi xizmati", "104"),
                                    AdventageModel("Qutqaruv xizmati", "1050")
                                )),
                                CategoryModel("Qisqa raqamlar", listOf(
                                    AdventageModel("Prezident virtual qabulxonasi", "1000"),
                                    AdventageModel("Interaktiv davlat xizmatlari portali", "1006"),
                                    AdventageModel("Adliya vazirligi", "1008"),
                                    AdventageModel("Bosh prokuratura", "1007"),
                                    AdventageModel("Temir yo'l ma'lumotxonasi", "1005"),
                                    AdventageModel("Dorixona ma'lumotnomasi", "1142"),
                                    AdventageModel("Aloqa operatorlari ko'dlari", "1192"),
                                    AdventageModel("Xotin-qizlar qo'mitasi", "1146"),
                                    AdventageModel("Toshshahartransxizmat", "1062")
                                ))
                            )
                        }
                        CATEGORY_SERVICES -> {
                            return listOf(
                                CategoryModel("", listOf(
                                    ServiceModel("Va’da qilingan to‘lov", "Internet paketlar va tariflarga oson ulaning - barcha USSD kodlar bir joyda!", "Ushbu xizmat kelgusida to‘lanadigan mablag‘ hisobidan aloqa xizmatlaridan foydalanishni davom ettirish uchun o‘z hisobvarag‘ingizga 3 kun muddatga 3 sh.b tushirish imkonini beradi.\n" +
                                            "\n" +
                                            "Ushbu xizmat hatto bloklangan holatda (oldindan to‘lovi yoq), -2 sh.b (minus ikki) dan ortiq balansida abonentlarga amal qiladi.\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish narxi 0,5 sh.b\n" +
                                            "\n" +
                                            "Xizmatni faollashtirish uchun mobil telefondan *111*32# USSD buyrug‘ini yuborish zarur. So‘ng «Siz «Va’da qilingan to‘lov\"ni so‘radingiz. Siz bu xizmatdan foydalanganingizda qarzni qaytarish majburiyatini olasiz. Ulash uchun 1 raqamini kiriting» degan SMS-xabar olasiz.\n" +
                                            "\n" +
                                            "Holatni tekshirish uchun *111*320# USSD buyrug‘ini terish zarur.", "*111*32#"),
                                    ServiceModel("Aloqadaman", "UMS ning barcha abonentlari hatto manfiy balansda bo‘lganda ham “Aloqadaman” deya oladilar!", "UMS ning barcha abonentlari hatto manfiy balansda bo‘lganda ham “Aloqadaman” deya oladilar!\n" +
                                            "\n" +
                                            "Agar balansingizni to‘ldirishga ulgurmagan bo‘lsangiz, kimdir sizga qo‘ng‘iroq qilolmasligi yoki SMS larni ololmasligingizdan havotirlanmang!\n" +
                                            "\n" +
                                            "Hatto balansingiz nolga teng yoki manfiy bo‘lganda ham, kiruvchi qo‘ng‘iroqlarni qabul qilish va SMS-xabarlarni olish imkoniga egasiz.\n" +
                                            "\n" +
                                            "Buning uchun xizmatni yoqish yoki boshqa harakat bajarishingiz shart emas. O‘zbekiston Respublikasi hududida “UMS” MChJ tarmog‘i amal qiladigan joyda bo‘lsangiz, xizmat avtomatik ravishda ishga tushadi.", ""),
                                    ServiceModel("Bevosita jo‘natish", "Do‘stingiz yoki yaqin kishingizning hisobvarag‘ini to‘ldirmoqchi bo‘lsangiz, endi “Bevosita jo‘natish” xizmati yordamida o‘z hisobvarag‘ingizdagi mablag‘ni UMSning boshqa abonenti bilan baham ko‘rishingiz mumkin!", "Do‘stingiz yoki yaqin kishingizning hisobvarag‘ini to‘ldirmoqchi bo‘lsangiz, endi “Bevosita jo‘natish” xizmati yordamida o‘z hisobvarag‘ingizdagi mablag‘ni UMSning boshqa abonenti bilan baham ko‘rishingiz mumkin!\n" +
                                            "\n" +
                                            "USSD–buyruqlarni terish tartibi\n" +
                                            "\n" +
                                            "Pul jo‘natish uchun:\n" +
                                            "\n" +
                                            "*112*xalqaro formatdagi abonent raqami*jo‘natma summasi#qo‘ng‘iroq.\n" +
                                            "\n" +
                                            "Masalan, Toshkent shahridagi 1030909 raqamli abonentga 5 sh.b jo‘natmoqchisiz:\n" +
                                            "\n" +
                                            "*112*998971030909*5#qo‘ng‘iroq.\n" +
                                            "\n" +
                                            "Hisobvarag‘ingizga pul tushirishni (boshqa abonentning hisobvarag‘idan) iltimos qilish uchun:\n" +
                                            "\n" +
                                            "*116*xalqaro formatdagi abonent raqami*jo‘natma summasi#qo‘ng‘iroq.\n" +
                                            "\n" +
                                            "Adresat quyidagi SMS-xabarni oladi: «Abonent <telefon raqami> Sizdan uning hisobiga pul tushirishingizni so‘rayapti».\n" +
                                            "\n" +
                                            "Eslatmalar:\n" +
                                            "\n" +
                                            "bu xizmat faqat jismoniy shaxs hisoblanuvchi abonentlarga taqdim etiladi;boshqa abonentning hisobvarag‘iga faqat 1 sh.b, 2 sh.b, 3 sh.b, 4 sh.b, 5 sh.b o‘tkazish mumkin.olingan jo‘natmalarning eng katta miqdori kuniga 20 sh.bni tashkil qiladi;jo‘natma o‘tkazilganidan keyin uni yuborgan abonent hisobvarag‘ida qoladigan mablag‘ 2 sh.bdan kam bo‘lmasligi kerak;pul yuboruvchilar uchun jo‘natmalarning eng katta miqdori kuniga 20ni sh.b tashkil qiladi;\n" +
                                            "\n" +
                                            " *111*0151# USSD-so‘rovini yuborish orqali pul jo‘natishni taqiqlab qo‘yish mumkin.\n" +
                                            "\n" +
                                            "Xizmatni u rad etilganidan keyin qayta ulash:\n" +
                                            "\n" +
                                            "«Internet-yordamchi» orqali;Kompaniya ofislarida;0890 raqami orqali.\n" +
                                            "\n" +
                                            "Bitta summani jo‘natish narxi – 0,04 sh.b (jo‘natmani yuboruvchidan olinadi).\n" +
                                            "\n" +
                                            "Hisobvaraqqa pul tashlashni so‘rash – 0,02 sh.b.\n" +
                                            "\n" +
                                            "Narxlar barcha soliqlarni hisobga olgan holda ko‘rsatilgan.", ""),
                                    ServiceModel("Traffik sarflanmaydigan saytlar", "“UMS” MChJ xizmatlaridan foydalanish qulay bo‘lishi uchun UMS web-resurslariga kirish mobil internet trafigini sarflamaydi!", "“UMS” MChJ xizmatlaridan foydalanish qulay bo‘lishi uchun UMS web-resurslariga kirish mobil internet trafigini sarflamaydi!\n" +
                                            "\n" +
                                            "ums.uz – UMS” MChJ rasmiy sayti\n" +
                                            "\n" +
                                            "goodok.ums.uz – Good’Ok xizmati web-resursi\n" +
                                            "\n" +
                                            "ip.ums.uz – Internet-yordamchi\n" +
                                            "\n" +
                                            "UMS abonentlari O‘zbekiston Respublikasining bir qator davlat portallaridan foydanalayotganida ham mobil Internet trafigi uchun haq olinmaydi!\n" +
                                            "\n" +
                                            "Bu ro‘yxatga quyidagi resurslar kiradi:\n" +
                                            "\n" +
                                            "pm.gov.uz- O‘zbekiston Respublikasi Prezidenti virtual qabulxonasi;\n" +
                                            "\n" +
                                            "www.gov.uz – O‘zbekiston Respublikasi Hukumat portali;\n" +
                                            "\n" +
                                            "my.gov.uz – Yagona interaktiv davlat xizmatlari portali;\n" +
                                            "\n" +
                                            "data.gov.uz – O‘zbekiston Respublikasi ochiq ma’lumotlar portali;\n" +
                                            "\n" +
                                            "dd.gov.uz – O‘zbekiston Respublikasi davlat dasturlari portali.\n" +
                                            "\n" +
                                            "UMS ning bepul Internet-trafigi yordamida “elektron hukumat” ning barcha qulayliklaridan foydalaning!", ""),
                                    ServiceModel("Sizga qo‘ng‘iroq qilishdi & Men aloqadaman!", "UMS abonentiga telefoniga ulanish mumkin yoki hattoki o‘chirilgan vaqtda birorta ham chaqiriqni yo‘qotmaslik imkonini beruvchi qo‘shimcha aloqa xizmatidir", "«Sizga qo‘ng‘iroq qilishdi!» —UMS abonentiga telefoniga ulanish mumkin yoki hattoki o‘chrilgan vaqtda birorta ham chaqiriqni yo‘qotmaslik imkonini beruvchi qo‘shimcha aloqa xizmatidir. O‘tkazib yuborilgan chaqiriqlar haqida axborotniabonent 808 raqamidan SMS-xabarlar shaklida oladi.\n" +
                                            "\n" +
                                            "«Sizga qo‘ng‘iroq qilishdi!»xizmatiga va roumingda ham ulanish mumkin. Shuni unutmaslik kerakki, UMS tarmog‘da xizmatningo‘ziva kiruvchi SMS bepul hisoblanadi, qator mamlakatlarda mobil aloqa operatorlari kiruvchi SMSga haq oladilar.\n" +
                                            "\n" +
                                            "Xizmatga qanday ulanish mumkin:\n" +
                                            "\n" +
                                            "«Sizga qo‘ng‘iroq qilishdi!»xizmati hamma abonentlarga ulangan. Agar xizmatni o‘chirib, uni yana qayta ulashga qaror qilgan bo‘lsangiz, quyidagilarni amalga oshirishingiz zarur:\n" +
                                            "\n" +
                                            "Abonеntlarga xizmat ko‘rsatish ofislariga murojaat eting;«Intеrnеt-yordamchi» orqali;*111*0131# raqamiga USSD-so‘rov jo‘natib.616013 raqamiga 1soni bilan SMS jo‘natib.\n" +
                                            "\n" +
                                            "Ulanganda yangi abonentlarga “Sizga qo‘ng‘iroq qilishdi/Aloqadaman” xizmatini 30 kun davomida bepul ishlatish uchun faollashtirish imkoniyati taqdim etiladi!\n" +
                                            "\n" +
                                            "30 kundan so‘ng xizmat narxi 84.21 so‘mni tashkil etadi.\n" +
                                            "\n" +
                                            "Amaldagi abonentlar uchun “Sizga qo‘ng‘iroq qilishdi/Aloqadaman” xizmatining abonent to‘lovi - kuniga 84.21 so‘m", "*111*0131#"),
                                    ServiceModel("Videoqo‘ng‘iroq", "«Videoqo‘ng‘iroq» xizmati evaziga o‘z suhbatdoshingizni nafaqat eshitish, balki ko‘rishingiz mumkin!", "«Videoqo‘ng‘iroq» xizmati evaziga o‘z suhbatdoshingizni nafaqat eshitish, balki ko‘rishingiz mumkin!\n" +
                                            "\n" +
                                            "Videoqo‘ng‘iroqni amalga oshirish uchun abonеntlarvideoqo‘ng‘iroq funksiyasi bo‘lgan tеlеfon apparatiga ega va ular 3G tarmog‘i amal qiladigan hududda bo‘lishlari shart.\n" +
                                            "\n" +
                                            "Videoqo‘ng‘iroqda chiquvchi suhbatlar 1 daqiqasining narxi – xizmat rejasida o‘rnatilgan ovozli aloqa -videoqo‘ng‘iroqda tarmoq ichida kirish qo‘ng‘roqlari 1 daqiqasi narxi – 0 sh.b.\n" +
                                            "\n" +
                                            "Boshqa mobil aloqa opеratorlaridan kirish qo‘ng‘roqlari 1 daqiqasi narxi –kiruvchi ovozli aloqa xizmati rejasida o‘rnatilgan tarifga muvofiq bo‘ladi.\n" +
                                            "\n" +
                                            "Xizmat barcha tarif-rejalarida xizmat ko‘rsatiladigan abonеntlar uchun taqdim etiladi.\n" +
                                            "\n" +
                                            "Narxlar barcha soliqlar hisobga olinib ko‘rsatilgan.", ""),
                                    ServiceModel("Raqamni aniqlash", "«Raqamni aniqlash» xizmati sizga kim qo‘ng‘iroq qilganini bilish imkonini beradi:", "«Raqamni aniqlash» xizmati sizga kim qo‘ng‘iroq qilganini bilish imkonini beradi:\n" +
                                            "\n" +
                                            "Mobil tеlеfoni ekranida chaqirilayotgan abonеnt raqamini ko‘ring;Abonеnt bilan yozuvlar kitobchasida individual musiqani o‘rnatgan bo‘lsangiz, uning qo‘ng‘rog‘i bilan ohang taraladi;So‘nggi kiruvchi qo‘ng‘iroqdan raqamni tanib, unga qayta qo‘ng‘iroq qilishingiz, о’tkazib yuborilgan qo‘ng‘iroqlarga javob berishingiz mumkin.\n" +
                                            "\n" +
                                            "Mobil tеlеfoni ekranida chaqiruvchi abonеntni raqamning paydo bo‘lishi va uni ko‘rish aloqa o‘rnatishdan oldin namoyon bo‘ladi. Boshqa tarmoq abonеntlari raqamlarini, jumladan, umumiy foydalanishdagi shahar telefon tarmog‘i raqamlarini aniqlash, kafolatlanmaydi.\n" +
                                            "\n" +
                                            "«Raqamni aniqlash» xizmati UMS abonеntiga, agar chaqiruvchi «raqamni aniqlashga qarshilik» xizmatidan foydalanib, o‘z tеlеfon raqamini aniqlashni taqiqlovchi o‘rnatgan bo‘lsa, mobil tеlеfoni ekranida abonеntni chaqiruvchi raqamni ko‘rish imkonini bermaydi.\n" +
                                            "\n" +
                                            "«Raqamni aniqlash» xizmati bepul taqdim etiladi.", ""),
                                    ServiceModel("SMS-xabarlar olish", "Mazkur servis UMS abonentlariga pensiya hisobvarag‘iga kelib tushgan mablag‘lar to‘g‘risida SMS-xabarlar olish imkonini beradi. Bu xabarlar abonentning mobil telefoniga keladi.", "Mazkur servis UMS abonentlariga pensiya hisobvarag‘iga kelib tushgan mablag‘lar to‘g‘risida SMS-xabarlar olish imkonini beradi. Bu xabarlar abonentning mobil telefoniga keladi.\n" +
                                            "\n" +
                                            "Qisqa raqam: 10711\n" +
                                            "\n" +
                                            "Xizmatni boshqarish jarayoni: Xizmatni faollashtirish uchun 10711 qisqa raqamiga pensiya ID kodini* yuborish kerak. Xizmat faollashtirilgan sanadan boshlab 30 kun amal qiladi. Obuna vaqti tugagach, bu haqda abonentga SMS-xabar keladi.\n" +
                                            "\n" +
                                            "Obunani davom ettirish uchun abonent yana 10711 qisqa raqamiga pensiya ID kodi(pensionerning noyob kodi. Budjetdan tashqari pensiya jamg‘armasi tomonidan beriladigan bu kodni abonentlar o‘z inspektorlaridan so‘rab bilishlari mumkin)ni yuborishi kerak bo‘ladi.\n" +
                                            "\n" +
                                            "Xizmat UMS abonentlariga bepul taqdim etiladi.\n" +
                                            "\n" +
                                            "Kontent-provayderning abonentlar bilan ishlash bo‘limi: +998712002222.\n" +
                                            "\n" +
                                            "Sayt: www.mobitelinform.uz\n" +
                                            "\n" +
                                            "MChJ \"Mobitel Inform\"", ""),
                                    ServiceModel("AntiAON", "Istalgan UMS abonenti telefon raqamiga chiquvchi qo‘ng‘iroqlarda o‘z tеlеfon raqamini aniqlashni taqiqlash yoki ruxsat berish imkonini beradi", "Raqamni aniqlashga qarshilik xizmati imkonini beradi abonentga istalgan UMS abonenti telefon raqamiga chiquvchi qo‘ng‘iroqlarda o‘z tеlеfon raqamini aniqlashni taqiqlash yoki ruxsat berish imkonini beradi. Boshqa tarmoqlar abonеntlariga, jumladan, umumiy foydalanishdagi chiquvchi qo‘ng‘iroqlarda raqamni aniqlashni taqiqlashni kafolatlanmaydi.\n" +
                                            "\n" +
                                            "Chaqiruvchi abonеnt faollashganda raqamni aniqlashga qarshilik xizmatida chaqiriluvchi abonеnt uning tеlеfon raqamini aniqlay olmaydi.\n" +
                                            "\n" +
                                            "Narxi qancha?\n" +
                                            "\n" +
                                            "«Raqamni aniqlashga qarshilik»xizmatidan foydalanish 0,10 sh.b kuniga\n" +
                                            "\n" +
                                            "«Raqamni aniqlashga qarshilik» ulanish/xizmatni o‘chirish - bepul.\n" +
                                            "\n" +
                                            "Xizmatga qanday ulanish mumkin?\n" +
                                            "\n" +
                                            "USSD-buyruq – *111*0101#SMS-yordamchi –616010 raqamiga 1 raqamiInternet-yordamchi;\n" +
                                            "\n" +
                                            "Xizmatni o‘chirish\n" +
                                            "\n" +
                                            "USSD-buyruq – *111*0100#SMS-yordamchi –616010 raqamiga 0 raqamiInternet-yordamchi;", "*111*0101#"),
                                    ServiceModel("Chaqiriqni kutish va ushlab turish", "Suhbat mobaynida boshqa abonentning kirish qo‘ng‘iroqlari joriy suhbat tugaguniga qadar ushlab turadi", "Suhbat mobaynida boshqa abonentning kirish qo‘ng‘iroqlari joriy suhbat tugaguniga qadar ushlab turadi.\n" +
                                            "\n" +
                                            "Mazkur xizmatdan foydalanish uchun telefon mеnyusi yordamida yoki klavishda terib faollashtirish zarur.\n" +
                                            "\n" +
                                            "Faollashtirish *43#\n" +
                                            "\n" +
                                            "Dеaktivatsiya #43#\n" +
                                            "\n" +
                                            "Ikki abonеnt o‘rtasida ketma-ket ulanadi:\n" +
                                            "\n" +
                                            "1. Suhbat mobaynida birinchi abonеntga ovozli signal eshitiladi, Sizga qo‘ng‘iroq qilingani haqida ikkinchi abonеntni xabardor qiladi.\n" +
                                            "\n" +
                                            "2. Suhbatga qo‘shilish uchun telefon apparatiga bog‘liq holda ikkinchi liniyani ajratilgan klavishni bosish zarur (Apparat yo‘riqnomasini qarang).\n" +
                                            "\n" +
                                            "0 (qo‘ng‘iroq) - ushlab turilgan qo‘ng‘iroq/chaqiriqni rad etish. Abonent \"Bandо\" signalini eshitadi. Agar \"Boshqa manzilga yo‘llash, raqam Band bo‘lganda (Divert on busy)\" xizmati ulangan bo‘lsa, mazkur chaqiriq ko‘rsatilgan raqamga yo‘naltiriladi.\n" +
                                            "\n" +
                                            "1 (qo‘ng‘iroq) - faol suhbatni yakunlash va chaqiriqni qаbul qilish.\n" +
                                            "2 (qo‘ng‘iroq) yoki (qo‘ng‘iroq) – chaqiriq qabul qilindi.\n" +
                                            "2 (qo‘ng‘iroq)- chaqiriq mаqomini o‘zgartirish (fаol ushlab turish, ushlab turuvchini faollashtirish)\n" +
                                            "\n" +
                                            "N – barcha faol qo‘ng‘iroqlarni ushlab turish va N telefon rаqamiga yangi qo‘ng‘iroq qilish.", "*43#"),
                                    ServiceModel("Suhbatni ushlab turish", "Suhbat mobaynida boshqa abonentning kirish qo‘ng‘iroqlari joriy suhbat tugaguniga qadar ushlab turadi.", "Suhbat mobaynida boshqa abonentning kirish qo‘ng‘iroqlari joriy suhbat tugaguniga qadar ushlab turadi.\n" +
                                            "\n" +
                                            "Mazkur xizmatdan foydalanish uchun telefon mеnyusi yordamida yoki klavishda terib faollashtirish zarur.\n" +
                                            "\n" +
                                            "Faollashtirish *43#\n" +
                                            "\n" +
                                            "Dеaktivatsiya #43#\n" +
                                            "\n" +
                                            "Ikki abonеnt o‘rtasida ketma-ket ulanadi:\n" +
                                            "\n" +
                                            "1. Suhbat mobaynida birinchi abonеntga ovozli signal eshitiladi, Sizga qo‘ng‘iroq qilingani haqida ikkinchi abonеntni xabardor qiladi.\n" +
                                            "\n" +
                                            "2. Suhbatga qo‘shilish uchun telefon apparatiga bog‘liq holda ikkinchi liniyani ajratilgan klavishni bosish zarur (Apparat yo‘riqnomasini qarang).\n" +
                                            "\n" +
                                            "0 (qo‘ng‘iroq) - ushlab turilgan qo‘ng‘iroq/chaqiriqni rad etish. Abonent \"Bandо\" signalini eshitadi. Agar \"Boshqa manzilga yo‘llash, raqam Band bo‘lganda (Divert on busy)\" xizmati ulangan bo‘lsa, mazkur chaqiriq ko‘rsatilgan raqamga yo‘naltiriladi.\n" +
                                            "\n" +
                                            "1 (qo‘ng‘iroq) - faol suhbatni yakunlash va chaqiriqni qаbul qilish.\n" +
                                            "2 (qo‘ng‘iroq) yoki (qo‘ng‘iroq) – chaqiriq qabul qilindi.\n" +
                                            "2 (qo‘ng‘iroq)- chaqiriq mаqomini o‘zgartirish (fаol ushlab turish, ushlab turuvchini faollashtirish)\n" +
                                            "\n" +
                                            "N – barcha faol qo‘ng‘iroqlarni ushlab turish va N telefon rаqamiga yangi qo‘ng‘iroq qilish.", ""),
                                    ServiceModel("Menga qo'ng'iroq qil", "Ushbu xizmat O‘zbekistonning barcha uyali aloqa operatorlari abonentlariga ular qo‘ng‘iroq qilishlarini iltimos qilib, tez va oson so‘rov yuborish imkonini beradi.", "Ushbu xizmat O‘zbekistonning barcha uyali aloqa operatorlari abonentlariga ular qo‘ng‘iroq qilishlarini iltimos qilib, tez va oson so‘rov yuborish imkonini beradi.\n" +
                                            "\n" +
                                            "So‘rov yuborish uchun, qo‘yidagi buyruqlarni terish kerak:\n" +
                                            "\n" +
                                            "*110*abonentning halqaro formatdagi raqami# (O‘zbekiston uyali aloqa operatorlari abonentlariga)\n" +
                                            "\n" +
                                            "Shundan so‘ng, xabar oluvchiga 110 raqamidan «Abonent +998ХХххххххх Sizni qo‘ng‘iroq qilishingizni iltimos qilyapti» yozuvi bilan SMS-xabari keladi.\n" +
                                            "\n" +
                                            "Yuborilgan USSD-so‘rovga javoban abonent qo‘yidagi xabarlarni olishi mumkin:\n" +
                                            "\n" +
                                            "«Xabar +998ХХххххххх raqamiga yuborildi»«Abonent raqamini halqaro formatda ko‘rsating»\n" +
                                            "\n" +
                                            "So‘rovlarni nafaqat tarmoq ichida, balki O‘zbekistonning barcha uyali aloqa operatorlariga yuborish mumkin – 1 so‘rovning narxi 42,10 so‘m.", ""),
                                    ServiceModel("Bir martalik AntiAON", "«Bir martalik AntiAON» xizmati sizga chaqirilayotgan abonentga o‘z raqamingizni ko‘rsatmaslik imkonini beradi. Ushbu servis bir marta taqdim etiladi va buning uchun uni maxsus ulash shart emas.", "«Bir martalik AntiAON» xizmati sizga chaqirilayotgan abonentga o‘z raqamingizni ko‘rsatmaslik imkonini beradi. Ushbu servis bir marta taqdim etiladi va buning uchun uni maxsus ulash shart emas.\n" +
                                            "\n" +
                                            "Qanday foydalanish mumkin?\n" +
                                            "\n" +
                                            "«Bir martalik AntiAON» xizmatidan foydalanish uchun chaqirilayotgan abonent raqamini terayotganingizda raqam oldiga «#» belgisini qo‘yishingiz kifoya.\n" +
                                            "\n" +
                                            "Masalan: #99897*******\n" +
                                            "\n" +
                                            "Xizmat narxi:\n" +
                                            "\n" +
                                            "raqamni yashirgan holda bir marta qo‘ng‘iroq qilish narxi 0,05 sh.b;so‘zlashuv tarif rejasiga muvofiq tariflanadi;agar abonent raqamida «AntiAON» xizmati oldin ulab qo‘yilgan bo‘lsa, lekin abonent «Bir martalik AntiAON» xizmati yordamida qo‘ng‘iroq qilsa, u holda «Bir martalik AntiAON» xizmatining narxi ushlab qolinadi.\n" +
                                            "\n" +
                                            "Eslatmalar:\n" +
                                            "\n" +
                                            "Servis xalqaro roumingda taqdim etilmaydi. Boshqa tarmoqlar, jumladan umumiy foydalanishdagi shahar tarmog‘i abonentlariga qo‘ng‘iroq qilinganda raqam aniqlanmasligi kafolatlanmaydi.", "")
                                ))
                            )
                        }
                    }
                }
            }

            return emptyList()
        }
    }
}
