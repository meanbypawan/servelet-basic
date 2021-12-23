
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HelloServlet implements Servlet{

    @Override
    public void init(ServletConfig config) throws ServletException {
      System.out.println("Init called............");
    }

    @Override
    public ServletConfig getServletConfig() {
       return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service called..................");
        PrintWriter out = res.getWriter();
        out.print("Welcome In Java Web Application");
    }

    @Override
    public String getServletInfo() {
      return null;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy called.........");
    }
    
}
