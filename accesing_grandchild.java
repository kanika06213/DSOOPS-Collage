class Main {
    public static void main(String[] args) {
        Student s1;
        s1 = new child();
        s1 = new grandchild();
        System.out.println(s1);   
    }
}

class Student {
    int roll;
    String name;

    Student() { }  

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

class child extends Student {

}

class grandchild extends child {
   
}
