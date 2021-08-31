public class Inventory {
    protected String itemName;
    protected int availableItemNumber;

    public Inventory() {
    }

    public Inventory(String itemName, int availableItemNumber) {
        this.itemName = itemName;
        this.availableItemNumber = availableItemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAvailableItemNumber() {
        return availableItemNumber;
    }

    public void setAvailableItemNumber(int availableItemNumber) {
        this.availableItemNumber = availableItemNumber;
    }

    public void displayItem(){
        System.out.println("\nItem Name        : "+this.getItemName());
        System.out.println("Available Number : "+this.getAvailableItemNumber()+" Pieces");
    }
}
