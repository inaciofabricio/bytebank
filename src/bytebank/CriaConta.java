package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.saldo = 200;
		
		System.out.println(conta1.saldo);
		
		conta1.saldo += 100; 
		
		System.out.println(conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.saldo = 50;
		
		System.out.println("Primeira conta tem: " + conta1.saldo);
		System.out.println("Segunda conta tem: " + conta2.saldo);
		
		if(conta1 == conta2) {
			System.out.println("São a mesma conta.");
		}else {
			System.out.println("São contas diferentes.");
		}
		
		System.out.println(conta1);
		System.out.println(conta2);
		
	}

}
