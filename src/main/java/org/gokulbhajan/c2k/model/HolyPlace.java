package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the holy_place database table.
 * 
 */
@Entity
@Table(name="holy_place")
@NamedQuery(name="HolyPlace.findAll", query="SELECT h FROM HolyPlace h")
public class HolyPlace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="holy_place_id")
	private int holyPlaceId;

	private String description;

	private String name;

	//bi-directional many-to-many association to Media
	@ManyToMany(mappedBy="holyPlaces")
	private List<Media> medias;

	public HolyPlace() {
	}

	public int getHolyPlaceId() {
		return this.holyPlaceId;
	}

	public void setHolyPlaceId(int holyPlaceId) {
		this.holyPlaceId = holyPlaceId;
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

	public List<Media> getMedias() {
		return this.medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

}