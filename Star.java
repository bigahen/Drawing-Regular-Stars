
public class Star {
	private Point point1 = new Point(0,0), point2 = new Point(0,0), point3 = new Point(0,0), point4 = new Point(0,0), point5 = new Point(0,0);
	private int width;
	
	public Star(int width, Point topPoint){
		this.width = width;
		point1.setX(topPoint.getX());
		point1.setY(topPoint.getY());
		generatePoints();
	}
	
	private void generatePoints(){
		//Alogirthm for drawing perfect stars
		point2.setX(point1.getX() + (width/2));
		point3.setX((int)(point1.getX() + (width/(4*Math.cos(36*Math.PI/180)))));
		point4.setX((int)(point1.getX() - (width/(4*Math.cos(36*Math.PI/180)))));
		point5.setX(point1.getX() - (width/2));
		
		point2.setY((int)(point1.getY() + (width*Math.tan(36*Math.PI/180)/2)));
		point3.setY((int)(point1.getY() + (width*Math.sin(72*Math.PI/180))));
		point4.setY((int)(point1.getY() + (width*Math.sin(72*Math.PI/180))));
		point5.setY((int)(point1.getY() + (width*Math.tan(36*Math.PI/180)/2)));
		
		
		//submitted algorithm for calculating star locations
		
		/*point2.setX(point1.getX() + (width/2));
		point3.setX(point1.getX() + (width/3));
		point4.setX(point1.getX() - (width/3));
		point5.setX(point1.getX() - (width/2));
		
		point2.setY(point1.getY() + (width/3));
		point3.setY(point1.getY() + ((width*6/7)));
		point4.setY(point1.getY() + ((width*6/7)));
		point5.setY(point1.getY() + (width/3)); */
		
	}
	
	public Point getPoint1(){
		return point1;
	}
	public Point getPoint2(){
		return point2;
	}
	public Point getPoint3(){
		return point3;
	}
	public Point getPoint4(){
		return point4;
	}
	public Point getPoint5(){
		return point5;
	}
	
}
