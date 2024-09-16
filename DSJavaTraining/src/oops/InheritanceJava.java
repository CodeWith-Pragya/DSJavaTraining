package oops;

public class InheritanceJava {
    public static void main(String[] args) {
        Parents parents = new Parents();
        //using inheritance call grandParent method
        parents.printGrandParent();
    }
}
class Parents extends GrandParents {
    void printParent(){
        System.out.println(" im parent");
    }
}
class GrandParents{
    void printGrandParent(){
        System.out.println(" im grandparent");
    }
}
