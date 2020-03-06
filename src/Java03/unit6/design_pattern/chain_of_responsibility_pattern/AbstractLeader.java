package Java03.unit6.design_pattern.chain_of_responsibility_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 8:09 PM
 */
public abstract class AbstractLeader {
//高层领导
    protected AbstractLeader highLeader;
/**
 * 处理报账请求
 * @param money 能批复的保障额度
 */
public final void handleRequest(int money){
    System.out.println(getLeader());
    if(money <= limit()){
        handle(money);
    }
    else{
        System.out.println("保障不足，提交上层");
        if(null != highLeader){
highLeader.handleRequest(money);
        }
    }
}
/**
 * 自身可以批复的额度
 * @return 额度
 */
public abstract int limit();

/**
 * @param money 具体金额
 */
public abstract  void handle(int money);

/**
 * 获取处理者
 * @return 处理者
 */
public abstract String getLeader();
}
