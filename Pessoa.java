/**
 * Classe abstrata que representa uma pessoa no sistema hospitalar.
 * Serve como base para Paciente e Médico, demonstrando herança e classes abstratas.
 */
public abstract class Pessoa {
    private String nome;  // Encapsulamento com atributo privado
    private int idade;

    /**
     * Construtor da classe Pessoa.
     * @param nome Nome da pessoa.
     * @param idade Idade da pessoa.
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;  // Uso de 'this' para diferenciar atributo de parâmetro
        this.idade = idade;
    }

    // Getters e setters para encapsulamento
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    /**
     * Método abstrato para polimorfismo, implementado pelas subclasses.
     * @return Descrição específica da pessoa.
     */
    public abstract String getDescricao();
}





