
public class MyList {

	
	
	private int[] arr;
	private int numberOfElements = 0;
	
	public MyList() {
		arr = new int[3];
	}


	public MyList(int capacity) {
		arr = new int[capacity];
	}
	
	public void add(int i) {
		numberOfElements++;
		
		if(numberOfElements <= arr.length)
			arr[numberOfElements-1] = i;
		else {
			resize();
			arr[numberOfElements-1] = i;
		}
	}


	private void resize() {
	
		//create a new arr
		int[] newArr = new int[arr.length*2];
		
		//copy existing data
		for(int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		arr = newArr;
		
	}


	public int size() {
		return numberOfElements;
	}


	public int get(int i) {
		return arr[i];
	}

	
}
