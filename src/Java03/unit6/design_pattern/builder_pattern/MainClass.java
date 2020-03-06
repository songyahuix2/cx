package Java03.unit6.design_pattern.builder_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 9:00 PM
 */
public class MainClass {
    public static void main(String[] args) {

    /*House house= new House();
    house.setFloor("地板");
    house.setWall("墙");
    house.setHousetop("屋顶");
    */
    HouseBuilder builder = new BungalowBuilder();
House house = builder.getHouse();
builder.makeFloor();
builder.makeWall();
builder.makeHousetop();
        System.out.println(house.getFloor());
        System.out.println(house.getWall());
        System.out.println(house.getHousetop());

    }

}
