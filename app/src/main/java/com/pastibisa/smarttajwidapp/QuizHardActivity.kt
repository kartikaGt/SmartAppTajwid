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

class QuizHardActivity: AppCompatActivity() {
    private lateinit var option1 : TextView
    private lateinit var option2 : TextView
    private lateinit var option3 : TextView
    private lateinit var option4 : TextView
    private lateinit var progressText : TextView
    private lateinit var questionText : TextView
    private lateinit var progresBar : ProgressBar
    private lateinit var allow : Button
    private var hasil:Int=0
    private var current_position:Int=1
    private var question_list:ArrayList<QuestionHard> ? = null
    private var selected_option:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_hard)
        option1 = findViewById(R.id.opt_one)
        option2 = findViewById(R.id.opt_two)
        option3 = findViewById(R.id.opt_three)
        option4 = findViewById(R.id.opt_four)
        progressText = findViewById(R.id.progress_text_hard)
        questionText = findViewById(R.id.question_Hard)
        progresBar = findViewById(R.id.progress_bar_hard)
        allow= findViewById(R.id.submit_hard)
        question_list=QuizData.getQuestion()

        setQuestion()
        option1.setOnClickListener{
            selected_Option_Style(option1,1)
        }
        option2.setOnClickListener{
            selected_Option_Style(option2,1)
        }
        option2.setOnClickListener{
            selected_Option_Style(option2,1)
        }
        option3.setOnClickListener{
            selected_Option_Style(option3,1)
        }
        option4.setOnClickListener{
            selected_Option_Style(option4,1)
        }

        allow.setOnClickListener {
            if(selected_option!=0)
            {

                val question=question_list!![current_position-1]
                if(selected_option!=question.corr_answer)
                {
                    set_color(selected_option,R.drawable.wrong_question_option)
                }else{
                    hasil++;
                }
                set_color(question.corr_answer,R.drawable.correct_question_option)
                if(current_position==question_list!!.size)
                    allow.text="SELESAI"
                else
                    allow.text="Selanjutnya"
            }else{
                current_position++
                when{
                    current_position<=question_list!!.size->{
                        setQuestion()
                        allow.text="Kirim"
                    }
                    else->{
                        var intent= Intent(this,ResultActivity::class.java)
                        intent.putExtra(QuizData.hasil,hasil.toString())
                        intent.putExtra("total size",question_list!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
                }
            }
            selected_option=0
        }
    }

    fun set_color(opT:Int,colur:Int){
        when(opT){
            1->{
                option1.background= ContextCompat.getDrawable(this,colur)
            }
            2->{
                option2.background= ContextCompat.getDrawable(this,colur)
            }
            3->{
                option3.background= ContextCompat.getDrawable(this,colur)
            }
            4->{
                option4.background= ContextCompat.getDrawable(this,colur)
            }
        }
    }

    fun setQuestion(){

        val question = question_list!![current_position-1]
        set_Option_Style()


        progresBar.progress=current_position
        progresBar.max=question_list!!.size
        progressText.text="${current_position}"+"/"+"${question_list!!.size}"
        questionText.text=question.question_hard
        option1.text=question.option_a
        option2.text=question.option_b
        option3.text=question.option_c
        option4.text=question.option_d


    }

    fun set_Option_Style(){
        var option_List:ArrayList<TextView> = arrayListOf()
        option_List.add(0,option1)
        option_List.add(1,option2)
        option_List.add(2,option3)
        option_List.add(3,option4)

        for(oP in option_List)
        {
            oP.setTextColor(Color.parseColor("#555151"))
            oP.background= ContextCompat.getDrawable(this,R.drawable.question_option)
            oP.typeface= Typeface.DEFAULT
        }
    }

    fun selected_Option_Style(view_3: TextView, option:Int){

        set_Option_Style()
        selected_option=option
        view_3.background= ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view_3.typeface= Typeface.DEFAULT_BOLD
        view_3.setTextColor(Color.parseColor("#000000"))

    }

}
