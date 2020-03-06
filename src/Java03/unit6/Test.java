package Java03.unit6;

/**
 * @author shkstart
 * @date 7/17/2019 - 6:26 PM
 */
public class Test {
    public static void main(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println( x + y +""+ (x+y)+y);
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
