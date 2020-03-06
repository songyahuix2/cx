package Java03.unit6.design_pattern.chain_of_responsibility_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 8:21 PM
 */
public class GroupLeader extends AbstractLeader {
    @Override
    //报账额度
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销"+ money +"元");
    }

    @Override
    public String getLeader() {
        return "当前是组长";
    }
}
