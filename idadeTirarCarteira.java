package fabio.com.exercicios;

public class idadeTirarCarteira {

	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel Verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel False: " + variavelFalsa);
		
		
		System.out.println(" -------------------------------- ");
		
		Integer idade = 21;
		
		Boolean podeTirarCarteira = idade >= 18;
		if (podeTirarCarteira) {
			System.out.println(" Sim ! Ele(a) pode tirar carteira.");
		}else {
				System.out.println(" Não ! Ele(a) não pode tirar carteira.");
				
			}
		}

	}


