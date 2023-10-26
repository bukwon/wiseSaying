package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    int lastquotationId;
    List<Quotation> list;
    Scanner sc;
    App() {
        lastquotationId = 0;
        list = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    void run() {
        System.out.println(" == 명언 앱 == ");

        while(true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine();

            if (cmd.equals("종료")) break;
            else if (cmd.equals("등록")) {
                actionWrite();
            }
            else if (cmd.equals("목록")) {
                actionList();
            }
            else if (cmd.startsWith("삭제?")){
                actionRemove(cmd);
            }
        }
    };

    void actionWrite() {
        System.out.print("명언 : ");
        String content = sc.nextLine();
        System.out.print("작가 : ");
        String author = sc.nextLine();

        lastquotationId ++;

        Quotation quotation = new Quotation(lastquotationId,content,author);
        list.add(quotation);
        System.out.println(lastquotationId + "번 명언이 등록되었습니다.\n");};

    void actionList() {
        System.out.println("총 개수 : " + list.size());
        System.out.println("번호 / 명언 / 작가");
        System.out.println("_____________________");

        if (list.isEmpty()) System.out.println("등록된 명언이 없습니다.");

        Quotation quotation;

        int i = 0;

        while ( i < 2 ) {
            quotation = list.get(i);
            System.out.println(quotation.id + " / " + quotation.content + " / " + quotation.author);

            i ++;
        }
    };

    void actionRemove(String cmd) {
        String str = cmd.replace("삭제?id=", "");
        int id = Integer.parseInt(str);

        System.out.println(id + "번 명언을 삭제합니다.");
    };
}
