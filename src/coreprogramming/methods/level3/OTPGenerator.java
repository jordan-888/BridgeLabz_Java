
package coreprogramming.methods.level3;
public class OTPGenerator {
    public static int generateOTP() {
        // Generate a 6-digit OTP (100000 to 999999)
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areAllUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        System.out.println("Generating 10 OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("\nAre all OTPs unique? " + areAllUnique(otps));
    }
}
