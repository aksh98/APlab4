//import java.util.*;

public final class GenComplex  <T extends Number> {

	private final T real, img;
	
	public GenComplex(T a,T b){this.real = a;this.img = b;}
	
	public final T getReal(){return this.real;}
	public final T getImg(){return this.img;}
	
	//Absolute value
	public final Double absValue(){ 
		return Math.sqrt(real.doubleValue()*real.doubleValue() + img.doubleValue()*img.doubleValue());  }
	
	//Conjugate
	public final GenComplex <Number> conjugate(){
		return new GenComplex<Number>(this.real.doubleValue(),this.img.doubleValue()*(-1)); }

	//Add
	public final GenComplex <Number> Add(GenComplex<T> z,GenComplex<T> z2){
		return new GenComplex<Number>(z2.real.doubleValue()+z.real.doubleValue(),z2.img.doubleValue()+z.img.doubleValue()); }
	public final GenComplex<Number> Add(GenComplex<T> z){return Add(this,z);}
	
	//Subtract
	public final GenComplex<Number> Sub (GenComplex<T> z,GenComplex<T> z2){
		return new GenComplex<Number>(z2.real.doubleValue()-z.real.doubleValue(), z2.img.doubleValue()-z.img.doubleValue());}
	public final GenComplex<Number> Sub (GenComplex<T> z){return Sub(this,z);}
	
	//Multiply
	public final GenComplex<Number> Mul(GenComplex<T> z,GenComplex<T> z2){
		return new GenComplex<Number>(z2.real.doubleValue()*z.real.doubleValue()+z.img.doubleValue()*z2.img.doubleValue(), z2.img.doubleValue()*z.real.doubleValue()+z.img.doubleValue()*z2.real.doubleValue());}
	public final GenComplex<Number> Mul(GenComplex<T> z){return Mul(this,z);}
	
	//Display
	public void Display(){
		if(getImg().doubleValue() > 0){System.out.println(this.getReal() + "+"+this.getImg()+ "i");}
		else if(getImg().doubleValue() < 0){System.out.println(this.getReal() +""+ (this.getImg())+"i");	}
		else if(getImg().doubleValue()==0){System.out.println(this.getReal()); }
	}


}