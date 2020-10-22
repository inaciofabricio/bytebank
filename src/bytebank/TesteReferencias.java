package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 300;
		System.out.println("Saldo da primeira conta: " + conta1.saldo);
		
		Conta conta2 = conta1;
		
		System.out.println("Saldo da Segunda conta: " + conta2.saldo);
		
		conta2.saldo += 100;

		System.out.println("Saldo da Segunda conta: " + conta2.saldo);
		System.out.println("Saldo da Segunda conta: " + conta2.saldo);
		
		if(conta1 == conta2) {
			System.out.println("São a mesma conta.");
		}
		
		System.out.println(conta1);
		System.out.println(conta2);
		
	}

}
