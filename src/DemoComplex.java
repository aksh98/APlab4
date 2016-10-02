
public class DemoComplex {

	public static void main(String args[]){
		
		Complex a = new Complex(5, 6);
	    Complex b = new Complex(-3, 4);
	    	System.out.println("Complex class output: ");
    		System.out.print("a            = ") ;a.Display();
	        System.out.print("b            = " ); b.Display();
	        System.out.println("Re(a)        = " + a.getReal());
	        System.out.println("Im(a)        = " + a.getImg());
	        System.out.print("b + a        = " ); b.Add(a).Display();
	        System.out.print("a - b        = " ); a.Sub(b).Display();
	        System.out.print("a * b        = " ); a.Mul(b).Display();
	        System.out.print("b * a        = " ); b.Mul(a).Display();
	        System.out.print("conjugate(a) = " ); a.conjugate().Display();
	        System.out.println("|a|          = " + a.absValue());
	    
	        
	ObjectComplex c = new ObjectComplex(5.0, -6);
    ObjectComplex d = new ObjectComplex(-3.9, 4);
    	System.out.println("");
    	System.out.println("--------------------------------------------------");
    	System.out.println("Object_Complex class output: ");
    	System.out.println("");
        System.out.print("c            = ") ;c.Display();
        System.out.print("d            = " ); d.Display();
        System.out.println("Re(c)        = " + c.getReal());
        System.out.println("Im(c)        = " + c.getImg());
        System.out.print("d + c        = " ); d.Add(c).Display();
        System.out.print("c - d        = " ); c.Sub(d).Display();
        System.out.print("c * d        = " ); c.Mul(d).Display();
        System.out.print("d * c        = " ); d.Mul(c).Display();
        System.out.print("conjugate(c) = " ); c.conjugate().Display();
        System.out.println("|c|          = " + c.absValue());

	GenComplex<Double> x = new GenComplex<Double>(5.2, -6.0);
    GenComplex<Double> y = new GenComplex<Double>(-3.0, 4.6);
    	System.out.println("");
        System.out.println("--------------------------------------------------");
    	System.out.println("Generic class Output : <Double> : ");
    	System.out.println("");
    	System.out.print("x            = ") ;x.Display();
        System.out.print("y            = " ); y.Display();
        System.out.println("Re(x)        = " + x.getReal());
        System.out.println("Im(x)        = " + x.getImg());
        System.out.print("y + x        = " ); y.Add(x).Display();
        System.out.print("x - y        = " ); x.Sub(y).Display();
        System.out.print("x * y        = " ); x.Mul(y).Display();
        System.out.print("y * x        = " ); y.Mul(x).Display();
        System.out.print("conjugate(x) = " ); x.conjugate().Display();
        System.out.println("|x|          = " + x.absValue());

	GenComplex<Integer> x1 = new GenComplex<Integer>(5, -6);
    GenComplex<Integer> y1 = new GenComplex<Integer>(-3, 4);
    	System.out.println("");
        System.out.println("--------------------------------------------------");
    	System.out.println("Generic class Output : <Integer> : ");
    	System.out.println("");
    	System.out.print("x1            = ") ;x1.Display();
        System.out.print("y1            = " ); y1.Display();
        System.out.println("Re(x1)        = " + x1.getReal());
        System.out.println("Im(x1)        = " + x1.getImg());
        System.out.print("y1 + x1        = " ); y1.Add(x1).Display();
        System.out.print("x1 - y1        = " ); x1.Sub(y1).Display();
        System.out.print("x1 * y1        = " ); x1.Mul(y1).Display();
        System.out.print("y1 * x1        = " ); y1.Mul(x1).Display();
        System.out.print("conjugate(x1) = " ); x1.conjugate().Display();
        System.out.println("|x1|          = " + x1.absValue());
	}
}
