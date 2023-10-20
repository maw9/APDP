package quiz_oop_p1;

public class ComputeDiscount extends Discount{

    public ComputeDiscount(String itemNo, int price, int quantity) {
        super(itemNo, price, quantity);
    }

    public float computeDiscountOnQuantity() {
        if (quantity >= 1 && quantity <= 10)
            return price * 0.95f * quantity;
        else if (quantity >= 11 && quantity <= 20)
            return price * 0.93f * quantity;
        else if (quantity >= 21 && quantity <= 40)
            return price * 0.91f * quantity;
        else
            return price * 0.9f * quantity;
    }
}
