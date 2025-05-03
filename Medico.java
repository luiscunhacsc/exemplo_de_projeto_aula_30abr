/**
 * Classe que representa um médico, herda de Pessoa.
 * Demonstra herança e encapsulamento.
 */
public class Medico extends Pessoa {
    private String especialidade;

    /**
     * Construtor do Médico.
     * 
     * @param nome          Nome do médico.
     * @param idade         Idade do médico.
     * @param especialidade Especialidade do médico.
     */
    public Medico(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String getDescricao() {
        return "Médico: " + getNome() + ", Especialidade: " + especialidade;
    }

    @Override
    public String toString() {
        return getNome() + " (" + getEspecialidade() + ")";
    }

}
