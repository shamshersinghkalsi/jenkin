package May12;

public class CharArr {
    public static void main(String[] args) {
        char[] chararr = new char[10];
chararr[0] = 'h';
chararr[1] = 'e';
chararr[2] = 'l';
chararr[3] = 'l';
chararr[4] = 'o';
        System.out.println(chararr);
        String s = "hello"; // string literal
        String x = new String("hello");
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('o'));
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(0,3));
        System.out.println(s.compareTo("hello"));
        System.out.println(s.toCharArray());
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);


    }
}
