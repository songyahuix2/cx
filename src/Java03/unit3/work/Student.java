package Java03.unit3.work;

/**
 * @author shkstart
 * @date 7/15/2019 - 6:14 PM
 */
class Student {
    private String sno;
    private String name;
    private String classroom;
    private int age;

    public Student(String sno, String name, String classroom, int age) {
        this.sno = sno;
        this.name = name;
        this.classroom = classroom;
        this.age = age;
    }


    /*public Student() {

    }*/

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", age=" + age +
                '}';
    }
}
