import java.util.Scanner;

 class Modularizacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarteiraDigital carteira = new CarteiraDigital();
        int opcao;

        do {
            opcao = menu();
            lerEntradaUsuario(opcao, carteira, scanner);
        } while (opcao != 4);

        scanner.close();
    }

    private static int menu() {
        System.out.println("Menu:");
        System.out.println("1) Adicionar Saldo");
        System.out.println("2) Realizar Pagamento");
        System.out.println("3) Verificar Saldo");
        System.out.println("4) Sair");
        System.out.print("Escolha uma opção: ");
        return new Scanner(System.in).nextInt();
    }

    private static void lerEntradaUsuario(int opcao, CarteiraDigital carteira, Scanner scanner) {
        switch (opcao) {
            case 1:
                System.out.print("Digite o valor a ser adicionado: ");
                double valorAdicionar = scanner.nextDouble();
                carteira.adicionarSaldo(valorAdicionar);
                break;
            case 2:
                System.out.print("Digite o valor a ser pago: ");
                double valorPagamento = scanner.nextDouble();
                carteira.realizarPagamento(valorPagamento);
                break;
            case 3:
                System.out.println("Saldo atual: R$" + carteira.verificarSaldo());
                break;
            case 4:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}



