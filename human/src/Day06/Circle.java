package Day06;

public class  Circle extends Shape {
	
	double redius;
	
	public Circle(double redius) {
		this.redius = redius;
	}
	
	@Override
	double area() {
		// (원주율) x (반지름) x (반지름)
		return Math.PI * redius * redius;
	}

	@Override
	double reund() {
		// 2 x (원주율) x (반지름)
		return 2 * Math.PI * redius;
	}
	
	

}
