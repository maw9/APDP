package quiz_oop_p1;

public class UseDiscount {

    public static void main(String[] args) {
        ComputeDiscount compute = new ComputeDiscount("Acer Inspire", 700, 20);
        float price = compute.computeDiscountOnQuantity();
        System.out.println("Net price after discount: " + price);
    }

}
