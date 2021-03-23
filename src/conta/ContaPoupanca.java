package conta;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public String tipo() {
        return "Conta Poupança";
    }
}
