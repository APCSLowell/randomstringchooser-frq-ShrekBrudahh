import java.util.*;
public class RandomStringChooser
{
   private String[] array;
      public RandomStringChooser(String[] arr){
         array = arr;
      }
      public String getNext(){
          if (array.length > 0){
             String chosen = array[(int)(Math.random() * array.length)];
             String[] newArr = new String[array.length - 1];
             int c = 0;
             for (int i = 0; i < array.length; i++){
                if (array[i] != chosen){
                  newArr[c] = array[i];
                  c++;
                }
             }
             array = newArr;
             return chosen;
          }
          return "NONE";
      }
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
