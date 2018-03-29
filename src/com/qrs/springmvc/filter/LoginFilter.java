package com.qrs.springmvc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain) throws IOException, ServletException {
		if(!(servletRequest instanceof HttpServletRequest)
				|| !(servletResponse instanceof HttpServletResponse)){
			throw new ServletException(    
                    "OncePerRequestFilter just supports HTTP requests"); 
		}
		HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
		HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
		HttpSession session = httpRequest.getSession();
		String[] strs = {"login"};// 路径中包含这些字符串的,可以不用登录直接访问 
		StringBuffer url = httpRequest.getRequestURL();
		
		String path = httpRequest.getContextPath();
		String protAndPath = httpRequest.getServerPort() == 80 ? "" : ":"    
                + httpRequest.getServerPort();    
        String basePath = httpRequest.getScheme() + "://"    
                + httpRequest.getServerName() + protAndPath + path + "/";
        if(basePath.equalsIgnoreCase(url.toString())){
        	filterChain.doFilter(servletRequest, servletResponse);
        	return;
        }
     // 特殊用途的路径可以直接访问    
        if (strs != null && strs.length > 0) {    
            for (String str : strs) {    
                if (url.indexOf(str) >= 0) {    
                    filterChain.doFilter(servletRequest, servletResponse);    
                    return;    
                }    
            }    
        }
        
     // 从session中获取用户信息    
        String loginInfo = (String) session.getAttribute("username");    
        if (null != loginInfo && !"".equals(loginInfo)) {    
            // 用户存在继续访问此    
            filterChain.doFilter(servletRequest, servletResponse);    
        } else {    
            // 用户不存在返回登录  
            String returnUrl = httpRequest.getContextPath();    
            httpRequest.setCharacterEncoding("UTF-8");    
            httpResponse.setContentType("text/html; charset=UTF-8"); // 转码    
            httpResponse.setHeader("Cache-Control", "no-store");  
            httpResponse.setDateHeader("Expires", 0);  
            httpResponse.setHeader("Prama", "no-cache");  
            httpResponse.sendRedirect(basePath+"login.jsp");  
//            httpResponse    
//                    .getWriter()    
//                    .println(    
//                            "<script language=\"javascript\">alert(\"您还没有登录，请先登录!\");if(window.opener==null){window.top.location.href=\""    
//                                    + returnUrl    
//                                    + "\";}else{window.opener.top.location.href=\""    
//                                    + returnUrl    
//                                    + "\";window.close();}</script>");    
            return;    
        }   
        
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
