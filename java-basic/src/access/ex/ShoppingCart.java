package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;
    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 참");
            return;
        }
        items[itemCount] = item;
        itemCount ++;
    }

    // 내가 푼 풀이
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total=0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:"+items[i].getName() +", 합계:"+items[i].getTotalPrice());
            total += items[i].getTotalPrice();
        }
        System.out.println("전체합계: "+ total);
    }
    
    /* 쌤이 푼 풀이
        public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:"+items[i].getName() +", 합계:"+items[i].getTotalPrice());
            total += items[i].getTotalPrice();
        }

        private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int 1= 0 ; i<itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
        sout("전체 가격 합:" + calculateTotalPrice());
     */
}


