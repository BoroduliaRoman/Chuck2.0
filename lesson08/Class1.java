package homework.lesson08;

public class Class1 {
	
	static final float PI = 3.14f;
	
	static int umnozjenieTrehChisel(int a, int b, int c) {
		int result = a * b * c;
		return result;
	}
	
	static void delenieDvuhChisel(int a, int b) {
		System.out.println("Целое частное: " + a / b + " Остаток от деления: " + a % b);
	}
	
	public float ploshad(float r) {
		float result =  PI * r * r;
		return result;
	}
	
	public static float dlinnaOkruznosti(float r) {
		float result = 2 * PI * r;
		return result;
	}
	
	public void show(float r) {
		System.out.println("Radius: " + r + " Площадь круга: " + ploshad(r) + " Длинна окружности: " + dlinnaOkruznosti(r));
	}

}

class Class1Test {
	
	public static void main(String[] args) {
		
		System.out.println(Class1.umnozjenieTrehChisel(5, 6, 8));
		System.out.println(Class1.umnozjenieTrehChisel(10, 10, 10));
		
		Class1.delenieDvuhChisel(186, 16);
		Class1.delenieDvuhChisel(579, 18);
		
		Class1 c = new Class1();
		c.show(5.14f);
	}
	
}