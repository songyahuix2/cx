package Java03.unit3.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/15/2019 - 6:17 PM
 */
public class Demo {

    static Student[] stuArr = new Student[100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputMenu();

    }
    /**
     * 输出菜单
     */
    public static void outputMenu() {
        System.out.println("*****************************");
        System.out.println("|     1. 增加学生        |	");
        System.out.println("|     2. 显示学生        |	");
        System.out.println("|     3. 修改学生        |	");
        System.out.println("|     4. 删除学生        |	");
        System.out.println("|     5. 查找学生        |	");
        System.out.println("|     6. 输入页数        |	");
        System.out.println("|     7. 退出程序        |	");
        System.out.println("|    请输入选择（1-6）：     |	");
        System.out.println("*****************************");
    }

    /**
     * 输入选项
     */
    public static void inputMenu() {
        boolean isRunning = true;
        //不知道循环次数，使用while循环
        while(isRunning) {
            outputMenu();
            String options = scanner.nextLine();
            if(options.equals("1")) {
                addStu();
            }
            else if(options.equals("2")) {
                showStu();
            }
            else if(options.equals("3")) {
                 updateStu();
            }
            else if(options.equals("4")) {
                deleteStu();
            }
            else if(options.equals("5")) {
                queryStu();
            }
            else if(options.equals("6")) {
                queryPage();
            }
            else if(options.equals("7")) {
               isRunning = false;
                System.out.println("运行结束");
            }
        }
    }

    /**
     * 添加学生
     */
    public static void addStu() {
        System.out.println("请输入学生信息：");
        //输入学生信息，例如张三;12345;12
        String stuInfo = scanner.nextLine();
        //将字符串按照空格 进行分割，返回分割后的数组
        String[] stArr = stuInfo.split(" ");
        //将学生信息转换成学生对象   转换类型Integer.parseInt(stuArr[2])
        Student stu = new Student(stArr[0],stArr[1],stArr[2],Integer.parseInt(stArr[3]));
        //添加位置
        for(int i = 0; i < stuArr.length; i ++) {
            //如果没有人
            if(stuArr[i] == null) {
                stuArr[i] = stu;
                System.out.println("添加成功！");
                break;
            }
        }
    }
    /**
     * 显示学生
     */
    public static void showStu() {
        for(int i = 0; i < stuArr.length; i ++) {
            if(stuArr[i] != null) {//座位有人，，不为空
                System.out.println(stuArr[i].toString());
            }
        }

    }
    /**
     * 删除学生
     */
    public static void deleteStu() {

        System.out.println("请输入需要删除学生的学号：");
        //键盘输入学号
        String num = scanner.nextLine();
        for(int i = 0; i < stuArr.length; i ++) {
            if(stuArr[i] != null) {
                if(stuArr[i].getSno().equals(num)) {
                    stuArr[i] = null;
                    System.out.println("该生已删除");
                }
            }

        }
    }
    /**
     * 查询学生
     */
    public static void  queryStu(){
        System.out.println("请输入需要查找的学生姓名：");
Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        for(int i = 0; i<stuArr.length ; i++) {
            if(stuArr[i].getName().equals(name1)) {
                System.out.println(stuArr[i].toString());
            }
        }
        System.out.println();
    }
    /**
     * 修改学生
     * set方法
     */
    public static void updateStu(){

        System.out.println("输入需要修改信息的学生姓名：");
        //查找待修改的姓名
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for(int i = 0; i< stuArr.length; i++) {
            //StringDemo name2 = stuArr[i].getName();
            if(stuArr[i].getName().equals(name)) {
                System.out.println("修改学生信息：");
                //输入修改的姓名
               Scanner scan = new Scanner(System.in);
               String str = scan.nextLine();
               String[] arr = str.split(" ");
               stuArr[i].setSno(arr[0]);
               stuArr[i].setName(arr[1]);
               stuArr[i].setClassroom(arr[2]);
               stuArr[i].setAge(Integer.parseInt(arr[3]));

                System.out.println("姓名已修改！" + stuArr[i].toString());
            }
            break;
        }
    }
    /*
    *
    * */
    public static void queryPage(){
        System.out.println("输入页数");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(stuArr.length >= 5 * Integer.parseInt(str)){

        for(int i = 5 * (Integer.parseInt(str)-1);i < 5 * Integer.parseInt(str);i++){
            if(stuArr[i] == null){
                System.out.println("null");
            }
            else
            System.out.println(stuArr[i].toString());

        }
        }
        else
            throw new NullPointerException("页数过大");
    }
}
