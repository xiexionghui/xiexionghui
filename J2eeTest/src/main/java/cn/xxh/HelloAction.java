package cn.xxh;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAction extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8"); 
		response.setContentLength(1560);
		response.setHeader("dever", "xxh");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML><html><head><meta http-equiv='Content-Type' content='text/html; charset=utf-8'><title>无标题文档</title><style type='text/css'> a{	text-decoration:none;	color:#999;	margin-left:10px;	}</style></head><body>	<form action='' method='post'>    	<table>        	<tr>            	<td><table width='1200'>                	<tr>                    	<td>                        <a href='#' style='font-size:12px'>网址大全</a>                        <a href='#' style='font-size:12px'>电影</a>                        <a href='#' style='font-size:12px'>电视剧</a>                        <a href='#' style='font-size:12px'>彩票</a>                        <a href='#' style='font-size:12px'>团购</a>                        <a href='#' style='font-size:12px'>购物</a>                        <a href='#' style='font-size:12px'>手机必备</a>                        <a href='#' style='font-size:12px'>小说</a>                        <a href='#' style='font-size:12px'>笑话</a>                        <select>                        	<option>更多分类</option>                            <option>更多分类</option>                        </select>                        </td>                        <td>                        <a href='#' style='font-size:12px'>设为主页|<a href='#' style='font-size:12px'>加入收藏</a>|<a href='#' style='font-size:12px'>意见反馈</a>                        </td>                    </tr>                </table></td>                      </tr>        </table>     </form></body></html>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println(" 初始化了");
		super.init();
	}

	@Override
	public void destroy() {
		System.out.println(" 销毁了");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.destroy();
	}
}
