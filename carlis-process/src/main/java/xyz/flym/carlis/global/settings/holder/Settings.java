package xyz.flym.carlis.global.settings.holder;

import xyz.flym.carlis.persistence.domain.Company;

/**
 * Global settings- hold global info(e.g. company info) to avoid multiple
 * database operations.
 * 
 * @author Carlis
 * 
 */
@Deprecated
public class Settings {
	private static Company company;

	public synchronized static Company getCompanyInfo() {
		return Settings.company;
	}

	public synchronized static void setCompanyInfo(Company company) {
		Settings.company = company;
	}
}
