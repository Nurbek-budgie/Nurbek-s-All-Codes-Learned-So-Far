public class Method {
    public static void main(String[] args) {
        String text = "reverse";

        System.out.println(reverse(text));
    }
      static String reverse(String s) {
        String temp = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        s = temp;
        return s;
    }
}
