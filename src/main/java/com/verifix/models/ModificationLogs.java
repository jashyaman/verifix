package com.verifix.models;

import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modification_log")
public class ModificationLogs {
	
	public ModificationLogs() {
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="log_id")
	private int logId;
	
	@Column(name="object_type")
	private String objectType;
	
	@Column(name="object_modified")
	private String objectModified;
	
	@Column(name="modifier_id")
	private int modifierId;
	
	@Column(name="modification_timestamp")
	private Timestamp modificationTimetamp;

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public String getObjectModified() {
		return objectModified;
	}

	public void setObjectModified(String objectModified) {
		this.objectModified = objectModified;
	}

	public int getModifierId() {
		return modifierId;
	}

	public void setModifierId(int modifierId) {
		this.modifierId = modifierId;
	}

	public Timestamp getModificationTimetamp() {
		return modificationTimetamp;
	}

	public void setModificationTimetamp(Timestamp modificationTimetamp) {
		this.modificationTimetamp = modificationTimetamp;
	}

	public ModificationLogs(int logId, String objectType, String objectModified, int modifierId) {
		super();
		this.logId = logId;
		this.objectType = objectType;
		this.objectModified = objectModified;
		this.modifierId = modifierId;
		this.modificationTimetamp = Timestamp.from(Instant.now());
	}
	
	
	
}
