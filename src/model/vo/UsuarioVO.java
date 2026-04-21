package model.vo;

/**
 * Classe com informações do usuário no banco de dados
 * @author baraunab
 */

public class UsuarioVO {
	private int id; // id gerado no banco de dados 
	private String usuario; // nome do usuario informado
	private String senha;  // senha do usuario informada
	
	/**
	 *  Getters e Setters dos objetos do usuário 
	 */
	
	// ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// Usuário
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	// Senha
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
