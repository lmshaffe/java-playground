package org.example.restProducer;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Coupon {
	private int[] catIds = {3,14,22};

	private int id = 1;
	private String businessName = "Lee's Pizza";
	private boolean topDeal = true;
	private boolean exclusive = false;
	private List<Integer> categoryIds = Arrays.asList(ArrayUtils.toObject(catIds));
	private int merchantId = 2856;
	private LocalDateTime createTime = LocalDateTime.parse("2016-05-25T22:04:30");

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public boolean isTopDeal() {
		return topDeal;
	}
	public void setTopDeal(boolean topDeal) {
		this.topDeal = topDeal;
	}
	public boolean isExclusive() {
		return exclusive;
	}
	public void setExclusive(boolean exclusive) {
		this.exclusive = exclusive;
	}
	public List<Integer> getCategoryIds() {
		return categoryIds;
	}
	public void setCategoryIds(List<Integer> categoryIds) {
		this.categoryIds = categoryIds;
	}
	public LocalDateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}


}
