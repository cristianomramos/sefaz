package br.com.agendaNova.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaNova.dao.UsuarioDao;
import br.com.agendaNova.modelo.Usuario;

public class RemoverContato implements Negocio {

	@Override
	public void processa(HttpServletRequest request, HttpServletResponse response) {
		String idform = request.getParameter("id");
		int id = Integer.parseInt(idform);
		Usuario usuario = new Usuario();
		UsuarioDao usuariodao = new UsuarioDao();
		usuario.setId(id);
		usuariodao.RemoveUsuario(usuario);
		request.getRequestDispatcher("/contatoremovido.html");
		
		
	}
	

}
