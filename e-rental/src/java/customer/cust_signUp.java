/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author Plutonianaus
 * 
 */
import bean.Customer;
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


@WebServlet(name = "cust_signUp", urlPatterns = {"/cust_signUp"})
    public class cust_signUp extends HttpServlet{
        
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
    
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            
        String cutomerName=request.getParameter("username");
        String customerID = request.getParameter("userid");
        String customerPass = request.getParameter("password");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
       
      String sqlInsert = "INSERT INTO customer(customerID,customerName,customerPass,address,phone) VALUES (?,?,?,?,?)";
        
        PrintWriter out = response.getWriter();
        try {
            PreparedStatement P = con.prepareStatement(sqlInsert);
            P.setString(1, customerID);
            P.setString(2, cutomerName);
            P.setString(3, customerPass);
            P.setString(4, address);
            P.setString(5, phone);

            P.executeUpdate();

 
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Sign Up successful');");
            out.println("location='customer_login.jsp';");
            out.println("</script>"); 

            
        }
        catch (SQLException ex) { 
            
    }
    }
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

    


