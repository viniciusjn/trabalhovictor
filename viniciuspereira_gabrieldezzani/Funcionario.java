import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa implements IUsuario {
    private Double salario;
    private List<Cargo> cargos;

    public List<Cargo> getCargos() {
        return cargos;
    }

    public Funcionario(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.salario = salario;
        this.cargos = new ArrayList<>();
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean authenticar() {
        // TODO Auto-generated method stub
        return false;
    }

    public void addCargo(Cargo cargo) {
        cargos.add(cargo);
        cargo.addFuncionario(this);
    }

}
