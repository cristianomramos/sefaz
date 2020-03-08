package br.com.agendaNova.logica;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaNova.dao.UsuarioDao;
import br.com.agendaNova.modelo.Telefone;
import br.com.agendaNova.modelo.Usuario;

public class InserirContato implements Negocio {
	@Override
	public void processa(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		String ddd1 = request.getParameter("ddd1");
		String numero1 = request.getParameter("numero1");
		String tipo1 = request.getParameter("tipo1");
		
		String ddd2 = request.getParameter("ddd2");
		String numero2 = request.getParameter("numero2");
		String tipo2 = request.getParameter("tipo2");
		
		String ddd3 = request.getParameter("ddd3");
		String numero3 = request.getParameter("numero3");
		String tipo3 = request.getParameter("tipo3");
		
		Usuario usuario = new Usuario();
		UsuarioDao usuariodao = new UsuarioDao();
		List<Telefone> telefone = new ArrayList<>();
		
		if(ddd1.isEmpty()!= true) {
			Telefone telefone1 = new Telefone();
			int dddi1 = Integer.parseInt(ddd1);
			
			telefone1.setDdd(dddi1);
			telefone1.setNumero(numero1);
			telefone1.setTipo(tipo1);
			telefone.add(telefone1);
		}
		if(ddd2.isEmpty()!= true) {
			Telefone telefone2 = new Telefone();
			int dddi2 = Integer.parseInt(ddd2);
			
			telefone2.setDdd(dddi2);
			telefone2.setNumero(numero2);
			telefone2.setTipo(tipo2);
			telefone.add(telefone2);
		}
		if(ddd3.isEmpty()!= true) {
			Telefone telefone3 = new Telefone();
			int dddi3 = Integer.parseInt(ddd3);
			
			telefone3.setDdd(dddi3);
			telefone3.setNumero(numero3);
			telefone3.setTipo(tipo3);
			telefone.add(telefone3);
		}
		
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		usuario.setTelefone(telefone);
		
		usuariodao.inserir(usuario);
		usuariodao.InsereTelefone(usuario);
		
	}
	
	
	
}
