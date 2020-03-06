package Java03.unit8.work;

/**
 * @author shkstart
 * @date 7/22/2019 - 7:20 PM
 */
enum DemoEnum{
//枚举类的实例一般是不可变实例，故属性默认为private final
//创建几个枚举实例：
CHINA(13){
   public  void baseTest(){
      System.out.println(" china 2017年GDP："+i+"万亿$");
   }
}, USA(18){
        public  void baseTest(){
            System.out.println(" america 2017年GDP："+i+"万亿$");
        }
    },JAPAN(5){
        public  void baseTest(){
            System.out.println(" japan 2017年GDP："+i+"万亿$");
        }
    },KOREA(2){
        public  void baseTest(){
            System.out.println(" Korea 2017年GDP："+i+"万亿$");
        }
    };
    int i;
    DemoEnum(int i) {
       this.i = i;
    }
//抽象枚举类不用声明abstract，直接定义抽象方法即可
    public abstract void  baseTest();
}
public class Demo_3 {


    public static void main(String[] args) {
        //法一
DemoEnum df = DemoEnum.CHINA;
df.baseTest();
//法二
DemoEnum[] d = DemoEnum.values();
        for (DemoEnum d1:d) {
            d1.baseTest();
        }
    }
}
