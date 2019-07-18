package com.nissandigital.voice.feedback.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Feedback {
	@Id
	private ObjectId feedBackId;
	private String header;
	private String crons;
	private String pros;
	private String createdBy;
	private String updatedBy;
	private String createdTime;
	private String updatedTime;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + ((crons == null) ? 0 : crons.hashCode());
		result = prime * result + ((feedBackId == null) ? 0 : feedBackId.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((pros == null) ? 0 : pros.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		result = prime * result + ((updatedTime == null) ? 0 : updatedTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdTime == null) {
			if (other.createdTime != null)
				return false;
		} else if (!createdTime.equals(other.createdTime))
			return false;
		if (crons == null) {
			if (other.crons != null)
				return false;
		} else if (!crons.equals(other.crons))
			return false;
		if (feedBackId == null) {
			if (other.feedBackId != null)
				return false;
		} else if (!feedBackId.equals(other.feedBackId))
			return false;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (pros == null) {
			if (other.pros != null)
				return false;
		} else if (!pros.equals(other.pros))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		if (updatedTime == null) {
			if (other.updatedTime != null)
				return false;
		} else if (!updatedTime.equals(other.updatedTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Feedback [feedBackId=" + feedBackId + ", header=" + header + ", crons=" + crons + ", pros=" + pros
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", createdTime=" + createdTime
				+ ", updatedTime=" + updatedTime + "]";
	}

	public Feedback(ObjectId feedBackId, String header, String crons, String pros, String createdBy, String updatedBy,
			String createdTime, String updatedTime) {
		super();
		this.feedBackId = feedBackId;
		this.header = header;
		this.crons = crons;
		this.pros = pros;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	public Feedback() {
	}

}
