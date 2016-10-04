package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the media_tag database table.
 * 
 */
@Entity
@Table(name="media_tag")
@NamedQuery(name="MediaTag.findAll", query="SELECT m FROM MediaTag m")
public class MediaTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tag_id")
	private int tagId;

	private String tag;

	//bi-directional many-to-one association to Media
	@ManyToOne
	@JoinColumn(name="media_id")
	private Media media;

	public MediaTag() {
	}

	public int getTagId() {
		return this.tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Media getMedia() {
		return this.media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

}