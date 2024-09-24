package com.AssignmentDay2;

public class MainClassForDisplayproducts {
    public static void main(String[] args) {
        DisplayProducts[] Products = new DisplayProducts[5];
        Products[0] = new DisplayProducts(1,"Product A",100.1);
        Products[1] = new DisplayProducts(2,"Product B",120.12);
        Products[2] = new DisplayProducts(3,"Product C",170.1);
        Products[3] = new DisplayProducts(4,"Product D",189.12);
        Products[4] = new DisplayProducts(5,"Product E",150.12);

        for(DisplayProducts product  : Products){
            System.out.println("---------------------------------------------");
            product.Display();
        }
   }
}
class DisplayProducts {
    private int proid;
    private String proname;
    private double price;

    public DisplayProducts(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }

    public void Display(){
        System.out.println("Product id: " + proid + " Name: " + proname + " Price: $" + price);
    }
}

