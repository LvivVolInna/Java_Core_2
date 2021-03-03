package ua.lviv.lgs;

public class homework1 {
	public static void main(String[] args) {

		// Написати по одній змінній кожного типу примітивних типів даних

		byte a = 12;
		short b = 893;
		int c = 2155145;
		long d = 1542288945;
		float h = 3.4f;
		double e = -12.0011224;
		char data1 = 5; // код символа
		char data2 = '5'; // символ
		boolean t1 = true;
		boolean t2 = 12 == 2;

		System.out.println("byte " + a);
		System.out.println("short " + b);
		System.out.println("int " + c);
		System.out.println("long " + d);
		System.out.println("float " + h);
		System.out.println("double " + e);
		System.out.print("char " + data1 + " або символ ");
		System.out.println(data2);
		System.out.print("boolean " + t1 + " або ");
		System.out.println(t2);

		System.out.println();
		// Вивести на консоль мінімальні і максимальні значення типів даних. Вивід
		// здійснити за допомогою System.out.println( ); та Java Wrappers,

		System.out.println("MaxByte = " + Byte.MAX_VALUE);
		System.out.println("MinByte = " + Byte.MIN_VALUE);
		System.out.println("MaxShort = " + Short.MAX_VALUE);
		System.out.println("MinShort = " + Short.MIN_VALUE);
		System.out.println("MaxInt = " + Integer.MAX_VALUE);
		System.out.println("MinInt = " + Integer.MIN_VALUE);
		System.out.println("MaxLong = " + Long.MAX_VALUE);
		System.out.println("MinLong = " + Long.MIN_VALUE);
		System.out.println("MaxFloat = " + Float.MAX_VALUE);
		System.out.println("MinFloat = " + Float.MIN_VALUE);
		System.out.println("MaxDouble = " + Double.MAX_VALUE);
		System.out.println("MinDouble = " + Double.MIN_VALUE);
		System.out.println("Діапазон допустимих значень (кількості символів) типу char у java  складає від 0 до 65536");
		System.out.println("Змінні типу boolean мають лише 2 логічні значення - true або false");

		System.out.println();
		// Створити масив, наповнити його 10 значеннями типу int, знайти максимальне та
		// мінімальне значення та вивести їх на консоль
		int[] v = new int[10];

		int max = v[0];
		int min = v[0];

		for (int i = 0; i < v.length; i++) {
			v[i] = i * i * i * i * i / 7 - 20 * i * i;
			System.out.println(v[i]);
		}
		for (int i = 0; i < v.length; i++) {
			if (max < v[i]) {
				max = v[i]; // знаходимо найбільше значення масиву
			}
		}
		System.out.println("max= " + max);

		for (int i = 0; i < v.length; i++) {
			if (min > v[i]) {
				min = v[i]; // знаходимо найменше значення масиву
			}
		}
		System.out.println("min= " + min);

		
		
		// my first commit to gitHub
	}

}
 