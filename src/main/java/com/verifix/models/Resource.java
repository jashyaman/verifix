package com.verifix.models;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource")
public class Resource {

	public Resource() {
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="resource_version")
	private String resourceVersion;
	
	@Column(name="resource_id")
	private int resourceId;
	
	@Column(name="creator_id")
	private int creatorId;
	
	@Column(name="create_timestamp")
	private Timestamp createTimestamp;
	
	@Column(name="updater_id")
	private int updaterId;
	
	@Column(name="updater_timestamp")
	private LocalDate updaterTimestamp;

	public String getResourceVersion() {
		return resourceVersion;
	}

	public void setResourceVersion(String resourceVersion) {
		this.resourceVersion = resourceVersion;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}


	public int getUpdater_id() {
		return updaterId;
	}

	public void setUpdater_id(int updaterid) {
		this.updaterId = updaterid;
	}

	public LocalDate getUpdaterTimestamp() {
		return updaterTimestamp;
	}
	
	

	public void setUpdaterTimestamp(LocalDate updaterTimestamp) {
		this.updaterTimestamp = updaterTimestamp;
	}

	public Resource(String resourceVersion, int resourceId, int creatorId) {
		super();
		this.resourceVersion = resourceVersion;
		this.resourceId = resourceId;
		this.creatorId = creatorId;
		this.createTimestamp = Timestamp.from(Instant.now());
		this.updaterId = 0;
	}

	
	
	
}
