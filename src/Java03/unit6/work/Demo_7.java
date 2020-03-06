package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/19/2019 - 8:45 PM
 */
public class Demo_7 {
    public static void main(String[] args) {
//获取输入
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //将输入字符串转化为char类型数组
        char[] charArr = input.toCharArray();
        char[] charArr1 = new char[charArr.length];
        //存放输出字符串
        String output;
        int num = 0;
        //判断第一个字符
        if(charArr[0] == 'j'){
            charArr1[num] = charArr[0];
            num++;
        }
        //判断第二个字符
        if(charArr[1] == 'b'){
            charArr1[num] = charArr[1];
        }
        //直接复制后面的字符
        for (int i = 2; i < charArr.length; i++) {
            charArr1[num] = charArr[i];
            num++;
        }
        //将char类型数组转换为字符串输出
        output = String.valueOf(charArr1);
        System.out.println(output);

    }
}
