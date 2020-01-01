package api.practice.server.models;

import javax.persistence.*;

@Entity
@Table(name="question")
public class Question {

    @Id
    @GeneratedValue
    private long id;

    @Column(length=38, nullable = false)
    private String deck;

    @Column(length=150, nullable = false)
    private String question;

    @Column(length=150, nullable = false)
    private String answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck() {
        this.deck = deck;
    }

}
