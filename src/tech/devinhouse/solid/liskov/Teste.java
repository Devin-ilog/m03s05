package tech.devinhouse.solid.liskov;

public class Teste {

    public static void main(String[] args) {

        Retangulo retangulo = new Quadrado();
        retangulo.altura = 10;
        retangulo.largura = 20;

        Quadrado quadrado = new Quadrado();
        quadrado.altura = 30;
        quadrado.largura = 30;

    }

}
