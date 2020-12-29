package com.howtodoinjava.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class Services {
	
	@JsonProperty("serviceId")
    private Long serviceId;
	
	@JsonProperty("serviceName")
    private String serviceName;

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public String toString() {
		return "Services [serviceId=" + serviceId + ", serviceName=" + serviceName + ", getServiceId()="
				+ getServiceId() + ", getServiceName()=" + getServiceName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
