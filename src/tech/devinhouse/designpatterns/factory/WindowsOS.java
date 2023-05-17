package tech.devinhouse.designpatterns.factory;

public class WindowsOS implements SistemaOperacional {

    @Override
    public void lerArquivo() {
        System.out.println("Windows lendo arquivo");
    }

    @Override
    public void gravarArquivo() {
        System.out.println("Windows gravando arquivo");
    }

}
