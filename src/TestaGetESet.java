
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(3377, 2527);
		
		System.out.println(conta.getNumero());
		
		Cliente diego = new Cliente();
		//conta.titular = diego;
		diego.setNome("Diego Barcellos");
		
		conta.setTitular(diego);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		// Em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(diego);
		System.out.println(conta.getTitular());
	}
	
	
}
