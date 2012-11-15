

	public class Main{


	public static void main(String[] args) {

		Agenda agenda = new Agenda();
		agenda.adicionarContato("Andre", "909090");

		try {
			agenda.pesquisaContato("909090");
		} catch (ContatoInexistenteException e) {
			System.err.println("O contato deveria existir");
		}
		try {
			agenda.removeContato("Andre");
		} catch (ContatoInexistenteException e) {
			System.err.println(e.getMessage());
		}
		try {
			agenda.removeContato("LOLA");
		} catch (ContatoInexistenteException e) {
			System.err.println(e.getMessage());
		}
	}

}