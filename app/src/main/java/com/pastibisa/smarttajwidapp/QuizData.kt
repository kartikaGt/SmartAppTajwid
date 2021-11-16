package com.pastibisa.smarttajwidapp

object QuizData {

//    const val name:String="name"
    const val score:String="score"
    const val nilai:String="score"
    const val hasil:String="score"

   fun getquestion():ArrayList<Questi>{
       var que:ArrayList<QuestionEasy> = arrayListOf()

       var question1 = QuestionEasy(
           1,
           "Hukum nun sukun ada...",
//            R.drawable.img1,
           "3",
           "4",
           "5",
           "6",
           2
       )
       var question2 = QuestionEasy(
           2,
           "Hukum mim sukun ada berapa?",

           "1",
           "2",
           "3",
           "4",
           3
       )
       var question3 = QuestionEasy(
           3,
           "Apa yang disebut dg idgham bighunnah?",

           "Nun sukun atau tanwin bertemu huruf ل _ ر ",
           "Nun sukun atau tanwin bertemu huruf ب ",
           "Nun sukun atau tanwin bertemu ن _ م _ ي _ و ",
           "Nun sukun atau tanwin bertemu _ خ _ ح _ ا _ ع _ غ _ ء",
           3
       )
       var question4 = QuestionEasy(
           4,
           "Yang disebut dg idgham bilaghunnah adalah...",

           "Nun sukun atau tanwin bertemu dg م _ ي _ ن _ و ",
           "Nun sukun atau tanwin bertemu dg ر _ ل ",
           "Nun sukun atau tanwin bertemu ب ",
           "Nun sukun atau tanwin bertemu _ خ _ ح _ ا ع",
           2
       )

       var question5 = QuestionEasy(
           5,
           "Berapa jumlah huruf ikhfa'?",

           "12",
           "13",
           "14",
           "15",
           4
       )

       var question6 = QuestionEasy(
           6,
           "Apa yang dimaksud iqlab?",

           "Nun sukun atau tanwin bertemu dg م _ ي _ ن _ و ",
           "Nun sukun atau tanwin bertemu _ خ _ ح _ ا ع _ غ _ ء ",
           "Nun sukun atau tanwin bertemu ر _ ا ",
           "Nun sukun atau tanwin bertemu ب",
           4
       )

       var question7 = QuestionEasy(
           7,
           "Setiap huruf nun dan mim yang bertasydid dinamakan?",

           "Idgham bilaghunnah ",
           "Idgham bighunnah ",
           "Ghunnah",
           "Iqlab",
           3
       )

       var question8 = QuestionEasy(
           8,
           "Hukum mad dibagi menjadi?",

           "1",
           "2",
           "3",
           "4",
           2
       )

       var question9 = QuestionEasy(
           9,
           "Fathah diikuti ا ،kasroh diikuti ي, dhummah diikuti و dinamakan?",

           "Mad Wajib Muttashil",
           "Mad Jaiz Munfasil",
           "Mad Aridh Lissukun",
           "Mad Thabi'i",
           4
       )

       var question10 = QuestionEasy(
           10,
           "Mad Thabi'i bertemu hamzah(ء (dalam satu kalimat dinamakan",

           "Mad Jaiz Munfasil",
           "Mad Wajib Muttashil",
           "Mad Shilah",
           "Mad Badal",
           1
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       que.add(question7)
       que.add(question8)
       que.add(question9)
       que.add(question10)
       return que
   }

   fun get_question():ArrayList<QuestionMedium>{
       var ques:ArrayList<QuestionMedium> = arrayListOf()

       var ques1 = QuestionMedium(
           1,
           "عَذَابٌ عظِيْمٌ adalah bacaan ",

           "ikhfa'",
           "idhar",
           "iqlab",
           "idgham",
           2
       )
       var ques2 = QuestionMedium(
           2,
           "Ikhfa' artinya adalah  ?",

           "mendengung",
           "samar-samar",
           "memantulkan",
           "jelas",
           2
       )
       var ques3 = QuestionMedium(
           3,
           "dibawah ini adalah contoh idhar syafawi, kecuali ?",

           "مِنْ وَرَائِهِمْ",
           "مِنْ يَوْمَئِذٍ",
           " منْ مَالِهِمْ",
           " مِنْ رَبِّهِ",
           4
       )
       var ques4 = QuestionMedium(
           4,
           "contoh idhar qomariyah yaitu...",

           " اَلَّذِيْنَ",
           "اَلْقَهَارُ",
           " لَهُمْ كَاذِبُوْنَ",
           " اَنْتَ",
           3
       )

       var ques5 = QuestionMedium(
           5,
           "Pada kata (النُّوْرِ) terdapat hukum ghunnah karena  ?",

           "Nun bertasydid",
           "Mim bertasydid",
           "Nun dibaca mad",
           "Terdapat pada satu kata",
           1
       )

       var ques6 = QuestionMedium(
           6,
           "Berikut yang merupakan contoh ghunnah kamilah adalah ",

           "أَنْبَأَهُمْ",
           "مُحَمَّدٌ",
           " أَنْـعَمْتَ",
           " يَعْمَلُوْنَ",
           1
       )

       var ques7 = QuestionMedium(
           7,
           "Ghunnah anqash adalah nun dan mim dalam keadaan ",

           "Sukun dan dihukumi idgham",
           "Sukun dan dihukumi izhar",
           "Sukun dan dihukumi ikhfa’َ",
           "Berharakat dan madَ",
           2
       )

       var ques8 = QuestionMedium(
           8,
           "Berikut yang merupakan contoh ghunnah naqishah adalah ",

           "أَنْـعَمْتَ",
           " يَعْمَلُوْنَ",
           "فِيْهِنََّ",
           "عِنْدَ",
           1
       )

       var ques9 = QuestionMedium(
           9,
           "Yang merupakan hukum yang dibarengi ghunnah akmal adalah ",

           "Izhar syafawi",
           "Idgham mitslainَ",
           "Ikhfa’ haqiqi",
           "Izhar halqiَ",
           2
       )

       var ques10 = QuestionMedium(
           10,
           "Ghunnah dibagi menjadi berapa tingkatan",

           "2 tingkatan",
           "3 tingkatanَ",
           "4 tingkatan",
           "5 tingkatan",
           3
       )

       ques.add(ques1)
       ques.add(ques2)
       ques.add(ques3)
       ques.add(ques4)
       ques.add(ques5)
       ques.add(ques6)
       ques.add(ques7)
       ques.add(ques8)
       ques.add(ques9)
       ques.add(ques10)
       return ques
   }

    fun getQuestion():ArrayList<QuestionHard>{
        var quiz:ArrayList<QuestionHard> = arrayListOf()

        var quiz1 = QuestionHard(
            1,
            " ﺍﻹﻧﺴﺎﻥ Hukum Bacaan ﺍﻞ Adalah ",

            "Asy-syamsiyah",
            "Al-Qomariyah",
            "Ghunnah",
            "Iqlab",
            2
        )
        var quiz2= QuestionHard(
            2,
            " ﻗﻝﻫﻭﷲﺍﺤﺪ Hukum Bacaannya adalah",

            "qolqolah sughro",
            "qolqolah kubro",
            "ikhfa'",
            "iqlab",
            2
        )
        var quiz3 = QuestionHard(
            3,
            "Di Bawah Ini Huruf Qolqolah Yang Benar adalah",

            "ﺏ ﺝ ﺪ",
            "ﺏ ﺝ ﺩ ﻁ ﻮ",
            "ﺝ ﺪ ﺏ ﻁ ﻥ",
            "ﺏ ﺝ ﺩ ﻁ ﻕ",
            4
        )
        var quiz4 = QuestionHard(
            4,
            "Yang termasuk hukum tajwid lam tafkhim adalah ",

            "سِبْيِل ِهللا",
            "وا َّتُقو َهللاا ",
            "وِهّٰلِل َعَلى الَّناِس",
            "وِهلِل ا َاْلْسَماُءاْلُحْسَنى",
            2
        )

        var quiz5 = QuestionHard(
            5,
            "Dalam lafaz ﻣﻦﻣﺴﺪ cara membacanya ",

            "samar-samar",
            "jelas",
            "mendengung",
            "dipantulkan",
            3
        )

        var quiz6 = QuestionHard(
            6,
            "apa hukum tajwid dari تِيْبَ . . . . . . adalahِ حُّج اْل ",

            "alif lam syamsyiah ",
            "lam tafkhim ",
            "alif lam qomariah ",
            "lam tarqiq ",
            3
        )

        var quiz7 = QuestionHard(
            7,
            "نٌت َّمَقاُم  ٰيٌت َبِّي ا ٰtermasuk hukum tajwid",

            "ikfa dan idgham bigunnah ",
            "iqlab dan idgham bigunnah ",
            "ikfa dan idzhar",
            "idzhar dan idgham bigunnah ",
            2
        )

        var quiz8 = QuestionHard(
            8,
            "yang termasuk hukum tajwid alif lam syamsiyah adalah ",

            "بَّر ُمْسِلِمْيَ",
            "اْغِنَياَءاْل َلْن َتَناُلوااْل و َة ",
            "يُمواالَّصٰل َوَا َخَلَق ا ِاْلْنَساَن",
            "إَذاَماَت ا ِاْلْنَساُن ",
            4
        )

        var quiz9 = QuestionHard(
            9,
            "يـِتِهْم ِّمْن َشْيٍء َحّٰتىيَهاِجُرْواَماَلُكْم ِّمْن َ terdapat hokum bacaan ",

            "idgham bigunnah, ikfa, dan idzhar ",
            "idgham bilagunnah, idzhar, dan iqlab ",
            "idgham bilagunnah, ikfa, dan idzhar ",
            "idgham bilagunnah, ikfa, dan iqlab",
            1
        )

        var quiz10 = QuestionHard(
            10,
            "yang termasuk dalam bacaan lam tarqiq adalah ",

            "ْذُكُرْوَن َهللا ",
            "سْبَحاَن هللا ",
            "اْسَتْغِفُرهللا",
            "ال ُتْشِرْك ِباِهلل",
            4
        )

        quiz.add(quiz1)
        quiz.add(quiz2)
        quiz.add(quiz3)
        quiz.add(quiz4)
        quiz.add(quiz5)
        quiz.add(quiz6)
        quiz.add(quiz7)
        quiz.add(quiz8)
        quiz.add(quiz9)
        quiz.add(quiz10)
        return quiz
    }
}


