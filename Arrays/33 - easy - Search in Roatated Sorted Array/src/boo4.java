class boo4 {


    public static void main(String[] args) {
        boolean prime = isPrime(36);
        System.out.println(prime);
    }
    public static boolean isPrime(int n) {

        int sqrt = (int) Math.sqrt(n);
        int count=0;
        for(int i =1 ; i<=sqrt ; i++){
            if (n%i==0){
                count++;

                if (n/i!=i){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count == 2;



    }
}