public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "LINGAUGEM " + "JAVA"; //concatenação Aula 2
        //System.out.println(nomeCompleto);

// Para objetos precisa utilizar o "equals"
String nomeUm = "CLAYTONY";
String nomeDois = new String("CLAYTONY");

System.out.println(nomeUm.equals(nomeDois));
//_____________________________________________________________________________________________________

//Para comparar numeros "operadores relacionas"ex: ==,!=
int numero1 = 3;
int numero2 = 2;

boolean simNao = numero1 != numero2;

if (numero1 > numero2) {
    System.out.println("O primeiro número é maior");
    
} else {
    System.out.println("O Segundo numero é maior");
}

//System.out.println("numero é didferete de numeroDois ? " + simNao);


int numero = 5;
//numero = numero + 2;
numero++;
System.out.println(numero);
      
    }
}
