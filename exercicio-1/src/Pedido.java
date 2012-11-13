import java.util.LinkedList;


public class Pedido {
	
	private int codigoDoItem;
	private Cliente cliente;
	private LinkedList<ItemDePedido> itens;
	
	public Pedido(int codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}

	public int getCodigoDoItem() {
		return codigoDoItem;
	}

	public void setCodigoDoItem(int codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public LinkedList<ItemDePedido> getItens() {
		return this.itens;
	}
	
	public void adicionaItem( ItemDePedido item ) {
		this.itens = new LinkedList<ItemDePedido>();
		itens.add(item);	
	}
	
	public String toString(){	
		return "Código do item:"+ getCodigoDoItem() + "\n"+
				"Quantidade:"+ this.itens.size() + "\n"+
				"Nome do Cliente:"+ getCliente().getNome() + "\n";
	}

}
