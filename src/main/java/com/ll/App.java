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
            }
        }
    };
}
