package Java03.unit6.design_pattern.chain_of_responsibility_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 8:32 PM
 */
public class client {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

    //设置上级领导处理者对象
        groupLeader.highLeader = director;
        director.highLeader = manager;
        manager.highLeader = boss;

        //报账
        groupLeader.handleRequest(11000);
    }
}
