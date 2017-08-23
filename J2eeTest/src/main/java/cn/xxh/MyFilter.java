package cn.xxh;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("调用init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		  HttpServletRequest req = (HttpServletRequest)request;
		  
		  HttpServletResponse res = (HttpServletResponse)response;
		  
		  
		
		  req.setCharacterEncoding("utf-8");
		  
		 
		 
		 
		  
		 
		 try { 
			 chain.doFilter(request, response);
		} catch (Throwable e) {
			e.printStackTrace();
			System.err.println("找不到....");
			res.sendRedirect("../index.jsp");
		}
		System.out.println("调用doFilter");
		
		System.out.println("调用doFilter...");

	}

	@Override
	public void destroy() {
		System.out.println("销毁");
		
	}

}
