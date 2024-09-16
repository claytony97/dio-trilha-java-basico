import java.util.Scanner;
import java.util.Locale;

public class Treino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Digite idade ");
        int idade = sc.nextInt();
        System.out.println("Idade é " + idade);


        sc.close();
       
    }
}
