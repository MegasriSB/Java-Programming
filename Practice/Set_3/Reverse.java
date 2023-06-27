package Set_3;
public class Reverse {
    public static void main(String[] args){
        String str = "madam";
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());
        if(str.equals(str1.toString()))
            System.out.println("It is a palindrome");
        else
            System.out.println("not a palindrome");
    }
}
