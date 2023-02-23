class Evennodigits {
    public int findNumbers(int[] nums) {
        int count=0;
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int flag=0;
            int temp=nums[i];
            while(temp!=0)
            {
                temp=temp/10;
                flag++;
            }
            ans[i]=flag;
            flag=0;

        }
        for(int i: ans)
        {
            if(i%2==0)
            {
                count++;
            }
        }
        return count;
    }
}