package br.com.agendaNova.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conector {

	public Conector() {
		
	}
	
	public Connection getConection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=America/Sao_Paulo","root","");
		}catch(SQLException e) {
			throw new RuntimeException("Erro ao conectar com o Banco de Dados!",e);
		}
		
	}
	
}
