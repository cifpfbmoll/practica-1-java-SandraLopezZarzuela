package proyecto1;

import java.util.Scanner;

public class Proyecto1 {
    static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);  //creamos objeto scanner para que lea valores por pantalla
		boolean salir = false; 		//inicializamos variable a false para poder seguir mientras no cambie a true
		int opcion;
		
		while(!salir) {  //usamos variable mientras sea true
			
			System.out.println("1.Leer 5 numeros");
			System.out.println("2.Leer 5 numeros y mostrarlos en inverso");
			System.out.println("3.Leer 5 numero y realizar la media de los positivos, la media de los negativos y el numero de 0s");
			System.out.println("4.Leer el texto introducido y devolver la cantidad de caracteres que tiene ");
			System.out.println("5.Leer el texto introducido y devolver el texto invertido");
			System.out.println("6.Leer el texto y suprime los espacios");
			System.out.println("7.Introduce dos cadenas y las devuelva concatenadas");
			System.out.println("8.Introduce una cadena y una vocal y sustituya todas las vocales por la vocal introducida");
			System.out.println("9.Introduce una cadena y lo devuelva como codido ASCII");
			System.out.println("10. salir");
			
			System.out.println("Escoge la opcion que quieras ");
			System.out.println("");
			opcion= entrada.nextInt();
		
		switch (opcion) {
			case 1:
				leerNumeros();
				break;
			case 2: 
				InvertirNumeros();
				break;
			case 3: 
				mediaNumeros();
				break;
			case 4:
				contarCaracteres();
				break;
			case 5:
				invertirTexto();
				break;
			case 6:
				suprimeEspacios();
				break;
			case 7: 
				juntarCadenas();
				break;
				
			case 8:
				sustituirVocal();
				break;
			case 9:
				cambiarTextoAscii();
				break;
			case 10:
				salir = true;
				break;
                    }		
		}
	}
	
	public static void  leerNumeros() {
		int arrayNumeros[] = new int[5];
		for ( int i=0; i<arrayNumeros.length ; i++){
			System.out.println("Introduce el "+ (i+1) + " numero: ");
			int numero = sc.nextInt();
			arrayNumeros[i] = numero;
		}
		for (int i=0; i< arrayNumeros.length; i ++) {
			System.out.print(" "+arrayNumeros[i]);
		}
		System.out.println("");
	}
	
	public static void InvertirNumeros() {
		int arrayNumInv[] = new int[5];
		for ( int i=0; i<arrayNumInv.length ; i++){
			System.out.println("Introduce el "+ (i+1) + " numero: ");
			int numero = sc.nextInt();
			arrayNumInv[i] = numero;
		}
		for (int i=arrayNumInv.length; i>0; i--) {
			System.out.print(" "+ arrayNumInv[(i-1)]);
		}
		System.out.println("");
		
	}
	public static void mediaNumeros() {
		int arrayMedia[]= new int [5];
		int arrayMediaPos[] = new int[5];
		int arrayMediaNeg[] = new int[5];
		int contadorPos=0;
		int contadorNeg=0;
		int contador = 0;
		for ( int i=0; i<arrayMedia.length ; i++){
			System.out.println("Introduce un numero: ");
			int numero = sc.nextInt();
			if (numero > 0) {
				arrayMediaPos[i]= numero;
				contadorPos++;
			} 
			else if (numero < 0) {
				arrayMediaNeg[i] = numero;
				contadorNeg++;
			}
			else if (numero==0) {
				contador ++;
			}
		}
		if (contadorPos >0) {
			int mediaPos=0;
			for (int i=0 ; i<arrayMediaPos.length; i++ ) {
				mediaPos =mediaPos + arrayMediaPos[i]; 
			}System.out.println("La media de los numeros es: " + (mediaPos/contadorPos));
		}
		if (contadorNeg > 0) {
			int mediaNeg=0;
			for (int i=0 ; i<arrayMediaNeg.length; i++ ) {
				mediaNeg =mediaNeg + arrayMediaNeg[i]; 
			}
			System.out.println("La media de los numeros negativos es: " + (mediaNeg/contadorNeg));
		}
		System.out.println("La cantidad de ceros es: " + contador );
	}
	public static void contarCaracteres() {
		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();
		System.out.println("La cantidad de caracteres son " + texto.length());		
	}
	public static void invertirTexto() {
		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();
		String inversa = new String();
		for (int i= texto.length()-1; i>=0; i--) {
			inversa = inversa + texto.charAt(i);
		}
		System.out.println("La cadena invertida es: "+ inversa);
	}
	public static void suprimeEspacios() {
		System.out.println("Introduce un texto: ");
		String texto = sc.nextLine();
		String cadenaJunta = new String();
		cadenaJunta = texto.replace(" ", "");
		System.out.println("El texto sin espacios es: " + cadenaJunta);
	}
	public static void juntarCadenas(){
		System.out.println("Introduce el primer texto: ");
		String texto1 = sc.nextLine();
		System.out.println("Introduce el segundo texto: ");
		String texto2 = sc.nextLine();
		String junto = texto1.concat(texto2);
		System.out.println("Texto junto: " + junto);
	}
	public static void sustituirVocal() {
		System.out.println("Introduce el texto: ");
		String textoVocal = sc.nextLine();
		System.out.println("Introduce una vocal: ");
		String Vocal = sc.nextLine();
		String textoCambiado = textoVocal.replace("a",Vocal).replace("e",Vocal).replace("i",Vocal).replace("o",Vocal).replace("e", "1").replace("u",Vocal);
		System.out.println("Resultado: " + textoCambiado);
	}
	public static void cambiarTextoAscii() {
		System.out.println("Introduce un texto: ");
		String textoAscii = sc.nextLine();
		for (int i=0; i<=textoAscii.length()-1; i++){
		  System.out.print(" "+ textoAscii.codePointAt(i));
		}
	}
}
