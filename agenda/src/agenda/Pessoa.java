//Ana Carolina Carvalho - 2017.1906.098-3

package agenda;

abstract public class Pessoa{
	
	protected String nome;
	protected String endereco;
	protected String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	abstract public String getDocumento();
	
}
