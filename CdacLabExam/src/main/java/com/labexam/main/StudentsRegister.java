package com.labexam.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.labexam.pojo.StudentDemo;


@WebServlet("/registerStudent")
public class StudentsRegister extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	 

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int rollNo = Integer.parseInt(request.getParameter("rollNo"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phoneNo = request.getParameter("phoneNo");
        String degree = request.getParameter("degree");

        StudentDemo student = new StudentDemo();
        student.setRollNo(rollNo);
        student.setName(name);
        student.setAddress(address);
        student.setPhoneNo(phoneNo);
        student.setDegree(degree);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            response.sendRedirect("registrationSuccess.jsp");
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            response.sendRedirect("registrationError.jsp");
        
        } 
    
        session.close();
    }
    
}
