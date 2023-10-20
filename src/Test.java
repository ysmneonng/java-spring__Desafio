import PadroesFacade.Facade;
import PadroesSingleton.SingletonEager;
import PadroesSingleton.SingletonLazy;
import PadroesSingleton.SingletonLazyHolder;
import PadroesStrategy.*;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Testes relacionados ao Desing Pattern Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Testes relacionados ao Desing Pattern Facade
        Facade facade = new Facade();
        facade.MigrarCliente("Yasmine", "88010-300");
    }
}
