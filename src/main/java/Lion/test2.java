package Lion;

public class test2 {
    public static void main(String[] args) {
        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다();
        // 출력 : 저는 못 날아요 ㅠㅠ
        a로봇오리.수영하다();
        // 출력 : 물갈퀴로 수영합니다.
    }
}

class 고무오리 extends 오리 {
    public void 날다() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }

    void 수영하다() {
        System.out.println("물에 둥둥 뜹니다.");
    }
}

class 로봇오리 extends 고무오리 {
    @Override
    public void 날다() {
        System.out.println("");
    }
}