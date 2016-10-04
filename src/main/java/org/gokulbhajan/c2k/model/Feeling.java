package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the feeling database table.
 * 
 */
@Entity
@NamedQuery(name="Feeling.findAll", query="SELECT f FROM Feeling f")
public class Feeling implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="feeling_id")
	private int feelingId;

	private String title;

	//bi-directional many-to-many association to Media
	@ManyToMany(mappedBy="feelings")
	private List<Media> medias;

	public Feeling() {
	}

	public int getFeelingId() {
		return this.feelingId;
	}

	public void setFeelingId(int feelingId) {
		this.feelingId = feelingId;
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