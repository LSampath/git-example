public class Application {
    public static void main(String[] args) {
        System.out.println("First");
        System.out.println("second - from branch 1");
        System.out.println("third - from branch 1");
        System.out.println("second - from master");
        System.out.println("third - from master");
        // branch-1 merged
        System.out.println("first - from branch 2");
        System.out.println("fourth - from master");

        System.out.println("first - from branch-3");
    }
}
