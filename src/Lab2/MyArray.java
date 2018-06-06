package Lab2;

public class MyArray {
	private double[] array;
	private int length;
	
	public MyArray() {
		this.array = new double[10];
		this.length = 0;
	}
	
	public void add(double value) {
		if (this.length >=10) {
			System.out.println("Tablica jest pelna");
		}
		else {
			this.array[this.length] = value;
			this.length++;
		}
	}
	public double average() {
		double average=0;
		if (this.length ==0) {
			System.out.println("Tablica jest pusta");
		}
		else {
			double sum=0;
			for(int i = 0; i<this.length; i++) {
				sum = sum+this.array[i];
			}
			average = sum/this.length;
		}
		return average;
	}
}
