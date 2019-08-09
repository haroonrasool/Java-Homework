package Calculator;

class Grandpa {
    void truck() {
        System.out.println("Grandpa's Truck");
    }
}

class Father extends Grandpa {
    void car() {
        System.out.println("Father's Car");
    }
}

class Son extends Father {
    void bicycle() {
        System.out.println("Son's Bicycle");
    }
}

class Daughter extends Father {
    void tricycle() {
        System.out.println("Daughter's Tricycle");
    }
}

// Multilevel Inheritance Example: Grandpa -> Father -> Son
// Hierarchical Inheritance Example: Grandpa -> Father => Son & Daughter
public class Inheritance {
    public static void main(String[] args) {
        Son son = new Son();
        son.bicycle();
        son.car();
        son.truck();
        //son.tricycle(); // Compile Time Error
        System.out.println("");
        Daughter dtr = new Daughter();
        dtr.tricycle();
        dtr.car();
        dtr.truck();
        //dtr.bicycle(); // Compile Time Error
    }
}
