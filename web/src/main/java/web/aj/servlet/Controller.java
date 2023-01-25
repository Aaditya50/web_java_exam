package web.aj.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.aj.dao.StudentDao;
import web.aj.entity.Student;

@WebServlet("/register")
public class Controller extends HttpServlet{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StudentDao studentDao;

    public void init() {
    	studentDao = new StudentDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        register(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.sendRedirect("register.jsp");
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int rollno = Integer.parseInt(request.getParameter("rollno"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phoneno = request.getParameter("phoneno");
        String degree = request.getParameter("degree");
        Student student = new Student();
        student.setRollNo(rollno);
        student.setName(name);
        student.setAddress(address);
        student.setPhoneno(phoneno);
        student.setDegree(degree);

        studentDao.saveUser(student);
        

        RequestDispatcher dispatcher = request.getRequestDispatcher("register_success.jsp");
        dispatcher.forward(request, response);
    }
}
