package java04.day09.exception;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/25/2019 - 3:42 PM
 */
public class TestException {
    public static void exe1(int i) throws AutoException{
        if(i>4){
            throw new AutoException("超时");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        try {
            TestException.exe1(i);
        } catch (AutoException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
