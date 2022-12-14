import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa implements IUsuario {
    private Boolean vip;
    private List<Conta> contas;
    
    
    public List<Conta> getContas() {
        return contas;
    }

    public Boolean getVip() {
        return vip;
    }

    private List<Endereco> enderecos;


    public Cliente(String cpf, String nome, String telefone, Boolean vip) {
        super(cpf, nome, telefone);
        this.vip = vip;
        this.enderecos = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void addEndereco(Endereco _end) {
        enderecos.add(_end);
    }

    public void listarEnderecos() {
        for(Endereco endereco : enderecos) {
            endereco.imprimir();
        }
    }

    @Override
    public boolean authenticar() {
        // TODO Auto-generated method stub
        return false;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }
}
