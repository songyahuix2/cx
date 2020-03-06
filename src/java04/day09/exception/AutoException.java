package java04.day09.exception;

/**
 * @author shkstart
 * @date 7/25/2019 - 3:34 PM
 */
public class AutoException extends Exception{


    public AutoException(String getMessage){
     super(getMessage);
        System.out.println("自定义异常");
    }
}

