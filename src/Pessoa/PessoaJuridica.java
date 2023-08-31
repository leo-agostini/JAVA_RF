package Pessoa;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public double calculaImposto() {
        return (this.getRendaBruta() - (this.getRendaBruta() * 0.10));
    }

    @Override
    public String toString() {
        return ("CNPJ: " + this.cnpj + " - ") + ("Renda Bruta: R$" + (this.calculaImposto()));
    }
}
