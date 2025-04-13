public class Investimento {
    private String tipo;
    private double valorInvestido;
    private double taxaRendimento;
    private int tempo;
    private Investidor investidor;

    public Investimento(String tipo, double valorInvestido, double taxaRendimento, int tempo, Investidor investidor){
        this.tipo = tipo;
        this.valorInvestido = valorInvestido;
        this.taxaRendimento = taxaRendimento;
        this.tempo = tempo;
        this.investidor = investidor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getTempo() {
        return tempo;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void simularRendimento(double valorInvestido, double taxaRendimento, int tempo){
        double valorFinal = valorInvestido * Math.pow((1 + taxaRendimento), tempo);
        double rendimento = valorFinal - valorInvestido;
        System.out.println("===== SIMULAÇÃO DE RENDIMENTO =====");
        System.out.printf("Investidor: %s\n", investidor.getNome());
        System.out.printf("Valor investido: R$ %.2f\n", valorInvestido);
        System.out.printf("Taxa de rendimento: %.2f%% ao período\n", taxaRendimento * 100);
        System.out.printf("Tempo: %d períodos\n", tempo);
        System.out.printf("Rendimento total: R$ %.2f\n", rendimento);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);
    }

    public void exibirResumo(){
        System.out.println("=== INFORMAÇÕES DO INVESTIMENTO ===");
        System.out.println("Investidor: " + investidor.getNome());
        System.out.println("Tipo de investimento: " + tipo);
        System.out.printf("Valor investido: R$ %.2f\n", valorInvestido);
        System.out.printf("Taxa de rendimento: %.2f%% ao período\n", taxaRendimento * 100);
        System.out.println("Tempo do investimento: " + tempo + " períodos");

    }
}
