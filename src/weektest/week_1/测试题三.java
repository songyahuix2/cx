package weektest.week_1;

/**
 * @author shkstart
 * @date 7/20/2019 - 2:25 PM
 */
public class 测试题三 {
    public  static void main(String[] args){
        int count =0;
        for(int index =0; index <= 20; index ++){
            switch(index++ % 4){
                case 0:
                    count = ++index;
                case 1:
                    count += index;
                    break;
                default:
                    System.out.println(count);
            }
        }

    }
}
