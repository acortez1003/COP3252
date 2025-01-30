public class InvoiceTest {
    public static void main(String[] args) {
        Invoice item1 = new Invoice("1", "Hammer", 3, 5.25);
        Invoice item2 = new Invoice("2", "Nails", 20, 0.25);
        Invoice item3 = new Invoice("3", "Screwdriver", -20, 4.75);
        Invoice item4 = new Invoice("4", "Wrench", 6, -2.50);

        System.out.println("Item 1: " + item1.getPartDescrip() + " - Total: $" + item1.getInvoiceAmount());
        System.out.println("Item 2: " + item2.getPartDescrip() + " - Total: $" + item2.getInvoiceAmount());

        System.out.println("\nThis item was given a quantity of -20, and it is corrected to 0: " + item3.getQuantity());
        System.out.println("Item 3: " + item3.getPartDescrip() + " - Total: $" + item3.getInvoiceAmount());

        System.out.println("\nThis item was given a negative price, and it is corrected to 0.0: " + item4.getPrice());
        System.out.println("Item 4: " + item4.getPartDescrip() + " - Total: $" + item4.getInvoiceAmount());

        System.out.println("\nLet's try setting the price and quantity to different values.");
        item1.setPrice(30);
        System.out.println("Setting price to 30: $" + item1.getPrice());
        item1.setPrice(-30);
        System.out.println("Setting price to -30: $" + item1.getPrice());
        item1.setQuantity(20);
        System.out.println("Setting quantity to 20: " + item1.getQuantity());
        item1.setQuantity(-20);
        System.out.println("Setting quantity to -20: " + item1.getQuantity());

        System.out.println("\nPrinting out all of Item 3's information:");
        System.out.println("Part number: " + item3.getPartNum() + 
                           "\nPart description: " + item3.getPartDescrip() +
                           "\nQuantity: " + item3.getQuantity() +
                           "\nPrice: $" + item3.getPrice());
    }
}
