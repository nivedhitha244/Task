public class task1 {
       public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        int b = a.intValue();
        int c = Integer.parseInt("20");
        Integer d = Integer.valueOf("30");
        String s = a.toString();
        System.out.println(a.compareTo(d)); 
        System.out.println(a.equals(10));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.isDigit('5'));
        System.out.println(a + " " + b + " " + c + " " + d + " " + s);
    }
 
}