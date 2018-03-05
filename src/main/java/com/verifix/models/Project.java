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
@Table(name="project")
public class Project {
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName, String projectDescription, int resourceGroupId,
			int projectOwnerId) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.resourceGroupId = resourceGroupId;
		this.projectOwnerId = projectOwnerId;
		this.createTimestamp = Timestamp.from(Instant.now());
		this.updaterId = 0;
		this.updaterTimestamp = null;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="project_id")
	private int projectId;
	
	@Column(name="project_name")
	private String projectName;


	@Column(name="project_description")
	private String projectDescription;
	

	@Column(name="resource_group_id")
	private int resourceGroupId;
	
	@Column(name="project_owner_id")
	private int projectOwnerId; 
	

	@Column(name="create_timestamp")
	private Timestamp createTimestamp;
	
	@Column(name="updater_id")
	private int updaterId;
	
	@Column(name = "updater_timestamp")
	private LocalDate updaterTimestamp;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public int getResourceGroupId() {
		return resourceGroupId;
	}

	public void setResourceGroupId(int resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public int getProjectOwnerId() {
		return projectOwnerId;
	}

	public void setProjectOwnerId(int projectOwnerId) {
		this.projectOwnerId = projectOwnerId;
	}

	public int getUpdaterId() {
		return updaterId;
	}

	public void setUpdaterId(int updaterId) {
		this.updaterId = updaterId;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public LocalDate getUpdaterTimestamp() {
		return updaterTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public void setUpdaterTimestamp(LocalDate updaterTimestamp) {
		this.updaterTimestamp = updaterTimestamp;
	}
	
	
	
}
