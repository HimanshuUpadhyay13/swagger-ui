package com.example.demo.model;

import java.security.Timestamp;
import java.util.Calendar;

public class Report {



	public Report(String reportID, String reportName, Calendar reportDate, Calendar lastModified) {
		super();
		this.reportID = reportID;
		this.reportName = reportName;
		this.reportDate = reportDate;
		this.lastModified = lastModified;
	}

	

	private String reportID;
	private String reportName;
	private Calendar reportDate;
	private Calendar lastModified;

	/**
	 * @return the reportID
	 */
	public String getReportID() {
		return reportID;
	}

	/**
	 * @param reportID the reportID to set
	 */
	public void setReportID(String reportID) {
		this.reportID = reportID;
	}

	/**
	 * @return the reportName
	 */
	public String getReportName() {
		return reportName;
	}

	/**
	 * @param reportName the reportName to set
	 */
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	/**
	 * @return the reportDate
	 */
	public Calendar getReportDate() {
		return reportDate;
	}

	/**
	 * @param reportDate the reportDate to set
	 */
	public void setReportDate(Calendar reportDate) {
		this.reportDate = reportDate;
	}

	/**
	 * @return the lastModified
	 */
	public Calendar getLastModified() {
		return lastModified;
	}

	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Calendar lastModified) {
		this.lastModified = lastModified;
	}



}
