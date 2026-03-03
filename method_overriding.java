class Main{
    public static void main(String[] args){
       A a1 = new A();
       a1.meth2();
       B b1 = new B();
       b1.meth2();
    }
}

class A{
    // public void meth1(){
    //     return 1;
    // }
    public void meth2(){
        System.out.println("I am a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
