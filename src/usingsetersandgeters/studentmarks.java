package usingsetersandgeters;

public class studentmarks {
	
	
	int java;
	int C ;
	int Dbs;
	int Oops ;
	int Testing ;
	
	double Average = ((java+C+Dbs+Oops+Testing)/5);
	
	
	public studentmarks(int java, int c, int dbs, int oops, int testing, double average) {
		super();
		this.java = java;
		C = c;
		Dbs = dbs;
		Oops = oops;
		Testing = testing;
		Average = average;
	}

	

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getC() {
		return C;
	}

	public void setC(int c) {
		C = c;
	}

	public int getDbs() {
		return Dbs;
	}

	public void setDbs(int dbs) {
		Dbs = dbs;
	}

	public int getOops() {
		return Oops;
	}

	public void setOops(int oops) {
		Oops = oops;
	}

	public int getTesting() {
		return Testing;
	}

	public void setTesting(int testing) {
		Testing = testing;
	}

	public double getAverage() {
		return Average;
	}

	public void setAverage(double average) {
		Average = average;
	}


}
