public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String triangle(int num){
	    String triangle = "";
	    for (int loopCount = 0; loopCount < num; loopCount++){
	        for (int triangleCount = 0; triangleCount <= loopCount; triangleCount++){
	            triangle = triangle + "*";
	        }
	        triangle = triangle + "\n";
	    }
	    return triangle;
	}
	
	public static String pyramid(int num){
	    String pyramid = "";
	    String spaces;
	    int spaceCount;
	    String stars = "";
	    for (int loopCount = 0; loopCount < num; loopCount++){
	        spaces = "";
	        stars += " *";
	        for (spaceCount = 1; spaceCount < (num - loopCount); spaceCount++){
	            spaces = spaces + "1";
	        }
	        pyramid += spaces + stars.trim() + "\n";
	    }
	    return pyramid;
	}
	
	public static String multiplicationTable(int num){
	    String output = "";
	    for (int loopCount = 1; loopCount <= num; loopCount++){
	        for (int multi = 1; multi <= num; multi++){
	            output += multi*loopCount;
	        }
	        output += "\n";
	    }
	    
	    return output;
	}

	

}
