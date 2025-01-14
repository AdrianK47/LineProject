public class Point{
    int x;
    int y;
    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int xCoord, int yCoord){
        x = xCoord;
        y = yCoord;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int newCoord){
        x = newCoord;
    }
    public void setY(int newCoord){
        y = newCoord;
    }
    public int manhattanDistance(Point other){
        int xDiff = this.getX() - other.getX();
        int yDiff = this.getY() - other.getY();

        return Math.abs(xDiff) + Math.abs(yDiff);
    }
    public boolean isCollinear(Point p1, Point p2){
        double firstSlope = (double)(p1.getY() - this.getY()) / (p1.getX() - this.getX());
        double secondSlope = (double)(p2.getY() - p1.getY()) / (p2.getX() - p1.getX());

        if(this.getX() == p1.getX() && p1.getX() == p2.getX()){
            return true;
        }

        return firstSlope == secondSlope;
    }
}