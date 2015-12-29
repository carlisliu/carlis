package xyz.flym.carlis.service;

import xyz.flym.carlis.persistence.domain.Company;

/**
 * Company related.
 * 
 * @author Carlis
 * 
 */
public interface CompanyService {

	/**
	 * Get company info.
	 * 
	 * @return
	 */
	Company getCompany();

	/**
	 * 
	 * @param company
	 */
	void saveCompany(Company company);

	/**
	 * Update company info.
	 * 
	 * @param company
	 */
	void updateCompany(Company company);

}
