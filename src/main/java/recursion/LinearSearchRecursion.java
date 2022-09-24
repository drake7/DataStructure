package recursion;

public class LinearSearchRecursion {
    public static void main(String[] args) {
  
    int [] arrayInfo = {1,2,3,4,5,6,12,32,12,35};
    linearSearch(arrayInfo,0,12);
    }
    
    public static void linearSearch(int[] arrayinfo,int index,int elementToBeSearched)
    {
          if(index>=arrayinfo.length)
        {
            System.out.println("element does not exist.");
            return;
        }
        if(arrayinfo[index]==elementToBeSearched)
        {
            System.out.println("element exist at"+index);
            return;
        }
        linearSearch(arrayinfo,index+1,elementToBeSearched);
    }
}
