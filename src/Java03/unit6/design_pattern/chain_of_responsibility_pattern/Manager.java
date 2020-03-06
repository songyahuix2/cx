package Java03.unit6.design_pattern.chain_of_responsibility_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 8:28 PM
 */
public class Manager extends AbstractLeader{
    @Override
    public int limit() {
        return  10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理批复报账"+money+"元");
    }

    @Override
    public String getLeader() {
        return "经理";
    }
}
