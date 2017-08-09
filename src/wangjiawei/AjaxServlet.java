package wangjiawei;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 根据穿入值，向客户端输出不同的值
		int deptId = Integer.parseInt(request.getParameter("dept"));
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String[] dept1 = {"英雄联盟", "跑跑卡丁车", "热血江湖", "魂斗罗"};
		String[] dept2 = {"C", "C++", "Java", "Objective-C", "Swift", "HTML", "Python"};
		String[] dept3 = {"变态", "色狼", "地铁", "公交"};
		switch (deptId) {
		case 1:
			out.write(Arrays.toString(dept1));
			break;
		case 2:
			out.write(Arrays.toString(dept2));
			break;
		case 3:
			out.write(Arrays.toString(dept3));
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
