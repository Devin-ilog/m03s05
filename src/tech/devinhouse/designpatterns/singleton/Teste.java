package tech.devinhouse.designpatterns.singleton;

public class Teste {

    public static void main(String[] args) {

//        SalarioService salarioService1 = new SalarioService(); // nao singleton
//        SalarioService salarioService2 = new SalarioService();

        // vai voltar a mesma instancia nas tres chamadas
        SalarioService service1 = SalarioService.getInstance();
        SalarioService service2 = SalarioService.getInstance();
        SalarioService service3 = SalarioService.getInstance();

    }

}
