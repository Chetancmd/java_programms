public class FriendsPairing {

    public static int FPairing(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // solo
        int fnm1 = FPairing(n - 1);

        // double
        int fnm2 = FPairing(n - 2);
        int Pairways = (n - 1) * fnm2;

        int Totalways = fnm1 + Pairways;
        return Totalways;

    }

    public static void main(String[] args) {
        System.out.println(FPairing(3));

    }

}
