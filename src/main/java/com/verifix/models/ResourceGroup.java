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
@Table(name="resource_group")
public class ResourceGroup {
	
	public ResourceGroup() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="resource_group_id")
	private int resourceGroupId;
	
	@Column(name="resource_group_name")
	private String resourceGroupName;
	
	@Column(name="creator_id")
	private int creatorId;
	
	@Column(name="create_timestamp")
	private Timestamp createTimestamp;
	

	@Column(name="updater_id")
	private int updaterId;
	
	@Column(name="updater_timestamp")
	private LocalDate updaterTimestamp;

	public int getResourceGroupId() {
		return resourceGroupId;
	}

	public void setResourceGroupId(int resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getResourceGroupName() {
		return resourceGroupName;
	}

	public void setResourceGroupName(String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
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

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public int getUpdaterId() {
		return updaterId;
	}

	public void setUpdaterId(int updaterId) {
		this.updaterId = updaterId;
	}

	public LocalDate getUpdaterTimestamp() {
		return updaterTimestamp;
	}

	public void setUpdaterTimestamp(LocalDate updaterTimestamp) {
		this.updaterTimestamp = updaterTimestamp;
	}

	public ResourceGroup(int resourceGroupId, String resourceGroupName, int creatorId) {
		super();
		this.resourceGroupId = resourceGroupId;
		this.resourceGroupName = resourceGroupName;
		this.creatorId = creatorId;
		this.createTimestamp = Timestamp.from(Instant.now());
		this.updaterId = 0;
	}
	
	
	
	
}
