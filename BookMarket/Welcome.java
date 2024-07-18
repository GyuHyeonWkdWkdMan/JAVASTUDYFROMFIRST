package BookMarket;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;

    public static void main(String[] args) {
        String[][] Mbook = new String[NUM_BOOK][NUM_ITEM];

        Scanner input = new Scanner(System.in);
        // System.out.println("Welcome to Shopping Mall");
        // System.out.println("Welcome to Book Market!");

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.next();
        System.out.print("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market";

        boolean quit = false;
        while (!quit) {
            System.out.println("************************************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);
            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            int n = input.nextInt();
            // System.out.println(n + "번을 선택했습니다.");
            if (n < 1 || n > 8) {
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
            } else {
                switch (n) {
                    case 1:
                        menuGuestInfo(userName, userMobile);
                        break;
                    case 2:
                        menuCartItemList();
                        break;
                    case 3:
                        menuCartClear();
                        break;
                    case 4:
                        menuCartAddItem(Mbook);
                        break;
                    case 5:
                        menuCartRemoveItemCount();
                        break;
                    case 6:
                        menuCartRemoveItem();
                        break;
                    case 7:
                        menuCartBill();
                        break;
                    case 8:
                        menuExit();
                        quit = true;
                        break;
                }
            }
        }
        input.close();
    }

    public static void menuIntroduction() {
        System.out.println("************************************************************");
        System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니에 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기 \t8. 종료");
        System.out.println("************************************************************");
    }

    public static void menuGuestInfo(String name, int mobile) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + "  연락처 " + mobile);
    }

    public static void menuCartItemList() {
        System.out.println("장바구니 상품 목록 보기 :");
    }

    public static void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    public static void menuCartAddItem(String[][] book) {
        // System.out.println("장바구니에 항목 추가하기 :");

        BookList(book);
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++)
                System.out.print(book[i][j] + " | ");
            System.out.println(" ");
        }

        boolean quit = false;

        while (!quit) {
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < NUM_BOOK; i++) {
                if (str.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("장바구니에 추가하시겠습니까? Y | N ");
                str = input.nextLine();

                if (str.toUpperCase().equals("Y")) {
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");
                }
                input.close();
                quit = true;
            } else
                System.out.println("다시 입력해 주세요");
        }

    }

    public static void menuCartRemoveItemCount() {
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem() {
        System.out.println("6. 장바구니의 항목 삭제하기");
    }

    public static void menuCartBill() {
        System.out.println("7. 영수증 표시하기");
    }

    public static void menuExit() {
        System.out.println("8. 종료");
    }

    public static void BookList(String[][] book) {

        book[0][0] = "ISBN1234";
        book[0][1] = "자바프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "최규현";
        book[0][4] = "자바를 이용해서 단계별로 쇼핑몰을 구현해보장";
        book[0][5] = "IT전문서";
        book[0][6] = "2024/06/01";

        book[1][0] = "ISBN1235";
        book[1][1] = "딥러닝프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "최규현";
        book[1][4] = "단계별로 딥러닝을 배우자";
        book[1][5] = "IT전문서";
        book[1][6] = "2024/06/01";

        book[2][0] = "ISBN1236";
        book[2][1] = "컴퓨터공학개론";
        book[2][2] = "22000";
        book[2][3] = "최규현";
        book[2][4] = "기본이 탄탄해야";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2024/06/01";
    }
}
