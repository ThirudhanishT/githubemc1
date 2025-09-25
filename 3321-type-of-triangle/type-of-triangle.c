char* triangleType(int* nums, int numsSize) {
    int a=nums[0];
    int b=nums[1];
    int c=nums[2];
    int r=a+c;
    int t1=r>b?1:0;
    int s=a+b;
    int t2=s>c?1:0;
    int t=b+c;
    int t3=t>a?1:0;
    if(t1==1 && t2==1 && t3==1)
    {
        if(a==b && b==c)
        {
            return "equilateral";
        }
        else if(a==b || b==c|| a==c)
        {
            return "isosceles";
        }
        else
        {
            return "scalene";
        }
    }
    return "none";
}