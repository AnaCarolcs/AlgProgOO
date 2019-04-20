//Ana Carolina Carvalho - 2017.1906.098-3

package agenda;

public class Juridica extends Pessoa {

	private String CNPJ;
	private String inscricaoEstad;
	private String razaoSocial;
	
	public Juridica(String nome, String cnpj, String endereco, String email, String inscricao, String razaoSocial){
		super.nome = nome;
		this.CNPJ = cnpj;
		super.endereco = endereco;
		super.email = email;
		this.inscricaoEstad = inscricao;
		this.razaoSocial = razaoSocial;
	}
	
	public String getCNPJ() {
		return CNPJ;
		
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getInscricaoEstad() {
		return inscricaoEstad;
	}
	public void setInscricaoEstad(String inscricaoEstad) {
		this.inscricaoEstad = inscricaoEstad;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@Override
	public String getDocumento() {
		return this.CNPJ;
	}
}
