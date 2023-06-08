import java.util.List;

public class Item extends Menus {

    double price;


    public Item() {
    }

    public Item(String name, String description, double price) {
        super(name, description); // 상속받은 조상 생성자 호출
        this.price = price;
    } // 매개변수가 있는 생성자


    public void cafeorder(List list) {
        for (int i = 0; i < list.size(); i++) {
            Item menuList2 = (Item) list.get(i);  // list.get(i)는 공식이므로 이해보단 암기
            System.out.println(menuList2.name + " | " + menuList2.description + " | " + menuList2.price);
        } // 메뉴리스트를 위한 매서드 출력
    }

    public void orderList(List list) { // Order 선택시 나타날 메뉴에서 선택한 주문들의 배열)
        double totalPrice = 0.0;

        for (int i = 0; i < list.size(); i++) {
            Item menuList2 = (Item) list.get(i);
            System.out.println(menuList2.name + " | " + menuList2.description + " | " + menuList2.price); //주문한 상품 이름 / 설명 / 가격 / → 같은 상품 n개로 주문할 경우 상품갯수 n개 및 가격 x n개로 출력되게 만들어보기
            totalPrice += menuList2.price; // 총 금액 = menuList2에 저장된 금액의 합산
        }
        System.out.println("[TOTAL]");
        System.out.println("￦ " + totalPrice);
    }
}