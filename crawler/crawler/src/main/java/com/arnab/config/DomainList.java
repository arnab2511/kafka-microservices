package com.arnab.config;

import java.util.List;
import java.util.Objects;

public class DomainList {
	
	public  List<Domain> domains;
	
	public DomainList() {
		
	}

	/**
	 * @return the domains
	 */
	public List<Domain> getDomains() {
		return domains;
	}

	/**
	 * @param domains the domains to set
	 */
	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	@Override
	public int hashCode() {
		return Objects.hash(domains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DomainList)) {
			return false;
		}
		DomainList other = (DomainList) obj;
		return Objects.equals(domains, other.domains);
	}

}
