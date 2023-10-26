package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    void run() {
        System.out.println(" == 명언 앱 == ");

        int lastquotationId = 0;
        List<Quotation> list = new ArrayList<>();

        while(true) {
            System.out.print("명령) ");
            Scanner sc = new Scanner(System.in);
            String cmd = sc.nextLine();

            if (cmd.equals("종료")) break;
            else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.nextLine();

                lastquotationId ++;

                Quotation quotation = new Quotation(lastquotationId,content,author);
                list.add(quotation);
                System.out.println(lastquotationId + "번 명언이 등록되었습니다.\n");
            }
            else if (cmd.equals("목록")) {
                System.out.println("총 개수 : " + list.size());
            }
        }
    };
}
