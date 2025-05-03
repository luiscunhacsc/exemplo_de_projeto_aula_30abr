/**
 * Classe que representa um paciente, herda de Pessoa.
 * Demonstra herança e encapsulamento.
 */
public class Paciente extends Pessoa {
    private String historicoMedico;

    /**
     * Construtor do Paciente com parâmetros.
     * 
     * @param nome            Nome do paciente.
     * @param idade           Idade do paciente.
     * @param historicoMedico Histórico médico do paciente.
     */
    public Paciente(String nome, int idade, String historicoMedico) {
        super(nome, idade); // Chama construtor da superclasse
        this.historicoMedico = historicoMedico;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    @Override
    public String getDescricao() {
        return "Paciente: " + getNome() + ", Idade: " + getIdade() + ", Histórico: " + historicoMedico;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getIdade() + " anos)";
    }

}
