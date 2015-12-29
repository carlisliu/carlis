package xyz.flym.carlis.web.listeners.impl;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import xyz.flym.carlis.service.CompanyService;
import xyz.flym.carlis.web.listeners.SystemStartupListener;
import xyz.flym.carlis.web.utils.ServletContextHelper;

/**
 * 
 * @author Carlis
 * 
 */
public class SettingListener implements SystemStartupListener {

	@Override
	public void onStartup(ServletContextEvent sce) {
		WebApplicationContext rwp = WebApplicationContextUtils
				.getRequiredWebApplicationContext(sce.getServletContext());
		CompanyService companyService = (CompanyService) rwp.getBean("companyService");
		// set common info to servletContext.
		// But remember to recall this method when company info is updated.
		ServletContextHelper.set(sce.getServletContext(), companyService.getCompany());
	}

}
