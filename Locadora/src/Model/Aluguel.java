package Model;

public class Aluguel {

    private String Filme;
    private String Cliente;
    private String Dias;

    public Aluguel(String filme, String cliente, String dias) {
        Filme = filme;
        Cliente = cliente;
        Dias = dias;
    }

    public String getFilme() {
        return Filme;
    }

    public void setFilme(String filme) {
        Filme = filme;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String dias) {
        Dias = dias;
    }
}
