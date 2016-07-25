// Using java solve the problem below:

//Create your own array of integers
// Find the maximum and minimum of this array that you just created.
// create a variable to hod the maximum
// create a variable to hold the minimum
// take in the array of numbers
// begin to loop through them
// put the lowest in its array 
// put the highest in its array
// output the highest then output the lowest

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
