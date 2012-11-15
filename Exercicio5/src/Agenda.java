import java.util.LinkedList;
import java.util.List;


public class Agenda implements AgendaIF{

	private List <Contato> contatos;
	
	public Agenda(){
		contatos = new LinkedList <Contato>(); 
	}
	
	@Override
	public void adicionarContato(String nome, String tel) {
		this.contatos.add(new Contato(nome,tel));
		
	}

	@Override
	public void removeContato(String nome) throws ContatoInexistenteException {
		boolean achou = false;
		for(Contato c : this.contatos){
			if(c.getNome().equals(nome)){
				this.contatos.remove(c);
				achou = true;
				break;
			}
		}
		if(achou == false){
			throw new ContatoInexistenteException("O contato não existe: "+ nome);
		}
	}

	@Override
	public Contato pesquisaContato(String nome) throws ContatoInexistenteException {
		for(Contato c : this.contatos){
			if(c.getNome().equals(nome)){
				return c;
			}
		}

		throw new ContatoInexistenteException("O contato não existe: "+ nome);

	}
	
}
