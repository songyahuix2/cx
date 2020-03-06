package Java03.unit8.exception;

/**
 * @author shkstart
 * @date 7/25/2019 - 3:59 PM
 */
public class AutoException extends Exception {
    public AutoException(String message){
        super(message);
        System.out.println("自定义异常已启动");
    }
}
