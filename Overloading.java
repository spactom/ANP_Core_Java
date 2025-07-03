package ANP;

class Meth_Overloading {

	void Area(int radius) {

		double area = 3.14 * radius * radius;

		System.out.print("Area Of Circle is :" + area+"\n");
	}

	void Area(int length, int width) {
		double area = length * width;

		System.out.print("Area of Reactangle is :" + area+"\n");
	}

	void Area(int base, int height) {
		double area = base * height;

		System.out.print("Area of Triangle is :" + area);
	}

}

public class Overloading {

	public static void main(String[] args) {

		Meth_Overloading obj = new Meth_Overloading();
		obj.Area(5);
		obj.Area(5,10);
		obj.Area(10,20);

	}

}
