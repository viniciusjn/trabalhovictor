public class ContaCorrente extends Conta {
    private Double limit;

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public ContaCorrente(String numero, Double limit) {
        super(numero);
        this.limit = limit;
    }
    
    public void transferir(Conta contaDestino, Double valor) {
        double local = calcularSaldo();
        if(local >= valor) {
            contaDestino.depositar(valor);
            this.sacar(valor);
        }
    }

    public Double calcularSaldo() {
        double localValue = 0.f;
        for(Credito credito : creditos) {
            localValue += credito.getValor();
        }
        for(Debito debito : debitos) {
            localValue -= debito.getValor();
        }
        return localValue + limit;
    }
}
