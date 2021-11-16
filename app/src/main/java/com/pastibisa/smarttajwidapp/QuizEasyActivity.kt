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

class QuizEasyActivity : AppCompatActivity() {
    private lateinit var opt1 : TextView
    private lateinit var opt2 : TextView
    private lateinit var opt3 : TextView
    private lateinit var opt4 : TextView
    private lateinit var progresstext : TextView
    private lateinit var questiontext : TextView
    private lateinit var progressbar : ProgressBar
    private lateinit var submit : Button
    private var score:Int=0
    private var currentPosition:Int=1
    private var questionList:ArrayList<QuestionEasy> ? = null
    private var selectedOption:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_easy)
        opt1 = findViewById(R.id.opt_1)
        opt2 = findViewById(R.id.opt_2)
        opt3 = findViewById(R.id.opt_3)
        opt4 = findViewById(R.id.opt_4)
        progresstext = findViewById(R.id.progress_text_easy)
        questiontext = findViewById(R.id.question_easy)
        progressbar = findViewById(R.id.progress_bar_easy)
        submit = findViewById(R.id.submit_easy)
        questionList=QuizData.getquestion()

        setQuestion()
        opt1.setOnClickListener{

            selectedOptionStyle(opt1,1)
        }
        opt2.setOnClickListener{

            selectedOptionStyle(opt2,2)
        }
        opt3.setOnClickListener{

            selectedOptionStyle(opt3,3)
        }
        opt4.setOnClickListener{

            selectedOptionStyle(opt4,4)
        }

        submit.setOnClickListener {
            if(selectedOption!=0)
            {

                val question=questionList!![currentPosition-1]
                if(selectedOption!=question.correct_ans)
                {
                    setColor(selectedOption,R.drawable.wrong_question_option)
                }else{
                    score++;
                }
                setColor(question.correct_ans,R.drawable.correct_question_option)
                if(currentPosition==questionList!!.size)
                    submit.text="SELESAI"
                else
                    submit.text="Selanjutnya"
            }else{
                currentPosition++
                when{
                    currentPosition<=questionList!!.size->{
                        setQuestion()
                        submit.text="Kirim"
                    }
                    else->{
                        var intent= Intent(this,ResultActivity::class.java)
                        intent.putExtra(QuizData.score,score.toString())
                        intent.putExtra("total size",questionList!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
                }
            }
            selectedOption=0
        }
    }

    fun setColor(opt:Int,color:Int){
        when(opt){
            1->{
                opt1.background= ContextCompat.getDrawable(this,color)
            }
            2->{
                opt2.background= ContextCompat.getDrawable(this,color)
            }
            3->{
                opt3.background= ContextCompat.getDrawable(this,color)
            }
            4->{
                opt4.background= ContextCompat.getDrawable(this,color)
            }
        }
    }

    fun setQuestion(){

        val question = questionList!![currentPosition-1]
        setOptionStyle()


        progressbar.progress=currentPosition
        progressbar.max=questionList!!.size
        progresstext.text="${currentPosition}"+"/"+"${questionList!!.size}"
        questiontext.text=question.question_easy
        opt1.text=question.option_one
        opt2.text=question.option_two
        opt3.text=question.option_three
        opt4.text=question.option_four

    }

    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,opt1)
        optionList.add(1,opt2)
        optionList.add(2,opt3)
        optionList.add(3,opt4)

        for(op in optionList)
        {
            op.setTextColor(Color.parseColor("#555151"))
            op.background= ContextCompat.getDrawable(this,R.drawable.question_option)
            op.typeface= Typeface.DEFAULT
        }
    }

    fun selectedOptionStyle(view: TextView, opt:Int){

        setOptionStyle()
        selectedOption=opt
        view.background= ContextCompat.getDrawable(this,R.drawable.selected_question_option)
        view.typeface= Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))

    }

}
