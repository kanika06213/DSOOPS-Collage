public class Main
{
	public static void main(String[] args) {
	   Rectangle r1 = new Rectangle(74, 89);
	   r1.calculateArea();
	}
}

class Rectangle{
    private int length;
    private int breadth;
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea(){
        int area = length * breadth;
        System.out.println("Area of Rectangle:" + area);
    }
    
}
