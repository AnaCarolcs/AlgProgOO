//Ana Carolina Carvalho - 2017.1906.098-3

package agenda;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.adicionar("Joao", "24.796.176/0001-60", "Rua nao sei qual", "email@email.com", "1", "Empresa 1");
		agenda.adicionar("Carol", "238.675.500-26", "Rua nao sei qual", "email@email.com", "21/05", "solteira", 21);
		agenda.adicionar("Ana", "082.524.560-57", "Rua nao sei qual", "email@email.com", "20/05", "solteira", 20);
		agenda.adicionar("Renato", "74.868.548/0001-94", "Rua nao sei qual", "email@email.com", "2", "Empresa 2");
		agenda.adicionar("Miguel", "76.725.429/0001-08", "Rua nao sei qual", "email@email.com", "3", "Empresa 3");
		agenda.adicionar("Maria", "381.023.520-27", "Rua nao sei qual", "email@email.com", "22/05", "solteira", 22);
		agenda.visualizar();
		agenda.ordenar();
		agenda.visualizar();
		agenda.remover("Joao");
		agenda.visualizar();
		}
}