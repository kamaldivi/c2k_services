package org.gokulbhajan.c2k.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
//import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the media_category database table.
 * 
 */
@Entity
@Table(name="media_category")
@NamedQuery(name="MediaCategory.findAll", query="SELECT m FROM MediaCategory m")
public class MediaCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="category_id")
	private int categoryId;

	@JsonIgnore
	private String description;

	private String name;

	//bi-directional many-to-one association to Media
	//@OneToMany(mappedBy="mediaCategory")
	//private List<Media> medias;

	public MediaCategory() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

	/*
	public List<Media> getMedias() {
		return this.medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	public Media addMedia(Media media) {
		getMedias().add(media);
		media.setMediaCategory(this);

		return media;
	}

	public Media removeMedia(Media media) {
		getMedias().remove(media);
		media.setMediaCategory(null);

		return media;
	}
	*/
}