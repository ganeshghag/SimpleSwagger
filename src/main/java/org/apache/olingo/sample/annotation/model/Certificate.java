package org.apache.olingo.sample.annotation.model;

import java.util.Date;

import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmFacets;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;

import com.google.gson.annotations.SerializedName;

@EdmEntityType(namespace = "MyFormula")
@EdmEntitySet(name = "Certificates")
public class Certificate {
	
	@EdmProperty(facets = @EdmFacets(nullable=false))
	@EdmKey
	@SerializedName("CertificateNumber")
	private String certificateNumber;
	
	@EdmProperty	
	@SerializedName("FinancialYear")
	private String financialYear;
	
	@EdmProperty	
	@SerializedName("CompanyCode")
	private String companyCode;
	
	@EdmProperty	
	@SerializedName("ServerName")
	private String serverName;
	
	@EdmProperty
	@SerializedName("DoneeId")
	private String doneeId;
	
	@EdmProperty	
	@SerializedName("VendorCode")
	private String vendorCode;
	
//	@EdmProperty	
//	@SerializedName("StartDate")
//	private Date startDate;
	
	@EdmProperty
	@SerializedName("PerpetuityFlag")
	private String perpetuityFlag;
	
//	@EdmProperty	
//	@SerializedName("EndDate")
//	private Date endDate;
	
	@EdmProperty	
	@SerializedName("ValdiatedOnDeptWebsite")
	private String valdiatedOnDeptWebsite;
	
	@EdmProperty	
	@SerializedName("CertificateUri")
	private String certificateUri;
	
	@EdmProperty	
	@SerializedName("IsActive")
	private String isActive;
	
//	@EdmProperty	
//	@SerializedName("CreatedOn")
//	private Date createdOn;
	
	@EdmProperty	
	@SerializedName("CreatedBy")
	private String createdBy;
	
//	@EdmProperty	
//	@SerializedName("UpdatedOn")
//	private Date updatedOn;
	
	@EdmProperty	
	@SerializedName("UpdatedBy")
	private String updatedBy;

	
	public String getDoneeId() {
		return doneeId;
	}

	public void setDoneeId(String doneeId) {
		this.doneeId = doneeId;
	}

	public String getCertificateNumber() {
		return certificateNumber;
	}

	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	public String getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

//	public Date getStartDate() {
//		return startDate;
//	}
//
//	public void setStartDate(Date startDate) {
//		this.startDate = startDate;
//	}

	public String getPerpetuityFlag() {
		return perpetuityFlag;
	}

	public void setPerpetuityFlag(String perpetuityFlag) {
		this.perpetuityFlag = perpetuityFlag;
	}

//	public Date getEndDate() {
//		return endDate;
//	}
//
//	public void setEndDate(Date endDate) {
//		this.endDate = endDate;
//	}

	public String getValdiatedOnDeptWebsite() {
		return valdiatedOnDeptWebsite;
	}

	public void setValdiatedOnDeptWebsite(String valdiatedOnDeptWebsite) {
		this.valdiatedOnDeptWebsite = valdiatedOnDeptWebsite;
	}

	public String getCertificateUri() {
		return certificateUri;
	}

	public void setCertificateUri(String certificateUri) {
		this.certificateUri = certificateUri;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

//	public Date getCreatedOn() {
//		return createdOn;
//	}
//
//	public void setCreatedOn(Date createdOn) {
//		this.createdOn = createdOn;
//	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

//	public Date getUpdatedOn() {
//		return updatedOn;
//	}
//
//	public void setUpdatedOn(Date updatedOn) {
//		this.updatedOn = updatedOn;
//	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	

	

}
