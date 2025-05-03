

public class Arranque {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.adicionarMedico(new Medico("Dr. João", 45, "Cardiologia"));
        hospital.adicionarMedico(new Medico("Dra. Maria", 38, "Pediatria"));

        javax.swing.SwingUtilities.invokeLater(() -> new HospitalGUI(hospital).setVisible(true));
    }
}