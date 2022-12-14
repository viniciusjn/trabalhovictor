import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private String numero;
    protected List<Debito> debitos;
    protected List<Credito> creditos;


    public Conta(String numero) {
        this.numero = numero;
        debitos = new ArrayList<>();
        creditos = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void depositar(Double _valor) {
        if(_valor < 0) {
            System.out.println("Valor precisa ser positivo");
            return;
        } 
        Credito credito = new Credito(_valor);
        creditos.add(credito);
    }

    public void sacar(Double _valor) {
        if(_valor < 0) {
            System.out.println("Valor precisa ser positivo");
            return;
        } 
        double localValue = 0.f;
        for(Credito credito : creditos) {
            localValue += credito.getValor();
        }
        for(Debito debito : debitos) {
            localValue -= debito.getValor();
        }
        if(localValue >= _valor) {
            Debito debito = new Debito(_valor);
            debitos.add(debito);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public Double calcularSaldo() {
        return 0.0;
    }
}
