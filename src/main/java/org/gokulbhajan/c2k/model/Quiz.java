package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the quiz database table.
 * 
 */
@Entity
@NamedQuery(name="Quiz.findAll", query="SELECT q FROM Quiz q")
public class Quiz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="quiz_id")
	private int quizId;

	private String description;

	private String name;

	//bi-directional many-to-one association to QuizQuestion
	@OneToMany(mappedBy="quiz")
	private List<QuizQuestion> quizQuestions;

	public Quiz() {
	}

	public int getQuizId() {
		return this.quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<QuizQuestion> getQuizQuestions() {
		return this.quizQuestions;
	}

	public void setQuizQuestions(List<QuizQuestion> quizQuestions) {
		this.quizQuestions = quizQuestions;
	}

	public QuizQuestion addQuizQuestion(QuizQuestion quizQuestion) {
		getQuizQuestions().add(quizQuestion);
		quizQuestion.setQuiz(this);

		return quizQuestion;
	}

	public QuizQuestion removeQuizQuestion(QuizQuestion quizQuestion) {
		getQuizQuestions().remove(quizQuestion);
		quizQuestion.setQuiz(null);

		return quizQuestion;
	}

}