package dongcode.point;

public class Point {

    float x; //Hoanh do
    float y; //Tung do
    float z; //Cao do

    //ham tao:

    Point() {}

    Point( float hd, float td, float cd ) {
        x = hd;
        y= td;
        z = cd;
    }

    Point(Point p2) {
        x = p2.x;
        y= p2.y;
        z = p2.z;
    }

    // get, set:
    void setHoanhDo( float hd ) {
        x = hd;
    }
    void setTungDo( float td ) {
        y = td;
    }
    void setCaoDo( float cd ) {
        z = cd;
    }

    float getHoanhDo() {
        return x;
    }
    float getTungDo() {
        return y;
    }
    float getCaoDo() {
        return z;
    }

    // in:
    void inPoint() {
        System.out.print(" (" + x + "," + y + "," + z + ") ");
    }
}
