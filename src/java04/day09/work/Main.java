package java04.day09.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/25/2019 - 7:57 PM
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passWord = scanner.nextLine();
        InspectPassword ip = new InspectPassword(passWord);
        try{
            ip.inspect();
        }
        catch (InvalidPasswordFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
