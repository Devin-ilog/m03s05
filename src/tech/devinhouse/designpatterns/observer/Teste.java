package tech.devinhouse.designpatterns.observer;

public class Teste {

    public static void main(String[] args) {

        ClimaObservable observavel = new ClimaObservable();

        ClimaObserver radar = new RadarClimaObserver();
        ClimaObserver torre = new TorreClimaObserver();

        observavel.adicionarObservador(radar);
        observavel.adicionarObservador(torre);

        observavel.novoEvento("Começou a chover");

    }

}
