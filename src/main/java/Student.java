import java.util.ArrayList;
import java.util.List;

public class Student {
    /*
     *跨平台，通过class
     * 面向对象，封装，继承，多态；
     * 强类型，健壮性
     * 数组，链表
     * hashCode,冲突，拉链，rehash
     * arrayList
     * set
     * queue
     * 线程安全
     */

    int age;
    String name;
    static String schoolName = "Sun";
    //构造函数
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //无参构造函数
    public Student(){

    }

    public int getAge() {
        return age+1;
    }

    public static String getSchoolName() {
        return schoolName;
    }
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Tom", 18);
        System.out.println(student.toString()) ;
        Student.getSchoolName();
        List<Student> list = new ArrayList<Student>();
        new Student("Tom", 18);
    }
}
