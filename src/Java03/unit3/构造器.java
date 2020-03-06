package Java03.unit3;
/*
*alt + insert --> constructor:选择构造器中的一个或者多个
* 参数来实现this调用
*/

/**
 * @author shkstart
 * @date 7/15/2019 - 2:10 PM
 */
public class 构造器 {
    String sno;
    String sname;
    String sclass;
    String depart;
    String gender;


    public 构造器(String sno) {
        this.sno = sno;
    }

    public 构造器(String sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    public 构造器(String sno, String sname, String sclass) {
        this.sno = sno;
        this.sname = sname;
        this.sclass = sclass;
    }

    public 构造器(String sno, String sname, String sclass, String depart) {
        this.sno = sno;
        this.sname = sname;
        this.sclass = sclass;
        this.depart = depart;
    }

    public 构造器(String sno, String sname, String sclass, String depart, String gender) {
        this.sno = sno;
        this.sname = sname;
        this.sclass = sclass;
        this.depart = depart;
        this.gender = gender;
    }

    public static void main(String[] args) {
        构造器 s = new 构造器("1611021027","宋亚辉","java03");
        System.out.println(s.sname);
        System.out.println(s.sno);
        System.out.println(s.sclass);
    }
}

