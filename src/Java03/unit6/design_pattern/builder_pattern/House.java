package Java03.unit6.design_pattern.builder_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 8:52 PM
 */
public class House {
    private String floor;
    private String wall;
    private  String housetop;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHousetop() {
        return housetop;
    }

    public void setHousetop(String housetop) {
        this.housetop = housetop;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", housetop='" + housetop + '\'' +
                '}';
    }
}
