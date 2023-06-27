package Set_1;
class AgeNotWithinRangeException extends Exception
{
    String msg;
    AgeNotWithinRangeException(String s)
    {
        msg=s;
    }
    @Override
    public String toString()
    {
        return"[AgeNotWithinRangeException]:"+msg;
    }
}
class NameNotValidException extends Exception
{
    String msg;
    NameNotValidException(String s)
    {
        msg=s;
    }
    @Override
    public String toString()
    {
        return"[NameNotValidException]:"+msg;
    }
}
public class Doctor 
{
    static String name;
    static  int age;
    static int attri_id;
    static String dept;
    Doctor(String n,String d,int a,int ai)
    {
        name=n;
        dept=d;
        attri_id=ai;
        age=a;
    }
    static void checkage() throws AgeNotWithinRangeException
    {
        if(age>=25&&age<=65)
        {
            throw new AgeNotWithinRangeException("age is not within the range of 25 to 65");
        }
        else
            System.out.println("age verified");
    }
    static void checkname() throws NameNotValidException
    {
        char ch[]=new char[name.length()];int f=1;
        for(int i=0;i<name.length();i++)
        {
            ch[i]=name.charAt(i);
            if(!Character.isLetter(ch[i]))
            {
                f=0;
                throw new NameNotValidException("name should not contain any numbers or special character");
            }
        }
        if(f==1)
            System.out.println("name verified");
    }
    public static void main(String[] args) 
    {
        try
        {
        Doctor d1=new Doctor("thaya","cardio",20,234);
        d1.checkname();
        d1.checkage();
        }
        catch( AgeNotWithinRangeException e)
        {
            System.out.println(e);
        }
        catch(NameNotValidException e)
        {
            System.out.println(e);
        }
    }
}