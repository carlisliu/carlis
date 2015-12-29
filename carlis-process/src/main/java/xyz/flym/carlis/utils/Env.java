package xyz.flym.carlis.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Carlis
 * 
 */
public class Env {

	private static final String DEFAULT_UPLOAD_PATH = "/resources/product";

	private static final String UPLOAD_PATH_KEY = "uploadPath";
	private static final String ROOT_PATH_KEY = "rootPath";
	private static final String ASSETS_PATH_KEY = "assetsPath";
	private static final String ADMIN_ASSET_PATH_KEY = "adminAsset";
	private static final String ADMIN_ROOT_KEY = "adminRoot";
	private static final String CACHE = "cache";
	private static final String UPLOAD_ROOT_KEY = "uploadRoot";
	private String uploadPath;
	private String rootPath;
	private String assetsPath;
	private String adminAsset;
	private String adminRoot;
	private boolean cache;
	private String uploadRoot;

	private Env() {
		Properties p = new Properties();
		try {
			InputStream in = Env.class.getResourceAsStream("/config.properties");
			p.load(in);
			in.close();
			if (p.containsKey(UPLOAD_PATH_KEY)) {
				this.uploadPath = p.getProperty(UPLOAD_PATH_KEY);
				if (StringUtils.isEmpty(this.uploadPath)) {
					this.uploadPath = DEFAULT_UPLOAD_PATH;
				}
			} else {
				// this.uploadPath = System.getProperty("java.io.tmpdir");
				this.uploadPath = DEFAULT_UPLOAD_PATH;
			}
			if (p.containsKey(ROOT_PATH_KEY)) {
				this.rootPath = p.getProperty(ROOT_PATH_KEY);
			}
			if (p.containsKey(ASSETS_PATH_KEY)) {
				this.assetsPath = p.getProperty(ASSETS_PATH_KEY);
			}
			if (p.containsKey(ADMIN_ASSET_PATH_KEY)) {
				this.adminAsset = p.getProperty(ADMIN_ASSET_PATH_KEY);
			}
			if (p.containsKey(ADMIN_ROOT_KEY)) {
				this.adminRoot = p.getProperty(ADMIN_ROOT_KEY);
			}
			if (p.containsKey(CACHE)) {
				this.cache = Boolean.valueOf(p.getProperty(CACHE));
			}
			if (p.containsKey(UPLOAD_ROOT_KEY)) {
				this.uploadRoot = p.getProperty(UPLOAD_ROOT_KEY);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class Nested {
		private static Env env = new Env();
	}

	/**
	 * Get upload path.
	 * 
	 * @return
	 */
	public static String getUploadPath() {
		return Nested.env.uploadPath;
	}

	public static String getRootPath() {
		return Nested.env.rootPath;
	}

	public static String getAssetsPath() {
		return Nested.env.assetsPath;
	}

	public static String getAdminAsset() {
		return Nested.env.adminAsset;
	}

	public static String getAdminRoot() {
		return Nested.env.adminRoot;
	}

	public static boolean isCache() {
		return Nested.env.cache;
	}

	public static String getUploadRoot() {
		return Nested.env.uploadRoot;
	}
}
