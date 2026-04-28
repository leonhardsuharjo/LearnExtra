/* learn java school */
/*
lecture april 14 2026 

Categories of data = primitive and non primitive
    - primitive 
        predefined by the language and store simple values directly in memory
        stored in STACK 

    - non primitive 
        non primitive == Reference 
        refer to objects rather than storing values directly, created by programmer
        stored in HEAP 

KEYWORDS = modifier, class, method, instance, variables, objects, attribut

Java constants 
    specified by modifier "final" 
        a final method cannot be overriden 
    
Overrideable method 
    have a copy for each instance 
    the opposite of class method 

Class method 
    cannot be overriden 
    characterized by STATIC modifier 

Private method 
    cannot be overriden -- is not overridable 

Default method 
    depends if the subclass is within the same pacakage or outside the package
        if within package, it can be overriden 
        if outside, then no

Instance method 
    is overrdible, unless is given keyword "final" 


Final class 
    a class that cannot be further specialized
    a class that can be instantiated, but cannot be inheritted 

Static modifier 
    only one copy 

different modifiers = public, private, default, protected 

Compiler requirement = cant be keyword or boolean

"OR" symbol in java = " |= "

Difference between ++num and num++
    num = 8 
    print(++num) #output = 9
    print(num++) #output = 9 not 10

Recieve inut from user = 
    scanner in = new scanner (systen.in)

multiplication has lower priority than "-"", when " -variable "

*EXAM* question = avoid if-else if
    use condition less than 3 conditions 
    avoid using multiple if and switch 
    use dependence inversion instead 
        inject object to be used beforehand
    
    all attributes inside public class should be private 

*3 STEPS OF INFORMATION HIDING* == to be done by creator programmer  
    1. engineering part = attribute must be PRIVATE 
    2. understand if its CLASS or INSTANCE method -- instance is private  
        understanding if the copy is only one or is it shared or duplicated 
        class = ONE copy, instance = multiple copies for multiple instance
    3. understand if its a CONSTANT or VARIABLE 
        if its constant, use final as it is unchangeable 

For loop 
    for-each loop = used to loop through elements in an array 
        EXAMPLE = 
            String[] cars = {"volvo", "bmw"}; 
            for (String i : cars) {System.out.printIn(i);} 

EXAMPLE code #1 = 
    import java.util.Scanner
    public class SchLearnJava
    {
        public static void main (String [] args)
        {
            final int FIRST = 0;
            String selection; 
            Scanner in = new Scanner (System.in); 
            System.out.printIn("Game Option"); 
            System.out.printIn("Enter your selection: ");
            selection = in.nextLine(); 
        }
    }

Opt app java = netbeans 

In a file u can only have ONE PUBLIC CLASS
    public CLASS != public STRING 
    
    why do an instantiation = because we are in a class so we cannot access it directly
        therefore, by default, u can NOT access instance method from a static method
            the workaround = we can access an instance method from a static method by calling the public class.instance method
            workaoround 2 = change the instance method into a static method by doing "public static" from previously "public string" 
        by default, you can access static method from an instance method 

By default, the object has built in functions 
    example => 
        public class App {} #import app library

always add CONSTRUCTOR to a PRIVATE FINAL

when no class is specified ==> it is a DEFAULT access modifier, but its not always the case 
*/

