package xyz.flym.carlis.service.impl;

import xyz.flym.carlis.persistence.domain.Company;
import xyz.flym.carlis.persistence.mapper.CompanyMapper;
import xyz.flym.carlis.service.CompanyService;

/**
 * 
 * @author Carlis
 * 
 */
public class CompanyServiceImpl implements CompanyService {

	private CompanyMapper companyMapper;

	/**
	 * Get company info.
	 */
	@Override
	public Company getCompany() {
		return companyMapper.getCompany();
	}

	/**
	 * 
	 */
	@Override
	public void saveCompany(Company company) {
		companyMapper.save(company);
	}
	
	@Override
	public void updateCompany(Company company) {
		companyMapper.update(company);
	}

	public CompanyMapper getCompanyMapper() {
		return companyMapper;
	}

	public void setCompanyMapper(CompanyMapper companyMapper) {
		this.companyMapper = companyMapper;
	}

}
