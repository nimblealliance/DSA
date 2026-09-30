public class timepass {

    static int depth=0;
    public static void main(String[] args) {
        try {
            someFunction();
        } catch (StackOverflowError e) {
            System.out.println("Max depth :"+depth);
        }
    }


    static void someFunction(){
        depth++;
        someFunction();
    }


}
