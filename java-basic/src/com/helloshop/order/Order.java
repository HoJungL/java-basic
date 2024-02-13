package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    //public 이 있어야 다른 패키지에서 참고가 가능함
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;

    }
}
