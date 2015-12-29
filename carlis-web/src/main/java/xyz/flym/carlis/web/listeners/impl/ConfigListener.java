package xyz.flym.carlis.web.listeners.impl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import xyz.flym.carlis.utils.Env;
import xyz.flym.carlis.web.listeners.SystemStartupListener;

/**
 * 
 * @author Carlis
 * 
 */
public class ConfigListener implements SystemStartupListener {

	private static final String ROOT_PATH = "rootPath";
	private static final String ASSETS_PATH = "assetsPath";
	private static final String ADMIN_ASSET_PATH = "adminAsset";
	private static final String ADMIN_ROOT = "adminRoot";

	@Override
	public void onStartup(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		context.setAttribute(ROOT_PATH, Env.getRootPath());
		context.setAttribute(ASSETS_PATH, Env.getAssetsPath());
		context.setAttribute(ADMIN_ROOT, Env.getAdminRoot());
		context.setAttribute(ADMIN_ASSET_PATH, Env.getAdminAsset());
	}

}
