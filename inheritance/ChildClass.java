package inheritance;

public class ChildClass extends ParentClass{
    public void m3(){
        m1();
        System.out.println("Child class m3 method");
    }
    public void m4(){
        System.out.println("Child class m4 method");
    }

    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass();
        obj1.m3();
        obj1.m4();
        obj1.m1();
        obj1.m2();

        ParentClass parentClass = new ParentClass();
        parentClass.m1();
        parentClass.m2();

    }
}
