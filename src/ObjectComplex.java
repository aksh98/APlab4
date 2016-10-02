//import java.util.*;

public final class ObjectComplex{

    private final Number real, img;
    
    public ObjectComplex(Number a,Number b){this.real = a;this.img = b;}
    public ObjectComplex(Number a){this.real = a; this.img = 0; }

    public final Number getReal(){return this.real;}
    public final Number getImg(){return this.img;}
    
    //Absolute value
    public final Number absValue(){ 
        if(this.real instanceof Double || this.img instanceof Double)
            return Math.sqrt(this.getReal().doubleValue() *this.real.doubleValue() + this.img.doubleValue()*this.img.doubleValue());  
        else if(this.real instanceof Float || this.img instanceof Float)
            return Math.sqrt(this.real.floatValue()*this.real.floatValue() +this.img.floatValue()*this.img.floatValue());
        else
            return Math.sqrt(this.real.intValue()*this.real.intValue() +this.img.intValue()*this.img.intValue());
    }
    
    //Conjugate
    public final ObjectComplex conjugate(){
        Number imagi;
        if(this.getReal() instanceof Double || this.getImg() instanceof Double)
            imagi = this.getImg().doubleValue()*(-1);
        else if(this.getReal() instanceof Float || this.getImg() instanceof Float)
            imagi = this.getImg().floatValue()*(-1);
        else
            imagi = this.getImg().intValue()*(-1);
        return new ObjectComplex(real,imagi); }

    //Add--------------------------------------------------------------------------
    public final ObjectComplex Add(ObjectComplex z,ObjectComplex z2){
        if(z.getReal() instanceof Double ||z2.getImg() instanceof Double || z2.getReal() instanceof Double || z.getImg() instanceof Double ){
            return new ObjectComplex(z2.getReal().doubleValue()+z.getReal().doubleValue(),z2.getImg().doubleValue()+z.getImg().doubleValue());}
        else if(z.getReal() instanceof Float ||z2.getImg() instanceof Float || z2.getReal() instanceof Float || z.getImg() instanceof Float){
            return  new ObjectComplex(z2.getReal().floatValue()+z.getReal().floatValue(),z2.getImg().floatValue()+z.getImg().floatValue());}
        else
            return new ObjectComplex(z2.getReal().intValue()+z.getReal().intValue(),z2.getImg().intValue()+z.getImg().intValue()); }
    
    public final ObjectComplex Add(ObjectComplex z){return Add(this,z);}
    
    //Subtract---------------------------------------------------------------------
    public final ObjectComplex Sub (ObjectComplex z,ObjectComplex z2)
    {
        if(z.getReal() instanceof Double || z2.getImg() instanceof Double || z2.getReal() instanceof Double || z.getImg() instanceof Double){
            return new ObjectComplex(z.getReal().doubleValue()-z2.getReal().doubleValue(), z.getImg().doubleValue()-z2.getImg().doubleValue());}
        else if(z.getReal() instanceof Float ||z2.getImg() instanceof Float || z2.getReal() instanceof Float || z.getImg() instanceof Float){
            return new ObjectComplex(z.getReal().floatValue()-z2.getReal().floatValue(), z.getImg().floatValue()-z2.getImg().floatValue());}
        else
            return new ObjectComplex(z.getReal().intValue()-z2.getReal().intValue(),z.getImg().intValue()-z2.getImg().intValue()); 
    }
    public final ObjectComplex Sub (ObjectComplex z){return Sub(this,z);}
    
    //Multiply----------------------------------------------------------------------
    public final ObjectComplex Mul(ObjectComplex z,ObjectComplex z2){
        if(z.getReal() instanceof Double || z2.getImg() instanceof Double || z2.getReal() instanceof Double || z.getImg() instanceof Double){
            return new ObjectComplex(z2.getReal().doubleValue()*z.getReal().doubleValue()+z.getImg().doubleValue()*z2.getImg().doubleValue(), z2.getImg().doubleValue()*z.getReal().doubleValue()+z.getImg().doubleValue()*z2.getReal().doubleValue()); }
        else if(z.getReal() instanceof Float ||z2.getImg() instanceof Float || z2.getReal() instanceof Float || z.getImg() instanceof Float){
            return new  ObjectComplex(z2.getReal().floatValue()*z.getReal().floatValue()+z.getImg().floatValue()*z2.getImg().floatValue(), z2.getImg().floatValue()*z.getReal().floatValue()+z.getImg().floatValue()*z2.getReal().floatValue());}   
        else
            return new ObjectComplex(z2.getReal().intValue()*z.getReal().intValue()+z.getImg().intValue()*z2.getImg().intValue(), z2.getImg().intValue()*z.getReal().intValue()+z.getImg().intValue()*z2.getReal().intValue());
    }
    public final ObjectComplex Mul(ObjectComplex z){return Mul(this,z);}
    //Display
    public void Display(){
        if(this.getImg().doubleValue()>=0){ System.out.println(this.getReal() + " + "+this.getImg()+ "i");}
        else if(this.getImg().doubleValue() < 0){ System.out.println(this.getReal() +""+ this.getImg()+"i");    }
    }


}