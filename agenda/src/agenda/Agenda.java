//Ana Carolina Carvalho - 2017.1906.098-3

package agenda;

import java.util.ArrayList;
import java.util.Comparator;

public class Agenda {

	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); 
	
	public void adicionar(String nome, String cpf, String endereco, String email, String dataNasc, String estadoCivil, int idade) {
		Fisica fisica = new Fisica(nome, cpf, endereco, email, dataNasc, estadoCivil, idade);
		pessoas.add(fisica);
	}
	
	public void adicionar (String nome, String cnpj, String endereco, String email, String inscricao, String razaoSocial){
		Juridica juridica = new Juridica(nome, cnpj, endereco, email, inscricao, razaoSocial);
		pessoas.add(juridica);
	}
	
	public void remover(String nome) {
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoa = pessoas.get(i);
			if(pessoa.getNome().equals(nome)) {
				pessoas.remove(pessoa);
			}
		}
	}
	
	public Pessoa pesquisar(String nome) {
		for (int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoa = pessoas.get(i);
			if(pessoa.getNome().equals(nome)) {
				return pessoa;
			}
		}
		return null ;
	}
	
	public void visualizar() {
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).getNome());
			System.out.println(pessoas.get(i).getDocumento());
		}
	}
	
	/*public ArrayList<Pessoa> visualizar() {
		return pessoas;
	}*/
	
	public ArrayList<Pessoa> ordenar(){
		pessoas.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa primeiraPessoa, Pessoa segundaPessoa) {
				if(primeiraPessoa instanceof Fisica && segundaPessoa instanceof Juridica) {
					return -1;
				}
				if(primeiraPessoa instanceof Juridica && segundaPessoa instanceof Fisica) {
					return 1;
				}
				return primeiraPessoa.getDocumento().compareTo(segundaPessoa.getDocumento());
			}
		});	
		return pessoas;
	}
}
