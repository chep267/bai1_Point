package dongcode.sophuc;

public class Complex {

    double a; //Phan thuc
    double b; //Phan ao

    //ham tao:
    Complex() {
        a = 0;
        b = 0;
    }

    Complex(double thuc) {
        a = thuc;
        b = 0;
    }

    Complex(double thuc, double ao) {
        a = thuc;
        b = ao;
    }

    Complex( Complex sp ) {
        a = sp.a;
        b = sp.b;
    }

    //get,set:
    void setPhanThuc(double thuc) {
        a = thuc;
    }
    void setPhanAo(double ao) {
        b = ao;
    }

    double getPhanThuc(){
        return a;
    }
    double getPhanAo(){
        return b;
    }

    //Cac phep toan:

    Complex addComplex( Complex sp2 ) {
        Complex sp3 = new Complex( a + sp2.a , b + sp2.b );
        return sp3;
    }

    Complex subComplex( Complex sp2 ) {
        Complex sp3 = new Complex( a - sp2.a , b - sp2.b );
        return sp3;
    }

    Complex mulComplex( Complex sp2 ) {
        Complex sp3 = new Complex( (a * sp2.a) - (b * sp2.b), (a * sp2.b) + (b * sp2.a) );
        return sp3;
    }

//    boolean canDivComplex() {
//        if( a==0 && b==0 ) {
//            return false;
//        }
//        else return true;
//    }

    Complex divComplex( Complex sp2 ) {
        if( (sp2.a == 0) && (sp2.b == 0) ) {
            System.out.println("SP bi chia = 0. Khong chia duoc!");
            return null;
        }
        else {
            double x = ( (sp2.a * a) + (sp2.b * b) ) / ( (sp2.a * sp2.a) + (sp2.b * sp2.b) );
            double y = ( (sp2.a * b) - (sp2.b * a) ) / ( (sp2.a * sp2.a) + (sp2.b * sp2.b) );
            Complex sp3 = new Complex( x,y );
            return sp3;
        }
    }

    //In so phuc:
    void inSP() {

        if ( a == 0 ) {
            if( b > 0 ) {
                System.out.print(b + "i");
            }
            else if( b == 0 ){
                System.out.print(a);
            }
            else {
                System.out.print(b +  "i");
            }
        }

        else {
            if( b > 0 ) {
                System.out.print(a + "+" + b + "i");
            }
            else if( b == 0 ){
                System.out.print(a);
            }
            else {
                System.out.print(a + "-" + (-b) + "i");
            }
        }
    }
}
