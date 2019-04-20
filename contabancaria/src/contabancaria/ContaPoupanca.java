package contabancaria;

public class ContaPoupanca extends ContaBancaria{

	private String rendimento;	
	
	public ContaPoupanca(String senha) {
		super(senha);
		this.rendimento = "0";
	}
	
	@Override
	void saca(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void tiraExtrato() {
		// TODO Auto-generated method stub

	}
}
