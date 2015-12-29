package xyz.flym.carlis.web.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author Carlis
 * 
 */
public class AppStartupListener implements ServletContextListener {

	private static final String INIT_PARAM = "AppStartupListener";
	private static final String SPERATOR = ",";
	private static final Log LOG = LogFactory.getLog(SystemStartupListener.class);

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String startupListener = sce.getServletContext().getInitParameter(INIT_PARAM);
		if (StringUtils.isNotEmpty(startupListener)) {
			LOG.info("System startup listener executing.");
			String[] listeners = startupListener.split(SPERATOR);
			for (int i = 0; i < listeners.length; i++) {
				try {
					@SuppressWarnings("unchecked")
					Class<SystemStartupListener> clazz = (Class<SystemStartupListener>) Class.forName(listeners[i]);
					clazz.newInstance().onStartup(sce);
				} catch (ClassNotFoundException e) {
					LOG.debug("System startup listener failed.", e);
					e.printStackTrace();
				} catch (InstantiationException e) {
					LOG.debug("System startup listener failed.", e);
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					LOG.debug("System startup listener failed.", e);
					e.printStackTrace();
				}
			}
			LOG.info("System startup listener executed.");
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// Do nothing
	}

}
