/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author USER
 */
public class Product {
    private String name;
    private String Stock;
    private String price;

    public Product(String name, String Stock, String price) {
        this.name = name;
        this.Stock = Stock;
        this.price = price;
    }
    public Product(){
    
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String Stock) {
        this.Stock = Stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public Object[] toArray(){
        Object[] obj = new Object[3];
        obj[0] = name;
        obj[1] = Stock;
        obj[2] = price;
        
        return obj;
    }
    
}
