import java.util.Scanner;

public class App {
    public static void main(String[] args) {
// Neste exemplo estamos criando uma estrutura de seleção múltipla, podendo escolher
// entre as opções 1, 2 e 3.
// Caso seja escolhido qualquer coisa que não seja alguma dessas opções, iré retornar
// a seguinte mensagem: Selecione alguma opção entre 1 até 3:

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma opção:");
    System.out.println("|1|2|3|");
    int opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Opção 1 selecionada!");
            break;
    
        case 2:
            System.out.println("Opção 2 selecionada!");
            break;

        case 3:
            System.out.println("Opção 3 selecionada!");
            break;
            
        default:
            System.out.println("Selecione alguma opção entre 1 até 3:");
            break;
        }
    }
}