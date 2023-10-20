package oop_exe_2;

public abstract class Auto {

    String made;
    float price;

    public abstract void setPrice(float price);

    public void setMake(String made) {
        this.made = made;
    }

    public String getMake() {
        return made;
    }

    public float getPrice() {
        return price;
    }
}

class Ford extends Auto {

    @Override
    public void setPrice(float price) {
        this.price = price * 2;
    }

    @Override
    public void setMake(String made) {
        super.setMake(made);
    }
}

class Chevy extends Auto {

    @Override
    public void setPrice(float price) {
        super.price = price * 1.5f;
    }

    @Override
    public void setMake(String made) {
        super.setMake(made);
    }
}

class UseAuto {

    public static void main(String[] args) {
        Auto fordCar = new Ford();
        fordCar.setMake("USA");
        fordCar.setPrice(5000);

        Auto chevyCar = new Chevy();
        chevyCar.setMake("Germany");
        chevyCar.setPrice(8000);

        System.out.println(fordCar.getPrice());
        System.out.println(chevyCar.getPrice());
    }

}
