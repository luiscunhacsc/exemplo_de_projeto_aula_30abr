/**
 * Classe que gerencia o hospital, usando coleções.
 * Demonstra composição e uso de List.
 */
class Hospital {
    private java.util.List<Paciente> pacientes = new java.util.ArrayList<>();
    private java.util.List<Medico> medicos = new java.util.ArrayList<>();
    private java.util.List<Consulta> consultas = new java.util.ArrayList<>();

    public void adicionarPaciente(Paciente p) { pacientes.add(p); }
    public void adicionarMedico(Medico m) { medicos.add(m); }

    /**
     * Adiciona uma consulta, verificando conflitos de data.
     * @param consulta Consulta a ser adicionada.
     * @throws DataOcupadaException Se a data estiver ocupada.
     */
    public void adicionarConsulta(Consulta consulta) throws DataOcupadaException {
        for (Consulta c : consultas) {
            if (c.getData().equals(consulta.getData())) {
                throw new DataOcupadaException("Data " + consulta.getData() + " já ocupada!");
            }
        }
        consultas.add(consulta);
    }

    public java.util.List<Paciente> getPacientes() { return pacientes; }
    public java.util.List<Medico> getMedicos() { return medicos; }
    public java.util.List<Consulta> getConsultas() { return consultas; }
}