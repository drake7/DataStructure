package leetcode75;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
  Example:
  	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * */
public class TwoSum {
public static void main(String...s)
{
int[] a= {10,20,5,1,16,18};
int numToCheck=17;


for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]+a[j]==numToCheck)
{
	System.out.println(a[i]+":"+a[j]);
System.out.println("Array Indexes are:"+i+":"+j);
}

}

}

/*Leet Code Version*/
/*
 *     public int[] twoSum(int[] nums, int target) {
        
        
    //    int[] a= {10,20,5,1,16,18};
//int numToCheck=17;

int[] a=new int[2];
for(int i=0;i<nums.length;i++)
{
for(int j=i+1;j<nums.length;j++)
{
if(nums[i]+nums[j]==target)
{
a[0]=i;
a[1]=j;
return a;
}

}
}
        return a;
    }

 * */



}
}
