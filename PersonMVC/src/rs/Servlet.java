package rs;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Servlet() {super();}

     

 // LISTA OSOBA KAO ATRIBUT SERVELTA, DA BI JOJ SE PRISTUPALO IZ METODA
	private ArrayList<Osoba> lo = new ArrayList<Osoba>();

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// LISTA OSOBA
		String ime = request.getParameter("ime");
		String prezime = request.getParameter("prezime");
		String godine = request.getParameter("godine");
		String sifra = request.getParameter("sifra");
		String validacija = request.getParameter("validacija");
		String zbir = request.getParameter("zbir");
		
		if(ime != null && ime.length()>0 &&
			prezime != null && prezime.length()>0 &&
			godine != null && godine.length()>0 &&
			sifra != null && sifra.length()>0 &&
			validacija != null && validacija.length()>0 &&
			zbir != null && zbir.length()>0 
			){
			if(sifra.equals("12345")){
				if(validacija.equals(zbir)){
					try {
						int g = Integer.parseInt(godine);
								
						// TEK SAD SVE OK
								
						Osoba o = new Osoba(ime, prezime, g);
								
						lo.add(o);
								
						request.setAttribute("lo", lo);
request.getRequestDispatcher("listaOsoba.jsp").forward(request, response);
					} catch (Exception e) {
request.setAttribute("msg", "Godine moraju biti broj");
request.getRequestDispatcher("index.jsp").forward(request, response);
					}
				}else{
request.setAttribute("msg", "pogresna validacija");
request.getRequestDispatcher("index.jsp").forward(request, response);
				}
			}else{
request.setAttribute("msg", "Pogresna sifra");
request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}else{
request.setAttribute("msg", "Morate popunitis sva polja");
request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
}
