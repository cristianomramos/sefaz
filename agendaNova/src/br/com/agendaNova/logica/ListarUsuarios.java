package br.com.agendaNova.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaNova.dao.UsuarioDao;
import br.com.agendaNova.modelo.Usuario;

public class ListarUsuarios implements Negocio {

	@Override
	public void processa(HttpServletRequest request, HttpServletResponse response) {
		List<Usuario> usuarios = new UsuarioDao().getUsuarios();
		
		request.setAttribute("usuarios", usuarios);
	}

}
