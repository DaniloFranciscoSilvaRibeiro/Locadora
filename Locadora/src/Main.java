import Model.Aluguel;
import Model.Cliente;
import Model.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Danilo", "55(35)99888-8888");
        System.out.println(cliente.getDados());

        Filme filme = new Filme("Mais que Vencedores", "Esporte/Drama ", 11.90);
        System.out.println(filme.getDadosFilme());
        filme.aplicardesconto(5);


        Aluguel aluguel = new Aluguel(filme, cliente, 4);
        System.out.println(aluguel.getResumo());


    }
}