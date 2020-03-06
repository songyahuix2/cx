import java.util.ArrayList;
import java.util.Collection;

public class Example {
    String str=new String("good");
    char[]ch={'a','b','c'};

    public static void main(String args[]){
        Example ex=new Example();
        Student stu = new Student();
        ex.change(ex.str,ex.ch,stu);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch+","+stu.age+","+stu.name);
    }
    public void change(String str,char ch[],Student stu){
        str="test ok";
        ch[0]='g';
        stu.age = 18;
        stu.name = "hys";
    }
}
class Student{
    int age = 20;
    String name = "syh";
        }
