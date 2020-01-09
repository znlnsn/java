package demoweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demoweb.bean.Student;
import demoweb.service.StudentService;
@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService service=new StudentService();
		String method = req.getParameter("method");
		//equals()比较两个字符串是否相等
		if("all".equals(method)) {
			List<Student> list = service.selectAllStudent();
			req.setAttribute("list", list);
			req.getRequestDispatcher("studentList.jsp").forward(req, resp);
		}else if("add".equals(method)){
			Student stu=new Student();
			String sno = req.getParameter("sno");
			stu.setSno(Integer.valueOf(sno));
			String sname = req.getParameter("sname");
			stu.setSname(sname);
			String sage = req.getParameter("sage");
			stu.setSage(Integer.valueOf(sage));
			String ssex = req.getParameter("ssex");
			stu.setSsex(ssex);
			int res=service.addStudent(stu);
			//重定向
			resp.sendRedirect("studentServlet?method=all");
		}else if("delete".equals(method)) {
			String sno = req.getParameter("sno");
			int res=service.deleteStudent(Integer.valueOf(sno));
			//重定向
			resp.sendRedirect("studentServlet?method=all");
		}else if("one".equals(method)) {
			String sno = req.getParameter("sno");
			Student stu = service.selectOne(Integer.valueOf(sno));
			req.setAttribute("student", stu);
			req.getRequestDispatcher("updateStudent.jsp").forward(req, resp);
		}else if("update".equals(method)) {
			Student stu=new Student();
			String sno = req.getParameter("sno");
			stu.setSno(Integer.valueOf(sno));
			String sname = req.getParameter("sname");
			stu.setSname(sname);
			String sage = req.getParameter("sage");
			stu.setSage(Integer.valueOf(sage));
			String ssex = req.getParameter("ssex");
			stu.setSsex(ssex);
			int res = service.updateStudent(stu);
			//重定向
			resp.sendRedirect("studentServlet?method=all");
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
