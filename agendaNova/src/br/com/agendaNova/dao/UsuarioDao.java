package br.com.agendaNova.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.agendaNova.conection.Conector;
import br.com.agendaNova.modelo.Telefone;
import br.com.agendaNova.modelo.Usuario;

public class UsuarioDao {
	private Connection connection;
	private int id_usuario;
	
	
	
	public void inserir(Usuario usuario) {
		
		try {
		this.connection = new Conector().getConection();
		PreparedStatement stm = this.connection.prepareStatement("insert into usuario (nome,senha,email) values(?,?,?)");
		
		
		stm.setString(1,usuario.getNome());
		stm.setString(2,usuario.getSenha());
		stm.setString(3,usuario.getEmail());
		
		stm.executeUpdate();
		stm.close();
		connection.close();
		
		System.out.println("Dados gravados com sucesso!");
		
		
		}catch(Exception e) {
			throw new RuntimeException("Impossível de inserir dados!",e);
		}
				
	}
	
	public List<Usuario> getUsuarios(){
		try {List<Usuario> usuarios = new ArrayList<>();
		Connection conector = new Conector().getConection();
		PreparedStatement busca = conector.prepareStatement("select * from usuario INNER JOIN telefone ON usuario.id=telefone.id_usuario");
		ResultSet resultado = busca.executeQuery();
		
		while (resultado.next()) {
		Usuario usuario = new Usuario();
		Telefone telefone = new Telefone();
		usuario.setId(resultado.getInt("usuario.id"));
		usuario.setNome(resultado.getString("nome"));
		usuario.setEmail(resultado.getString("email"));
		telefone.setDdd(resultado.getInt("ddd"));
		telefone.setNumero(resultado.getString("numero"));
		telefone.setTipo(resultado.getString("tipo"));
		usuario.setPhone(telefone);
		usuarios.add(usuario);
		}
		resultado.close();
		busca.close();
		conector.close();
		return usuarios;
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	public void InsereTelefone(Usuario usuario) {
		
		try {
			this.connection = new Conector().getConection();
			PreparedStatement stmt = this.connection.prepareStatement("select id from usuario ORDER by id DESC LIMIT 1");
			
			ResultSet resultado = stmt.executeQuery();
			
			
		
				while(resultado.next()) {
				this.id_usuario = resultado.getInt("id");				
				}
					
			
			resultado.close();
			stmt.close();
			this.connection.close();
			this.connection = new Conector().getConection();
			int lista_tamanho = usuario.getTelefone().size();
			if (usuario.getTelefone().isEmpty()) {
				return;
			}else {
				for(int i=0; i<=lista_tamanho-1;i++) {
					PreparedStatement stmt1 = this.connection.prepareStatement("insert into telefone (ddd,numero,tipo,id_usuario) values(?,?,?,?)");
					stmt1.setInt(1,usuario.getTelefone().get(i).getDdd());
					stmt1.setString(2,usuario.getTelefone().get(i).getNumero());
					stmt1.setString(3,usuario.getTelefone().get(i).getTipo());
					stmt1.setInt(4,this.id_usuario);
					stmt1.executeUpdate();
				}
			}
			this.connection.close();
			System.out.println("Dados inseridos!!");
			
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void RemoveUsuario(Usuario usuario) {
		try {
			this.connection = new Conector().getConection();
			PreparedStatement remove = this.connection.prepareStatement("delete from usuario where id = ?");
			remove.setInt(1, usuario.getId());
			remove.executeUpdate();
			remove.close();
			this.connection.close();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void AtualizarUsuario(Usuario usuario) {
		try {
			Connection conector = new Conector().getConection();
			PreparedStatement busca = conector.prepareStatement("update usuario set nome=?,email=?,senha=? where id=?");
			busca.setString(1, usuario.getNome());
			busca.setString(2, usuario.getEmail());
			busca.setString(3, usuario.getSenha());
			busca.setInt(3, usuario.getId());
			busca.executeUpdate();
			busca.close();
			int tamanho = usuario.getTelefone().size();
			for(int i=0;i<tamanho-1; i++) {
				PreparedStatement buscafone = conector.prepareStatement("update telefone set ddd=?,numero=?,tipo=? where id=?");
				buscafone.setInt(1, usuario.getTelefone().get(i).getDdd());
				buscafone.setString(2, usuario.getTelefone().get(i).getNumero());
				buscafone.setString(3, usuario.getTelefone().get(i).getTipo());
				buscafone.setInt(4, usuario.getId());
				buscafone.executeUpdate();
				buscafone.close();	
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

