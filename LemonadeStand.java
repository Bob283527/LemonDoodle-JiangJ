import doodlepad.*;
import java.util.ArrayList;


public class LemonadeStand {
	
	public LemonadeStand() {
		Rectangle frame = new Rectangle(25, 75, 1865, 800);
		Rectangle base = new Rectangle(700, 700, 500, 150);
		Rectangle leg1 = new Rectangle(700, 550, 25, 150);
		Rectangle leg2 = new Rectangle(1175, 550, 25, 150);
		Rectangle path = new Rectangle(25, 800, 1865, 100);
		path.setFillColor(127, 127, 127);
		
		Rectangle roofThing = new Rectangle(650, 525, 600, 25);
        
          Path p1 = new Path();       // 1) Create an empty Path object
        p1.moveTo(650.0,  525.0);    // 2) Move the virtual pencil to (150, 50)
        p1.lineTo(700.0, 475.0);    // 3) Draw a line down to (150, 150)
        p1.lineTo( 1250.0, 525.0);    // 4) Add a line over to (50, 150)
        p1.lineTo( 1175.0, 475.0);    // 5) Add a line up to (50, 50)
        p1.lineTo(650.0, 525.0);

		Path p3 = new Path();       // 1) Create an empty Path object
        p3.moveTo( 700.0,  700.0);   // 2) Move your pencil to (150, 50)
        p3.lineTo( 700.0, 650.0);   // 3) Draw a line down to (150, 150)
                                    // 4) Add a bezier spline over to (50, 150)
        p3.curveTo(100.0, 200.0, 100.0, 100.0, 1175.0, 650.0);
        p3.lineTo(  1175.0,  700.0);   // 5) Add a line up to (50, 50)
        p3.closePath();             // 6) Close the Path.
	}
	
	public static void main(String[] args) {
		LemonadeStand myLemonadeStand = new LemonadeStand();
	}
}

