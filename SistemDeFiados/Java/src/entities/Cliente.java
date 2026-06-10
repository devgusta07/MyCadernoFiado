package entities;

public class Cliente {

    private final String name;
    private final String cpf;
    private final double creditario;

    public Cliente(String name, String cpf, double creditario) {
        this.name = name;
        this.cpf = cpf;
        this.creditario = creditario;
    }


    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public double getCreditario() {
        return creditario;
    }

    @Override
    public String toString() {
        return "Cliente:" +
                "\nNome: "+ name+
                "\nCpf: "+ cpf+
                "\nCreditario: "+ creditario;
    }
}
