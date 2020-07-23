package dongcode.point;

public class TestPoint {

    public static void main(String[] args) {

        Point p1 = new Point(1,1,1);
        Point p2 = new Point(p1);
        Point p3 = new Point(2,2,1);

        p1.inPoint();
        System.out.println("\nCap nhat hoanh do moi cho p1 thanh 5 : ");
        p1.setHoanhDo(5);
        p1.inPoint();
    }
}
