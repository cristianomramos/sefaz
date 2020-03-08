package br.com.agendaNova.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaNova.dao.UsuarioDao;
import br.com.agendaNova.modelo.Usuario;

public class AlteraUsuario implements Negocio{
	@Override
	public void processa(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		/*String ddd = request.getParameter("ddd");
		String numero = request.getParameter("numero");
		String tipo = request.getParameter("tipo");*/
		
		Usuario usuario = new Usuario();
		usuario.setId(usuario.getId());
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		UsuarioDao usuariodao = new UsuarioDao();
		usuariodao.AtualizarUsuario(usuario);
				
		request.getRequestDispatcher("/Sistema");
		
		
	}
}
