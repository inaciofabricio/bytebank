package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		
		conta1.deposita(50);
		System.out.println("Saldo Atual Conta 1: " + conta1.saldo);
		
		boolean conseguiuSacar = conta1.saca(20);
		System.out.println("Saldo Atual Conta 1: " + conta1.saldo);
		System.out.println(conseguiuSacar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		System.out.println("Saldo Atual Conta 2: " + conta2.saldo);
		
		boolean transfere = conta2.transfere(300, conta1);
		System.out.println(transfere);
		System.out.println("Saldo Atual Conta 1: " + conta1.saldo);
		System.out.println("Saldo Atual Conta 2: " + conta2.saldo);
		
		
	}

}
