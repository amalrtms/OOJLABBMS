class Age extends Exception{
    public Age(String message){
        super(message);
    }
}

class father{
    int age;
    public father(int age) throws Age {
        if (age < 0) {
            throw new Age("Age cannot be less than zero");
        }
        this.age = age;
        System.out.println("Father's age is= " + this.age);
    }
}

class son extends father{
    int sonage;
    public son(int fatherage, int sonage) throws Age {
        super(fatherage);
        if (sonage < 0) {
            throw new Age("Son's age cannot be less than zero");
        }
        if (sonage >= fatherage) {
            throw new Age("Son's age cannot be more than or equal to Father's age");
        }
        this.sonage = sonage;
        System.out.println("Son's age is= " + this.sonage);
    }
}

public class InheritanceTree{
    public static void main(String[] args) {
	System.out.println("AMALROY 1BM23CS025");
        try{        
            System.out.println("CASE 1: Valid case");
            son son1 = new son(60, 20); 
            System.out.println("\nCASE 2: Son's age is more than or equal to Father's age");
            son son2 = new son(20, 30);
        } catch(Age a){
            
            System.out.println("Exception: " + a.getMessage());
        }
        try{
            System.out.println("\nCASE 3: Father's age is less than zero");
            father father1 = new father(-20);
        } 
	catch (Age a){
            System.out.println("Exception: " + a.getMessage());
        }
    }
}
