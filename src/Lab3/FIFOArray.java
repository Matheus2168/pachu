package Lab3;

import java.util.Arrays;

public class FIFOArray {

	private int[] array;
	
	public FIFOArray(int wielkosc) {
		this.array = new int[wielkosc];
	}
	
	private boolean isFull() {
		for (int i = 0 ; i < this.array.length ; i++){
			if (this.array[i] == 0){
				return false;
			}
		}
		return true;

	}
	private boolean isEmpty() {
		for (int i = 0 ; i < this.array.length ; i++){
			if (this.array[i] != 0){
				return false;
			}
		}
		return true;
	}
	
	public void put(int value) {
		if (isFull()){
			System.out.println("Kolejka jest pelna");
		}
		else {
			this.array[findFirstEmptyIndex()] = value;
		}
		}


	public int get() {
		if (this.isEmpty()) {
			System.out.println("Kolejka jest pusta");
			return 0;
		}
		else {
			int result = this.array[0];
			move();
			return result;
		}
	}

	private void move(){
		this.array[0] = 0;
		for (int i = 1 ; i < this.array.length; i++){
			this.array[i-1] = this.array[i];
		}
	}

	private int findFirstEmptyIndex(){
		for (int i = 0 ; i < this.array.length ; i++){
			if (this.array[i] == 0){
				return i;
			}
		}
		return 0;
	}
	
}
