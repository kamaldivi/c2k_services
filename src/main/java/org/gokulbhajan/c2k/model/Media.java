package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Media.findAll", query = "SELECT m FROM Media m"),
	@NamedQuery(name = "Media.findByType", query = "SELECT m FROM Media m where m.type = :type ") })
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="media_id")
	private int mediaId;

	@Column(name="active_flag")
	private byte activeFlag;

	private String author;

	private String description;

	@Column(name="icon_url")
	private String iconUrl;

	@Column(name="image_url")
	private String imageUrl;

	@JsonIgnore
	@Column(name="last_update")
	private Timestamp lastUpdate;

	@Column(name="play_url")
	private String playUrl;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="publish_date")
	private Date publishDate;

	@Column(name="text_content")
	private String textContent;

	private String title;

	private String type;

	//bi-directional many-to-one association to MediaCategory
	@ManyToOne
	@JoinColumn(name="category_id")
	private MediaCategory mediaCategory;

	//bi-directional many-to-one association to Media
	@ManyToOne
	@JoinColumn(name="related_media")
	private Media media;

	//bi-directional many-to-one association to Media
	@OneToMany(mappedBy="media")
	private List<Media> medias;

	//bi-directional many-to-many association to Calendar
	@ManyToMany
	@JoinTable(
		name="media_calendar"
		, joinColumns={
			@JoinColumn(name="media_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="calendar_id")
			}
		)
	private List<Calendar> calendars;

	//bi-directional many-to-many association to Feeling
	@ManyToMany
	@JoinTable(
		name="media_feeling"
		, joinColumns={
			@JoinColumn(name="media_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="feeling_id")
			}
		)
	private List<Feeling> feelings;

	//bi-directional many-to-many association to Habit
	@ManyToMany
	@JoinTable(
		name="media_habit"
		, joinColumns={
			@JoinColumn(name="media_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="habit_id")
			}
		)
	private List<Habit> habits;

	//bi-directional many-to-many association to HolyPlace
	@ManyToMany
	@JoinTable(
		name="media_holy_place"
		, joinColumns={
			@JoinColumn(name="media_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="holy_place_id")
			}
		)
	private List<HolyPlace> holyPlaces;

	//bi-directional many-to-one association to MediaTag
	@OneToMany(mappedBy="media")
	private List<MediaTag> mediaTags;

	public Media() {
	}

	public int getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}

	public byte getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(byte activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getPlayUrl() {
		return this.playUrl;
	}

	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getTextContent() {
		return this.textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MediaCategory getMediaCategory() {
		return this.mediaCategory;
	}

	public void setMediaCategory(MediaCategory mediaCategory) {
		this.mediaCategory = mediaCategory;
	}

	public Media getMedia() {
		return this.media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public List<Media> getMedias() {
		return this.medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	public Media addMedia(Media media) {
		getMedias().add(media);
		media.setMedia(this);

		return media;
	}

	public Media removeMedia(Media media) {
		getMedias().remove(media);
		media.setMedia(null);

		return media;
	}

	public List<Calendar> getCalendars() {
		return this.calendars;
	}

	public void setCalendars(List<Calendar> calendars) {
		this.calendars = calendars;
	}

	public List<Feeling> getFeelings() {
		return this.feelings;
	}

	public void setFeelings(List<Feeling> feelings) {
		this.feelings = feelings;
	}

	public List<Habit> getHabits() {
		return this.habits;
	}

	public void setHabits(List<Habit> habits) {
		this.habits = habits;
	}

	public List<HolyPlace> getHolyPlaces() {
		return this.holyPlaces;
	}

	public void setHolyPlaces(List<HolyPlace> holyPlaces) {
		this.holyPlaces = holyPlaces;
	}

	public List<MediaTag> getMediaTags() {
		return this.mediaTags;
	}

	public void setMediaTags(List<MediaTag> mediaTags) {
		this.mediaTags = mediaTags;
	}

	public MediaTag addMediaTag(MediaTag mediaTag) {
		getMediaTags().add(mediaTag);
		mediaTag.setMedia(this);

		return mediaTag;
	}

	public MediaTag removeMediaTag(MediaTag mediaTag) {
		getMediaTags().remove(mediaTag);
		mediaTag.setMedia(null);

		return mediaTag;
	}

}