package www.wangchong.java;

//1.创建一个Test类，包含有一个public权限的int型成员变量与一个char类型的成员变量，观察在main方法中的初始值。
class Test {
    private int index;
    private char ch;
    int getIndex() {
        return index;
    }

    char getCh() {
        return ch;
    }
}

public class PracticeOne {
    public static void main(String[] args) {
        Test text = new Test();
        System.out.println("char 默认值："+text.getCh()+"int 默认值："+text.getIndex()+".");
    }
}

