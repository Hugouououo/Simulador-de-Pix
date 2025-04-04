import java.util.Scanner;

public class ContaBancaria {

    // Declaraçao da variavel saldo
    static double saldo = 0;

    public static void main(String[] args){
        // Opcoes e input do usuario
        Scanner input = new Scanner(System.in);
        System.out.print("""
                URUBU DO PIX
                1 - Receber 100 reais
                2 - Doar 100 reais
                3 - Ver seu saldo
                4 - Zerar seu saldo
                0 - Finalizar Programa
                ----------------------------
                Digite a sua opçao desejada: """);
        int opcao = input.nextInt();

        // reconhecendo opcao, repetindo até 0
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    receber();
                    break;
                case 2:
                    doar();
                    break;
                case 3:
                    verSaldo();
                    break;
                case 4:
                    zerarSaldo();
                    break;
            }
            System.out.print("""
                    ----------------------------
                    Digite outra opçao desejada: """);
            opcao = input.nextInt();
        }
    }

    public static void receber(){
        saldo += 100;
        System.out.println("R$100 foram adicionados à sua conta.");
    }

    public static void doar(){
        saldo -= 100;
        System.out.println("R$100 foram retirados da sua conta.");
    }

    public static void verSaldo(){
        if (saldo >= 0) System.out.printf("Você possui R$%.2f em sua conta. \n", saldo);
        else System.out.printf("Sua conta está negativa, você deve R$%.2f. \n", saldo * -1);
    }

    public static void zerarSaldo(){
        saldo = 0;
        System.out.println("Seu saldo foi zerado.");
    }
}
