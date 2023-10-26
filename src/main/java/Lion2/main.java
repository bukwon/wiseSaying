package Lion2;

public class main {
    public static void main(String[] args) {
        전사1 a전사 = new 전사1();
        a전사.이름 = "카니";
        a전사.나이 = 122;
        a전사.a무기 = new 칼1();
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.나이 = 123;
        a전사.a무기 = new 활1();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사1{
    String 이름;
    int 나이;
    무기 a무기;

    void 공격() {
        a무기.attack(이름, 나이);
    }
}

class 무기{
    String 주무기;
    void attack(String 이름, int 나이) {
        System.out.println(나이 + "살 " + 이름 + "가 " + 주무기 + "로 공격합니다.");
    }
}

class 칼1 extends 무기{
    칼1(){
        주무기 = "칼";
    }
}

class 활1 extends 무기{
    활1(){
        주무기 = "활";
    }

}