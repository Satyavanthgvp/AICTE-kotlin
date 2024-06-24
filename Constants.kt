package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Which of the following language dipicts to store data ?",
            R.drawable.satya_sql_image,
            arrayListOf("SQL", "JAVA", "CPP", "PYTHON"),
            0,
        )
        questionsList.add(questionTen)

        return questionsList
    }
}