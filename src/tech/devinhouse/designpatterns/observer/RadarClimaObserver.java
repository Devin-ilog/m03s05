package tech.devinhouse.designpatterns.observer;

public class RadarClimaObserver implements ClimaObserver {

    @Override
    public void update(String evento) {
        System.out.println("Radar notificado: " + evento);
    }

}
