package march8;

public class Circle implements Drawable 
{
private double radius;


public Circle ()
{
	
}
public Circle(double radius)
{
	this.radius=radius;
	
			
}
@Override
public void drawShape() {
	// TODO Auto-generated method stub
	
}
@Override
public double calarea() {
	// TODO Auto-generated method stub
	return PI*2*radius;
}
}

