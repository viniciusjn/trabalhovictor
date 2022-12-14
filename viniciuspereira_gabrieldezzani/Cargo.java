import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private String nome;
    private List<Funcionario> funcionarios;

    public Cargo(String nome) {
        this.nome = nome;
        funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
