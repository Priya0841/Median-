This is the code for given question
class Solution
{
    public int find_median(int[] v)
    {
        Arrays.sort(v);
        
        int n = v.length;
        
        if (n % 2 != 0) {
            return v[n / 2]; 
        } else {
            return (v[(n - 1) / 2] + v[n / 2]) / 2;
        }
    }

    }


EXPLAINATION : 

First, it sorts the list of numbers in ascending order. Sorting means putting the numbers in order from smallest to largest.

Then, it checks if the number of elements in the list is odd or even. 
If it's odd, that means there's a single middle number. If it's even, there are two middle numbers.

If the number of elements is odd, the function simply picks the number that's in the middle of the sorted list as the median.

If the number of elements is even, the function finds the two middle numbers and calculates their average. This average is the median.
EXAMPLE :

For example, if we have the numbers 90, 100, 78, 89, and 67, the sorted list would be 67, 78, 89, 90, 100. 
Since there are 5 numbers (an odd number), the middle number is the third one, which is 89. So, the median is 89.

If we have the numbers 56, 67, 30, and 79, the sorted list would be 30, 56, 67, 79.
Here, we have 4 numbers (an even number), so we find the middle two numbers, which are 56 and 67.
Their average is (56 + 67) / 2 = 61. So, the median is 61.
