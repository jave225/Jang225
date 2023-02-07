package Day06;

public class Rectangle extends Shape  {
	
	double  width, height;
	
	public Rectangle(double width, double  height) {
		this.width = width;
		this.height = height;
		
}
	@Override
	double area() {
		// (가로) x (세로) / 2
		return width  * height / 2;
	}

	@Override
	double reund() {
		// (정삼각형) : (한 변의 길이) * 4
		return  width * 4;
	}
	
}
