package com.tmt.cognitive.challenge.visualrecognition.vo;

// Generated Oct 27, 2017 5:49:04 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Userproductadsmapping generated by hbm2java
 */
@Entity
@Table(name = "userproductadsmapping")
public class Userproductadsmapping implements java.io.Serializable {

	private Long adsmappingid;
	private Visualrecognisionuserprofiles visualrecognisionuserprofiles;
	private Commercialproductsprofile commercialproductsprofile;
	private String adsinfo;
	private Date createdtime;
	private String createdby;
	private Date updatedtime;
	private String updatedby;
	private Set<Visualrecognitionaudittransaction> visualrecognitionaudittransactions = new HashSet<Visualrecognitionaudittransaction>(
			0);

	public Userproductadsmapping() {
	}

	public Userproductadsmapping(
			Visualrecognisionuserprofiles visualrecognisionuserprofiles,
			Commercialproductsprofile commercialproductsprofile, String adsinfo) {
		this.visualrecognisionuserprofiles = visualrecognisionuserprofiles;
		this.commercialproductsprofile = commercialproductsprofile;
		this.adsinfo = adsinfo;
	}

	public Userproductadsmapping(
			Visualrecognisionuserprofiles visualrecognisionuserprofiles,
			Commercialproductsprofile commercialproductsprofile,
			String adsinfo,
			Date createdtime,
			String createdby,
			Date updatedtime,
			String updatedby,
			Set<Visualrecognitionaudittransaction> visualrecognitionaudittransactions) {
		this.visualrecognisionuserprofiles = visualrecognisionuserprofiles;
		this.commercialproductsprofile = commercialproductsprofile;
		this.adsinfo = adsinfo;
		this.createdtime = createdtime;
		this.createdby = createdby;
		this.updatedtime = updatedtime;
		this.updatedby = updatedby;
		this.visualrecognitionaudittransactions = visualrecognitionaudittransactions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ADSMAPPINGID", unique = true, nullable = false)
	public Long getAdsmappingid() {
		return this.adsmappingid;
	}

	public void setAdsmappingid(Long adsmappingid) {
		this.adsmappingid = adsmappingid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USERPROFILEID", nullable = false)
	public Visualrecognisionuserprofiles getVisualrecognisionuserprofiles() {
		return this.visualrecognisionuserprofiles;
	}

	public void setVisualrecognisionuserprofiles(
			Visualrecognisionuserprofiles visualrecognisionuserprofiles) {
		this.visualrecognisionuserprofiles = visualrecognisionuserprofiles;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCTID", nullable = false)
	public Commercialproductsprofile getCommercialproductsprofile() {
		return this.commercialproductsprofile;
	}

	public void setCommercialproductsprofile(
			Commercialproductsprofile commercialproductsprofile) {
		this.commercialproductsprofile = commercialproductsprofile;
	}

	@Column(name = "ADSINFO", nullable = false, length = 2000)
	public String getAdsinfo() {
		return this.adsinfo;
	}

	public void setAdsinfo(String adsinfo) {
		this.adsinfo = adsinfo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDTIME", length = 19)
	public Date getCreatedtime() {
		return this.createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	@Column(name = "CREATEDBY", length = 45)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATEDTIME", length = 19)
	public Date getUpdatedtime() {
		return this.updatedtime;
	}

	public void setUpdatedtime(Date updatedtime) {
		this.updatedtime = updatedtime;
	}

	@Column(name = "UPDATEDBY", length = 45)
	public String getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userproductadsmapping")
	public Set<Visualrecognitionaudittransaction> getVisualrecognitionaudittransactions() {
		return this.visualrecognitionaudittransactions;
	}

	public void setVisualrecognitionaudittransactions(
			Set<Visualrecognitionaudittransaction> visualrecognitionaudittransactions) {
		this.visualrecognitionaudittransactions = visualrecognitionaudittransactions;
	}

}
