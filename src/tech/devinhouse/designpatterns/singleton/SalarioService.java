package tech.devinhouse.designpatterns.singleton;

// Singleton
public class SalarioService {

    private static SalarioService instance;

    private SalarioService() {
    }

    public static synchronized SalarioService getInstance() {
        if (instance == null) {
            instance = new SalarioService();
        }
        return instance;
    }


    public Float calcularSalario() {
        return 0F;
    }

}
