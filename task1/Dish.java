package task1;

public class Dish {
    private int foodAmount;

    public Dish(int foodAmount) {
        if(foodAmount < 0) System.out.println("Отрицательное значение.");
        else this.foodAmount = foodAmount;
    }

    public boolean removeFood(int foodAmount){
        if(foodAmount <= this.foodAmount){
            this.foodAmount -= foodAmount;
            return true;
        }
        return false;
    }
    public void addFood(int foodAmount){
        this.foodAmount += foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
