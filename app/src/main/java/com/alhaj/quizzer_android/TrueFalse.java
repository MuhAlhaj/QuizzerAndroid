package com.alhaj.quizzer_android;

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionResoueceID, boolean trueOrfalse)
    {
        mQuestionID = questionResoueceID;
        mAnswer = trueOrfalse;
    }


    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    public boolean isAnswer() {
        return mAnswer;
    }
}
