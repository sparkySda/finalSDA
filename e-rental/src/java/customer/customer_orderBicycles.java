/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "customer_orderBicycles", urlPatterns = {"/customer_orderBicycles"})
public class customer_orderBicycles extends HttpServlet{
    
    
    
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
        
        

        
        String name = request.getParameter("custName");
        String bikeID = request.getParameter("bookID");
        String bikeType = request.getParameter("bType");
        String bikePickup = request.getParameter("startRent");
        String bikeDuration = request.getParameter("rentDuration");

        int a1= Integer.parseInt(request.getParameter("rentDuration"));
        int a2= Integer.parseInt(request.getParameter("startRent"));
        int pickup=a1+a2;
       String spickup=Integer.toString(pickup);
        
      
        String sqlInsert = "INSERT INTO booking(custName,bikeID,bikeType,pickupBike,returnBike,duration) VALUES (?,?,?,?,?,?)";
        String sql2="UPDATE bike SET bikeStatus=? WHERE bikeID=?";
    
        
        try {
            
           PreparedStatement P = con.prepareStatement(sqlInsert);
           PreparedStatement P1 = con.prepareStatement(sql2);
            P.setString(1,name);
            P.setString(2,bikeID);
            P.setString(3,bikeType);
            P.setString(4,bikePickup);
            P.setString(5,spickup);
            P.setString(6,bikeDuration);
            
             P1.setString(1,"BOOKED");
             P1.setString(2,bikeID);

           
            P.executeUpdate();
            P1.executeUpdate();
            response.sendRedirect(request.getContextPath() + "/payment.jsp");
          
                
        }
        catch (SQLException ex) {            
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

    void sendPage(HttpServletRequest req, HttpServletResponse res, String fileName) throws ServletException, IOException
    {
        // Get the dispatcher; it gets the main page to the user
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(fileName);

	if (dispatcher == null)
	{
            System.out.println("There was no dispatcher");
	    // No dispatcher means the html file could not be found.
	    res.sendError(HttpServletResponse.SC_NO_CONTENT);
	}
	else
	    dispatcher.forward(req, res);
    }

}

