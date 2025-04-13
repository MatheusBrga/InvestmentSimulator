public class Investidor {
    private String nome;
    private String cpf;
    private double saldo;

    public Investidor(String nome, String cpf, double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public Investidor(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirDados(){
        System.out.println("=== DADOS DO INVESTIDOR ===\n");
        System.out.println("Nome do investidor: " + nome);
        System.out.println("CPF do investidor: " + cpf);
        System.out.println("Saldo do investidor: " + saldo);
    }

    public void adicionarSaldo(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Valor adicionado!");
        } else {
            System.out.println("Impossível adicionar valores menores que 0");
        }
    }
}
