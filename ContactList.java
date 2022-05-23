import java.io.*;
import java.util.*;
public class ContactList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Hashtable ht = new Hashtable();
		int smno;
		String sname=null;
		System.out.println("Enter number of students: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the student: ");
			sname=sc.next();
			System.out.println("Enter the mobile number of student: ");
			smno=sc.nextInt();
			ht.put(sname,smno);
		}
		System.out.println("The student Details are : "+ht);
		}
}


	
