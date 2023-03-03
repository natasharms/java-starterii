package entities;

public class Product {

    // o public serve pra mostrar que essa informação pode ser utilizada em outras packages
    private String name;
    private double price;
    private int quantity;

    public Product() { // construtor padrão (aula 78)
    }

    public Product (String name, double price, int quantity){ // CONSTRUTOR (aula 76)
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { // AULA 78 SOBRECARGA
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts (int quantity){
        this.quantity += quantity; // O this é uma auto referência para o objeto. Ele explicita que é para acessar o atributo e não o parâmetro.

    }
    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    public String toString() { // converte o objeto pra string
        return name
                + ", $ "
                + String.format("%.2f", price) // define o formato
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
