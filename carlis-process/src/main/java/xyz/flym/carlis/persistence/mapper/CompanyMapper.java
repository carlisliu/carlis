package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Company;

/**
 * Company Mapper
 * 
 * @author Carlis
 * 
 */
public interface CompanyMapper {

	/**
	 * 
	 * @return
	 */
	Company getCompany();

	/**
	 * 
	 * @param company
	 */
	void save(Company company);

	/**
	 * 
	 * @param company
	 */
	void update(Company company);
}
