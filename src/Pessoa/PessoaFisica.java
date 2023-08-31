package Pessoa;

public class PessoaFisica extends Contribuinte {

    private String cpf;

    public PessoaFisica(String cpf, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public double calculaImposto() {
        double rend = this.getRendaBruta();


        if (rend <= 1903.98) {
            return rend;
        }

        if (rend <= 2926.65) {
            return (rend - (rend * 0.075 - 142.80));
        }

        if (rend <= 3751.05) {
            return (rend - (rend * 0.15 - 354.80));
        }

        if (rend <= 4664.68) {
            return (rend - (rend * 0.225 - 636.13));
        }

        return (rend - (rend * 0.275 - 869.36));
    }

    @Override
    public String toString() {
        return ("CPF: " + this.cpf + " - ") + ("Renda Bruta: R$" + (this.calculaImposto()));
    }
}
