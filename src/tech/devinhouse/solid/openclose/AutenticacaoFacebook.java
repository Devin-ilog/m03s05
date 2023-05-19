package tech.devinhouse.solid.openclose;

public class AutenticacaoFacebook implements Autenticacao {
    @Override
    public boolean autenticar(String usuario, String senhaInformada) {
        System.out.println("Autenticacao acessando o Facebook");
        return true;
    }

}
