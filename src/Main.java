import Estabelecimento.ReceitaFederal;
import Pessoa.Contribuinte;
import Pessoa.PessoaFisica;
import Pessoa.PessoaJuridica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contribuinte> contribuintes = new ArrayList<>();
        contribuintes.add(new PessoaFisica("12916428976", "Leonardo Agostini Costa", 1500));
        contribuintes.add(new PessoaFisica("12916428976", "Leonardo Agostini Costa", 2300));
        contribuintes.add(new PessoaFisica("12916428976", "Leonardo Agostini Costa", 3000));
        contribuintes.add(new PessoaFisica("12916428976", "Leonardo Agostini Costa", 4200));
        contribuintes.add(new PessoaFisica("12916428976", "Leonardo Agostini Costa", 5000));
        contribuintes.add(new PessoaJuridica("12916428976-12", "Leonardo Agostini Costa LTDA", 10000));


        ReceitaFederal rf = new ReceitaFederal(contribuintes);

        for (Contribuinte c : rf.getContribuintes()) {
            System.out.println(c.toString());
        }
    }
}