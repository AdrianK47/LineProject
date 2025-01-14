public class Line2D {
    private Point point1;
    private Point point2;
    
    public Line2D(Point p1, Point p2) {
        point1 = p1;
        point2 = p2;
    }
    public Line2D(int x1, int y1, int x2, int y2){
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }
    public Point getPoint1() {
        return point1;
    }
    
    public Point getPoint2() {
        return point2;
    }
    
    public String toString() {
        return "[(" + point1.getX() + ", " + point1.getY() + "), (" + point2.getX() + ", " + point2.getY() + ")]";
    }
    public double getSlope(){
        return (double)(point1.getY() - point2.getY()) / (point1.getX() - point2.getX());
    }
    public boolean isCollinear(Point p) {
        double slope1 = (double)(point1.getY() - p.getY()) / (point1.getX() - p.getX());
        double slope2 = (double)(point2.getY() - p.getY()) / (point2.getX() - p.getX());
        return slope1 == slope2;
    }
}