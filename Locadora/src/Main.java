import Model.Aluguel;
import Model.Cliente;
import Model.Filme;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Danilo", "55(35)99888-8888");

        Filme filme = new Filme("Mais que Vencedores", "Esporte/Drama ", 11.90);
        filme.aplicardesconto(8);


        Aluguel aluguel = new Aluguel(filme, cliente, 4);

        System.out.println(filme.exibirdetalhes());
        System.out.println(aluguel.getResumo());
        System.out.println(cliente.apresentar());
    }
}