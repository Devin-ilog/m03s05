package tech.devinhouse.designpatterns.observer;

import java.util.*;

// objeto observável
public class ClimaObservable {

    private List<ClimaObserver> observadores = new ArrayList<>();

    public void adicionarObservador(ClimaObserver observador) {
        observadores.add(observador);
    }

    public void novoEvento(String evento) {
        // fazer o que for preciso com evento recebido e notificar observadores
        observadores.forEach(observador -> observador.update(evento));
    }

}
