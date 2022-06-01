
public class Poupanca extends Contas {

	public Poupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato da Conta Poupanca ===");
		super.imprimirInfosComuns();
	}
}
