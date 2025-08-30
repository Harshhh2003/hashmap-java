public class basicstring{
    public static void main(String[] args) {
        String s = "harsh";
 System.out.println(s.substring( 0 , 3));
 String s1 = "hello";
 String s2 = "hello";
 String s3 = new String(" hello");

//  System.out.println(s1.equals(s2));      // true retrun 
System.out.println(s1==s2);   // true  

System.out.println(s1.equals(s3));     // falsse diff address
StringBuilder str = new StringBuilder("hello");
str.append("world");
System.out.println(str);
str.setCharAt(1, 'z');
System.out.println(str);

        
    }
}

