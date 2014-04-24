package com.supwisdom.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AclFilter implements Filter {
	/**
	 * Logger for this Class
	 */
	private static final Logger logger = LoggerFactory.getLogger(AclFilter.class);
	
	/**
	 * The filter configuration object we are associated with. If this value is
	 * null, this filter instance is not currently configured.
	 */
	private FilterConfig config = null;
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain fc) throws IOException, ServletException {
		
		HttpServletRequest hreq = (HttpServletRequest) req;
		
		logger.info("acl filter - {}",config.getServletContext().getContextPath());
		logger.info("acl filter url - {}",hreq.getRequestURL());
		
		if(!isLogin()){
			config.getServletContext().getRequestDispatcher("/auth.jsp").forward(req, resp);
		}
		fc.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		config = filterConfig;
	}
	
	@Override
	public void destroy() {
		config = null;
	}
	
	private boolean isLogin(){
		return true;
	}
}
