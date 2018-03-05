package com.verifix.models;

import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="upload_log")
public class UploadLog {
	public UploadLog() {	}
	
	
	public UploadLog(int uploadId, String uploadType, String fileName, String uploaderId) {
		super();
		this.uploadId = uploadId;
		this.uploadType = uploadType;
		this.fileName = fileName;
		this.uploaderId = uploaderId;
		this.uploadTimestamp = Timestamp.from(Instant.now());
	}


	@Id
	@Column(name = "upload_id")
	private int uploadId;
	
	@Column(name = "upload_type")
	private String uploadType;
	
	
	@Column(name = "filename")
	private String fileName;
	

	@Column(name = "uploader_id")
	private String uploaderId;
	
	@Column(name = "upload_timestamp")
	private Timestamp uploadTimestamp;

	public int getUploadId() {
		return uploadId;
	}


	public void setUploadId(int uploadId) {
		this.uploadId = uploadId;
	}


	public String getUploadType() {
		return uploadType;
	}


	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getUploaderId() {
		return uploaderId;
	}


	public void setUploaderId(String uploaderId) {
		this.uploaderId = uploaderId;
	}


	public Timestamp getUploadTimestamp() {
		return uploadTimestamp;
	}


	
	
	
	
	
	

}
