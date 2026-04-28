package Model;

public class Cliente {

    private String Nome;
    private String Telefone;

    public Cliente(String nome, String telefone) {
        Nome = nome;
        Telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getContato(){
        return Nome + " " + Telefone;
    }

    public String apresentar(){
        return "Contato: " + getContato();
    }
}