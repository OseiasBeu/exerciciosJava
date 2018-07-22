package Conta;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double salario;
	
	
	
/*	double saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		return this.saldo = novoSaldo;
	}
	
	*/
	
	double  deposita(double quantidade) {
		return this.saldo += quantidade;		
	}
	
	
	boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else{
			this.saldo = this.saldo -valor;
			return true;
		}		
	}
	
	
	
}
