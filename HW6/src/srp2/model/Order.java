package srp2.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int quantity;
    private int price;

    public Order(String clientName, String product, int quantity, int price) {
        this.clientName = clientName;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+ quantity +",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        quantity = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
