package java04.day15_enum.enumernation;

/**
 * @author shkstart
 * @date 8/3/2019 - 9:29 AM
 */
public class Test1_Class_To_Enum {
    private String season;
    public static final Test1_Class_To_Enum spring = new Test1_Class_To_Enum("春");
    public static final Test1_Class_To_Enum summer = new Test1_Class_To_Enum("夏");
    public static final Test1_Class_To_Enum autumn = new Test1_Class_To_Enum("秋");
    public static final Test1_Class_To_Enum winter = new Test1_Class_To_Enum("冬");

    private Test1_Class_To_Enum(String season){
        this.season = season;
    }

    public static void main(String[] args) {
        Test1_Class_To_Enum class_season = Test1_Class_To_Enum.autumn;
        System.out.println(class_season);
    }
}
