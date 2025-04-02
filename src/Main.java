import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Controle do Carro:");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: carro.ligar(); break;
                case 2: carro.desligar(); break;
                case 3: carro.acelerar(); break;
                case 4: carro.diminuirVelocidade(); break;
                case 5: carro.virar("esquerda"); break;
                case 6: carro.virar("direita"); break;
                case 7: carro.verificarVelocidade(); break;
                case 8:
                    System.out.print("Informe a nova marcha (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;
                case 9: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 9);

        scanner.close();
    }
}

