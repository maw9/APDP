package quiz_oop_p1;

public class HouseHoldDemo {

    public static void main(String[] args) {
        Household house1 = new Household();
        System.out.println("Using no argument constructor");
        System.out.printf("no of occupants %5d income %5d", house1.getNoOfOccupants(), house1.getIncome());
        System.out.println();

        Household house2 = new Household(5);
        System.out.println("Using no argument constructor");
        System.out.printf("no of occupants %5d income %5d", house2.getNoOfOccupants(), house2.getIncome());
        System.out.println();

        Household house3 = new Household(8, 3);
        System.out.println("Using no argument constructor");
        System.out.printf("no of occupants %5d income %5d", house3.getNoOfOccupants(), house3.getIncome());
        System.out.println();
    }

}
