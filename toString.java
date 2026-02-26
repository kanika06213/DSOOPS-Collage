class Main {
    public static void main(String[] args) {
        Student s1 = new grandchild();
        System.out.println(s1);
    }
}

class Student {
    int roll;
    String name;

    Student() {
        roll = 999;
        name = "grandchild object";
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll = " + roll + ", Name = " + name;
    }
}

class child extends Student { }

class grandchild extends child { }
