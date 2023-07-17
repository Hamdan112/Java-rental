package om.gov.taxoman.entity;

public class Item {

    private int itemId;
    private String itemName;
    private int quantity;
    private String itemType;
    private String itemDescription;

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", itemType='" + itemType + '\'' +
                ", itemDescreption='" + itemDescription + '\'' +
                '}';
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Item(int itemId, String itemName, int quantity, String itemType, String itemDescreption) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemType = itemType;
        this.itemDescription = itemDescreption;
    }

    public Item() {
    }
}
