package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//Para poder acceder al servlet desde el navegador
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    //Especificar el método que va a procesar el servlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html:charset-UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola Mundo desde Servlets");
        out.println("Probando");
    }
}
