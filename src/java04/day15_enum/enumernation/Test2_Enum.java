package java04.day15_enum.enumernation;

/**
 * @author shkstart
 * @date 8/3/2019 - 9:29 AM
 */
public enum Test2_Enum {

    spring("chun"){
public void test(){
    System.out.println("春天");
}
    },
    summer("xian"){
     public void test(){
         System.out.println("夏天");
     }
    },
    autumn("qiu"){
        public void test(){
            System.out.println("秋天");
        }
    },
    winter("dong"){
        public void test(){
            System.out.println("冬天");
        }
    };
    String season;
    Test2_Enum(String season){
        this.season = season;
    }
    public abstract void test();
    public void test(int a){
        System.out.println(a);
    }
//    spring,
//    summer,
//    autumn,
//    winter
public static void main(String[] args) {
    Test2_Enum es = Test2_Enum.autumn;
    Test2_Enum[] es2 = Test2_Enum.values();
    es.test();
    es.test(2);

}
}
