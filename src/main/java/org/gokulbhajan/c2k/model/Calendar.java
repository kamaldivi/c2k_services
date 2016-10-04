package org.gokulbhajan.c2k.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the calendar database table.
 * 
 */
@Entity
@NamedQuery(name="Calendar.findAll", query="SELECT c FROM Calendar c")
public class Calendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="calendar_id")
	private int calendarId;

	@Temporal(TemporalType.DATE)
	@Column(name="calendar_date")
	private Date calendarDate;

	private String description;

	private String name;

	@Column(name="reminder_ahead_days")
	private short reminderAheadDays;

	private String type;

	//bi-directional many-to-many association to Media
	@ManyToMany(mappedBy="calendars")
	private List<Media> medias;

	public Calendar() {
	}

	public int getCalendarId() {
		return this.calendarId;
	}

	public void setCalendarId(int calendarId) {
		this.calendarId = calendarId;
	}

	public Date getCalendarDate() {
		return this.calendarDate;
	}

	public void setCalendarDate(Date calendarDate) {
		this.calendarDate = calendarDate;
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

	public short getReminderAheadDays() {
		return this.reminderAheadDays;
	}

	public void setReminderAheadDays(short reminderAheadDays) {
		this.reminderAheadDays = reminderAheadDays;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Media> getMedias() {
		return this.medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

}