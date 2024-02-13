package ref.ex;

import java.util.Scanner;

public class ProductOrdermain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요. : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];


        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총금액 : " + totalAmount);

    }
    static ProductOrder createOrder(String productName, int price, int quantity ) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrders(ProductOrder[] allall) {
        for (ProductOrder a : allall) {
            System.out.println("상품명: " + a.productName + ", 가격: " + a.price + ", 수량: " + a.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }

}
