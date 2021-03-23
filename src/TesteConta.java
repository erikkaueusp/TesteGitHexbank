import conta.ContaCorrente;
import conta.ContaPoupanca;
import conta.GuardadorDeContas;

public class TesteConta {


    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente(102,220);
        ContaPoupanca cp = new ContaPoupanca(48,550);

        guardador.adiciona(cc);
        guardador.adiciona(cp);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);




    }
}
