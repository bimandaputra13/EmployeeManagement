package com.id.bima.employee.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="TB_DATA_EMPLOYEE")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="NIP")
	private String nip;
	
	@Column(name="NAMA")
	private String nama;
	
	@Column(name="TGL_LAHIR")
	private Date tglLahir;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="JABATAN")
	private String jabatan;
	
	@Column(name="SALLARY")
	private Long gaji;
	
	@Version
	@Column(name="optVersion",columnDefinition="Long DEFAULT 0")
	private Long version; 
	
	
	
	
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getTglLahir() {
		return tglLahir;
	}
	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public Long getGaji() {
		return gaji;
	}
	public void setGaji(Long gaji) {
		this.gaji = gaji;
	}
	
	
	
	

}
