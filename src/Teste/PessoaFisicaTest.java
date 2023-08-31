package Teste;

import Pessoa.PessoaFisica;
import org.junit.Test;

import static org.junit.Assert.*;

public class PessoaFisicaTest {

    @Test
    public void calculaImposto() {
        PessoaFisica clt = new PessoaFisica("12916428976", "Leonardo Agostini", 5000);
        assertEquals(4494.36, clt.calculaImposto());
    }
}