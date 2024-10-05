class palindrome {
    public static boolean isPalindrome(int x){
        int temp=x;
        int rev=0;
        int rem;
        while (temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }

        if(rev==x){
            System.out.println("is a palindrome number");
        }
        else{
            System.out.println("is not a palindrome number");
        }
        return rev==x;

       
    }
     public static void main(String[] args){
        int x=152;
              isPalindrome(x);
    }
}