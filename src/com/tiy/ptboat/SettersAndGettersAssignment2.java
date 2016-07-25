package com.tiy.keithgibson_20160725_2;

import java.sql.Date;

public class SettersAndGetters {
	
	private double diskSize;
	private int acres;
	private String fileName;
	private String phoneNumber;
	private String companyName;
	private Date todaysDate;
	private boolean lightSwitch;
	private Double pi;
	private String speedOfLightWithinVacuum;
	public double getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(double diskSize) {
		this.diskSize = diskSize;
	}
	public int getAcres() {
		return acres;
	}
	public void setAcres(int acres) {
		this.acres = acres;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getTodaysDate() {
		return todaysDate;
	}
	public void setTodaysDate(Date todaysDate) {
		this.todaysDate = todaysDate;
	}
	public boolean isLightSwitch() {
		return lightSwitch;
	}
	public void setLightSwitch(boolean lightSwitch) {
		this.lightSwitch = lightSwitch;
	}
	public Double getPi() {
		return pi;
	}
	public void setPi(Double pi) {
		this.pi = pi;
	}
	public String getSpeedOfLightWithinVacuum() {
		return speedOfLightWithinVacuum;
	}
	public void setSpeedOfLightWithinVacuum(String speedOfLightWithinVacuum) {
		this.speedOfLightWithinVacuum = speedOfLightWithinVacuum;
	}
	public String[] getProductname() {
		return productname;
	}
	public void setProductname(String[] productname) {
		this.productname = productname;
	}
	private String[] productname;
}
