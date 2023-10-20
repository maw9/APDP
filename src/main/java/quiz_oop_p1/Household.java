package quiz_oop_p1;

public class Household {

    private int noOfOccupants;

    private int income;

    public Household() {
        this.noOfOccupants = 1;
        this.income = 0;
    }

    public Household(int noOfOccupants) {
        this.noOfOccupants = noOfOccupants;
    }

    public Household(int noOfOccupants, int income) {
        this.noOfOccupants = noOfOccupants;
        this.income = income;
    }

    public int getNoOfOccupants() {
        return noOfOccupants;
    }

    public void setNoOfOccupants(int noOfOccupants) {
        this.noOfOccupants = noOfOccupants;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
