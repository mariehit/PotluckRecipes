/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewlayer;

import businesslayer.CommentsBusinessLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import transferobjects.Comments;

/**
 *
 * @author Johan
 */
public class CommentsSummaryView extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            //from here, my code
            out.println("<h1>Johan Setyobudi</h1>");
            out.println("Date: " +java.time.LocalDate.now().toString() +"<br>");
            out.println("Time: " +java.time.LocalTime.now().toString() +"<br>");
            out.println("<title>Johan Setyobudi</title>");   
            CommentsBusinessLogic logic = new CommentsBusinessLogic();
            List<Comments> comments = logic.getAllComments();
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td>Member ID</td>");
            out.println("<td>Recipe ID</td>");
            out.println("<td>Date Created</td>");
            out.println("<td>Ranking</td>");
            out.println("<td>Comment Text</td>");
            out.println("</tr>");
            for(Comments comment : comments){
                out.printf("<tr><td>%d</td><td>%d</td><td>%s</td><td>%d</td><td>%s</td></tr>",
                    comment.getMemberId(), comment.getRecipeId(), comment.getDateCreated(), comment.getRanking(), comment.getCommentText());
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
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
