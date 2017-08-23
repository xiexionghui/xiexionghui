package cn.xxh;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieAction extends HttpServlet {
	
	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// /servlet/cookieaction.do<
		
		
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie ck: cookies){
				if(ck.getName().equals("loginUserName")){
					request.setAttribute("userNameFromCookie", ck.getValue());
				}
				 int  a= 1/0;
			}
		}
		
		
		

		request.getRequestDispatcher("../user/Login.jsp").forward(request, response);
		
		Cookie co = new Cookie("name", "123");
		response.addCookie(co);
		request.setAttribute("co", co);
		

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		String remberme = request.getParameter("remberme");

		// D调用service 方法

		// 保存用户名
		if (remberme != null) {
			Cookie cookie = new Cookie("loginUserName", username);
			cookie.setMaxAge(180);
			response.addCookie(cookie);
		}

		request.getRequestDispatcher("../index.jsp").forward(request, response);
	}

}
