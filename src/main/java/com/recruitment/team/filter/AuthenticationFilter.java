package com.recruitment.team.filter;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.recruitment.team.bean.LoginBean;



/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter({ "/AuthenticationFilter", "/views/*", "/template/*" })
public class AuthenticationFilter implements Filter {

	@Inject
    private LoginBean loginbean;
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		if(loginbean.getLoginUser().getId() == 0) {
			HttpServletRequest req = (HttpServletRequest) request;
			req.setAttribute("error_message", "Please Login !");
			req.getServletContext().getRequestDispatcher("/index.xhtml").forward(req, response);
		}else {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}