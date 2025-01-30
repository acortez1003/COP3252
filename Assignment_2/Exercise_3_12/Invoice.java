public class Invoice {
    private String partNum;
    private String partDescrip;
    private int quantity;
    private double price;

    public Invoice(String partNum, String partDescrip, int quantity, double price) {
        this.partNum = partNum;
        this.partDescrip = partDescrip;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.price = (price > 0.0) ? price : 0.0;   // if > 0.0, set to price. else, set to 0.0
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }
    public String getPartNum() {
        return partNum;
    }

    public void setPartDescrip(String partDescrip) {
        this.partDescrip = partDescrip;
    }
    public String getPartDescrip() {
        return partDescrip;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = (price > 0.0) ? price : 0.0;
    }
    public double getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
 }