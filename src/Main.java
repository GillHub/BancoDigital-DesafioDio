
public class Main {
	public static void main(String[] args) {
		Cliente Joe = new Cliente();
		Joe.setNome("Joe");
		
		Contas ContaCorrente = new ContaCorrente(Joe);
		Contas poupanca = new Poupanca(Joe);

		ContaCorrente.depositar(1000);
		ContaCorrente.transferir(200, poupanca);
		
		ContaCorrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}


