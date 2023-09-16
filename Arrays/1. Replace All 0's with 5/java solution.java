

class GfG {
    int convertfive(int num) {
        // Your code here
        int temp=0;
        while(num>0){
            int digit=num%10;
            if(digit==0) digit=5;
            temp=temp*10+digit;
            num=num/10;
        }
        int rev=0;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        return rev;
    }
}