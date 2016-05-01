package xyz.flym.carlis.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Carlis
 * 
 */
public class Env {

	private static final String PREFIX = "pageContext_";
	private static Map<String, String> pageContext;

	static {
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = Env.class.getResourceAsStream("/config.properties");
			p.load(in);
			Iterator<Entry<Object, Object>> it = p.entrySet().iterator();
			while (it.hasNext()) {
				Entry<Object, Object> entry = it.next();
				String key = (String) entry.getKey();
				if (StringUtils.startsWith(key, PREFIX)) {
					key = key.replace(PREFIX, StringUtils.EMPTY);
					String value = (String) entry.getValue();
					getPageContext().put(key, value);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static Map<String, String> getPageContext() {
		if (Env.pageContext == null) {
			Env.pageContext = new HashMap<String, String>();
		}
		return Env.pageContext;
	}

}
