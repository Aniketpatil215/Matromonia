/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aniket
 */
public class Aadhar_number extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String Adharcard_no = req.getParameter("Adharcard_no");
        String btn = req.getParameter("btn");

        out.println(name);
        out.println(email);
        out.println(Adharcard_no);
        out.println(btn);

        Database db = new Database();
        out.println(db.ConnectDB());

        if (btn.equals("SUBMIT")) {

            String insert = ("insert into adharcard_number (name,email,Adharcard_no) values ('" + name + "','" + email + "','" + Adharcard_no + "'");
            String result = db.Insert(insert, "Record Inserted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Inserted');");
            out.println("location='Adharcard_verify.jsp';");
            out.println("</script>");
        }

        if (btn.equals("Update")) {

            String update = ("update  adharcard_number set name='" + name + "',Adharcard_no='" + Adharcard_no + "' where email='" + email + "'");
            String result = db.Update(update, "Record Updated");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Inserted');");
            out.println("location='Adharcard_verify_view.jsp';");
            out.println("</script>");
        }

        if (btn.equals("Delete")) {

            String delete = "delete from adharcard_number  where email='" + email + "'";
            String result = db.Delete(delete, "Record Deleted");
            out.println(result);

            resp.setContentType("text/html;charset=UTF-8");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Record Deleted');");
            out.println("location='Adharcard_verify_view.jsp';");
            out.println("</script>");

        }

    }
}
