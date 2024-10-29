import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CarteiraDigital {
    public double saldo;
    public List<String> historico;

    public CarteiraDigital() {
        saldo = 0.0;
        historico = new ArrayList<>();
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add("Adicionado: R$" + valor);
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historico.add("Pagamento: R$" + valor);
        }
    }

    public double verificarSaldo() {
        return saldo;
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarteiraDigital carteira = new CarteiraDigital();
        int opcao;

        do {
            System.out.println("Menu: 1) Adicionar Saldo, 2) Realizar Pagamento, 3) Verificar Saldo, 4) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Valor a adicionar: ");
                carteira.adicionarSaldo(scanner.nextDouble());
            } else if (opcao == 2) {
                System.out.print("Valor a pagar: ");
                carteira.realizarPagamento(scanner.nextDouble());
            } else if (opcao == 3) {
                System.out.println("Saldo: R$" + carteira.verificarSaldo());
            }
        } while (opcao != 4);

        scanner.close();
    }
}
