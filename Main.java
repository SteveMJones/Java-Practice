package john_test;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Animal animal = new Animal("Roofus");
		Dog bowser = new Dog("Bowser");
		Dog doof = new Dog("Derpy", 2);
		
		Dog derp = new Dog("Derp 1", 104);
		Dog derp2 = new Dog("Derp 2", 104);
		Dog derp3 = new Dog("Derp 3", 104);
		
		System.out.println(animal);
		System.out.println(bowser + bowser.printId() + "has " + Dog.numLegs + " legs");
		System.out.println(doof + doof.printId() + "has " + Dog.numLegs + " legs");
		System.out.println(derp + derp.printId() + "has " + Dog.numLegs + " legs");
		System.out.println(derp2 + derp2.printId() + "has " + Dog.numLegs + " legs");
		System.out.println(derp3 + derp3.printId() + "has " + Dog.numLegs + " legs");
			
		// reverse a String
		System.out.println("\n");
		String forwards = "This sentence is false.";
		StringBuilder reverse = new StringBuilder();
		ArrayList<Character> backwards = new ArrayList<Character>();
		int length = forwards.length() - 1;
		
		while(length >= 0){
			reverse.append(forwards.charAt(length));
			backwards.add(forwards.charAt(length));
			length--;
		}
		System.out.println(reverse);
		
		String output = "";
		for(int i = 0; i < backwards.size(); i++){
			output = output + backwards.get(i);
		}
		System.out.println(output);
		
		// check if String is a palindrome
		System.out.println("\n");
		String original = "Racecar";
		String racecar = original.toLowerCase();
		int p1 = 0;
		int p2 = racecar.length() - 1;
		char c1;
		char c2;
		boolean isPalindrome = true;
		
		while((p1 != p2) && (p2 > p1)){
			c1 = racecar.charAt(p1);
			c2 = racecar.charAt(p2);
			if(c1 != c2){
				isPalindrome = false;
				//break;
			}
			System.out.println("p1: " + p1);
			System.out.println("p2: " + p2);
			++p1;
			--p2;
		}
		
		if(isPalindrome){
			System.out.println(original + " is a Palidrome");
		}
		else{
			System.out.println(original + " is not a Palindrome");
		}
		
		//array stuff that I'm trying
		int[][] tryme = new int[10][10];
		System.out.println("\nArray stuff");
		System.out.println(tryme[0][0]);
		
		int[] feed = new int[]{7, 3, 4, 7, 8, 9, 7, 7, 7, 2, 3, 4, 7, 7, 7, 7};
		Main main = new Main();
		int candidate = main.getCandidate(feed);
		System.out.println(candidate);
		if(main.validate(feed, candidate)){
			System.out.println(candidate + " is a majority");
		}
		
		
	}//end main
	
	public int getCandidate(int[] array){
		int majority = 0;
		int count = 0;
		for(int n : array){
			if(count == 0){
				majority = n;
			}
			if(n == majority){
				count++;
			}
			else{
				count--;
			}
		}
		return majority;
	}
	
	public boolean validate(int[] array, int majority){
		int count = 0;
		for(int n : array){
			if(n == majority){
				count++;
			}
		}
		System.out.println(count + " out of " + array.length);
		if(count > array.length / 2){
			return true;
		}
		else{
			return false;
		}		
	}

}//end class