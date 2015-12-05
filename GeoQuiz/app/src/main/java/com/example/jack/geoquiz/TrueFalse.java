package com.example.jack.geoquiz;

/**
 * Created by jack on 2015/12/2.
 */
public class TrueFalse {
    private int mQuestion;

    private boolean mTrueQuestion;

    private boolean isAnswer;
    public TrueFalse(int mQuestion, boolean TrueQuestion) {
        this.mQuestion = mQuestion;
        this.mTrueQuestion = TrueQuestion;
    }

    public int getmQuestion() {
        return mQuestion;
    }

    public boolean ismTrueQuestion() {
        return mTrueQuestion;
    }

    public boolean isAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(boolean isAnswer) {
        this.isAnswer = isAnswer;
    }
}
