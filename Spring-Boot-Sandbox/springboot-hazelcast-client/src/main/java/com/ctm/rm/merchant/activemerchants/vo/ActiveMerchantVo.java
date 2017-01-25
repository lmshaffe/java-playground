package com.ctm.rm.merchant.activemerchants.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ActiveMerchantVo implements Serializable {

	private static final long serialVersionUID = 2235779372425145938L;

	private String componentId = "";
	private String businessName = "";
	private String normalizedBusinessName = "";
	private long partnerMerchantId = 0;
	private List<Long> metaDataIds = new ArrayList<Long>();
	private List<Long> zoneMapIds = new ArrayList<Long>();
	private String country = "";
	private String listingURL = "";
	private List<String> fmpUrls = new ArrayList<String>();
	private boolean active = false;

	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		if (componentId == null) return;
		this.componentId = componentId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		if (businessName == null) return;
		this.businessName = businessName;
	}
	public String getNormalizedBusinessName() {
		return normalizedBusinessName;
	}
	public void setNormalizedBusinessName(String normalizedBusinessName) {
		if (normalizedBusinessName == null) return;
		this.normalizedBusinessName = normalizedBusinessName;
	}
	public long getPartnerMerchantId() {
		return partnerMerchantId;
	}
	public void setPartnerMerchantId(long partnerMerchantId) {
		this.partnerMerchantId = partnerMerchantId;
	}

	public List<Long> getMetaDataIds() {
		return metaDataIds;
	}
	public void setMetaDataIds(List<Long> metaDataIds) {
		this.metaDataIds = metaDataIds;
	}
	public void addMetaDataIdIfNotPresent(Long metaDataId) {
		if (metaDataId == null) return;
		if (metaDataIds.contains(metaDataId)) return;
		metaDataIds.add(metaDataId);
	}

	public List<Long> getZoneMapIds() {
		return zoneMapIds;
	}
	public void setZoneMapIds(List<Long> zoneMapIds) {
		if (zoneMapIds == null) return;
		this.zoneMapIds = zoneMapIds;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		if (country == null) return;
		this.country = country;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void addZoneMapIdIfNotPresent(Long zoneMapId) {
		if (zoneMapId == null) return;
		if (zoneMapIds.contains(zoneMapId)) return;
		zoneMapIds.add(zoneMapId);
	}

	public String getListingURL() {
		return listingURL;
	}
	public void setListingURL(String listingURL) {
		if (listingURL == null) return;
		this.listingURL = listingURL;
	}
	public List<String> getFmpUrls() {
		return fmpUrls;
	}
	public void setFmpUrls(List<String> fmpUrls) {
		if (fmpUrls == null) return;
		this.fmpUrls = fmpUrls;
	}
	public void addFmpUrlIfNotPresent(String fmpUrl) {
		if (fmpUrl == null) return;
		if (fmpUrls.contains(fmpUrl)) return;
		fmpUrls.add(fmpUrl);
	}

}
