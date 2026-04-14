/*
1. Exam question = 
    - what happen when we want to edit the private final n 
        to do this, we need to make a new public int called getN to identift whether the n is constant or not  
    
        NumCheck will extend to other object because its public 
        no need to call super() in NumCheck

*/

public class NumCheck {
    private final int n; /* the attribute will be the number */

    public int getN() {return n;}

    public NumCheck(int n){
        this.n=n;
    }

    public void sign(){
        if (n>0) System.out.println("positive");
        else if (n<0) System.out.println("negative");
        else System.out.println("zero");
    }

    public void oddity(){
        if (n%2!=0) System.out.println("odd");
        else System.out.println("even");
    }
}
