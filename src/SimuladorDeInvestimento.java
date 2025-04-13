import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimuladorDeInvestimento {
    private Map<String ,Investidor> investidores;
    private ArrayList<Investimento> investimentos;

    public SimuladorDeInvestimento(){
        this.investidores = new HashMap<>();
        this.investimentos = new ArrayList<>();
    }

    public void cadastrarInvestidor(String nome,String cpf){
        if(!investidores.containsKey(cpf)){
            Investidor investidor = new Investidor(nome, cpf);
            investidores.put(cpf, investidor);
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("CPF já cadastrado no sistema!");
        }
    }

    public void realizarInvestimento(String cpf, String tipo, double valor, int meses){
        double taxa = 0;
        if(investidores.containsKey(cpf)){
            if(tipo.equalsIgnoreCase("Poupança")){
                taxa = 0.005;
            } else if(tipo.equalsIgnoreCase("CDB")){
                taxa = 0.01;
            } else if(tipo.equalsIgnoreCase("Ações")){
                taxa = 0.025;
            } else {
                System.out.println("Tipo de investimento inválido!");
                return;
            }

            Investidor investidor = investidores.get(cpf);

            Investimento investimento = new Investimento(tipo, valor, taxa, meses, investidor);
            investimentos.add(investimento);
            System.out.println("Investimento Realizado!");
            investimento.simularRendimento(valor, taxa, meses);
        } else {
            System.out.println("Investidor não encontrado. Verifique o CPF!");
        }
    }

    public void listarInvestimentosPorCPF(String cpf){
        if(investidores.containsKey(cpf)){
            boolean encontrou = false;
            for(Investimento investimento: investimentos){
                if(investimento.getInvestidor().getCpf().equals(cpf)){
                    investimento.exibirResumo();
                    encontrou = true;
                }
            }

            if(!encontrou){
                System.out.println("Esse investidor não fez nenhum investimento!");
            }
        } else {
            System.out.println("CPF não encontrado no sistema!");
        }
    }
}
