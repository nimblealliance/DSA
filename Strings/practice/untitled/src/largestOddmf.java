public class largestOddmf {

    public static void main(String[] args) {


    }

    public static String largestOddNumber(String num) {

        int n= num.length();
        int index =-1;
        for (int i = n-1 ; i>=0 ; i--){

            int lastNum = num.charAt(i)-'0';
            if (lastNum %2 ==1){
                index=i;
            }
        }

        if (index==-1){
            return "";
        }

        int i=0;

        while (i<= n && num.charAt(i)== '0'){
            i++;
        }
        return num.substring(i,index+1);
    }
}
