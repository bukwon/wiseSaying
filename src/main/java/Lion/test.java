package Lion;

class testNum{
    static int num1;
    int num2;
    testNum() {
        num1 = 7;
        num2 = 7;
    }
}
public class test {
    public static void main(String[] args) {
        testNum number1 = new testNum();
        testNum number2 = new testNum();

        number1.num1++;
        number1.num2++;
        System.out.println(number2.num1);
        System.out.println(number2.num2);
    }
}