/*
Lecture April 20 2026 

Composition != inheritance 
    composition is black box use 
    because we are accessing from user perspective 

    example of composition -- Gradebook.java file 

an object must match the type

DIfference bween attribute and local variable == 
    - local variable is never initialized 
    - attributes are Always initialized 
        attributes are variables defined in a class 

What is instanace member ? 
    is created for each member 
    will exist only if u instantiate the object 

If we use "Override" on an object it will be error, 
    unless we use public static on the object previously

The two types of METHOD = 
    the instance 
    the static 

with "static" method on definition of variable, we can use the function on another java file
    we can make a copy, but we cannot invoke a static instance 
    we cannot call instance from a static method

even within the same class, always use get_()
    example => getCourseName()
    to ensure proper acccess and ENFORCE INFORMation Hiding and security approach 

    the three principles of God 
        1. always make an attribute private 
            dont come to exam with protected 
            because a get or set will just make the private work, so for security always use private 
        2. instance or class 
        3. constant or variable 
            if u have a constant, then make it final,, because we will avoid error due to someone changing the value 
                if u enforce this rule, []

Encapsulation and INfo hiding is always orthogonal 

Primitive vs Reference type 
    an attempt to use an uninitialized local variable causes a compilation error 
    a variable declared type indicate whether a variable is primitive or reference 
    total number of primitive types = 8 

Strings in java are objects that are bacled internally by a char array 
    example code -- defining a string => 
        String str = "Geeks";
        String str = new String("Geeks");
        str="Best"->str= new String("Best");

    when a string object is made, two objects will be made
        one in heap and one in string constant pool
    
    difference between string and any other objects = []
    
    string are immutable, therefore they can be shared 
        char is a primitive type

    Array is an object,, is a REFERENCE type
        uses "[]"
        example code =>
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            // Accessing the first element (index 0)
            System.out.println(cars[0]); // Outputs: Volvo
    
    how to Make COMMENT in Java = 
    
    String as real or fake number =
        given y = 5 
            y+2 = 52,, not 7
        however 
            "y+2= "+ (y+2) // will give 7 
    
    Default CONSTRUCTOR 
        Example in Gradebook.java => Gradebook{}
        default constructor will do nothing but calling the superclass 
        when we dont have default constructor == when we dont define any constrctor 
            we can define many constructor
    
        what if no constructor with any parameter 
            when we define a superclass it will be error 
            therefore need to explicitly introduce a constructor 
        
        a default constructor shall have no parameters 
            therefore use keyword "extend" 
*/

/*
class 21 April 2026 

Why use "override" explicitly = it will ask to the compiler to check if it is really doing overriding 
    error at compile time is easier to be solved than the ones on run time


new changes to code java folder 
    # new "account.java" file in folder
    public account (int id, String type, Person holder) {}
        public Account(int id, String type, Person holder, float balance) {}   
        public float getBalance() {return balance;}
        public void setBalance(float b) {}
        public int getId() {return id;}
        public String getType(){}
        public Person getHolder() {}
        public static int getCounter {return Counter;}
        public void withdraw(float s){
              if (balance>s) balance=s; 
              else System.out.println("not enough money" + getBalance() + " to withdraw" + s)
          }
        public void deposit(float s){
          if (s > 0) balance +=s; 
          else System.out.println("wrong deposit")
      }

    # new "App.java" file in folder 
    public class App {
        public static void main(String[], args) {
            Account a; 
            Scanner in; 

            for (int c=0; c<1; c++){
                System.out.println("insert holder first and last name and id"); 
                Person p=new Person(in.next(), in.next(), in.nextInt()); 
                System.out.println("insert account id and type  "); 
                a[c]=new Account (in.nextInt(), in.next(), p); 
                System.out.println(a); 
            }

            for (Account b: a) System.out.println(b);
            a[1].deposit(1000); 
            a[2].withdraw(300); 
            for(Account b:a) System.out.println(b); 

        }
    }
    class Person {
        private final String firstname;
        private final String lastname;  
    }

Netbeans app -- download and setup in progress 

avoid any overrideable methods 
*/

/* 
class 28 April 2026 

@override checks if overriding is properly done 

Steps = 
    1. define the variable 
    2. do the "this.var = var" process 
    3. do the getVar process for info hiding 
    4. for each big classes made, each classes have thier own sub elements 

what to do in exam 
    - if sales(>0) sales=s; //sales will be initiliazed to zero anyway in the end of the day by its initializer so no need to put if sales = 0 (minimize if conditions but take adv of the OOP behaviour)
    - first instruction of the construtor = calling antoher construtor, calling the superclass constructor (calling super without parameter implicitly)
      - chain of constructors calling each other so that if conditions are seperated into different constructors 
        - the top constructor in the subclass will call the constructor in the superclass Implicitly
    - question of what is missing in the code 
    - no final or private because we are just defining a variable 
    - the problem of subtyping = 
        basecomission is subtype of commission == meaning the interface of base have to contain interface of commission
        if public superclass become a protected or private subclass, unless subtype is broken
    - elements belonging to a superclass that are defined private MUST use get() even if it is unheritted to a subclass
        for info hiding eng, never use protected, always use private 
    - what will object do ? = will initialize all the attributes to their default Values 
        what are default val = 0 or false (for boolean) for primitive type, null for reference type 
            primitive = int, double, float, char, long, byte, boolean, short
            reference = []

Current progress => inheritance slides

overriding example = 
    classOne (AttributeOne)
    classOne (AttributeOne, AttributeTwo)
    classOne (AttributeOne, AttributeTwo, AttributeThree)


*/