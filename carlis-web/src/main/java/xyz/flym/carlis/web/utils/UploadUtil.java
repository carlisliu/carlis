package xyz.flym.carlis.web.utils;

import java.io.File;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import xyz.flym.carlis.utils.Env;

import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author Carlis
 * 
 */
public class UploadUtil {

	public static String getRoot() {
		ServletContext servletContext = (ServletContext) ActionContext.getContext().get(
				ServletActionContext.SERVLET_CONTEXT);
		return servletContext.getRealPath("/");
	}

	public static String getUploadPath(String type) {
		StringBuilder path = new StringBuilder(UploadUtil.getRoot());
		path.append(Env.getUploadRoot().replace("/", File.separator));
		path.append(File.separator);
		path.append(type);
		path.append(File.separator);
		return path.toString();
	}
}
