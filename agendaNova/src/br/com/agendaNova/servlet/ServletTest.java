package br.com.agendaNova.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaNova.logica.AlteraUsuario;
import br.com.agendaNova.logica.InserirContato;
import br.com.agendaNova.logica.ListarUsuarios;
import br.com.agendaNova.logica.RemoverContato;

@WebServlet("/Sistema")
public class ServletTest extends HttpServlet {

	private static final long serialVersionUID = 7986631375565690773L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("logica");

		if (acao.equals("InserirContato")) {
			InserirContato inserir = new InserirContato();
			inserir.processa(request, response);
			request.getRequestDispatcher("index.html").forward(request, response);

		}else if(acao.equals("RemoverContato")){
			RemoverContato removercontato = new RemoverContato();
			removercontato.processa(request, response);
			request.getRequestDispatcher("index.html").forward(request, response);
		}else if(acao.equals("ListarUsuarios")){
			ListarUsuarios listar = new ListarUsuarios();
			listar.processa(request, response);
			request.getRequestDispatcher("lista-contatos-scriplet.jsp").forward(request, response);
		}else if(acao.equals("AlteraUsuario")){
			AlteraUsuario alterar = new AlteraUsuario();
			alterar.processa(request, response);
			request.getRequestDispatcher("index.html").forward(request, response);
			}
	}
}
