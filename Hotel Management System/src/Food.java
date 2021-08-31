public class Food {
    protected String foodName;
    protected double foodPrice;
    protected int foodPiece;

    public Food() {
    }

    public Food(String foodName, double foodPrice, int foodPiece) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodPiece = foodPiece;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodPiece() {
        return foodPiece;
    }

    public void setFoodPiece(int foodPiece) {
        this.foodPiece = foodPiece;
    }

    public void displayFoodMenu(){
        System.out.println("\nFood Name  : "+this.getFoodName());
        System.out.println("Food Price   : "+this.getFoodPrice());
    }
}
