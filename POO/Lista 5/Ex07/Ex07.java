import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ModeloComputador computador = new ModeloComputador();
        int resposta;
        do {
            System.out.println("Comprar placa-mãe?");
            System.out.println("1 - Placa-mãe básica\n2 - Não");
            resposta = sc.nextInt();
            switch(resposta) {
                case 1:
                    computador.setPlacaMae(800);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            if(resposta < 1 || resposta > 2) {
                System.out.println("Opção inválida!");
            }
        } while(resposta < 1 || resposta > 2);

        do {
            System.out.println("Comprar processador?");
            System.out.println("1 - 1600Mhz\n2 - 1800Mhz\n3 - 1900Mhz\n4 - Não");
            resposta = sc.nextInt();
            switch(resposta) {
                case 1:
                    computador.setProcessador(700);
                    break;
                case 2:
                    computador.setProcessador(830);
                    break;
                case 3:
                    computador.setProcessador(910);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(resposta < 1 || resposta > 4);

        do {
            System.out.println("Comprar memória RAM?");
            System.out.println("1 - 1GB\n2 - 2GB\n3 - 4GB\n4 - 6GB\n5 - 8GB\n6 - Não");
            resposta = sc.nextInt();
            switch(resposta) {
                case 1:
                    computador.setRam(1 * 350);
                    break;
                case 2:
                    computador.setRam(2 * 350);
                    break;
                case 3:
                    computador.setRam(4 * 350);
                    break;
                case 4:
                    computador.setRam(6 * 450);
                    break;
                case 5:
                    computador.setRam(8 * 350);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(resposta < 1 || resposta > 6);

        do {
            System.out.println("Comprar Disco Rígido?");
            System.out.println("1 - 500GB\n2 - 1TB\n3 - 2TB\n4 - Não");
            resposta = sc.nextInt();
            switch(resposta) {
                case 1:
                    computador.setHd(300);
                    break;
                case 2:
                    computador.setHd(420);
                    break;
                case 3:
                    computador.setHd(500);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(resposta < 1 || resposta > 4);

        do {
            System.out.println("Comprar monitor?");
            System.out.println("1 - 15 polegadas\n2 - 17 polegadas\n3 - Não");
            resposta = sc.nextInt();
            switch(resposta) {
                case 1:
                    computador.setMonitor(320);
                    break;
                case 2:
                    computador.setMonitor(520);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(resposta < 1 || resposta > 3);
        sc.close();

        System.out.printf("Total: R$ %.2f\n", computador.calcularPreco());
    }

}
