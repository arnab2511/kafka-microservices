/**
 * 
 */
package com.arnab.domainservice;

import java.util.Objects;

/**
 * @author arnab
 *
 */
public class Domain {
	
	String domain;
	String create_date;
	String update_date;
	String country;
	boolean isDead;
	String A;
	String NS;
	String CNAME;
	String MX;
	String TXT;
	
	@Override
	public int hashCode() {
		return Objects.hash(A, CNAME, MX, NS, TXT, country, create_date, domain, isDead, update_date);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Domain)) {
			return false;
		}
		Domain other = (Domain) obj;
		return Objects.equals(A, other.A) && Objects.equals(CNAME, other.CNAME) && Objects.equals(MX, other.MX)
				&& Objects.equals(NS, other.NS) && Objects.equals(TXT, other.TXT)
				&& Objects.equals(country, other.country) && Objects.equals(create_date, other.create_date)
				&& Objects.equals(domain, other.domain) && isDead == other.isDead
				&& Objects.equals(update_date, other.update_date);
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getNS() {
		return NS;
	}
	public void setNS(String nS) {
		NS = nS;
	}
	public String getCNAME() {
		return CNAME;
	}
	public void setCNAME(String cNAME) {
		CNAME = cNAME;
	}
	public String getMX() {
		return MX;
	}
	public void setMX(String mX) {
		MX = mX;
	}
	public String getTXT() {
		return TXT;
	}
	public void setTXT(String tXT) {
		TXT = tXT;
	}
}
