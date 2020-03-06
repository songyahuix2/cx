package java04.day10.work.problem_6;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/26/2019 - 6:51 PM
 */
public class Problem_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(YearSearch.search(str));
    }
}
