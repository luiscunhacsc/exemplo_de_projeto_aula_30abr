/**
 * Classe principal com interface gráfica usando Swing.
 * Integra todos os conceitos da POO com uma GUI.
 */
class HospitalGUI extends javax.swing.JFrame {

    private Hospital hospital;

    public HospitalGUI(Hospital hospital) {
        this.hospital = hospital; // usa o hospital já preenchido
        initUI();
    }
    
    private void initUI() {
        setTitle("Gestão Hospitalar");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.BorderLayout());

        // Menu
        javax.swing.JMenuBar menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu menu = new javax.swing.JMenu("Gestão");
        javax.swing.JMenuItem itemAdicionarPaciente = new javax.swing.JMenuItem("Adicionar Paciente");
        javax.swing.JMenuItem itemAdicionarConsulta = new javax.swing.JMenuItem("Adicionar Consulta");
        menu.add(itemAdicionarPaciente);
        menu.add(itemAdicionarConsulta);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Painel de saída
        javax.swing.JTextArea output = new javax.swing.JTextArea();
        add(new javax.swing.JScrollPane(output), java.awt.BorderLayout.CENTER);

        // Evento para adicionar paciente
        itemAdicionarPaciente.addActionListener(e -> {
            javax.swing.JDialog dialog = new javax.swing.JDialog(this, "Novo Paciente", true);
            dialog.setLayout(new java.awt.GridLayout(4, 2));
            javax.swing.JTextField nomeField = new javax.swing.JTextField();
            javax.swing.JTextField idadeField = new javax.swing.JTextField();
            javax.swing.JTextField historicoField = new javax.swing.JTextField();
            dialog.add(new javax.swing.JLabel("Nome:"));
            dialog.add(nomeField);
            dialog.add(new javax.swing.JLabel("Idade:"));
            dialog.add(idadeField);
            dialog.add(new javax.swing.JLabel("Histórico:"));
            dialog.add(historicoField);
            javax.swing.JButton salvar = new javax.swing.JButton("Salvar");
            dialog.add(salvar);
            salvar.addActionListener(ev -> {
                try {
                    Paciente p = new Paciente(nomeField.getText(), 
                        Integer.parseInt(idadeField.getText()), 
                        historicoField.getText());
                    hospital.adicionarPaciente(p);
                    output.append("Paciente adicionado: " + p.getDescricao() + "\n");
                    dialog.dispose();
                } catch (NumberFormatException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Idade inválida!");
                }
            });
            dialog.pack();
            dialog.setVisible(true);
        });

        // Evento para adicionar consulta
        itemAdicionarConsulta.addActionListener(e -> {
            javax.swing.JDialog dialog = new javax.swing.JDialog(this, "Nova Consulta", true);
            dialog.setLayout(new java.awt.GridLayout(4, 2));
            javax.swing.JTextField dataField = new javax.swing.JTextField("dd/MM/yyyy");
            javax.swing.JComboBox<Medico> medicoBox = new javax.swing.JComboBox<>();
            javax.swing.JComboBox<Paciente> pacienteBox = new javax.swing.JComboBox<>();
            hospital.getMedicos().forEach(medicoBox::addItem);
            hospital.getPacientes().forEach(pacienteBox::addItem);
            dialog.add(new javax.swing.JLabel("Data:"));
            dialog.add(dataField);
            dialog.add(new javax.swing.JLabel("Médico:"));
            dialog.add(medicoBox);
            dialog.add(new javax.swing.JLabel("Paciente:"));
            dialog.add(pacienteBox);
            javax.swing.JButton salvar = new javax.swing.JButton("Salvar");
            dialog.add(salvar);
            salvar.addActionListener(ev -> {
                try {
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                    Consulta c = new Consulta(sdf.parse(dataField.getText()), 
                        (Medico) medicoBox.getSelectedItem(), 
                        (Paciente) pacienteBox.getSelectedItem());
                    hospital.adicionarConsulta(c);
                    output.append("Consulta adicionada: " + c.getDescricao() + "\n");
                    dialog.dispose();
                } catch (DataOcupadaException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (Exception ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Erro na data!");
                }
            });
            dialog.pack();
            dialog.setVisible(true);
        });
    }
}