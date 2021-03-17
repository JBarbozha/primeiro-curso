package entity;

public class Cliente {
	private Integer id;
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String nome, String email, String telefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		String s = "Id: "+this.getId();
		s+="\nNome: "+this.getNome();
		s+="\nE-mail: "+this.getEmail();
		s+="\nTelefone: "+this.getTelefone();
		
		return s;
	}
	
	
}
