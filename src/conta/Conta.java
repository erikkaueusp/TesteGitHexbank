package conta;

public abstract class Conta {

    private double saldo;
    private double numero;
    private double agencia;


// Getters And Setters

    public double getSaldo() {
        return saldo;
    }
    public double getNumero() {
        return numero;
    }
    public double getAgencia() {
        return agencia;
    }

    public String tipo(){
        return "Sou uma conta normal";
    }

// End Of Getters And Setters


    public Conta (int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Seu número de agência e conta são, respectivamente: " + getNumero() + ", "
                + getAgencia() + "e do tipo: " + tipo() );
    }


    public boolean saca (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere (double valor, Conta destinatario) {
        if (this.saldo >= valor ) {
            this.saldo -= valor;
            destinatario.saldo += valor;
            return true;
        }
        return false;

    }

    public void deposito (double valor) {
        this.saldo += valor;
    }
}