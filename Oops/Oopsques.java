class Oopsques{
    public static void main(String args[]){
      Complex c1 = new Complex(2,3);
      System.out.println(c1.real);
      Complex c2= new Complex(2,4);
      c1.sum(c1,c2);
      c1.sub(c1,c2);
      c1.mul(c1,c2);
    }
}

class Complex{
    int real;
    int imag;
    Complex(int real,int imag){
       this.real = real;
       this.imag = imag;
    }
    void sum(Complex c1 , Complex c2){
        double realsum=c1.real+c2.real;
        double imagsum=c1.imag+c2.imag;
      System.out.println(realsum +"+" + imagsum+ "i");
    }
    void sub(Complex c1 , Complex c2){
        double realsub=c1.real-c2.real;
        double imagsub=c1.imag-c2.imag;
      System.out.println(realsub +"-" + imagsub+"i");
    }
    void mul(Complex c1 , Complex c2){
       int a=c1.real*c2.real;
        int b=c1.real*c2.imag; 
        int c=c1.imag*c2.real; 
        int d=c1.imag*c2.imag;
        int x = b+c; 
        System.out.println(a +"+" + x+"i" + "-" +d);
    }
}

