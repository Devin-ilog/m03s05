package tech.devinhouse.solid.openclose;

public class AutenticacaoBD implements Autenticacao {
    @Override
    public boolean autenticar(String usuario, String senhaInformada) {
        System.out.println("Autenticacao usando banco de dados");
        return true;
    }

}
