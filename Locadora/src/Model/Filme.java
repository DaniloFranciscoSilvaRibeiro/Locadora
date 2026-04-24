package Model;

public class Filme {

    private String Titulo;
    private String Genero;
    private double ValorAluguel;

    public Filme(String titulo, String genero, double valorAluguel) {
        Titulo = titulo;
        Genero = genero;
        ValorAluguel = valorAluguel;
    }

    public String getDadosFilme() {
        return Titulo + " " + Genero + " " + ValorAluguel;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public double getValorAluguel() {
        return ValorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        ValorAluguel = valorAluguel;
    }

    public void aplicardesconto(double percentual) {
        ValorAluguel = ValorAluguel - (ValorAluguel * percentual / 100);

    }

}