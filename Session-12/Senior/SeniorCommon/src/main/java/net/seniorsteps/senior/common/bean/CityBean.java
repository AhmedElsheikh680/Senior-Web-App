/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.common.bean;

/**
 *
 * @author Senior Steps
 */
public class CityBean {
	private String nameAr;
	private String nameEn;
	private String name;

	public CityBean(String nameAr, String nameEn, String name) {
		this.nameAr = nameAr;
		this.nameEn = nameEn;
		this.name = name;
	}

	public CityBean() {
	}

	public String getNameAr() {
		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
