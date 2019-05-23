/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike;

import bean.Bike;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
@WebServlet(name = "hybrid", urlPatterns = {"/hybrid"})
public class hybrid extends HttpServlet {


   
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
        
        HttpSession session = request.getSession();
        


        
        ArrayList basikal = new ArrayList();    
            
       try {
            String sql = "SELECT * FROM bike where bikeType='Hybrid'and bikeStatus='available' ";
            PreparedStatement P = con.prepareStatement(sql);
            ResultSet rs = P.executeQuery();
            
            while (rs.next()) {
                Bike hold = new Bike();
                
                int bikeID        = rs.getInt   ("bikeID");
                String bikeStatus = rs.getString("bikeStatus");
                String bikeType   = rs.getString("bikeType");
                double bikePrice  = rs.getDouble("bikePrice");
                
                hold.setBikeID(bikeID);
                hold.setBikeStatus(bikeStatus);
                hold.setBikeType(bikeType);
                hold.setBikePrice(bikePrice);
                
                basikal.add(hold);
                
            }
        }
        catch (SQLException ex) {            
        }
        
        session.setAttribute("HYBRID", basikal);
        
        response.sendRedirect(request.getContextPath() + "/Hybrid_list.jsp");
    
    
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
	    res.sendError(res.SC_NO_CONTENT);
	}
	else
	    dispatcher.forward(req, res);
    }
}
