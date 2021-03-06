//Código omitido

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteCompara {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(9, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(1, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(4, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(3, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();

        System.out.println("---------");

        lista.sort(comparator);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        if(c1.getNumero() < c2.getNumero()) {
            return -1;
        }

        if(c1.getNumero() > c2.getNumero()) {
            return 1;
        }

        return 0;
    }
}