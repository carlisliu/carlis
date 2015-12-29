package xyz.flym.carlis.web.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import xyz.flym.carlis.web.utils.Const;

/**
 * 
 * @author Carlis
 * 
 */
public class AdminLoginFilter implements Filter {

	Map<String, Boolean> ignores = new HashMap<String, Boolean>();

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String ignorePaths = filterConfig.getInitParameter("ignore");
		if (StringUtils.isNotEmpty(ignorePaths)) {
			String[] ignorePathValues = ignorePaths.split(",");
			for (String path : ignorePathValues) {
				ignores.put(path, Boolean.TRUE);
			}
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String url = req.getRequestURI();
		if (StringUtils.isNotEmpty(url) && url.startsWith("/admin") && !shouldIgnore(url)) {
			Object loginContext = req.getSession().getAttribute(Const.LOGIN_USER_SESSION_IDENTIFIER);
			if (loginContext == null) {
				HttpServletResponse res = (HttpServletResponse) response;
				res.sendRedirect(req.getContextPath() + "/admin/login.jsp");
				return;
			}
		}
		chain.doFilter(request, response);
	}

	private boolean shouldIgnore(String url) {
		if (!ignores.isEmpty()) {
			for (String key : ignores.keySet()) {
				if (url.contains(key)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void destroy() {
		// do nothing
	}

}
