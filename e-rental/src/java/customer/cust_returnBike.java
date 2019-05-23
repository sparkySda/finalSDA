/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import bean.Booking;
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
@WebServlet(name = "cust_returnBike", urlPatterns = {"/cust_returnBike"})
public class cust_returnBike extends HttpServlet {
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
        
        Booking user = null;
        HttpSession session = request.getSession();
        
        String name = request.getParameter("custName");
        
        String sql = "SELECT * FROM booking WHERE custName = ?";
        
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                
        String custName=rs.getString("custName");
        String bikeID = rs.getString("bikeID");
        String bikeType = rs.getString("bikeType");
        String pickupBike = rs.getString("pickupBike");
        String returnBike = rs.getString("returnBike");
        String duration = rs.getString("duration");
                
            user = new Booking();
                
            user.setCustName(custName);
            user.setBikeID(bikeID);
            user.setBikeType(bikeType);
            user.setReturnTime(returnBike);
            user.setPickUpTime(pickupBike);
            user.setDuration(duration);
            }
        }
        catch (SQLException ex ) {
        }
        
        
        
        if (user != null) {
            session.setAttribute("BOOK", user);
            response.sendRedirect(request.getContextPath() + "/booking_return.jsp");
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
