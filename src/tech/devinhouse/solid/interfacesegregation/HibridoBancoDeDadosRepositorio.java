package tech.devinhouse.solid.interfacesegregation;

public class HibridoBancoDeDadosRepositorio implements
        RepositorioDeDadosRelacional, RepositorioDeDadosNoSQL {

    @Override
    public void inserirDocumento() {

    }

    @Override
    public String consultarDocumento() {
        return null;
    }

    @Override
    public String consultarRegistroTabela() {
        return null;
    }

    @Override
    public void inserirRegistroNaTabela() {

    }

}
