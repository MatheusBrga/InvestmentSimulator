import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimuladorDeInvestimento simuladorDeInvestimento = new SimuladorDeInvestimento();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System .out.println("===== SIMULADOR DE INVESTIMENTOS =====\n");

        do {
            System.out.println("1. Cadastrar Investidor");
            System.out.println("2. Realizar Investimento");
            System.out.println("3. Listar Investimentos por CPF");
            System.out.println("4. Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite seu nome: ");
                    String nomeCadastro = scanner.nextLine();
                    System.out.print("Digite seu CPF: ");
                    String cpfCadastro = scanner.nextLine();
                    simuladorDeInvestimento.cadastrarInvestidor(nomeCadastro, cpfCadastro);
                    System.out.println("\n-------------------------------------");
                    break;

                case 2:
                    System.out.print("Digite o CPF do investidor: ");
                    String cpfInvestimento = scanner.nextLine();
                    System.out.print("Tipo de investimento (Poupança / CDB / Ações): ");
                    String tipoInvestimento = scanner.nextLine();
                    System.out.print("Valor do investimento: ");
                    double valorInvestimento = scanner.nextDouble();
                    System.out.print("Tempo do Investimento em meses: ");
                    int tempoInvestimento = scanner.nextInt();
                    simuladorDeInvestimento.realizarInvestimento(cpfInvestimento, tipoInvestimento, valorInvestimento, tempoInvestimento);
                    System.out.println("\n-------------------------------------");
                    break;

                case 3:
                    System.out.print("Informe seu CPF: ");
                    String cpfInvestimentos = scanner.nextLine();
                    simuladorDeInvestimento.listarInvestimentosPorCPF(cpfInvestimentos);
                    System.out.println("\n-------------------------------------");
                    break;

                case 4:
                    System.out.println("Saindo do Sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        } while (opcao != 4);

        scanner.close();
    }
}