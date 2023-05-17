package tech.devinhouse.designpatterns.factory;

public class LinuxOS implements SistemaOperacional {

    @Override
    public void lerArquivo() {
        System.out.println("Linux lendo arquivo");
    }

    @Override
    public void gravarArquivo() {
        System.out.println("Linux gravando arquivo");
    }

}
