package oopconcept;

public class polymorphism_overloading {
    int add(int a ,int b){
        return a + b;
    }
    int add(int p,int q,int r,int s){
        return p + q + r + s;
    }
    void add(float h,float i,float j){
        System.out.println(h+i+j);
    }

    public static void main(String[] args) {
        polymorphism_overloading obj = new polymorphism_overloading();
        int ans = obj.add(10,20);
        System.out.println(ans);
        int ans1 = obj.add(2,3,4,5);
        System.out.println(ans1);
        obj.add(5,6,7);
    }
}
