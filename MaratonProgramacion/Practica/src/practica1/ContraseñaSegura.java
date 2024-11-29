package practica1;

import java.util.Scanner;

public class ContraseñaSegura {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int longitud;
		String cadena;
		
		System.out.println("Digite la longitud de la contraseña");
		longitud = numero.nextInt();
		
		numero.nextLine();
		
		System.out.println("Digite la contraseña");
		cadena = numero.nextLine();
		
		String cEspecial= "^!@#$%&*()-+";
		
		boolean digito = false;
		boolean mayuscula = false;
		boolean minuscula = false;
		boolean simbolo = false;
		
		for (char contrasena : cadena.toCharArray()) {
			if (Character.isDigit(contrasena)) {
				digito = true;
			} else {
				if (Character.isLowerCase(contrasena)) {
					minuscula = true;
				} else {
					if (Character.isUpperCase(contrasena)) {
						mayuscula = true;
					} else {
						if (cEspecial.contains(String.valueOf(contrasena))) {
							simbolo = true;
						}
						
					}

				}
			}
						
		}
		
		int faltantes = 0;
		if (!digito) { faltantes++;}
		if (!minuscula) { faltantes++;}		
		if (!mayuscula) { faltantes++;}
		if (!simbolo) { faltantes++;}
		
		
		int longitudFaltante = Math.max(0, 6 - longitud); // Calcular el resultado final
		int resultado = Math.max(faltantes, longitudFaltante); 
		System.out.println(resultado);
		
	}

}
