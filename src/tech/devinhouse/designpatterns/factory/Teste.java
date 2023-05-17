package tech.devinhouse.designpatterns.factory;

public class Teste {

    public static void main(String[] args) {
        String tipo = "linux";
        SistemaOperacional so = SistemaOperacionalFactory.criar(tipo);
        // continua minha logica de negocio
        so.lerArquivo();
        so.gravarArquivo();
    }

}
