
public class ItemDePedido {

	private int quantidade;
	private long codigoPedido;
	private double valorUnitario;
	private int codigoDoItem;
	
	public ItemDePedido(int quantidade, long codPedido, double valorUnitario, int codigoDoItem) {
		this.quantidade = quantidade;
		this.codigoPedido = codPedido;
		this.valorUnitario = valorUnitario;
		this.codigoDoItem = codigoDoItem;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public long getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(long codPedido) {
		this.codigoPedido = codPedido;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getCodigoDoItem() {
		return codigoDoItem;
	}

	public void setCodigoDoItem(int codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}
	

	
}
