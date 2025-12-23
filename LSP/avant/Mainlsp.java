 package LSP.avant;

 public class Mainlsp {
     public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("aire du rectangle ="+rectangle.getArea());

        Rectangle rectangle1 = new Square();
        rectangle1.setHeight(5);
        rectangle1.setHeight(4);
        System.out.println("Aire du carré="+rectangle.getArea());
        

}

}