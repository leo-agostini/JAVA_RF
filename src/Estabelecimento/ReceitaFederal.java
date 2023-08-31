package Estabelecimento;

import Pessoa.Contribuinte;

import java.util.ArrayList;

public class ReceitaFederal {
    private ArrayList<Contribuinte> contribuintes;

    public ReceitaFederal() {
    }
    public ReceitaFederal(ArrayList<Contribuinte> contribuintes) {
        this.contribuintes = contribuintes;
    }

    public ArrayList<Contribuinte> getContribuintes() {
        return contribuintes;
    }
}
