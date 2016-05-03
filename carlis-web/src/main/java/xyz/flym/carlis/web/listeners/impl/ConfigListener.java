package xyz.flym.carlis.web.listeners.impl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import xyz.flym.carlis.web.listeners.SystemStartupListener;

/**
 * 
 * @author Carlis
 * 
 */
public class ConfigListener implements SystemStartupListener {

	private static Log LOG = LogFactory.getLog(ConfigListener.class);
	private static final String ACTION_PATH = "action";
	private static final String STATIC_PATH = "staticPath";

	@Override
	public void onStartup(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		String contextPath = context.getContextPath();
		context.setAttribute(ACTION_PATH, contextPath);
		LOG.info("Setting page context " + ACTION_PATH + " to " + contextPath);
		String staticPath = contextPath + "/assets";
		context.setAttribute(STATIC_PATH, staticPath);
		LOG.info("Setting page context " + STATIC_PATH + " to " + staticPath);
	}
}
