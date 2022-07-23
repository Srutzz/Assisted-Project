package assistedproject2;

public class abstraction {
    public static void main(String[] args) 
    { 
        shapes s1 = new circle("Black", 2); 
        shapes s2 = new rectangle("Blue", 1, 2);
        System.out.println(s1.disp()); 
        System.out.println(s2.disp()); 
    } 
}
abstract class shapes  
{ 
    String color; 
    abstract double area(); 
    public abstract String disp(); 
    public shapes(String color) 
    { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
    public String getcolor() 
    { 
        return color; 
    } 
} 
class circle extends shapes 
{ 
    double r; 
    public circle(String color,double r) 
    { 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.r=r; 
    }
    double area() 
    { 
        return Math.PI * Math.pow(r, 2); 
    } 
    @Override
    public String disp() 
    { 
        return "Circle color is " + super.color + "and area is : " + area(); 
    } 
} 
class rectangle extends shapes
{ 
    double l; 
    double w; 
    public rectangle(String color,double l,double w) 
    { 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.l=l; 
        this.w=w; 
    } 
    double area() 
    { 
        return l*w; 
    } 
    @Override
    public String disp() 
    { 
        return "Rectangle color is " + super.color +"and area is : " + area(); 
    } 
} 

