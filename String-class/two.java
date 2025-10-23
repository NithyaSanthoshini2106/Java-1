



public class two {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder sb = new StringBuilder(str);
        String newStr = sb.toString();
        StringBuffer sBuf = new StringBuffer(str);

        System.out.println("StringBuilder: " + sb);
        System.out.println("Converted back to String: " + newStr);
        System.out.println("StringBuffer: " + sBuf);
    }
}
