package Java03.unit6.design_pattern.chain_of_responsibility_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 8:29 PM
 */
public class Boss extends AbstractLeader{
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("老板批复报销"+ money +"元");
    }

    @Override
    public String getLeader() {
        return "老板";
    }
}
