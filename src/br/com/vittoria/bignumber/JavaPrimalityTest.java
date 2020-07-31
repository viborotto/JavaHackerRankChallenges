package br.com.vittoria.bignumber;
/**
 * @author Vittoria Borotto
 *
 */
    public class JavaPrimalityTest {
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            BigInteger n = scanner.nextBigInteger();

            if(n.isProbablePrime(100)){
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
            scanner.close();
        }
    }

