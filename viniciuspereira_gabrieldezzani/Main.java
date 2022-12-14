public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("12408876510", "Vinicius", "32999876545", 2000.0);
        Funcionario funcionario2 = new Funcionario("12409862315", "Vinicius Kezner", "32999877341", 4000.0);
        Cargo cargo = new Cargo("Gerente");
        Cargo cargo2 = new Cargo("Atendente");
        funcionario.addCargo(cargo);
        funcionario2.addCargo(cargo2);
        System.out.println("Funcionario 1 nome: " + funcionario.getNome());
        System.out.println("Funcionario 2 nome: " + funcionario2.getNome());

        Cliente cliente = new Cliente("87655199915", "Leonardo", "32996765433", false);
        ContaCorrente corrente = new ContaCorrente("83724492378", 200.0);
        cliente.addConta(corrente);
        cliente.getContas().get(0).depositar(100.0);
        cliente.getContas().get(0).depositar(100.0);
        cliente.getContas().get(0).depositar(100.0);
        cliente.getContas().get(0).sacar(50.0);
        cliente.getContas().get(0).depositar(50.0);
        Double saldo = cliente.getContas().get(0).calcularSaldo();
        System.out.println("Saldo da conta corrente e: " + saldo);
        ContaPoupanca poupanca = new ContaPoupanca("321439-021390-129-3", 2000.0);
        cliente.addConta(poupanca);
        cliente.getContas().get(1).depositar(100.0);
        cliente.getContas().get(1).depositar(-1000.0);
        cliente.getContas().get(1).sacar(100.0);
        Double poupancaSaldo = cliente.getContas().get(1).calcularSaldo();
        System.out.println("Saldo da conta poupanca e: " + poupancaSaldo);
    }
}
