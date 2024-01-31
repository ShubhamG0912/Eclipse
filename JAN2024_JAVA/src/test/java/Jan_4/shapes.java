package Jan_4;

abstract class shape
{

	abstract void draw();
		
}

class rect extends shape
{
	@Override
	void draw() {
		System.out.println("Draw the Rectangle");
	}
	}
public class shapes{
	public static void main(String[] args) {
		
		rect r1 =new rect();
		r1.draw();
	}
}