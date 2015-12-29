package xyz.flym.carlis.web.action.admin;

import org.apache.struts2.ServletActionContext;

import xyz.flym.carlis.persistence.domain.Company;
import xyz.flym.carlis.service.CompanyService;
import xyz.flym.carlis.web.utils.ServletContextHelper;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class CompanyAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CompanyService companyService;
	private Company company;

	/**
	 * Init.
	 * 
	 * @return
	 */
	public String init() {
		this.company = companyService.getCompany();
		ServletContextHelper.set(ServletActionContext.getServletContext(), this.company);
		return Action.SUCCESS;
	}

	/**
	 * Save company.
	 * 
	 * @return
	 */
	public String save() {
		if (company != null) {
			Company existed = companyService.getCompany();
			if (existed != null) {
				company.setId(existed.getId());
				companyService.updateCompany(company);
			} else {
				companyService.saveCompany(company);
			}
		}
		return Action.SUCCESS;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public CompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

}
