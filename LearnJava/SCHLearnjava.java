/* learn java school */
/*
Categories of data = primitive and non primitive
    - primitive 
        predefined by the language and store simple values directly in memory
        stored in STACK 

    - non primitive 
        non primitive == Reference 
        refer to objects rather than storing values directly, created by programmer
        stored in HEAP 

KEYWORDS = modifier, class, method, instance 

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
    1. engineering part = attribute must be private 
    2. understand if its class or instance method -- instance is private  
        understanding if the copy is only one or is it shared or duplicated 
    3. understand if its a constant or variable 
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




*/

