package dongcode.sophuc;

public class TestComplex {

    public static void main(String[] args) {

        Complex sp1 = new Complex( 2, 1 );
        Complex sp2 = new Complex( 1 );
        Complex sp3 = new Complex( sp1 );
        Complex sp4 = new Complex( -1, -3 );


        sp1.inSP();
        System.out.println();
        sp2.inSP();
        System.out.println();
        sp3.inSP();
        System.out.println();
        sp4.inSP();

        //Cong 2 sp:
        System.out.println("Tong 2 so phuc 1 va 2 la: ");
        sp1.addComplex(sp2).inSP();

        //tich 2 sp:
        System.out.println("Tich 2 so phuc 1 va 4 la: ");
        sp1.mulComplex(sp2).inSP();
    }
}
