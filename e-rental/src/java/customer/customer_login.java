/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import bean.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JDBCUtility;

/**
 *
 * @author Plutonianaus
 */
@WebServlet(name = "customer_login", urlPatterns = {"/customer_login"})
public class customer_login extends HttpServlet {
    
    private JDBCUtility jdbcUtility;
    private Connection con;
    
    public void init() throws ServletException
    {
        String driver = "com.mysql.jdbc.Driver";

        String dbName = "bicycledb";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";

        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        con = jdbcUtility.jdbcGetConnection();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Customer user = null;
        HttpSession session = request.getSession();
        
        String username = request.getParameter("userID");
        String password = request.getParameter("password");
        
        String sql = "SELECT * FROM customer WHERE customerID = ? AND customerPass = ?";
        
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                
        String customerID=rs.getString("customerID");
        String cutomerName = rs.getString("customerName");
        String customerPass = rs.getString("customerPass");
        String address = rs.getString("address");
        String phone = rs.getString("phone");
                
            user = new Customer();
                
            user.setCustomerName(cutomerName);
            user.setCustomerPass(customerPass);
            user.setAddress(address);
            user.setcustomerPhone(phone);
            user.setCustomerID(customerID);
            }
        }
        catch (SQLException ex ) {
        }
        
        
        
        if (user != null) {
            session.setAttribute("CUSTOMER", user);
            response.sendRedirect(request.getContextPath() + "/bicycles.jsp");
        }
        else {
            PrintWriter out = response.getWriter();
           
            out.println("<script type=\"text/javascript\">");
            out.println("alert('CUSTOMER ID or Password incorrect!\\nPlease try again.');");
            out.println("location='customer_login.jsp';");
            out.println("</script>");
              } 
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
