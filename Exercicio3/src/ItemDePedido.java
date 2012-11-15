
public class ItemDePedido {

	private long codProduto;
	private int quantidade;
	private double valorUnitario;
	
	public ItemDePedido(long codigoItem,int quantidade, double valorUnitario) {
		this.codProduto = codigoItem;
		this.quantidade = quantidade;		
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	
}
