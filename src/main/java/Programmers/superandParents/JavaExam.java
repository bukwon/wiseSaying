package Programmers.superandParents;

public class JavaExam {
    int globalScope = 10;
    static int num = 7;
    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(num);

        JavaExam v1 = new JavaExam();
        System.out.println(v1.globalScope);
        JavaExam v2 = new JavaExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.num = 50;
        v2.num = 100;
        System.out.println(v1.num);
        System.out.println(v1.num);
    }
}
