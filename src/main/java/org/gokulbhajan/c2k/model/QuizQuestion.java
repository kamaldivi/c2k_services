package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the quiz_question database table.
 * 
 */
@Entity
@Table(name="quiz_question")
@NamedQuery(name="QuizQuestion.findAll", query="SELECT q FROM QuizQuestion q")
public class QuizQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="question_id")
	private int questionId;

	private byte answer1;

	private byte answer2;

	private byte answer3;

	private byte answer4;

	private byte answer5;

	private String choice1;

	private String choice2;

	private String choice3;

	private String choice4;

	private String choice5;

	private String question;

	//bi-directional many-to-one association to Quiz
	@ManyToOne
	@JoinColumn(name="quiz_id")
	private Quiz quiz;

	public QuizQuestion() {
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public byte getAnswer1() {
		return this.answer1;
	}

	public void setAnswer1(byte answer1) {
		this.answer1 = answer1;
	}

	public byte getAnswer2() {
		return this.answer2;
	}

	public void setAnswer2(byte answer2) {
		this.answer2 = answer2;
	}

	public byte getAnswer3() {
		return this.answer3;
	}

	public void setAnswer3(byte answer3) {
		this.answer3 = answer3;
	}

	public byte getAnswer4() {
		return this.answer4;
	}

	public void setAnswer4(byte answer4) {
		this.answer4 = answer4;
	}

	public byte getAnswer5() {
		return this.answer5;
	}

	public void setAnswer5(byte answer5) {
		this.answer5 = answer5;
	}

	public String getChoice1() {
		return this.choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	public String getChoice2() {
		return this.choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	public String getChoice3() {
		return this.choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	public String getChoice4() {
		return this.choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	public String getChoice5() {
		return this.choice5;
	}

	public void setChoice5(String choice5) {
		this.choice5 = choice5;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Quiz getQuiz() {
		return this.quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

}