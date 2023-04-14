package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PathController extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("[요청] CommandServlet 객체 생성");
    }

    public void proccess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("::::::::: CommandServlet 요청 처리 시작 :::::::::::");
        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html;charset=utf-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("CommandServlet GET 호출!");
        proccess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("CommandServlet POST 호출!");
        proccess(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("[종료] CommandServlet 객체 제거");
    }
}
