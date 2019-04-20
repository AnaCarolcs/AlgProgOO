//Ana Carolina Carvalho - 2017.1906.098-3

package agenda;

public class Fisica extends Pessoa {

	private String CPF;
	private String dataNasc;
	private String estadoCivil;
	private int idade;
	
	public Fisica(String nome, String cpf, String endereco, String email, String dataNasc, String estadoCivil, int idade){
		super.nome = nome;
		this.CPF = cpf;
		super.endereco = endereco;
		super.email = email;
		this.dataNasc = dataNasc;
		this.estadoCivil = estadoCivil;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}	
	@Override
	public String getDocumento() {
		return this.CPF;
	}
}
