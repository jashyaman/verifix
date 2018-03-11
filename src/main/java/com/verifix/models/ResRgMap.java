package com.verifix.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="res_rg_map")
public class ResRgMap {
	
	public ResRgMap() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="res_rg_map_id")
	private int resrgMapId;
	
	@Column(name="resource_version")
	private String resourceVersion;
	
	@Column(name="resource_id")
	private int resourceId;
	
	@Column(name="resource_group_id")
	private int resourceGroupId;

	public int getResrgMapId() {
		return resrgMapId;
	}

	public void setResrgMapId(int resrgMapId) {
		this.resrgMapId = resrgMapId;
	}

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

	public int getResourceGroupId() {
		return resourceGroupId;
	}

	public void setResourceGroupId(int resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public ResRgMap(int resrgMapId, String resourceVersion, int resourceId, int resourceGroupId) {
		super();
		this.resrgMapId = resrgMapId;
		this.resourceVersion = resourceVersion;
		this.resourceId = resourceId;
		this.resourceGroupId = resourceGroupId;
	}
	
	
	
}
