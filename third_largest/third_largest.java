// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be "world" because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)

<<<<<<< HEAD
Public static ThirdGreatest(String[] strArr){
  String answer=null;
  String sorted=null;
  Boolean sort=true;
  
  while (sort){
    for(int a=1;a<=srtArr.length-1 a++;){
      if(strArr[a].length()<strArray[a-1].length()){
        sorted=strArr[a];
        strArr[a]=strArr[a+1];
        strArr[a+1]=sorted;
        sort=false;
      }
    }
  }
  return strArray[2];
}

Public static []main (string args){
  String[] testArr={"au","banana","alex","wave"};
    System.out.println(ThirdGreatest(testArr));
  }
=======
public class ThirdSort {

    /**
     * @param args the command line arguments
     */
    public String ThirdGreatest(String[]strArr){
        String sortedString = "";
        boolean finalSort =  true;
        while(finalSort){
            for(int i = 0; i < strArr.length-1; i++){
                if(strArr[i].length() < strArr[i+1].length()){
                    sortedString = strArr[i];
                    strArr[i] = strArr[i+1];
                    strArr[i+1]= sortedString;
                    finalSort = false;
                };
            }
        }
        return strArr[2];
    }
    public static void main(String[] args) {
        String[] myArr={"hello", "world", "before", "all"};
        System.out.println(ThirdGreatest(myArr));
    }

}
>>>>>>> f2cb726813d99a923abc5e0900986b0c11b362d9
