package Java03.unit6.design_pattern.chain_of_responsibility_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 8:26 PM
 */
public class Director extends AbstractLeader {

    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("主管批复报销"+ money +"元");
    }

    @Override
    public String getLeader() {
        return "当前是主管";
    }
}
