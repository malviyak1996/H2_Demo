package com.howtodoinjava.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class ActivationNotification {

		@JsonProperty("activationStatus")
	    private String activationStatus;
		
		@JsonProperty("mobileNumber")
	    private String mobileNumber;
		
		@JsonProperty("activationId")
	    private Long activationId;
		
		@JsonProperty("serviceList")
	    private List<Services> serviceList;

		public String getActivationStatus() {
			return activationStatus;
		}

		public void setActivationStatus(String activationStatus) {
			this.activationStatus = activationStatus;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public Long getActivationId() {
			return activationId;
		}

		public void setActivationId(Long activationId) {
			this.activationId = activationId;
		}

		public List<Services> getServiceList() {
			return serviceList;
		}

		public void setServiceList(List<Services> serviceList) {
			this.serviceList = serviceList;
		}
		
		
}
