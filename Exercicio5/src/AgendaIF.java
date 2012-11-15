
public interface AgendaIF {
	
	public void adicionarContato(String nome, String tel); 
	public void removeContato(String nome) throws ContatoInexistenteException;
	public Contato pesquisaContato(String nome) throws ContatoInexistenteException;

}
