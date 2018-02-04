package example2;

public class CalculationTest implements Calculation {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		int z = x + y;
		System.out.println("z: " + z);
		return z;
	}

	@Override
	public String add(String x, String y) {
		// TODO Auto-generated method stub
		String z = x + y;
		System.out.println("z: " + z);
		return z;

	}

	@Override
	public int mull(int x, int y) {
		// TODO Auto-generated method stub
		int z2 = x * y;
		System.out.println(z2);
		return z2;
	}

	@Override
	public String mull(int x, String y) {
		// TODO Auto-generated method stub
		String z3 = y + x;
		System.out.println(z3);
		return z3;
	}
	
	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation call = new CalculationTest();
		System.out.println("INside main, z value: " +call.add(5, 6));
		call.add("Sree", "Pavan");
		call.mull(5, 6);
		call.mull(5,"Sree");
		System.out.println("Name :" +call.name("Sree Pavan"));

	}

	
}
