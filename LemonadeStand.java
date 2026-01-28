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

		/*Path p3 = new Path();       // 1) Create an empty Path object
        p3.moveTo(650.0, 475.0);   // 2) Move your pencil to (150, 50)
		p3.lineTo(1175.0, 475.0);
		*/
		
		//testing for cups
		Path p2 = new Path();       // 1) Create an empty Path object
        p2.moveTo(130.0,  50.0);    // 2) Move your pencil to (150, 50)
        p2.lineTo(140.0, 100.0);    // 3) Draw a line down to (150, 150)
                                    // 4) Add a quadratic segment over to (50, 150)
        p2.quadTo(120.0, 75.0, 100.0, 100.0);
        p2.lineTo( 115.0,  50.0);    // 5) Add a line up to (50, 50)
        p2.closePath();             // 6) Close the Path.
        
	}
	
	public static void main(String[] args) {
		LemonadeStand myLemonadeStand = new LemonadeStand();
	}
}

