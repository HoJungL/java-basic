package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders); // 컨트롤 알트 V 누르면 알아서 추천해줌
        System.out.println("총 금액: " + totalAmount) ;
    }

    static ProductOrder createOrder(String productname, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productname;
        product.price = price;
        product.quantity = quantity;
        return product;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;

/*    static void getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
//        System.out.println("총 합계: "+ total);*/ //이것도 가능함
    }




}
