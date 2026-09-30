class boo3 {

    public static void main(String[] args) {
        boolean armstrong = isArmstrong(153);
        System.out.println(armstrong);
    }

    public static boolean isArmstrong(int n) {
        int temp=n;
        int temp2=n;
        int ans=0;
        int digit=0;
        while(temp>0){
            temp/=10;
            digit++;
        }

        while(temp2>0){
            int num=temp2%10;
            ans= (int) (ans+Math.pow(num,digit));
            temp2/=10;
        }

        return ans==n;



    }
}