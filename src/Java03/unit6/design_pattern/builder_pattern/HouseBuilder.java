package Java03.unit6.design_pattern.builder_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 9:06 PM
 */
public interface HouseBuilder {
    //修地板
    public void makeFloor();
    //修墙
    public void makeWall();
    //修屋顶
    public void makeHousetop();
    //获得房子
    public House getHouse();
}
