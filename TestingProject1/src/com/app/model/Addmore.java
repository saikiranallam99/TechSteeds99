package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="addmoretable")
public class Addmore {
	@Id
	@GeneratedValue
	@Column(name="aid")
	int addmoreId;
	@Column(name="caddr")
    String gadd;
	@Column(name="currentadd")
    String cadd;
	@Column(name="paddr")
    String gaddr;
	@Column(name="perminantadd")
    String padd;
	@Column(name="routelist")
    String rls;
	@Column(name="bankaccno")
    String accno;
	@Column(name="bankname")
    String bknm;
	@Column(name="ifsccode")
    String ifscc;
	@Column(name="nationalidno")
    String nidno;
	@Column(name="localidno")
    String lidno;
	@Column (name="previoussd")
	String pssd;
	public Addmore() {
		super();
	}
	public Addmore(int addmoreId) {
		super();
		this.addmoreId = addmoreId;
	}
	public Addmore(int addmoreId, String gadd, String cadd, String gaddr,
			String padd, String rls, String accno, String bknm, String ifscc,
			String nidno, String lidno, String pssd) {
		super();
		this.addmoreId = addmoreId;
		this.gadd = gadd;
		this.cadd = cadd;
		this.gaddr = gaddr;
		this.padd = padd;
		this.rls = rls;
		this.accno = accno;
		this.bknm = bknm;
		this.ifscc = ifscc;
		this.nidno = nidno;
		this.lidno = lidno;
		this.pssd = pssd;
	}
	public int getAddmoreId() {
		return addmoreId;
	}
	public void setAddmoreId(int addmoreId) {
		this.addmoreId = addmoreId;
	}
	public String getGadd() {
		return gadd;
	}
	public void setGadd(String gadd) {
		this.gadd = gadd;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public String getGaddr() {
		return gaddr;
	}
	public void setGaddr(String gaddr) {
		this.gaddr = gaddr;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public String getRls() {
		return rls;
	}
	public void setRls(String rls) {
		this.rls = rls;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getBknm() {
		return bknm;
	}
	public void setBknm(String bknm) {
		this.bknm = bknm;
	}
	public String getIfscc() {
		return ifscc;
	}
	public void setIfscc(String ifscc) {
		this.ifscc = ifscc;
	}
	public String getNidno() {
		return nidno;
	}
	public void setNidno(String nidno) {
		this.nidno = nidno;
	}
	public String getLidno() {
		return lidno;
	}
	public void setLidno(String lidno) {
		this.lidno = lidno;
	}
	public String getPssd() {
		return pssd;
	}
	public void setPssd(String pssd) {
		this.pssd = pssd;
	}
	@Override
	public String toString() {
		return "Addmore [addmoreId=" + addmoreId + ", gadd=" + gadd + ", cadd="
				+ cadd + ", gaddr=" + gaddr + ", padd=" + padd + ", rls=" + rls
				+ ", accno=" + accno + ", bknm=" + bknm + ", ifscc=" + ifscc
				+ ", nidno=" + nidno + ", lidno=" + lidno + ", pssd=" + pssd
				+ "]";
	}
	
	
	
	

}
