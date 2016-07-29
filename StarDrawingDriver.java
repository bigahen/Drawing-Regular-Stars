
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class StarDrawingDriver extends Applet{
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics page){	
		setBackground(Color.BLACK);
		Star star1 = new Star(50, new Point(50,50));
		Star star2 = new Star(30, new Point(110,30));
		Star star3 = new Star(40, new Point (190, 60));
		Star star4 = new Star(55, new Point(130, 70));
		Star star5 = new Star(35, new Point(220, 15));
		Star star6 = new Star(45, new Point(275, 20));
		Star star7 = new Star(65, new Point(240, 65));
		Star star8 = new Star(1000, new Point(900, 35));
		page.setColor(Color.WHITE);
		drawStar(page, star1);
		drawStar(page, star2);
		drawStar(page, star3);
		drawStar(page, star4);
		drawStar(page, star5);
		drawStar(page, star6);
		drawStar(page, star7);
		drawStar(page, star8);	
	}
	
	public void drawStar(Graphics page, Star star){
		page.drawLine(star.getPoint1().getX(),star.getPoint1().getY(),star.getPoint3().getX(),star.getPoint3().getY());
		page.drawLine(star.getPoint1().getX(),star.getPoint1().getY(),star.getPoint4().getX(),star.getPoint4().getY());
		page.drawLine(star.getPoint2().getX(),star.getPoint2().getY(),star.getPoint5().getX(),star.getPoint5().getY());
		page.drawLine(star.getPoint2().getX(),star.getPoint2().getY(),star.getPoint4().getX(),star.getPoint4().getY());
		page.drawLine(star.getPoint3().getX(),star.getPoint3().getY(),star.getPoint5().getX(),star.getPoint5().getY());
	}
}
