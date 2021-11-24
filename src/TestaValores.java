
public class TestaValores {
	
	public static void main(String[] args) {
		int total = 0;
		Conta conta = new Conta(3377, 252733);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1234);
		
		Conta conta2 = new Conta(3377, 102030);
		Conta conta3 = new Conta(1314, 171819);
		
		System.out.println(Conta.getTotal());
		
		
	}

}
