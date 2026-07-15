class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        for(int i=1;i<nums.size();i++)
        {
            if(nums.get(i)<nums.get(i-1))
            {
                return false;
            }
            
        }
        return true;


        
    }
}



/*
    Difference between Array and ArrayList in Java

    1. Declaration:

       Array:
       int[] nums = {1, 2, 3, 4};

       ArrayList:
       ArrayList<Integer> nums = new ArrayList<>();


    2. Finding size:

       Array:
       nums.length

       ArrayList:
       nums.size()


    3. Accessing elements:

       Array:
       nums[i]

       ArrayList:
       nums.get(i)


    4. Updating elements:

       Array:
       nums[i] = value;

       ArrayList:
       nums.set(i, value);


    5. Adding elements:

       Array:
       Fixed size, cannot directly add elements.

       ArrayList:
       nums.add(value);


    6. Removing elements:

       Array:
       Not directly possible.

       ArrayList:
       nums.remove(index);


    Summary:

       Array      -> length, nums[i], fixed size
       ArrayList  -> size(), get(i), dynamic size
*/
