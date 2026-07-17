

                           
public class Main
{
    
    
    
    public static void unionArray(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int[] temp=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                i++;
                k++;

            }else if(nums2[j]<nums1[i]){
                temp[k]=nums2[j];
                j++;
                k++;
            }
            else{
                temp[k]=nums1[i];
                i++;
                j++;
                k++;
            }
        }
        while(i<nums1.length){
            temp[k++]=nums1[i++];
        }
         while(j<nums2.length){
            temp[k++]=nums2[j++];
        }

        for(int l=0;l<k;l++)
        {
            System.out.print(temp[l]+" ");
        }
       
        
    }
    
	public static void main(String[] args) {
		
	int[] nums1={1, 2, 3, 4, 5};
	int[] nums2={1, 2, 7};
	unionArray(nums1,nums2);
	}
}
