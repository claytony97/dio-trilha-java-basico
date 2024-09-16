import java.util.Scanner;
import java.util.Locale;
import javax.swing.JOptionPane;
public class ContaTerminal {
    public static void main(String[] args) {

          //TODO: Conhecer e importar a classe Scanner 
          Scanner sc = new Scanner(System.in).useLocale(Locale.US);
          //Exibir as mensagens para o nosso usuario 
             String titular;
             int numeroConta;
             double saldo; 
  
             System.out.println("Digite o titular");
             titular = sc.nextLine();
             System.out.println("Digite o numeroConta");
             numeroConta = sc.nextInt();  
             System.out.println("Digite o saldo");
             saldo = sc.nextDouble();
           
             
          //Obter pela scanner os valores digitados no terminal 
          System.out.println("Titular: " + titular);
          System.out.println("Número da Conta: " + numeroConta);
          System.out.println("Saldo Inicial: R$ " + saldo);
          JOptionPane.showMessageDialog(null, "Conta Criada");
          // Exibir a mensagem conta criada 
  
  
          sc.close();
        
    }
    
}
