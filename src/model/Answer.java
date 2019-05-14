package model;

public class Answer<T> {
    private T answer;

    public Answer(T answer) {
        this.answer = answer;
    }

    public T getAnswer() {
        return answer;
    }

    public void setAnswer(T answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return (String) answer;
    }
}
