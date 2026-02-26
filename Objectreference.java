// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "abc");
        Student s2 = new Student(102, "xyz");
        System.out.println(s1);
        System.out.println(s2);
     

        

    }
}
class Student{
    int roll;
    String name;
    Student(int roll,String name){
        this.roll = roll;
        this.name = name;

    }
}
