package model.dao;

import java.sql.*;

import model.vo.UsuarioVO;

/**
 * Classe de conexão do usuário com o banco de dados
 * @author baraunab
 */

public class UsuarioDAO {
	// informa nome de funcao para verificar execução ou erros  
	String funcao; 
	
	// Cadastro do usuário no banco de dados
	public void cadastroUsuario (UsuarioVO usuario) {
		Connection conexao;
		funcao = "cadastroUsuario";
		
		// comando sql para inserir o usuário no banco de dados
		String sql = "insert into usuario (username, senha) value (?, ?)";
		// adição da função de conexão
		conexao = new ConexaoDAO().conexaoBD(); 

		try {
			// junção da conexão com o comando de inserção 
			PreparedStatement linhaSql = conexao.prepareStatement(sql);
			
			// adição das informações obtidas do usuário
			linhaSql.setString(1, usuario.getUsuario());
			linhaSql.setString(2, usuario.getSenha());
			
			// execução do comando sql
			linhaSql.execute();
			
			// fecha as conexões 
			linhaSql.close();
			conexao.close();
			
			// confirma o cadastro no terminal
			System.out.println(funcao + ": cadastro realizado!");
			
		} catch (SQLException e) {
			// informa erros encontrados
			System.out.println(funcao + ": erro no cadastro");
			e.printStackTrace();
		} // fim try/catch
	} // fim cadastrarUsuario
	
} // fim classe
