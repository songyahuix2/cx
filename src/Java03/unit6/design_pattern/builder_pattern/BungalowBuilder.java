package Java03.unit6.design_pattern.builder_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 9:08 PM
 */
public class BungalowBuilder implements HouseBuilder{
House house = new House();
    @Override
    public void makeFloor() {
        house.setFloor("平房--》地板");
    }

    @Override
    public void makeWall() {
house.setWall("平房--》墙");
    }

    @Override
    public void makeHousetop() {
house.setHousetop("平房--》房顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
