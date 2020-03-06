package Java03.unit8.work;

/**
 * @author shkstart
 * @date 7/22/2019 - 6:01 PM
 */
class AutoException extends RuntimeException{

    AutoException(String message){
        super(message);
    }
}
public class Demo_1 {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        test1(time);*/
      test1(5);
    }
    private static  void test1(int time){
        try{
            test2(time);
        }
        catch (AutoException e){
            e.printStackTrace();
            System.out.println("分析："+e.getMessage());
        }
    }

    private static void test2(int time) {
        if(time>=4){
            throw new AutoException("时间以到");
        }
        else
            System.out.println("可以继续玩"+(4-time)+"小时");
    }

}
