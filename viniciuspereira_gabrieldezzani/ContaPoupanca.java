public class ContaPoupanca extends Conta {

    private Double rentabilidadeMensal;

    public Double getRentabilidadeMensal() {
        return rentabilidadeMensal;
    }

    public void setRentabilidadeMensal(Double rentabilidadeMensal) {
        this.rentabilidadeMensal = rentabilidadeMensal;
    }

    public ContaPoupanca(String numero, Double rent) {
        super(numero);
        setRentabilidadeMensal(rent);
    }
    
    public Double calcularSaldo() {
        double localValue = 0.f;
        for(Credito credito : creditos) {
            localValue += credito.getValor();
        }
        for(Debito debito : debitos) {
            localValue -= debito.getValor();
        }
        return localValue;
    }
}
