package Java03.unit3;

/*
*  1.重载（编译时多态）：
*  方法名可以同名，但是前提是参数列表不同
*  2.值传递和引用（地址）传递：
*  值传递指的是栈中的数据的直接传递，例如 int A =2;
*  引用传递指的是栈中的引用指向对象的传递，例如： student Resourse = new student();
*  3.值传递和引用传递的区别：
*  值传递不一定会改变值，
*  例如：
*  int A = 2;
*  public void test(int A){
*  int A=10;
*  }
*  但是a的值不会改变，因为test(int A)中的a是局部的变量，而int A 的a是全局变量，局部变量覆盖了全局变量，若想不覆盖：this.A = A ;
*  引用传递一定会改变结果：
*  因为引用一般都指向堆中的数据，所以修改堆中的数据就会变得一劳永逸
*  4.可变参数列表，即数组的快捷声明方式：
*  public void test(int A,int b,StringDemo... args){
*      this.A=A;
*      this.b=b;
*
*      虽然test()中的前两个形参不可以省，但是最后的可变参数列表可以省，例如下面语句块可以省掉
*      for(StringDemo str:args){
*      for(int i = 0; i<args.length;i++){
*      sout(args[i]);
*      }
*      }
*
*
*
*  [注:]
*  StringDemo...(即可变参数)必须在参数列表的最后
*  使用带有可变参数列表的实例的构造时,StringDemo...的实参可以不写
*/

/**
 *
 * @author shkstart
 * @date 7/15/2019 - 3:18 PM
 */
public class 值传递和引用传递 {
    String name ="宋亚辉";

    public String test1(String name){
      return name = "200000";

    }


    public static void main(String[] args) {
        值传递和引用传递 fd = new 值传递和引用传递();

        System.out.println( fd.test1(fd.name)+"....."+fd.name);


    }
}


