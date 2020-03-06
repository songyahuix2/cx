package java04.day18_JDK新特性;

/**
 * @author shkstart
 * @date 8/7/2019 - 10:22 PM
 */
public class Example{

    String str=new String("good");
    char[]ch={'a','b','c'};

    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }

    public void change(String str,char ch[]){
        this.str="test ok";
        ch[0]='g';
    }
}
