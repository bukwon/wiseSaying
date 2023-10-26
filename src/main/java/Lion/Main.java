package Lion;

public class Main {
    public static void main(String[] args) {
        전사1 a전사1 = new 전사1();
        a전사1.이름 = "카니";
        a전사1.나이 = 22;
        a전사1.aWeapon = new 칼();
        a전사1.Attack();
        // 출력v1 : 전사1가 칼로 공격합니다.
        // 출력v2 : 22살 전사1 카니님이 칼로 공격합니다.

        a전사1.이름 = "초코";
        a전사1.aWeapon = new 활();
        a전사1.Attack();
        // 출력v1 : 전사1가 활로 공격합니다.
        // 출력v2 : 22살 전사1 초코님이 활로 공격합니다.
    }
}

class 전사1 {
    String 이름;
    int 나이;
    무기 aWeapon;
    void Attack() {
        aWeapon.Attack(나이, 이름);
    }
}

abstract class 무기{
    abstract void Attack(int age, String name);
}
class 칼 extends 무기{
    void Attack(int age, String name){
        System.out.println("전사1이 칼로 공격합니다.");
        System.out.println(age + "살 전사1 " + name + "님이 칼로 공격합니다.");
    }
}

class 활 extends 무기{
    void Attack(int age, String name){
        System.out.println("전사1이 활로 공격합니다.");
        System.out.println(age + "살 전사1 " + name + "님이 활로 공격합니다.");
    }
}