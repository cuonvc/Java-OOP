package lesson38.Ex4;

public class RegisterDriver<E, V, N> {
    private E driver;  //lái xe
    private V route;  //tuyến xe
    private N numberOfRoute;  //số lượt lái

    public RegisterDriver() {
    }

    public RegisterDriver(E driver, V route, N numberOfRoute) {
        this.driver = driver;
        this.route = route;
        this.numberOfRoute = numberOfRoute;
    }


    public E getDriver() {
        return driver;
    }

    public void setDriver(E driver) {
        this.driver = driver;
    }

    public V getRoute() {
        return route;
    }

    public void setRoute(V route) {
        this.route = route;
    }

    public N getNumberOfRoute() {
        return numberOfRoute;
    }

    public void setNumberOfRoute(N numberOfRoute) {
        this.numberOfRoute = numberOfRoute;
    }

    @Override
    public String toString() {
        return "RegisterDriver{" +
                "driver=" + driver +
                ", route=" + route +
                ", numberOfRoute=" + numberOfRoute +
                '}';
    }
}
