package PadroesSingleton;

/**
 * Singleton Lazy Holder
 *
 * @see <a href="http://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author yasmineoenning
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
