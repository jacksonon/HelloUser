package wangjiawei;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		request.setCharacterEncoding("utf-8");
//		String userName = request.getParameter("USERNAME");
//		User user = new User();
//		user.setUserName(userName);
//		request.setAttribute("user", user);
//		RequestDispatcher rd = request.getRequestDispatcher("hello.jsp");
//		rd.forward(request, response);
		
		String requestUrl = request.getRequestURL().toString();
		String requestUri = request.getRequestURI();
		String queryString = request.getQueryString();
		String remoteAddr = request.getRemoteAddr();
		String remoteHost = request.getRemoteHost();
		int remotePort = request.getRemotePort();
		String remoteUser = request.getRemoteUser();
		String method = request.getMethod();
		String pathInfo = request.getPathInfo();
		String localAddr = request.getLocalAddr();
		String localName = request.getLocalName();
		
		response.setCharacterEncoding("utf-8");
		response.setHeader("content-type", "text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.write("获取到的客户端信息如下：");
		out.write("<hr/>");
		out.write("请求的URL地址为" + requestUrl);
		out.write("<br/>");
		out.write("请求的资源" + requestUri);
		out.write("<br/>");
		out.write("请求的URL附带参数" + queryString);
		out.write("<br/>");
		out.write("来访者IP地址" + remoteAddr);
		out.write("<br/>");
		out.write("来访者主机名" + remoteHost);
		out.write("<br/>");
		out.write("使用的端口号" + remotePort);
		out.write("用户" + remoteUser);
		out.write("<br/>");
		out.write("请求使用的方法" + method);
		out.write("<br/>");
		out.write("路径信息" + pathInfo);
		out.write("<br/>");
		out.write("本地地址" + localAddr);
		out.write("<br/>");
		out.write("本地名称" + localName);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
