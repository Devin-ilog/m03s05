package tech.devinhouse.designpatterns.observer;

public class TorreClimaObserver implements ClimaObserver {

    @Override
    public void update(String evento) {
        System.out.println("Torre notificada: " + evento);
    }

}
