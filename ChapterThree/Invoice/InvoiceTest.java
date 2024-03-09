package ChapterThree.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("number", "a product", 1, 20.0);


        System.out.printf("The total cost of item %s is $%.2f", invoice.getName(), invoice.getInvoiceAmount());
    }
}
