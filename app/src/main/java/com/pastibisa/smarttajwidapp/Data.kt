package com.pastibisa.smarttajwidapp

object Data {
    //ini data untuk tajwid
    private val no_tajwid = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
    )
    private val jdl_tajwid = arrayOf(
        "Huruf Hijaiyah",
        "Hukum Nun Mati dan Tanwin",
        "Hukum Mim Mati",
        "Hukum Mad",
        "Hukum Lam",
        "Hukum Idgam",
        "Hukum Qalqalah",
        "Hukum Ra",
        "Hukum Wakaf",
    )
    private val pengertian_tajwid = arrayOf(
    "Huruf hijaiyah diambil dari bahasa arab الهجائية yang memiliki arti ejaan atau mengeja. Huruf hijaiyah ini memiliki aturan terminologi yang berbeda dari abjad lain. Huruf ini ditulis dari kanan ke kiri. Huruf hijaiyah memiliki jumlah 29 huruf, dan memiliki penulisan dan cara pembacaan yang berbeda tergantung pada harakat dan tajwid.\n" +
            "Berikut huruf hijaiyah dan cara membacanya :\n" +
            "•\tا\t\t: alif\n" +
            "•\tب \t: ba\n" +
            "•\tت \t: ta\n" +
            "•\tث \t: tsa\n" +
            "•\tج \t: jim\n" +
            "•\tج \t: ha\n" +
            "•\tخ \t: kho\n" +
            "•\tد \t\t: dal\n" +
            "•\tذ \t\t: dzal\n" +
            "•\tر \t\t: ro\n" +
            "•\tز \t\t: zay, zayy atau za\n" +
            "•\tس \t: sin\n" +
            "•\tش \t: syin\n" +
            "•\tص \t: shod\n" +
            "•\tض \t: dhod\n" +
            "•\tط \t: tho\n" +
            "•\tظ \t: zho\n" +
            "•\tع \t: ain\n" +
            "•\tغ \t: ghoin\n" +
            "•\tف \t: fa\n" +
            "•\tق \t: qof\n" +
            "•\tك \t: kaf\n" +
            "•\tل \t: lam\n" +
            "•\tم \t\t: mim\n" +
            "•\tن \t: nun\n" +
            "•\tه \t\t: ha\n" +
            "•\tو \t\t: waw\n" +
            "•\tي \t: ya\n" +
            "•\tء \t\t: hamzah\n",
        "Nun mati atau tanwin (ـًـٍـٌ / نْ) jika bertemu dengan huruf-huruf hijaiyyah, hukum bacaannya ada 5 macam, yaitu:\n" +
                "1.\tIzhar  (إظهار)\n" +
                "Izhar artinya jelas atau terang. Apabila ada nun mati atau tanwin (ـًـٍـٌ / نْ) bertemu dengan salah satu huruf halqi (ا ح خ ع غ ه ), maka dibacanya jelas/terang.\n" +
                "Contoh : \n" +
                "مَنْ اُوْتِيَ – وَانْحَرْ – نَارٌحَامِيَةٌ - سَلَامٌ هِيَ\n" +
                "\n" +
                "2.\tIdgham  (إدغام)\n" +
                "Terdapat 2 macam idgham, yaitu:\n" +
                "•\tIdgham Bighunnah (dilebur dengan disertai dengung)\n" +
                "Yaitu memasukkan/meleburkan huruf nun mati atau tanwin (ـًـٍـٌ / نْ) kedalam huruf sesudahnya dengan disertai (ber)dengung, jika bertemu dengan salah satu huruf yang empat, yaitu:( ن م و ي). \n" +
                "Contoh : \n" +
                "عَامِلَةٌ نَّاصِبَةٌ - مِنْ مَّسَدٍ - خَيْرٌ وَّأَبْقَى – يَّقُوْلُ\n" +
                "\n" +
                "•\tIdgham Bilaghunnah (dilebur tanpa dengung)\n" +
                "Yaitu memasukkan/meleburkan huruf nun mati atau tanwin (ـًـٍـٌ / نْ) kedalam huruf sesudahnya tanpa disertai dengung, jika bertemu dengan huruf lam atau ra (ر ل).\n" +
                "Contoh :\n" +
                "غَفُوْرٌ رَّحِيْمٌ - أَنْ لَّـمْ يَرَهُ\n" +
                "\n" +
                "Pengecualian\t:\n" +
                "Jika nun mati bertemu dengan keenam huruf idgam tersebut tetapi ditemukan dalam satu kata, seperti بُنْيَانٌ , اَدُّنْيَا , قِنْوَانٌ, dan صِنْوَانٌ, maka nun mati atau tanwin tersebut dibaca jelas.\n" +
                "\n" +
                "3.\tIqlab  (إقلاب)\n" +
                "Iqlab artinya menukar atau mengganti. Apabila ada nun mati atau tanwin(ـًـٍـٌ / نْ) bertemu dengan huruf ba (ب), maka cara membacanya dengan menyuarakan /merubah bunyi (نْ) menjadi suara mim (مْ), dengan merapatkan dua bibir serta mendengung.\n" +
                "Contoh : \n" +
                "مَنْ بِخَلَ\n" +
                "\n" +
                "4.\tIkhfa  (إخفاء)\n" +
                "Ikhfa artinya menyamarkan atau tidak jelas. Apabila ada nun mati atau tanwin (ـًـٍـٌ /نْ) bertemu dengan salah satu huruf ikhfa yang 15 (ت ث ج د ذ س ش ص ض ط ظ ف ق ك ), maka dibacanya samar-samar, antara jelas dan tidak (antara izhar dan idgham) dengan mendengung. \n" +
                "Contoh:\n" +
                " نَقْعًا فَوَسَطْنَ\n",
        "Mim mati (مْ) bila bertemu dengan huruf hijaiyyah, hukumnya ada tiga, yaitu: ikhfa syafawi, idgham mim, dan izhar syafawi.\n" +
                "Macam – Macam Mim Mati:\n" +
                "1.\tIkhfa Syafawi  (إخفاء سفوى)\n" +
                "Apabila mim mati (مْ) bertemu dengan ba (ب), maka cara membacanya harus dibunyikan samar-samar di bibir dan didengungkan.\n" +
                "Contoh:\n" +
                " اِنَهُمْ بِدَالِكَ \n" +
                "\n" +
                "2.\tIdgham Mimi  ( إدغام ميمى)\n" +
                "Apabila mim mati (مْ) bertemu dengan mim (مْ), maka cara membacanya adalah seperti menyuarakan mim rangkap atau ditasyidkan dan wajib dibaca dengung.Idgham mimi disebut juga idgham mislain atau mutamasilain.\n" +
                "Contoh : \n" +
                "لَهُمْ مَايَتَقُوْنَ \n" +
                "\n" +
                "3.\tIzhar Syafawi  (إظهار سفوى)\n" +
                "Apabila mim mati  (مْ)  bertemu dengan salah satu huruf hijaiyyah selain huruf mim (مْ) dan ba (ب), maka cara membacanya dengan jelas di bibir dan mulut tertutun. \n" +
                "Contoh :\n" +
                " هُمْ نَائِمُوْنَ\n",
        "Arti dari mad adalah memanjangkan suara suatu bacaan. Huruf mad ada tiga yaitu : ا  و  ي. Jenis mad terbagi 2 macam, yaitu :\n" +
                "1.\tMad Ashli / mad thobi’i\n" +
                "Mad Ashli / mad thobi’I terjadi apabila :\n" +
                "•\tHuruf berbaris fathah bertemu dengan alif\n" +
                "•\tHuruf berbaris kasroh bertemu dengan ya mati\n" +
                "•\tHuruf berbaris dhommah bertemu dengan wawu mati\n" +
                "Panjangnya adalah 1 alif atau dua harokat.\n" +
                "Contoh : \n" +
                " فِىۡ دِيۡنِ\n" +
                "\n" +
                "2.\tMad far’i\n" +
                "Adapun jenis mad far’i ini terdiri dari 13 macam, yaitu :\n" +
                "a.\tMad Wajib Muttashil\n" +
                "Yaitu setiap mad thobi’i bertemu dengan hamzah dalam satu kata. Panjangnya adalah 5 harokat atau 2,5 alif. (harokat = ketukan/panjang setiap suara). \n" +
                "Contoh:\n" +
                "اِذَا جَآءَ - يُرَاۤءُوْنَۙ\n" +
                " \n" +
                "b.\tMad Jaiz Munfashil\n" +
                "Yaitu setiap mad thobi’i bertemu dengan hamzah dalam kata yang berbeda. Panjangnya adalah 2, 4, atau 6 harokat (1, 2, atau 3 alif). \n" +
                "Contoh: \n" +
                "إِنَّا أَنْزَلْنَاهُ  - انْطَلِقُوا إِلَىٰ\n" +
                "\n" +
                "c.\tMad Aridh Lisukuun\n" +
                "Yaitu setiap mad thobi’i bertemu dengan huruf hidup dalam satu kalimat dan dibaca waqof (berhenti). Panjangnya adalah 2, 4, atau 6 harokat (1, 2, atau 3 alif).  Apabila tidak dibaca waqof, maka hukumnya kembali seperti mad thobi’i. \n" +
                "Contoh :\n" +
                "فَهُمْ مُسْلِمُونَ - عَذَابٌ أَلِيمٌ\n" +
                "\n" +
                "d.\tMad Badal\n" +
                "Yaitu mad pengganti huruf hamzah di awal kata. Lambang mad madal ini biasanya berupa tanda baris atau kasroh tegak. Panjangnya adalah 2 harokat (1 alif).\n" +
                "Contoh :\n" +
                "آدَمَ  asalnya  اَأْدَمَ\n" +
                "اِيْمَانٌ  asalnya اِئْمَانٌ \n" +
                "\n" +
                "e.\tMad ‘Iwad\n" +
                "Yaitu mad yang terjai apabila pada akhir kalimat terdapat huruf yang berbaris fathatain dan dibaca waqof. Panjangnya 2 harokat (1 alif). \n" +
                "Contoh :\n" +
                "كَثِيرًا - وَنِسَاءً\n" +
                " \n" +
                "f.\tMad Lazim Mutsaqqol Kalimi\n" +
                "Yaitu bila mad thobi’i bertemu dengan huruf yang bertasydid. Panjangnya adalah 6 harokat (3 alif).\n" +
                "Contoh :\n" +
                "وَلَا الضَّالِّينَ - اَوْ يُحَاۤجُّوْكُمْ\n" +
                " \n" +
                "g.\tMad Lazim Mukhoffaf Kalimi\n" +
                "Yaitu bila mad thobi’i bertemu dengan huruf sukun atau mati. Panjangnya adalah 6 harokat (3 alif).\n" +
                "Contoh :\n" +
                " آلْآنَ\n" +
                " \n" +
                "h.\tMad Lazim Harfi Musyba’\n" +
                "Mad ini terjadi hanya pada awal surat dalam al-qur’an. Huruf mad ini ada delapan, yaitu :\n" +
                "نَقَصَ عَسَلُكُمْ . Panjangnya adalah 6 harokat (3 alif). \n" +
                "Contoh :\n" +
                "لـمّ – الـمّر – الـمّص – طسمّ \n" +
                "\n" +
                "i.\tMad Lazim Mukhoffaf harfi\n" +
                "Mad ini juga terjadi hanya pada awal surat dalam al-qur’an. Huruf mad ini ada lima, yaitu: حَيٌّ طَهُرَ. Panjangnya adalah 2 harokat.\n" +
                "Contoh :\n" +
                "طٰهٰ – يٰسۤ -  حٰمۤ - الۤرٰ - كۤهٰيٰعۤصۤ\n" +
                " \n" +
                "j.\tMad Layyin\n" +
                "Mad ini terjadi bila : huruf berbaris fathah bertemu wawu mati atau ya mati, kemudian terdapat huruf lain yg juga mempunyai baris. Mad ini terjadi di akhir kalimat kalimat yang dibaca waqof (berhenti). Panjang mad ini adalah 2 – 6 harokat ( 1 – 3 alif). \n" +
                "Contoh :\n" +
                "قُرَيْشٍۙ - وَالصَّيْفِۚ\n" +
                "\n" +
                "k.\tMad Shilah\n" +
                "Mad ini terjadi pada huruh “ha” di akhir kata yang merupakan dhomir muzdakkar mufrod lilghoib (kata ganti orang ke-3 laki-laki). Syarat yang harus ada dalam mad ini adalah bahwa huruf sebelum dan sesudah “ha” dhomir harus berbaris hidup dan bukan mati/sukun.\n" +
                "Mad shilah terbagi 2, yaitu :\n" +
                "1)\tMad Shilah Qashiroh\n" +
                "Terjadi bila setelah “ha” dhomir terdapat huruf selain hamzah. Dan biasanya mad ini dilambangkan dengan baris fathah tegak, kasroh tegak, atau dhommah terbalik pada huruf “ha” dhomir. Panjangnya adalah 2 harokat (1 alif). \n" +
                "Contoh :\n" +
                "إِنَّهُ كَانَ – لَهُ مَا\n" +
                " \n" +
                "2)\tMad Shilah Thowilah\n" +
                "Terjadi bila setelah “ha” dhomir terdapat huruf hamzah. Panjangnya adalah 2-5 harokat (1 – 2,5  alif). \n" +
                "Contoh:\n" +
                " مَالَهٗٓ اَخْلَدَهٗ -  مَالُهٗٓ اِذَا\n" +
                " \n" +
                "l.\tMad Farqi \n" +
                "Terjadi bila mad badal bertemu dengan huruf yang bertasydid dan untuk membedakan antara kalimat istifham (pertanyaan) dengan sebuutan/berita. Panjangnya 6 harokat.\n" +
                "Contoh :\n" +
                "قُلْ آَلذَّكَرَيْنِ - قُلْ آَللَّ\n" +
                " \n" +
                "m.\tMad Tamkin\n" +
                "Terjadi bila 2 buah huruf ya bertemu dalam satu kalimat, di mana ya pertama berbaris kasroh dan bertasydid dan ya kedua berbaris sukun/mati. Panjangnya 2 – 6 harokat (1 – 3 alif).\n" +
                "Contoh :\n" +
                "وَالنَّبِيّٖنَ - حُيِّيْتُمْ - وَالْاُمِّيّٖنَ\n",
        "Hukum bacaan alim lam ( ال ) menyatakan bahwa apabila huruf alim lam ( ال ) bertemu dengan huruf-huruf hijaiyah, maka cara membaca huruf alif lam ( ال ) tersebut terbagi atas dua macam, yaitu alif lam ( ال ) syamsiyah dan alif lam ( ال ) qamariyah.\n" +
                "\n" +
                "1.\tAl - Syamsiyah.\n" +
                "Al - Syamsiyah adalah “Al” atau alif lam mati yang bertemu dengan salah satu huruf syamsiyah dan dibacanya lebur/idghom (bunyi “al’ tidak dibaca). Huruf-huruf tersebut adalah : ت ث د ذ ر ز س ش ص ض ط ظ ل ن.\n" +
                "\n" +
                "Ciri-ciri hukum bacaan “Al” Syamsiyah:\n" +
                "a.\tDibacanya dileburkan/idghom.\n" +
                "b.\tAda tanda tasydid/syiddah ( ) di atas huruf yang terletak setelah alif lam mati => الـــّ.\n" +
                "Contoh:\n" +
                "وَالشَّمْسِ  -  يَوْمُ الدِّيْنِ  -  وَالضُّحَى\n" +
                "\n" +
                "c.\tAl - Qamariyah\n" +
                "Al - Qamariyah adalah “Al” atau alif lam mati yang bertemu dengan salah satu huruf qamariyah dan dibacanya jelas/izhar. Huruf-huruf tersebut adalah : ا ب ج ح خ ع غ ف ق ك م و ه ي.\n" +
                "Ciri-ciri hukum bacaan “Al” Qamariyah:\n" +
                "a.\tDibacanya jelas/izhar.\n" +
                "b.\tAda tanda sukun ( ْ ) di atas huruf alif lam mati => الْ.\n" +
                "\n" +
                "Contoh:\n" +
                "اَلْهَادِى  -  وَالْحَمْدُ  -  بِاْلإِيْمَانِ\n",
        "Idgham adalah memasukkan satu huruf kepada huruf lainnya seakan-akan melafalkan huruf yang sama. Idgham dalam ilmu tajwid berlaku apabila ada dua huruf yang sama atau berdekatan dalam makhraj dan sifat saling bertemu. \n" +
                "Macam – macam idgham :\n" +
                "1.\tIdgham Mutamatsilain, Mutajanisain, dan Mutaqaribain\n" +
                "a.\tIdgham Mutamatsilain\n" +
                "Idgham mutamatsilain adalah apabila dua huruf yang sama makhraj dan shifatnya bertemu dan yang pertama sukun. Contohnya dal sukun bertemu dal, kaf sukun bertemu kaf, lam sukun bertemu lam, dll.\n" +
                "Contoh:\n" +
                "• Al-Baqarah: 16 (ta’ bertemu ta’)\n" +
                "فَمَا رَبِحَتْ تِّـجَارَتُهُمْ\n" +
                "• Al-Maidah: 61 (dal bertemu dal)\n" +
                "وَقَـدْ دَّخَلُواْ\n" +
                "• Al-Anbiya’: 87 (dzal bertemu dzal)\n" +
                "إِذْ ذَّهَبَ\n" +
                "b.\tIdgham Mutajanisain\n" +
                "Idgham mutajanisain adalah apabila ada dua huruf yang sama makhrajnya tapi beda sifatnya bertemu dan huruf yang pertama sukun. Akan tetapi, kaidah tersebut tidak berlaku pada semua huruf. Idgham mutajanisain berlaku pada:\n" +
                "•\tTa’ (ت) sukun bertemu Tha’ (ط)\n" +
                "•\tTha’ (ط) sukun bertemu Ta (ت)\n" +
                "•\tTa’ (ت) sukun bertemu Dal (د)\n" +
                "•\tDal (د) sukun bertemu Ta (ت)\n" +
                "•\tTsa’ (ث) sukun bertemu Dzal (ذ)\n" +
                "•\tDzal (ذ) sukun bertemu Zha’ (ظ)\n" +
                "•\tBa’ (ب) sukun bertemu Mim (م)\n" +
                "\n" +
                "Contoh:\n" +
                "• Ali Imran: 69\n" +
                "وَدَّتْ طَّـآئِفَةٌ\n" +
                "• Ali Imran: 122\n" +
                "إِذْ هَمَّتْ طَّـآئِفَتَانِ\n" +
                "• Al-Maidah: 28\n" +
                "لَئِن بَسَطْتَّ\n" +
                "\n" +
                "c.\tIdgham Mutaqaribain\n" +
                "Idgham mutaqaribain adalah apabila dua huruf yang berdekatan makhrajnya dan berbeda sifatnya bertemu dan huruf yang pertama sukun. Kaidah di atas tidak berlaku secara umum.  Dalam bacaan riwayat Imam Hafsh dari Imam Ashim, Idgham mutaqaribain hanya berlaku pada huruf-huruf berikut:\n" +
                "•\tQaf (ق) sukun bertemu kaf (ك).\n" +
                "•\tLam (ل) sukun bertemu ra' (ر).\n" +
                "•\tLam ta'rif (ال) bertemu huruf berikut:\n" +
                "ت ث د ذ ر ز س ش ص ض ط ظ ن\n" +
                "•\tNun (ن) sukun bertemu ya' (ي), mim (م), wau (و), lam (ل) dan ra' (ر).\n" +
                "\n" +
                "Contoh:\n" +
                "\uF0A7\tAl Mukminun: 97\n" +
                "وَقُلْ رَبِّ أَعُوذُ بِكَ\n" +
                "\uF0A7\tAl Qoshosh: 85\n" +
                "قُلْ رَبِّي أَعْلَمُ\n" +
                "\n" +
                "2.\tIdgham Kabir dan Idgham Shagir\n" +
                "a.\tIdgham Kabir\n" +
                "Idgham kabir adalah idgham dua huruf dimana keduanya berharakat.\n" +
                "Contoh idgham kabir:\n" +
                "سَلَكَكُمْ ← سَلَكْكُّمْ\n" +
                "فِيْهِ هُدًى ← فِيْهْ هُّدًى\n" +
                "Dalam qiraah Imam ‘Ashim tidak berlaku idgham kabir. Namun ada beberapa kata yang diidghamkan dimana keduanya berharakat namun secara tulisan pun sudah diidghamkan. Berikut diantaranya:\n" +
                "•\tKata (مَكَّنِّيْ)\n" +
                "Kata (مَكَّنِّيْ) asalnya (مَكَّنَنِيْ) sebagaimana terdapat pada Al-Kahfi ayat 95.\n" +
                "•\tKata (تَأْمَنَّا)\n" +
                "Kata (تَأْمَنَّا) asalnya (تَأْمَنُنَا) sebagaimana terdapat pada Yusuf ayat 11. Hanya saja dalam kata di atas ada dua cara membacanya, yakni dengan isymam atau raum.\n" +
                "•\tKata (تُحَاجُّونِّي)\n" +
                "Kata (تُحَاجُّونِّي) asalnya (تُحَاجُّونَنِي) sebagaimana terdapat pada Al-An’am ayat 80.\n" +
                "•\tKata (تَأْمُرُونِّي)\n" +
                "Kata (تَأْمُرُونِّي) asalnya (تَأْمُرُونِّي) sebagaimana terdapat pada Az-Zumar ayat 64.\n" +
                "\n" +
                "b.\tIdgham Shagir\n" +
                "Idgham shagir adalah idgham dua huruf dimana yang pertama sukun dan yang kedua berharakat. \n" +
                "Contoh idgham shagir:\n" +
                "نْ ← ي = مَنْ يَعْمَلْ\n" +
                "دْ ← ت = عَبَدْتُّمْ\n" +
                "لْ ← ن = وَالنَّاسُ\n" +
                "3.\tIdgham Kamil dan idham Naqish\n" +
                "a.\tIdgham Kamil\n" +
                "Idgham kamil artinya adalah idgham yang sempurna. Adapun dalam istilah ilmu tajwid idgham kamil adalah memasukkan huruf ke huruf yang lainnya secara sempurna baik makhraj maupun sifatnya. \n" +
                "Contohnya:\n" +
                "عَبَدْتُّمْ – مِنْ نِّعْمَةٍ – عَصَوْا وَّكَانُوْا - اَلدَّهْرِ\n" +
                "Contoh diatas merupakan bacaan idgham kamil karena huruf yang pertama melebur ke huruf yang kedua sehingga lafal huruf yang pertama tidak tersisa sama sekali.\n" +
                "\n" +
                "Idgham kamil terdapat pada:\n" +
                "•\tIdgham syamsiyah\n" +
                "•\tIdgham bila ghunnah\n" +
                "•\tIdgham bighunnah (selain wau dan ya’)\n" +
                "•\tIdgham mutamatsilain\n" +
                "•\tIdgham mutajanisain (selain tha’ ke ta’)\n" +
                "•\tIdgham mutaqaribain\n" +
                "\n" +
                "b.\tIdgham Naqish                   \n" +
                "Idgham naqish adalah memasukkan huruf ke huruf yang lainnya namun ada beberapa sifat yang masih muncul pada huruf yang pertama. \n" +
                "Contoh:\n" +
                "مَنْ يَعْمَلْ – مِنْ وَّالٍ – بَسَطْتَ – اَلَمْ نَخْلُقْكُّمْ\n" +
                "\n" +
                "Mengapa contoh-contoh di atas dikategorikan idgham naqish:\n" +
                "•\tIdgham pada kata pertama dan kedua disertai dengan ghunnah. Ghunnah adalah sifat yang terdapat pada huruf nun. Sedangkan ya’ dan wau tidak memiliki sifat ghunnah. Ketika nun diidghamkan ke huruf ya’ dan wau masih menyisakan sifat yang terdapat pada nun yaitu ghunnah sehingga termasuk idgham naqish.\n" +
                "•\tIdgham pada kata (بَسَطتَّ) masih menyisakan sifat ithbaq yang terdapat pada huruf tha’ sehingga idghamnya tidak sempurna. Adapun kata (نَخْلُقْكُمْ) ulama berbeda pendapat. Ada yang mengatakan masih terdapat sifat isti’la pada huruf qaf ada juga yang mengatakan qaf didghamkan secara sempurna ke huruf kaf.\n" +
                "\n" +
                "Idgham naqish terdapat pada: \n" +
                "•\tIdgham bighunnah (selain mim dan nun)\n" +
                "•\tIdgham tha’ ke ta.\n" +
                "\n" +
                "4.\tIdgham Bighunnah dan Idgham Bilaghunnah\n" +
                "1)\tIdgham Bighunnah (dilebur dengan disertai dengung)\n" +
                "Yaitu memasukkan/meleburkan huruf nun mati atau tanwin (ـًـٍـٌ / نْ) kedalam huruf sesudahnya dengan disertai berdengung, jika bertemu dengan salah satu huruf yang empat, yaitu: ( ن م و ي). \n" +
                "Contoh :\n" +
                "يَّقُوْلُ - خَيْرٌ وَّأَبْقَى - مِنْ مَّسَدٍ - عَامِلَةٌ نَّاصِبَةٌ\n" +
                "\n" +
                "2)\tIdgham Bilaghunnah (dilebur tanpa dengung)\n" +
                "Yaitu memasukkan/meleburkan huruf nun mati atau tanwin (ـًـٍـٌ / نْ) kedalam huruf sesudahnya tanpa disertai dengung, jika bertemu dengan huruf lam atau ra (ر ل).\n" +
                "Contoh : \n" +
                "أَنْ لَّـمْ يَرَهُ - غَفُوْرٌ رَّحِيْمٌ\n" +
                "\n" +
                "5.\tIdgham Syamsiyah\n" +
                "Idgham syamsiyyah adalah apabila lam ta'rif bertemu dengan 14 huruf idgham syamsiyah. Huruf idgham syamsiyah terkumpul pada bait berikut:\n" +
                "طِبْ ثُمَّ صِـلْ رَحْمًا تَـفُـزْ ضِفْ ذَا نِعَمْ * دَعْ سُوْءَ ظَنٍّ زُرْ شَرِيْفًا لِلْكَرَمْ\n" +
                "Apabila diambil huruf inisial dari bait di atas, maka didapati:\n" +
                "ط ث ص ر ت ض ذ ن د س ظ ز ش ل\n" +
                "dan apabila diurutkan sesuai urutan hijaiyah menjadi:\n" +
                "ت ث د ذ ر ز س ش ص ض ط ظ ل ن\n" +
                "Contoh:\n" +
                "وَالشَّمْسِ – وَالضُّحَى - مِنَ الذَّهَبِ - وَمِنَ النَّاسِ - وَإِذَا الرُّسُلُ\n",
        "Menurut bahasa qalqalah artinya gerak, sedangkan menurut istilah qalqalah adalah bunyi huruf yang memantul bila ia mati atau dimatikan, atau suara membalik dengan bunyi rangkap. Adapun huruf qalqalah terdiri atas lima huruf, yaitu : ق ط ب ج د  agar mudah dihafal dirangkai menjadi قُطْبُ جَدٍ.\n" +
                "Macam-macam Qalqalah :\n" +
                "a.\tQalqalah kubra (besar) \n" +
                "Yaitu Huruf Qalqalah yang berbaris hidup, dimatikan karena waqaf. inilah Qalqalah yang paling utama, cara membacanya dikeraskan qalqalahnya.\n" +
                "Contoh :\n" +
                " مَا خَلَقَ -  أُوْلُوا اْلأَلْبَابِ  -  زَوْجٍ بَهِيْجٍ .\n" +
                "\n" +
                "b.\tQalqalah Sugra (kecil)\n" +
                "Yaitu Huruf Qalqalah yang berbaris mati, tetapi tidak waqaf padanya,caranya membacanya kurang dikeraskan Qalqalahnya. \n" +
                "Contoh :\n" +
                " يَقْطَعُوْنَ   -   إِلاَّ إِبْلِيْسَ  -   وَمَا أَدْرَاكَ\n",
        "Ra’ yang Bisa Dibaca Tafkhim atau Tarqiq (Jawazul Wajhain). Huruf ra’ boleh dibaca tebal (tafkhim) atau tipis (tarqiq) dalam keadaan tertentu. Dan kebolehan ra’ dibaca tafkhim atau tarqiqnya juga ada yang dalam keadaan waqaf dan adapula ketika washal. \n" +
                "Hukum bacaan Ra terbagi menjadi tiga,yaitu:\n" +
                "1.\tRa dibaca Tafkhim \n" +
                "Tafkhim artinya tebal, apabila keadaannya sbb:\n" +
                "a.\tRa berharkat fathah. \n" +
                "Contoh : اَلرَّسُوْلَ\n" +
                "b.\tRa berharkat dhummah. \n" +
                "Contoh : رُحَمَاءِ\n" +
                "c.\tRa diwakafkan sebelumnya huruf yang berharkat fathah atau Dhummah. \n" +
                "Contoh : يَنْصُرُ -  َاْلاَبْتَرُ\n" +
                "d.\tRa sukun sebelumnya huruf yang berbaris fathah atau dhummah. \n" +
                "Contoh :   تُرْجَعُوْنَ- يَرْحَمٌ\n" +
                "e.\tRa sukun karena wakaf sebelumnya terdapat alif atau wau yang mati. \n" +
                "Contoh : اَلْغَفُوْرُ -اَلْجَبَّارُ   \n" +
                "f.\tBila ra terletak sesudah Hamzah Washal. \n" +
                "Contoh : اُرْكُضْ- اِرْحَمْنَا\n" +
                "\n" +
                "Catatan:Hamzah Washal adalah Hamzah yang apabila terletak dia diawal dibaca, tetapi kalau ada yang mendahuluinya dia tidak dibaca\n" +
                "\n" +
                "2.\tRa dibaca tarqiq\n" +
                "Tarqiq artinya tipis Ra dibaca Tarkik apabila keadaannya sebagai berikut:\n" +
                "a.\tRa berharkat kasrah. \n" +
                "Contoh :  رِحْلَةَ الشّتَاءِ  -  تَجْرِيْ\n" +
                "b.\tRa sukun sebelumnya huruf berharkat kasrah dan sesudahnya bukanlah huruf Ist’la’ . Contoh : فِرْعَوْنَ – مِرْيَةٌ\n" +
                "c.\tRa sukun sebelumnya huruf yan berharkat kasrah dan sesudahnya huruf Ist’la’ dalam kata yang terpisah. \n" +
                "d.\tContoh :  فَصْبِرْصَبْرًا   \n" +
                "e.\tRa sukun karena wakaf, sebelumnya huruf berharkat kasrah atau ya sukun. \n" +
                "Contoh: جَمِيْعٌ مُنْتَصِرٌ – يَوْمَئِذِ لَخَبِيْر\n" +
                "f.\tRa sukun karena wakaf sebelumnya bukan huruf huruf Isti’la’dan sebelumnya didahului oleh huruf yang berbaris kasrah. \n" +
                "Contoh : ذِيْ الذِّكْر\n" +
                "\n" +
                "Catatan : huruf Isti’lak ialah melafalkan huruf dengan mengangkat pangkal lidah kelangit-langit yang mengakibatkan hurfnya besar  ق ص ض ظ ط غ خ\n" +
                "\n" +
                "3.\tRa boleh dibaca tafkhim atau tarqiq(Jawazul Wajhain)\n" +
                "Ra dibaca tarkik dan tafkhim bila:\n" +
                "a.\tRa sukun sebelumnya berharkat kasrah dan sesudahnya huruf Isti’la’ berharkat kasrah atau Kasratain.\n" +
                "Contoh :  مِنْ عِرْضِهِ – بِحِرْص\n" +
                "b.\tRa sukun karena wakaf, sebelumnya huruf Isti’la’ yang berbaris mati, yang diawali dengan huruf yang berharkat kasrah.\n" +
                "Contoh : الْقِطْرِ – مِصْرِ\n",
        "Waqaf artinya berhenti, yaitu berhenti ketika membaca ayat-ayat Al-Qur’an baik di akhir ayat atau di pertengahan ayat. Adapun tanda-tanda waqaf antara lain :\n" +
                "Adapun tanda-tanda waqaf antara lain :\n"+
                "لا\t(Waqaf La Washal) \t: Tidak Boleh Berhenti.\\\n" +
                "م \t(Waqaf Lazim)\t\t: Harus Berhenti Di Akhir Kalimat Sempurna.\n" +
                "ﺹ \t(Waqaf Murakhkhas)\t: Lebih Baik Tidak Berhenti, Diperbolehkan Berhenti Tanpa Mengubah Makna.\n" +
                "صلى (Al-Wasl Awlaa)\t\t: Meneruskan Bacaan Adalah Lebih Baik.\n" +
                "ﻕ\t(Qeela Alayhil Waqf)\t: Telah Dinyatakan Boleh Berhenti Pada Waqaf Sebelumnya\n" +
                "ﺼﻞ\t(Qad Yoosalu)\t\t: Kadang Kala Boleh Diwasalkan\n" +
                "قف \t(Waqaf Mustahabb)\t: Di Sini Boleh Berhenti\n" +
                "ل \t(‘Adamul Waqfi)\t\t: Tidak Boleh Berhenti\n" +
                "س \t(Saktah) \t\t\t: Berhenti Sebentar Tanpa Mengambil Napas.\n" +
                "ز\t(Waqaf Mujawwas)\t: Boleh Berhenti, Tetapi Lebih Baik Meneruskan Bacaan\n" +
                "قلى\t(Waqaf Aulaa)\t\t: Lebih Baik Untuk Berhenti, Daripada Diteruskan\n" +
                "ﻙ \t(WAQAF Kathaalik)\t: Serupa Dengan Waqaf Yang Sebelumnya Muncul.\n" +
                ". ۛ. . ۛ.(Waqaf Muraqabah) \t: Harus Berhenti Di Salah Satu Tanda.\n" +
                "ﻁ \t(Waqaf Mutlaq) \t\t: Diharuskan Berhenti.\n" +
                "ﺝ \t(Waqaf Jaiz)\t\t\t: Boleh Berhenti Dan Boleh Untuk Dilanjutkan.\n" +
                "ﻇ \t(Waqaf Dza)\t\t\t: Lebih Baik Tidak Berhenti.\n",
    )
    private val audio_tajwid = intArrayOf(
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah,
        R.raw.huruf_hijaiyah

    )

    //ini data untuk doa
    private val no_doa = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
        "11",
        "12",
        "13",
        "14",
        "15",
        "16",
        "17",
        "18",
        "19",
        "20",
    )
    private val jdl_doa = arrayOf(
        "Doa Sebelum Tidur",
        "Doa Bangun Tidur",
        "Doa Masuk Kamar Mandi",
        "Doa Keluar Kamar Mandi",
        "Doa Ketika Bercermin",
        "Doa Keluar Rumah",
        "Doa Masuk Rumah",
        "Doa Memohon Ilmu Yang Bermanfaat",
        "Doa Sebelum Belajar",
        "Doa Sesudah Belajar",
        "Doa Sebelum Wudhu",
        "Doa Setelah Wudhu",
        "Doa Sebelum Membaca Al - Qur'an",
        "Doa Setelah Membaca Al - Qur'an",
        "Doa Sebelum Mandi",
        "Doa Hendak Berpergian",
        "Doa Ketika Sampai Di Tempat Tujuan",
        "Doa Memakai Pakaian",
        "Doa Memakai Pakaian Baru",
        "Doa Melepas Pakaian",
    )
    private val arabic_doa = arrayOf(
        "بِسْمِكَ االلّٰهُمَّ اَحْيَا وَبِاسْمِكَ اَمُوْتُ",
        "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ",
        "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ",
        "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ",
        "اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ فَحَسِّـنْ خُلُقِىْ",
        "بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِالله",
        "اَللّٰهُمَّ اِنّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبّنَا تَوَكَّلْنَا",
        "اَللّٰهُمَّ اِنِّى اَسْأَلُكَ عِلْمًا نَافِعًا وَرِزْقًا طَيِّبًا وَعَمَلاً مُتَقَبَّلاً",
        "يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا",
        "iاَللّٰهُمَّ اِنِّى اِسْتَوْدِعُكَ مَاعَلَّمْتَنِيْهِ فَارْدُدْهُ اِلَىَّ عِنْدَ حَاجَتِىْ وَلاَ تَنْسَنِيْهِ يَارَبَّ الْعَالَمِيْنَ",
        "نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا لِلّٰهِ تَعَالَى",
        "َشْهَدُ اَنْ لاَّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللّٰهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ، وَجْعَلْنِيْ مِنْ عِبَادِكَ الصَّالِحِيْنَ",
        "اَللّٰهُمَّ افْتَحْ عَلَىَّ حِكْمَتَكَ وَانْشُرْ عَلَىَّ رَحْمَتَكَ وَذَكِّرْنِىْ مَانَسِيْتُ يَاذَاالْجَلاَلِ وَاْلاِكْرَامِ",
        "اَللّٰهُمَّ ارْحَمْنِىْ بِالْقُرْآنِ. وَاجْعَلْهُ لِىْ اِمَامًا وَنُوْرًا وَّهُدًى وَّرَحْمَةً. اَللّٰهُمَّ ذَكِّرْنِىْ مِنْهُ مَانَسِيْتُ وَعَلِّمْنِىْ مِنْهُ مَاجَهِلْتُ. وَارْزُقْنِىْ تِلاَ وَتَهُ آنَآءَ اللَّيْلِ وَاَطْرَافَ النَّهَارٍ. وَاجْعَلْهُ لِىْ حُجَّةً يَارَبَّ الْعَالَمِيْنَ",
        "اَللّٰهُمَّ اغْفِرْلِى ذَنْبِى وَوَسِّعْ لِى فِىْ دَارِىْ وَبَارِكْ لِىْ فِىْ رِزْقِىْ",
        "اَللّٰهُمَّ هَوِّنْ عَلَيْنَا سَفَرَنَا هَذَا وَاطْوِعَنَّابُعْدَهُ اَللّٰهُمَّ اَنْتَ الصَّاحِبُ فِى السَّفَرِوَالْخَلِيْفَةُفِى الْاَهْلِ",
        "َلْحَمْدُ ِللهِ الَّذِى سَلَمَنِى وَالَّذِى اَوَنِى وَالَّذِى جَمَعَ الشَّمْلَ بِ",
        "بِسْمِ اللهِ اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ خَيْرِهِ وَخَيْرِ مَاهُوَ لَهُ وَاَعُوْذُبِكَ مِنْ شَرِّهِ وَشَرِّمَا هُوَلَهُ",
        "لْحَمْدُ لِلّٰهِ الَّذِىْ كَسَانِىْ هَذَا وَرَزَقَنِيْهِ مِنْ غَيْرِ حَوْلٍ مِنِّىْ وَلاَقُوَّةٍَ",
        "بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوَ",
    )
    private val latin_doa = arrayOf(
        "Bismikallaahumma ahyaa wa ammuut",
        "Alhamdu lillahil ladzii ahyaanaa ba’da maa amaa tanaa wa ilahin nusyuuru",
        "Allahumma Innii a'uudzubika minal khubutsi wal khoaaitsi",
        "Ghufraanakal hamdu lillaahil ladzii adzhaba 'annil adzaa wa 'aafaanii",
        "Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii",
        "Bismillaahi tawakkaltu 'alalloohi laa hawlaa walaa quwwata illaa bilaahi",
        "Allahumma innii as-aluka khoirol mauliji wa khoirol makhroji bismillaahi wa lajnaa wa bismillaahi khorojnaa wa'alallohi robbina tawakkalnaa",
        "Allahumma innii as-aluka 'ilmaan naafi'aan wa rizqoon thoyyibaan wa 'amalaan mutaqobbalaan",
        "Yaa robbi zidnii 'ilman warzuqnii fahmaa",
        "Allaahumma innii astaudi'uka maa 'allamtaniihi fardud-hu ilayya 'inda haajatii wa laa tansaniihi yaa robbal 'alamiin",
        "Nawaitul whudu-a lirof'il hadatsii ashghori fardhon lillaahi ta'aalaa",
        "Asyhadu allaa ilaaha illalloohu wahdahuu laa syariika lahu wa asyhadu anna muhammadan ‘abduhuuwa rosuuluhuu, alloohummaj’alnii minat tawwaabiina waj’alnii minal mutathohhiriina, waj'alnii min 'ibadikash shaalihiina.",
        "Allahummaftah 'alayya hikmataka wansyur 'alayya rohmataka wa dzakkirnii maanasiitu yaa dzal jalaali wal ikhroomi",
        "Allahummarhamnii bil qur'aani. waj'alhu lii imaaman wa nuuran wa hudan wa rohman. Allahumma dzakkirnii minhu maa nasiitu wa'allimnii minhu maa jahiltu. wazuqnii tilaa watahu aanaa-al laili wa athroofan nahaari. waj'alhu lii hujjatan yaa robbal 'aalamiina.",
        "Allahummaghfirlii dzambii wa wassi'lii fii daarii wa baarik lii fii rizqii",
        "Allahumma hawwin 'alainaa safaranaa hadzaa waatwi 'annaa bu'dahu. Alloohumma antashookhibu fiissafari walkholiifatu fiil ahli",
        "Alhamdulillahil ladzi sallamani wal ladzi awani wal ladzi jama’asy syamla bi",
        "Bismillaahi, Alloohumma innii as-aluka min khoirihi wa khoiri maa huwa lahuu wa'a'uu dzubika min syarrihi wa syarri maa huwa lahuu",
        "Alhamdu lillaahil ladzii kasaanii haadzaa wa rozaqoniihi min ghoiri hawlim minni wa laa quwwatin",
        "Bismillaahil ladzii laa ilaaha illaa huwa",
    )
    private val arti_doa = arrayOf(
        "Artinya: \"Dengan menyebut nama Allah, aku hidup dan aku mati\"",
        "Artinya: \"Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan\"",
        "Artinya: \"Ya Allah, aku berlindung pada-Mu dari godaan setan laki-laki dan setan perempuan\"",
        "Artinya: \"Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan\"",
        "Artinya: \"Segala puji bagi Allah, baguskanlah budi pekertiku sebagaimana Engkau telah membaguskan rupa wajahku\"",
        "Artinya: \"Dengan menyebut nama Allah aku bertawakal kepada Allah, tiada daya kekuatan melainkan dengan pertolongan Allah.\"",
        "Artinya: \"Ya Allah, sesungguhnya aku mohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk, dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami bertawakkal\"",
        "Artinya: \"Ya Allah, sesungguhnya aku mohon kepada-Mu ilmu yang berguna, rezki yang baik dan amal yang baik Diterima. (H.R. Ibnu Majah)\"",
        "Artinya: \"Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman\"",
        "Artinya: \"Ya Allah, sesungguhnya aku menitipkan kepada Engkau ilmu-ilmu yang telah Engkau ajarkan kepadaku, dan kembalikanlah kepadaku sewaktu aku butuh kembali dan janganlah Engkau lupakan aku kepada ilmu itu wahai Tuhan seru sekalian alam.\"",
        "Artinya: \"Saya niat berwudhu untuk menghilangkan hadast kecil fardu (wajib) karena Allah ta'ala\"",
        "Artinya: \"Aku bersaksi, tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku mengaku bahwa Nabi Muhammad itu adalah hamba dan Utusan Allah. Ya Allah, jadikanlah aku dari golongan orang-orang yang bertaubat dan jadikanlah aku dari golongan orang-orang yang suci dan jadikanlah aku dari golongan hamba-hamba Mu yang shaleh\"",
        "Artinya: \"Ya Allah bukakanlah hikmahMu padaku, bentangkanlah rahmatMu padaku dan ingatkanlah aku terhadap apa yang aku lupa, wahai Dzat yang memiliki keagungan dan kemuliaan.\"",
        "Artinya: \"Ya Allah, rahmatilah aku dengan Al-Quran yang agung, jadikanlah ia bagiku ikutan cahaya petunjuk rahmat. Ya Allah, ingatkanlah apa yang telah aku lupa dan ajarkan kepadaku apa yang tidak aku ketahui darinya, anugerahkanlah padaku kesempatan membacanya pada sebagian malam dan siang, jadikanlah ia hujjah yang kuat bagiku, wahai Tuhan seru sekalian alam.\"",
        "Artinya: \"Ya Allah ampunilah dosa kesalahanku dan berilah keluasaan di rumahku serta berkahilah pada rezekiku.\"",
        "Artinya: \"Ya Allah, mudahkanlah kami berpergian ini, dan dekatkanlah kejauhannya. Ya Allah yang menemani dalam berpergian, dan Engkau pula yang melindungi keluarga.\"",
        "Artinya: \"Segala puji bagi Allah, yang telah menyelamatkan akau dan yang telah melindungiku dan yang mengumpulkanku dengan keluargaku.\"",
        "Artinya: \"Dengan nama-Mu yaa Allah akku minta kepada Engkau kebaikan pakaian ini dan kebaikan apa yang ada padanya, dan aku berlindung kepada Engkau dari kejahatan pakaian ini dan kejahatan yang ada padanya\"",
        "Artinya: \"Segala puji bagi Allah yang memberi aku pakaian ini dan memberi rizeki dengan tiada upaya dan kekuatan dariku\"",
        "Artinya: \"Dengan nama Allah yang tiada Tuhan selain-Nya\"",
    )
    //untuk tajwid
    val ListDataTajwid: ArrayList<Tajwid>
        get () {
            val list = arrayListOf<Tajwid>()
            for (position in no_tajwid.indices) {
                val tajwid = Tajwid()
                tajwid.nomor = no_tajwid[position]
                tajwid.judul = jdl_tajwid[position]
                tajwid.pengertian = pengertian_tajwid[position]
                tajwid.audio = audio_tajwid[position]
                list.add(tajwid)
            }
            return list
        }

    //untuk doa
    val ListDataDoa: ArrayList<Doa>
        get (){
            val List = arrayListOf<Doa>()
            for (position in no_doa.indices){
                val doa = Doa()
                doa.nmr = no_doa[position]
                doa.jdl = jdl_doa[position]
                doa.arabic = arabic_doa[position]
                doa.latin = latin_doa[position]
                doa.arti = arti_doa[position]
                List.add(doa)
            }
            return List
        }
}