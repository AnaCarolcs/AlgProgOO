package estoque;

import java.util.ArrayList;

public class Estoque {

	ArrayList<Item> itens = new ArrayList<Item>();
	
	public void inserir(String id, String nome, String preco) {
		Item item = new Item(id, nome, preco);
		itens.add(item);
	}
	
	
	
}
