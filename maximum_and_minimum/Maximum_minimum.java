// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hold the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest
<<<<<<< HEAD

public class MinAndMax{
    int[] numArray= new int[]{-10,11,3,21,97,34,30};
    int maxNum=numArray[0];
    int minNum=numArray[0];
    for (int i=0;i<numArray.length;i++){
      if (numArray[i]>maxNum) maxNum=numArray[i];
      else if(numArray[i]<minNum) maxNum=numArray[i];
    }
   	System.out.println("Max value be: "+maxNum);
	System.out.println("Min Value be: "+minNum);
  }
}
=======
public static void main(String[] args){
		int[] arrayIn = {56,9,21,78,91,64,84,53,25};
		Arrays.sort(arrayIn);
		int min = arrayIn[0];
		int max = arrayIn[arrayIn.length-1];
                
                int[] minA = new int[1];
                int[] maxA = new int[1];
                
                for(int i = 0; i <= arrayIn.length - 1; i++){
                    if (arrayIn[i] <= max){
                        maxA[0] = arrayIn[i];
                    }
                    if (arrayIn[i] <= min){
                        minA[0] = arrayIn[i];
                    }
                }
                System.out.println(Arrays.toString(arrayIn));
                System.out.println("Max integer is " + Arrays.toString(maxA));
                System.out.println("Min integer is " + Arrays.toString(minA));
	}
>>>>>>> f2cb726813d99a923abc5e0900986b0c11b362d9
