package conta;

public class ContaCorrente extends Conta{


    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public String tipo() {
        return "Conta Corrente";
    }
}
