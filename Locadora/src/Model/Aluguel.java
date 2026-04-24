package Model;

public class Aluguel {

    private Filme Filme;
    private Cliente Cliente;
    private Integer Dias;

    public Aluguel(Filme filme, Cliente cliente, Integer dias) {
        this.Filme = filme;
        this.Cliente = cliente;
        this.Dias = dias;
    }

    public String getDadosAluguel(){
        return Cliente + " " + Filme + " " + Dias;
    }

    public Filme getFilme() {
        return Filme;
    }

    public void setFilme(Filme filme) {
        Filme = filme;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public Integer getDias() {
        return Dias;
    }

    public void setDias(Integer dias) {
        Dias = dias;
    }
    public double calculoTotal(){
        return Filme.getValorAluguel() * Dias;
    }

    public String getResumo(){
        return "Cliente: " + this.Cliente + " " + "\nDias: " + this.Dias + " " + "\nFilme: " + this.Filme;
    }
}
