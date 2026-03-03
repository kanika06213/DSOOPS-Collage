
public class Main
{
	public static void main(String[] args) {
		Base b =  new Base();
		derived d = new derived();
	}
}

class Base extends Main{
    Base(){
        System.out.println("i am a constructor");
    }
    Base(int x){
        
        System.out.println("I am an overloaded constructor");
    }
    public int x;
    public int getx(){
        return x; 
    }
    public void setx(int x){
        this.x = x;
    }
}

class derived extends Base{
    derived(){
        super(0);
        System.out.println("I am a derived class constructor.");
    }
    derived(int x, int y){
        super(x);
        System.out.println("I am a derived class constructor 2.");
    }
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y = y;
    }
}
