package www.wangchong.java;
/*
 2.编写一个程序，展示无论你创建了某个特定类的多少个对象，这个类的某个特定的static成员变量只有一个属性。
*/
class Student {
    static String country = "中国";
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class PracticeTwo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("王崇 ");
        student1.setAge(18);
        student2.setName("王少博 ");
        student2.setAge(36);
        System.out.println("姓名："+student1.getName()+"年龄："+student1.getAge()+"国籍：" + Student.country);
        System.out.println("姓名："+student2.getName()+"年龄："+student2.getAge()+"国籍：" + Student.country);

    }

}
