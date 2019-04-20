package contabancaria;

public class ContaCorrente extends ContaBancaria{

	private int quantTransacoes;
	
	public ContaCorrente(String senha) {
		super(senha);
		this.quantTransacoes = 0;
	}
	
	@Override
	void saca(double valor) {
		super.setSaldo(super.getSaldo() - valor);
		quantTransacoes++;
	}

	@Override
	void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);
		quantTransacoes++;
	}

	@Override
	void tiraExtrato() {
		System.out.println(getSaldo());
		System.out.println(quantTransacoes);
	}

	public int getQuantTransacoes() {
		return quantTransacoes;
	}

	public void setQuantTransacoes(int quantTransacoes) {
		this.quantTransacoes = quantTransacoes;
	}
}
