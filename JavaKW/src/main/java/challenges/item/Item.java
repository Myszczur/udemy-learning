package challenges.item;

public class Item {
    public static int numItems = 0;
    final int ID;

    Item(int id) {
        ID = id;
    }

    public static int getNextId() {
        return Item.numItems++;
    }

    public static Item getItem() {
        int id = Item.getNextId();
        Item item = new Item(id);
        return item;
    }

    public static void printNumItems() {
        System.out.println("Num items: " + Item.numItems);
    }

    public void printId() {
        System.out.println("Item ID: " + this.ID);
    }
}
