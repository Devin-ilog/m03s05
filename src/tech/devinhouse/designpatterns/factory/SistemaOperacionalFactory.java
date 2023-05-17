package tech.devinhouse.designpatterns.factory;

public class SistemaOperacionalFactory {

    public static SistemaOperacional criar(String tipo) {
        SistemaOperacional so;
        switch (tipo) {
            case "windows":
                so = new WindowsOS();
                break;
            case "linux":
                so = new LinuxOS();
                break;
            default:
                throw new IllegalArgumentException("Sist Operacional nao reconhecido!");
        }
        return so;
    }

}
