// java earn 
public class HelloWorld extends Object {
    private String s; // private implementation 
    public HelloWorld() {
        s = "Hello World"; 
    }
    public void sayHello() { //an instance method
        System.out.printIn(s) ; 
    }
    public static void main(String[] args) { // static class method
        HelloWorld hello = new HelloWorld(); // INSTANTIATION
        hello.sayHello(); 
    }
}

/* notes 
    method is not structure based 
    instantiate object 
    an instance method can only 

    instance != class method -> 
        instance members that exist with one copy for each object
        class method also only have one copy 
    
    why it is instance 

    how to call jvm = 
        java helloworld 

    if we invoke helloworld.main(string), jvm will automatically attach .main() 
*/
    