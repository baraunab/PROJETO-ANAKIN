package model.dao;

import java.sql.*;

/**
 * Classe de conexão ao banco de dados do sistema
 * @author baraunab
 */

public class ConexaoDAO {
	private Connection conexao;
	
	public Connection conexaoBD() {
		this.conexao = null;
		
		try {
			// URL que conecta ao banco de dados
			String URL = "jdbc:mysql://localhost:3306/anakin?user=root&password=root";
			
			// Realiza conexão por meio da URL
			this.conexao = DriverManager.getConnection(URL);
			
			// Confirma conexão
			System.out.println("CONEXAO REALIZADA");
		} catch (Exception e) {
			
			// Exibe erro de exceção
			System.out.println(e.getMessage());
		}
		
		return conexao;
	}
		

}