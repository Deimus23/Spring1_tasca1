package Nivel1.Ejercicio1.Instument;
public abstract class Instrument {
    private String name;
    private int price;
    public Instrument(String name, int precio) {
        this.name = name;
        this.price = precio;
    }
    public String getNombre() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    static{System.out.println("Acces to satatic class");}
}