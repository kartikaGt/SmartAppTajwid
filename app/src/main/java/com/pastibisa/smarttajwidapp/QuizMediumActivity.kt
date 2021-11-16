package com.pastibisa.smarttajwidapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizMediumActivity : AppCompatActivity() {
    private lateinit var opt_1 : TextView
    private lateinit var opt_2 : TextView
    private lateinit var opt_3 : TextView
    private lateinit var opt_4 : TextView
    private lateinit var progress_text : TextView
    private lateinit var question_text : TextView
    private lateinit var progress_bar : ProgressBar
    private lateinit var setuju : Button
    private var nilai:Int=0
    private var current_Position:Int=1
    private var question_List:ArrayList<QuestionMedium> ? = null
    private var selected_Option:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_medium)
        opt_1 = findViewById(R.id.opt_a)
        opt_2 = findViewById(R.id.opt_b)
        opt_3 = findViewById(R.id.opt_c)
        opt_4 = findViewById(R.id.opt_d)
        progress_text = findViewById(R.id.progress_text_medium)
        question_text = findViewById(R.id.question_medium)
        progress_bar = findViewById(R.id.progress_bar_medium)
        setuju = findViewById(R.id.submit_medium)
        question_List=QuizData.get_question()

        setQuestion()
        opt_1.setOnClickListener{
            selected_OptionStyle(opt_1,1)
        }
        opt_2.setOnClickListener{
            selected_OptionStyle(opt_2,2)
        }
        opt_3.setOnClickListener{
            selected_OptionStyle(opt_3,3)
        }
        opt_4.setOnClickListener{
            selected_OptionStyle(opt_4,4)
        }

        setuju.setOnClickListener {
            if(selected_Option!=0)
            {

                val question=question_List!![current_Position-1]
                if(selected_Option!=question.correct_answer)
                {
                    set_Color(selected_Option,R.drawable.wrong_question_option)
                }else{
                    nilai++;
                }
                set_Color(question.correct_answer,R.drawable.correct_question_option)
                if(current_Position==question_List!!.size)
                    setuju.text="SELESAI"
                else
                    setuju.text="Selanjutnya"
            }else{
                current_Position++
                when{
                    current_Position<=question_List!!.size->{
                        setQuestion()
                        setuju.text="Kirim"
                    }
                    else->{
                        var intent= Intent(this,ResultActivity::class.java)
                        intent.putExtra(QuizData.nilai,nilai.toString())
                        intent.putExtra("total size",question_List!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
                }
            }
            selected_Option=0
        }
    }

    fun set_Color(opp:Int,colour:Int){
        when(opp){
            1->{
                opt_1.background= ContextCompat.getDrawable(this,colour)
            }
            2->{
                opt_2.background= ContextCompat.getDrawable(this,colour)
            }
            3->{
                opt_3.background= ContextCompat.getDrawable(this,colour)
            }
            4->{
                opt_4.background= ContextCompat.getDrawable(this,colour)
            }
        }
    }

    fun setQuestion(){

        val question = question_List!![current_Position-1]
        set_OptionStyle()


        progress_bar.progress=current_Position
        progress_bar.max=question_List!!.size
        progress_text.text="${current_Position}"+"/"+"${question_List!!.size}"
        question_text.text=question.question_medium
        opt_1.text=question.option_1
        opt_2.text=question.option_2
        opt_3.text=question.option_3
        opt_4.text=question.option_4

    }

    fun set_OptionStyle(){
        var option_list:ArrayList<TextView> = arrayListOf()
        option_list.add(0,opt_1)
        option_list.add(1,opt_2)
        option_list.add(2,opt_3)
        option_list.add(3,opt_4)


        for(opt in option_list)
        {
            opt.setTextColor(Color.parseColor("#555151"))
            opt.background= ContextCompat.getDrawable(this,R.drawable.question_option)
            opt.typeface= Typeface.DEFAULT
        }
    }

    fun selected_OptionStyle(view_2: TextView, opp:Int){

        set_OptionStyle()
        selected_Option=opp
        view_2.background= ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view_2.typeface= Typeface.DEFAULT_BOLD
        view_2.setTextColor(Color.parseColor("#000000"))

    }

}
