package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the habit database table.
 * 
 */
@Entity
@NamedQuery(name="Habit.findAll", query="SELECT h FROM Habit h")
public class Habit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="habit_id")
	private int habitId;

	private String title;

	//bi-directional many-to-many association to Media
	@ManyToMany(mappedBy="habits")
	private List<Media> medias;

	public Habit() {
	}

	public int getHabitId() {
		return this.habitId;
	}

	public void setHabitId(int habitId) {
		this.habitId = habitId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Media> getMedias() {
		return this.medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

}