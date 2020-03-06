package Java03.unit8.exception;

/**
 * @author shkstart
 * @date 7/25/2019 - 4:01 PM
 */
public class Test {

    public void test(int i)throws AutoException{
        if(i>=4){
            throw new AutoException("超时异常");
        }
    }
}
