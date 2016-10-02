//import java.util.*;

public final class Complex{

	private final Integer real, img;
	
	public Complex(Integer a,Integer b){this.real = a;this.img = b;}
	public Complex(Integer a){this.real = a; this.img = 0; }

	public final Integer getReal(){return this.real;}
	public final Integer getImg(){return this.img;}
	//Absolute value
	public final Double absValue(){ 
		return (Double) Math.sqrt(this.real*this.real + this.img*this.img);  }
	
	//Conjugate
	public final Complex conjugate(){
		//new Complex;
		return new Complex(real,img*(-1)); }

	//Add
	public final Complex Add(Complex z,Complex z2){
		return new Complex(z2.real+z.real,z2.img+z.img); }
	public final Complex Add(Complex z){return Add(this,z);}
	
	//Subtract
	public final Complex Sub (Complex z,Complex z2){
		return new Complex(z2.real-z.real, z2.img-z.img);}
	public final Complex Sub (Complex z){return Sub(this,z);}
	
	//Multiply
	public final Complex Mul(Complex z,Complex z2){
		return new Complex(z2.real*z.real+z.img*z2.img, z2.img*z.real+z.img*z2.real);}
	public final Complex Mul(Complex z){return Mul(this,z);}
	//Display
	public void Display(){
		if(img>0){System.out.println(this.getReal() + " + "+this.getImg()+ "i");}
		else if(img<0){System.out.println(this.getReal() + " - "+(this.getImg())*(-1)+"i");	}
		else if(img==0){System.out.println(this.getReal()); }
	}


}