public class Wolf {
    
    String sex;
    String color;
    String name;
    int age;
    float weight;
    
    void go() {
        System.out.println(name + " is going");
    }

    void sit() {
        System.out.println(name + " is sitting");
    }

    void run() {
        System.out.println(name + " is running");
    }

    void howl() {
        System.out.println("* " + name + " is howling");
    }

    void hunt() {
        System.out.println(name + " is hunting");
    }

}
