package ChapterThree.Invoice;

public class Invoice {

    private String name;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String name, String description, int quantity, double price){
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setNumber(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount(){

        if( quantity <= 0){
            quantity = 0;
        }
        if(price <= 0.0){
            price = 0.0;
        }
        return quantity * price;
    }
}
