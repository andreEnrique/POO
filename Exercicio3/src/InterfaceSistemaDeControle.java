import java.util.LinkedList;


public interface InterfaceSistemaDeControle {

	public void adicionarPedido(Pedido p);
	public LinkedList<Pedido> pesquisaPedidoIncluindoProduto(long codigoPedido);
	public void removePedido(long numPedido);
	
}
