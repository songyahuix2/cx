package java04.day11_手写Array集合.work.Test_3;

import java.util.Objects;

/**
 * @author shkstart
 * @date 7/29/2019 - 8:24 PM
 */
public class Course {
    private String sno;
    private String name;
    private int credit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return sno.equals(course.sno) &&
                name.equals(course.name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", credit='" + credit + '\'' +
                '}';
    }

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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, credit);
    }

    public Course(String sno, String name, int credit) {
        this.sno = sno;
        this.name = name;
        this.credit = credit;
    }
}
