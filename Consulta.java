/**
 * Classe que representa uma consulta, implementa Agendavel.
 * Usa composição com Medico e Paciente.
 */
public class Consulta implements Agendavel {
    private java.util.Date data;
    private Medico medico;    // Composição: Consulta "tem-um" Médico
    private Paciente paciente;// Composição: Consulta "tem-um" Paciente
    private boolean agendada;

    /**
     * Construtor da Consulta.
     * @param data Data da consulta.
     * @param medico Médico responsável.
     * @param paciente Paciente atendido.
     */
    public Consulta(java.util.Date data, Medico medico, Paciente paciente) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.agendada = false;
    }

    // Getters e setters
    public java.util.Date getData() { return data; }
    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }

    @Override
    public void agendar(java.util.Date data) {
        this.data = data;
        this.agendada = true;
    }

    @Override
    public void cancelar() {
        this.agendada = false;
    }

    public String getDescricao() {
        return "Consulta em " + data + " com " + medico.getNome() + " para " + paciente.getNome();
    }
}
