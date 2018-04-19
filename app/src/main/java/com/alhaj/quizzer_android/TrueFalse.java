package com.alhaj.quizzer_android;

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    /**
     * @param questionResoueceID
     * @param trueOrfalse
     */
    public TrueFalse(int questionResoueceID, boolean trueOrfalse)
    {
        mQuestionID = questionResoueceID;
        mAnswer = trueOrfalse;
    }

    /**
     * @return
     */
    public int getQuestionID() {
        return mQuestionID;
    }

    /**
     * @param questionID
     */
    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }



    /**
     * @param answer
     */
    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    public boolean isAnswer() {
        return mAnswer;
    }
}
