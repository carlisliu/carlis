package xyz.flym.carlis.web.listeners;

import javax.servlet.ServletContextEvent;

/**
 * System Startup Listener,invoke onStartup() when web application starts.
 * 
 * @author Carlis
 * 
 */
public interface SystemStartupListener {
	void onStartup(ServletContextEvent sce);
}
