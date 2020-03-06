package java04.day15_enum.exercise;

/**
 * @author shkstart
 * @date 8/26/2019 - 7:23 PM
 */
public enum  EnumTest {
    spring("chun"){
        public void test(){
            System.out.println("chun");
        }
    },
    summer("xia"){
        public void test(){
            System.out.println("xia");
        }
    },
    autumn("qiu"){
        public void test(){

        }
    };
    String season;

    public abstract void test();

    EnumTest(String season) {
        this.season = season;
    }


    public static void main(String[] args) {
        EnumTest et = EnumTest.autumn;
        et.test();
        EnumTest[] et1 = EnumTest.values();
        EnumTest[] et2 = et1.clone();
        System.out.println(et1==et2);
    }
}

