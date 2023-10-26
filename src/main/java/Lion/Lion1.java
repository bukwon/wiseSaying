package Lion;

public class Lion1 {
    public static void main(String[] args) {


        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 = 122;
        a전사.a무기 = new 총();
        a전사.공격();
        // 출력 : 22살 전사 카니(이)가 칼(으)로 공격합니다.

        a전사.이름 = "초코";
        a전사.나이 = 123;
        a전사.a무기 = new 도끼();
        a전사.공격();
        // 출력 : 22살 전사 초코(이)가 활(으)로 공격합니다.
    }
}

class 전사 {
    String 이름;
    int 나이;
    Weapon a무기;

    void 공격() {
        a무기.작동(이름, 나이);
    }
}

abstract class Weapon {
    String 무기;
    void 작동(String 이름, int 나이) {
        System.out.println(나이 + "살 전사 " + 이름 + "(이)가 " + 무기 + "(으)로 공격합니다.");
    }
}

class 총 extends Weapon {
    총() {
        무기 = "총";
    }
}

class 도끼 extends Weapon {
    도끼() {
        무기 = "도끼";
    }

}