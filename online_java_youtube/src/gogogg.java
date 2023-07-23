public class gogogg {
    public static void main(String[] args) {
        g:
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        my_goto:
        {
            System.out.println("4");
            System.out.println("5");
            if (true) break my_goto;

        } //goto end location.
        g:
        {
            System.out.println("7");
            if(true) break g;
            System.out.println("8");
        }
        System.out.println("300");
    }
}
