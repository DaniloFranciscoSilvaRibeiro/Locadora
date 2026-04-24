package Model;

public class Filme {

    private String Titulo;
    private String Genero;
    private String ValorAluguel;

    public Filme(String titulo, String genero, String valorAluguel) {
        Titulo = titulo;
        Genero = genero;
        ValorAluguel = valorAluguel;
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

    public String getValorAluguel() {
        return ValorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        ValorAluguel = valorAluguel;
    }
}
