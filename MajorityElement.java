package Arrays_Problems;

public class MajorityElement {
	
	public static void main(String[] args) {
		
	//Optimal Solution
		//ArrAy Intinitalization
	int[] arr = {}; --> 
	
	//Counter to keep track for each element
	int cnt = 0;
	
	//Store the element
	int el = 0;
	
	//Looping through Array
	for(int i=0;i<arr.length;i++) {
		//To keep track of new element.
		if(cnt == 0) {
			cnt = 1;
			el = arr[i];
		}
		
		//If Already initialized element keep coming increment the cou ter
		else if(arr[i] == el) {
			cnt++;
			
		}
		//If new element are appearing then decrement the counter.
		else {
			cnt--;
		}
	}
	
	
	//Counter for check the got element is actually a majority one.
	int cnt1 = 0;
	
	for(int i=0; i<arr.length;i++) {
		//Check the available element how many time appearers in array.
		if(arr[i] == el) {
			cnt1++;
		}
	}
	
	//check the cnt1 value is > (Array Length / 2) ? Yes: we got element else No.
	if(cnt1 > (arr.length/2)) {
		System.out.println("Majpority element Exist i.e"+ el);
	}else {
		System.out.println("Majpority element Doesn't Exist i.e");
	}
}
}
