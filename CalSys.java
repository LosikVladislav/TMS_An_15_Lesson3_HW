public class CalSys {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        int z=8;
        int g=14;
        System.out.println("decimal system " +x);
        String convertY = Long.toBinaryString(y);
        System.out.println("binary system =" + convertY);
        String convertZ = Long.toOctalString(z);
        System.out.println("Octal system =" + convertZ);
        String convertG = Long.toHexString(g);
        System.out.println("Hex system =" +convertG);
    }
}
