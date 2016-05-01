package xyz.flym.carlis.web.listeners.impl;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import xyz.flym.carlis.utils.Env;
import xyz.flym.carlis.web.listeners.SystemStartupListener;

/**
 * 
 * @author Carlis
 * 
 */
public class ConfigListener implements SystemStartupListener {

	private static Log LOG = LogFactory.getLog(ConfigListener.class);

	@Override
	public void onStartup(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		Map<String, String> ctx = Env.getPageContext();
		Iterator<String> keys = ctx.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			String value = ctx.get(key);
			LOG.info("Setting page context " + key + " to " + value);
			context.setAttribute(key, value);
		}
	}
}
