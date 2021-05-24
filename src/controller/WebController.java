package controller;

import action.Action;
import vo.ActionForward;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "*.bo")
public class WebController extends HttpServlet {

    protected void doProcess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String RequestURI=request.getRequestURI();
        String contextPath=request.getContextPath();
        String command=RequestURI.substring(contextPath.length());
        ActionForward forward = null;
        Action action = null;

        if(command.equals("/main.bo")){
            forward=new ActionForward();
            forward.setPath("/view/main.jsp");
        }

        if(forward != null){

            if(forward.isRedirect()){
                response.sendRedirect(forward.getPath());
            }else{
                RequestDispatcher dispatcher=
                        request.getRequestDispatcher(forward.getPath());
                dispatcher.forward(request, response);
            }

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doProcess(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doProcess(request,response);
    }
}
