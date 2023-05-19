package tech.devinhouse.solid.interfacesegregation;

public class Teste {

    public static void main(String[] args) {

        RepositorioDeDadosRelacional repo = new MySqlRepositorio();

        repo.consultarRegistroTabela();

    }

}
