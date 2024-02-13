package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;

        ProductOrder[] products = {product1, product2, product3};
        // 시작부터 ProdcutOrder[] orders = new ProductOrder[3]; 으로 쓰고 시작해도 됨.
        int sum = 0;

        for (int i = 0; i < products.length; i++) {
            sum += products[i].price * products[i].quantity;
            System.out.println(products[i].productName + products[i].price + products[i].quantity);
        }
        System.out.println(sum);

    }
}
