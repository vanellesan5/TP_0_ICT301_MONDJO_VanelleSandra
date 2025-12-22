package OCP.apres;

public class Circle implements Shape{
    private double width;
    private double height;

    @Override
    public double calculateArea(){
        return height*width;
    }
}

