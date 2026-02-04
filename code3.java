class Car{
    String brand;
    int model;
    double price;
    Car(String brand,int model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;

    }
void run(){
    System.out.println(brand);
    System.out.println(model);
    System.out.println(price); 

}


}


public class code3 {
    public static void main(String[] args) {
        Car cr = new Car("Toyota",2010,1000000);
        cr.run();

    }
    
}