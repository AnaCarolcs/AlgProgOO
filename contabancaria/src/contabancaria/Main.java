package contabancaria;

public class Main {

	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("12345");
		cc.deposita(100);
		cc.tiraExtrato();
		cc.saca(50);
		cc.tiraExtrato();
		cc.alteraSenha("1234");
		cc.alteraSenha("123456");
	}
	
}
