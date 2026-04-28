package Model;

public class Filme {

    private String Titulo;
    private String Genero;
    private Double valorAluguel;

    public Filme(String titulo, String genero, Double valorAluguel) {
        Titulo = titulo;
        Genero = genero;
        this.valorAluguel = valorAluguel;
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

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(Double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String exibirdetalhes(){
        return "Filme: " + this.Titulo + "\nGênero: " + this.Genero + "\nValor do aluguel: " + this.valorAluguel;
    }
    public void aplicardesconto(double percentual) {
         valorAluguel=  valorAluguel- (valorAluguel * percentual / 100);

    }

}