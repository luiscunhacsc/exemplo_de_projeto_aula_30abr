# 🏥 Projeto Java – Sistema de Gestão Hospitalar

Este projeto implementa um sistema de gestão hospitalar em Java, com interface gráfica baseada em Swing. É um exemplo completo e pedagógico de aplicação dos princípios da Programação Orientada por Objetos (POO), seguindo rigorosamente os critérios definidos no documento **“Checklist para Projeto - POO 2024-2025”**.

---

## ✅ Como o projeto cumpre os critérios de avaliação

### 1. **Classes e Objetos**
- O projeto modela entidades reais: `Pessoa`, `Paciente`, `Medico`, `Consulta`, `Hospital`.
- Cada classe representa uma entidade coesa com atributos e comportamentos adequados.

### 2. **Encapsulamento**
- Todos os atributos são `private` e o acesso é feito por getters e setters (`getNome()`, `setIdade()`, etc.).
- Isto garante proteção do estado interno dos objetos.

### 3. **Construtores**
- Uso sistemático de construtores com parâmetros em todas as classes principais.
- A palavra-chave `this` é usada para distinguir atributos de parâmetros (`this.nome = nome`).

### 4. **Herança**
- As classes `Paciente` e `Medico` herdam de `Pessoa`, usando a palavra-chave `extends`.
- A herança é usada com sentido (relação "é-um").

### 5. **Polimorfismo**
- A classe abstrata `Pessoa` define um método abstrato `getDescricao()` implementado de forma diferente por `Paciente` e `Medico`.
- A interface `Agendavel` é implementada por `Consulta`, permitindo tratar objetos agendáveis de forma genérica.

### 6. **Composição**
- A classe `Consulta` contém referências a objetos `Medico` e `Paciente`, evidenciando uma relação "tem-um".
- A classe `Hospital` agrega listas de `Consulta`, `Medico` e `Paciente`.

### 7. **Interfaces**
- A interface `Agendavel` define os métodos `agendar()` e `cancelar()`, sendo implementada pela classe `Consulta`.
- Este uso reforça o polimorfismo e a separação entre contrato e implementação.

### 8. **Classes Abstratas**
- `Pessoa` é uma classe abstrata que serve de base comum para `Paciente` e `Medico`.
- Define comportamento partilhado e obriga as subclasses a implementar `getDescricao()`.

### 9. **Coleções e Estruturas de Dados**
- A classe `Hospital` usa `ArrayList` para armazenar listas de médicos, pacientes e consultas.
- Usa-se `forEach` para povoar caixas de seleção na GUI.

### 10. **Tratamento de Exceções**
- A classe `DataOcupadaException` é uma exceção personalizada, usada quando se tenta agendar uma consulta numa data já ocupada.
- O código trata estas exceções com mensagens claras para o utilizador (`JOptionPane.showMessageDialog`).

### 11. **Interface Gráfica (Swing) – Opcional**
- A classe `HospitalGUI` implementa uma interface gráfica completa com menus, caixas de texto, `JComboBox`, botões e eventos.
- A GUI interage diretamente com os objetos da lógica de negócio, respeitando o modelo de objetos.

---

## 📁 Estrutura dos ficheiros

| Ficheiro              | Descrição |
|-----------------------|-----------|
| `Pessoa.java`         | Classe abstrata base para `Paciente` e `Medico`. |
| `Paciente.java`       | Subclasse de `Pessoa`, com histórico médico. |
| `Medico.java`         | Subclasse de `Pessoa`, com especialidade médica. |
| `Agendavel.java`      | Interface para objetos que podem ser agendados. |
| `Consulta.java`       | Representa uma consulta entre paciente e médico. |
| `DataOcupadaException.java` | Exceção personalizada para conflitos de datas. |
| `Hospital.java`       | Classe principal que gere as coleções de entidades. |
| `HospitalGUI.java`    | Interface gráfica Swing do sistema. |
| `Arranque.java`       | Classe com o método `main()` que inicia a aplicação. |

---

## 🧠 Comentários e JavaDoc

- Todas as classes possuem comentários introdutórios e JavaDoc explicando o propósito dos atributos e métodos.
- Partes críticas do código são comentadas com explicações adicionais para facilitar a leitura.

---

## ✨ Conclusão

Este projeto não só aplica de forma rigorosa todos os conceitos essenciais da Programação Orientada por Objetos, como também oferece uma interface gráfica intuitiva, tratamento robusto de erros e uma estrutura modular e extensível. Está totalmente alinhado com o espírito pedagógico do documento de avaliação e demonstra maturidade no uso de boas práticas em Java.

---

© 2025 – Luís Simões da Cunha  
Trabalho académico – Projeto de Programação Orientada por Objetos (POO)
