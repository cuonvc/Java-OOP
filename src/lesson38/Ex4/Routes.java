package lesson38.Ex4;

public class Routes {
    private String routeId;
    private String routeName;
    private float roadLength;

    public Routes() {
    }

    public Routes(String routeId, String routeName) {
        this.routeId = routeId;
        this.routeName = routeName;
    }

    public Routes(String routeId, String routeName, float roadLength) {
        this.routeId = routeId;
        this.routeName = routeName;
        this.roadLength = roadLength;
    }

    public final String getRouteId() {
        return routeId;
    }

    public final void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public final String getRouteName() {
        return routeName;
    }

    public final void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public final float getRoadLength() {
        return roadLength;
    }

    public final void setRoadLength(float roadLength) {
        this.roadLength = roadLength;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "routeId='" + routeId + '\'' +
                ", routeName='" + routeName + '\'' +
                '}';
    }
}
