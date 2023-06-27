package Set_3;
import java.util.*;
class RoleNotApplicableException extends Exception{
    public RoleNotApplicableException(String message) {
        super(message); 
    }
}
public class Manager {
    static void Managerdetails(String qualification, int experience) throws RoleNotApplicableException
    {
        if (qualification != "mba" && experience < 10)
            throw new RoleNotApplicableException("Cannot accept the role");
        else
            System.out.println("Accepted");
    }
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = ob.next();
        System.out.print("Enter the qualification: ");
        String qualification = ob.next();
        System.out.print("Enter the age: ");
        int age = ob.nextInt();
        System.out.print("Enter the experience: ");
        int experience = ob.nextInt();
        try{Managerdetails(qualification,experience);}
        catch(RoleNotApplicableException e){e.printStackTrace();}
    }
}