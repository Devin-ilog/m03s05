package tech.devinhouse.solid.openclose;

public class AutenticacaoGoogle implements Autenticacao {
    @Override
    public boolean autenticar(String usuario, String senhaInformada) {
        System.out.println("Autenticacao acessando o Google");
        return true;
    }

}
