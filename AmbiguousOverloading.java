
class Main {

    static int max(int x, double y) {
        return (x > y) ? x : (int) y;
    }

    static int max(double x, int y) {
        return (x > y) ? (int) x : y;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 5));  // ambiguous occurs comile time error
    }

}
