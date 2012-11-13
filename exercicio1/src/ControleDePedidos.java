import java.util.LinkedList;



public class ControleDePedidos implements InterfaceSistemaDeControle {
		private LinkedList<Pedido> pedido;
		
	public LinkedList <Pedido> getPedido(){
		return pedido;
	}
	
	@Override
	public void adicionarPedido(Pedido p) {
		// TODO Auto-generated method stub
		this.pedido.add(p);
		
	}

	@Override
	public LinkedList<Pedido> pesquisaPedidoIncluindoProduto(long codigoPedido) {
		return pedido;
	//
	}

	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente) {
		int qtdPedidos = 0;
		
		for(int i = 0; i < pedido.size(); i++) {
			if( nomeCliente.equals(pedido.get(i).getCliente().getNome())) {
					qtdPedidos++;
			}
		}
		return (qtdPedidos);
	}
	
	@Override
	public void removePedido(long numPedido) {
	  int aux=0;
	  	for (int i=0; i < this.pedido.size(); i++){
	  		if (numPedido == pedido.get(i).getCodigoDoItem()){
	  			pedido.remove(i);
	  			aux ++;
	  		}
	  	}
	}

	
}
