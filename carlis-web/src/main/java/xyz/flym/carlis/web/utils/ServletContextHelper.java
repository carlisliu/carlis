package xyz.flym.carlis.web.utils;

import javax.servlet.ServletContext;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import xyz.flym.carlis.persistence.domain.Company;

/**
 * 
 * @author Carlis
 * 
 */
public class ServletContextHelper {

	/**
	 * 
	 * @param context
	 * @param company
	 */
	public static void set(ServletContext context, Company company) {
		if (context != null && company != null) {
			context.setAttribute("company", company);
		}
	}

	/**
	 * 
	 * @param context
	 * @param props
	 */
	public static void remove(ServletContext context, String... props) {
		if (context != null && !ArrayUtils.isEmpty(props)) {
			for (String prop : props) {
				context.removeAttribute(prop);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T get(ServletContext context, String key) {
		if (StringUtils.isEmpty(key)) {
			return null;
		}
		return (T) context.getAttribute(key);
	}

	public static <T> void put(ServletContext context, String key, T t) {
		context.setAttribute(key, t);
	}
}