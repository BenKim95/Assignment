import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
        //       key      value  → key 값 입력시 value 값 출력 →배열로 나중에 재도전
        HashMap<Integer, String> cafeMenu = new HashMap<Integer, String>();
        cafeMenu.put(1, "1. Signature Coffee   | 시그니처 커피");
        cafeMenu.put(2, "2. COFFEE             | 좋은 원두의 커피");
        cafeMenu.put(3, "3. TEA                | 따뜻한 차");
        cafeMenu.put(4, "4. OREDER             | 장바구니 확인 후 주문");
        cafeMenu.put(5, "5. CANCEL             | 주문을 취소");



        List sigcoffee = new ArrayList();

        // 배열에 객체 입력(배열 안에 객체를 넣는다.)
        sigcoffee.add(new Item("1.일직동커피", "BLCTD만의 시그니처 커피입니다.", 6.9));
        sigcoffee.add(new Item("2.자몽 커피", "자몽을 이용한 시그니처 커피입니다.", 6.9));
        sigcoffee.add(new Item("3.흑임자크림라떼", "고소한 흑임자 시그니처 커피입니다.", 6.9));
        sigcoffee.add(new Item("4.샤케라또", "이건 저도 안먹어봐서 모르겠습니다.", 7.9));

        List coffee = new ArrayList();

        coffee.add(new Item("1. 크림 블랙", "부드러운 크림과 블랙 커피의 조화", 5.9));
        coffee.add(new Item("2. 아메리카노", "좋은 원두로 만든 아메리카노", 4.9));
        coffee.add(new Item("3. 카푸치노", "거품이 이쁜 카푸치노", 5.9));
        coffee.add(new Item("4. 바닐라라떼", "어른들도 좋아하는 달달한 커피", 6.9));

        List tea = new ArrayList();

        tea.add(new Item("1. 밀크티", "부드러운 밀크티", 5.0));
        tea.add(new Item("2. 페퍼민트", "상쾌한 느낌의 페퍼민트티", 4.5));
        tea.add(new Item("3. 유자홍차", "새콤한 유자와 홍차의 만남", 5.5));
        tea.add(new Item("4. 자몽차", "유기농 자몽으로 만든 자몽차", 6.0));

        List orderList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();  // item 인스턴스 생성!!

        // switch문으로 다시 구성해보기!
        while (true) {
            System.out.println("-------BLCTD 카페에 오신걸 환영합니다.-------");
            System.out.println("[-------------BLCTD 카페 MENU----------------]");
            System.out.println(cafeMenu.get(1));
            System.out.println(cafeMenu.get(2));
            System.out.println(cafeMenu.get(3));
            System.out.println(cafeMenu.get(4));
            System.out.println(cafeMenu.get(5));
            System.out.println("번호 입력");

            int order = scanner.nextInt(); // 선택한 번호를 변수인 int order에 저장

            if (order == 1) {
                item.cafeorder(sigcoffee); // signature커피가 있는 item의 매서드 출력
                // 시그니처 커피 선택시 화면
                Scanner scanner1 = new Scanner(System.in); // 시그니처 coffee 메뉴를 보고 숫자 입력할 수 있게 하는 scanner
                String change1 = scanner1.nextLine(); // 유저가 입력한 숫자 받는 곳
                int num1 = Integer.parseInt(change1); // 조회를 위한 형변환

                Item SigcoffeeList = (Item) sigcoffee.get(num1 - 1);
                System.out.println(SigcoffeeList.name + " | " + SigcoffeeList.description + " | " + SigcoffeeList.price); // 선택한 메뉴의 이름, 설명, 가격 가져오기
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인   2. 취소");
                Scanner scanner2 = new Scanner(System.in); // 확인 또는 취소를 누를 수 있는 스캐너 메서드
                String input2 = scanner2.nextLine();
                int num2 = Integer.parseInt(input2); // 특정 숫자값받기
                if (num2 == 1) {
                    orderList.add(SigcoffeeList); // 선택한 메뉴를 장바구니에 저장
                    System.out.println("선택한 메뉴가 장바구니에 추가되었습니다.");
                } else {
                    // 되돌아가기
                }
            }else if (order == 2) {
                item.cafeorder(coffee);
                // 일반 커피 선택시 화면
                Scanner scanner1 = new Scanner(System.in); // coffee 메뉴를 보고 숫자 입력할 수 있게 하는 scanner
                String change1 = scanner1.nextLine(); // 유저가 입력한 숫자 받는 곳
                int num1 = Integer.parseInt(change1); // 조회를 위한 형변환

                Item coffeeList = (Item) coffee.get(num1-1);
                System.out.println(coffeeList.name + " | " + coffeeList.description + " | " + coffeeList.price);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인   2. 취소");
                Scanner scanner2 = new Scanner(System.in); // 확인 또는 취소를 누를 수 있는 스캐너 메서드
                String input2 = scanner2.nextLine();
                int num2 = Integer.parseInt(input2); // 숫자 받기
                if (num2 == 1) {
                    orderList.add(coffeeList);
                    System.out.println("선택한 메뉴가 장바구니에 추가되었습니다.");
                } else { // 되돌아가기

                }
            } else if (order == 3) {
                item.cafeorder(tea);
                // 차 메뉴 선택
                Scanner scanner1 = new Scanner(System.in); // tea 메뉴를 보고 숫자 입력할 수 있는 scanner
                String change1 = scanner1.nextLine(); // 유저가 입력한 숫자 받는 곳
                int num1 = Integer.parseInt(change1); // 형변환 String → int

                Item teaList = (Item) tea.get(num1-1);
                System.out.println(teaList.name + " | " + teaList.description + " | " + teaList.price);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인   2. 취소");
                Scanner scanner2 = new Scanner(System.in); // 확인 또는 취소를 누를 수 있는 스캐너 메서드
                String input2 = scanner2.nextLine();
                int num2 = Integer.parseInt(input2); // 숫자 받기
                if (num2 == 1) {
                    orderList.add(teaList);
                    System.out.println("선택한 메뉴가 장바구니에 추가되었습니다.");
                } else { // 되돌아가기

                }
            } else if (order == 4) {
                System.out.println("전체 주문 내역을 확인합니다.");
                System.out.println("[Order]");
                item.orderList(orderList);
                System.out.println("1. 주문    2. 메뉴판");

                Scanner scanner1 = new Scanner(System.in);
                String input = scanner1.nextLine();
                int order1 = Integer.parseInt(input);

                if (order1 == 1) {
                    System.out.println("주문이 완료되었습니다!");
                    System.out.println("2초후 메뉴판으로 돌아갑니다.");

                    orderList.clear(); // 주문 내역 초기화
                    Order.Clear2sec(); // 2초 후 메인으로 돌아가기
                } else {
                    System.out.println("메인 메뉴판으로 돌아갑니다."); // 메뉴판으로 돌아감
                }
            } else if (order == 5) {
                System.out.println("주문을 취소하시겠습니까?");
                System.out.println("1.주문초기화     2.메인화면으로 돌아가기");
                Scanner scanner3 = new Scanner(System.in);
                String input = scanner3.nextLine();
                int cancelorder = Integer.parseInt(input);
                if (cancelorder == 1) {
                    orderList.clear();
                } else {
                    System.out.println("메인 메뉴판으로 돌아갑니다.");
                }
            }
            else {
                System.out.println("잘못된 입력값입니다.");
            }
        }
    }
}
