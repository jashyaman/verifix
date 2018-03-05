package com.verifix.models;

public class DefaultResponse {
	
	public DefaultResponse() {
	}
	
	private String responseCode;
	private String responseDescription;
	private String statusCode;
	private String statusDescription;
	private Object data;
	
	public DefaultResponse defaultResourceBuilder(Object data) {
		this.setData(data);
		return this;
	}
	
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public DefaultResponse(String responseCode, String responseDescription, String statusCode,
			String statusDescription) {
		super();
		this.responseCode = responseCode;
		this.responseDescription = responseDescription;
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	@Override
	public String toString() {
		return "DefaultResponse [responseCode=" + responseCode + ", responseDescription=" + responseDescription
				+ ", statusCode=" + statusCode + ", statusDescription=" + statusDescription + "]";
	}
	
	

}
