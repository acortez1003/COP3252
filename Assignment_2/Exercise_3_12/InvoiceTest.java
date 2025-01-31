public class InvoiceTest {
    public static void main(String[] args) {
        Invoice item1 = new Invoice("1", "Hammer", 3, 5.25);
        Invoice item2 = new Invoice("2", "Nails", 20, 0.25);
        Invoice item3 = new Invoice("3", "Screwdriver", -20, 4.75);
        Invoice item4 = new Invoice("4", "Wrench", 6, -2.50);

        System.out.printf("Item 1: %s - Total: $%.2f%n", item1.getPartDescrip(), item1.getInvoiceAmount());
        System.out.printf("Item 2: %s - Total: $%.2f%n", item2.getPartDescrip(), item2.getInvoiceAmount());

        System.out.printf("%nThis item was given a quantity of -20, and it is corrected to 0: %d%n", item3.getQuantity());
        System.out.printf("Item 3: %s - Total: $%.2f%n", item3.getPartDescrip(), item3.getInvoiceAmount());

        System.out.printf("%nThis item was given a negative price, and it is corrected to 0.0: $%.2f%n", item4.getPrice());
        System.out.printf("Item 4: %s - Total: $%.2f%n", item4.getPartDescrip(), item4.getInvoiceAmount());

        System.out.printf("%nLet's try setting the price and quantity to different values.%n");
        item1.setPrice(30);
        System.out.printf("Setting price to 30: $%.2f%n", item1.getPrice());
        item1.setPrice(-30);
        System.out.printf("Setting price to -30: $%.2f%n", item1.getPrice());
        item1.setQuantity(20);
        System.out.printf("Setting quantity to 20: %d%n", item1.getQuantity());
        item1.setQuantity(-20);
        System.out.printf("Setting quantity to -20: %d%n", item1.getQuantity());

        System.out.printf("%nPrinting out all of Item 3's information:%n");
        System.out.printf("Part number: %s%nPart description: %s%nQuantity: %d%nPrice: $%.2f%n",
                item3.getPartNum(), item3.getPartDescrip(), item3.getQuantity(), item3.getPrice());
    }
}