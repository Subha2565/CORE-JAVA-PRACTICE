/*
Program : creating class Bank to create Students
@author: SUBHADIP DAS
@Date: 23 sept 2022

*/

//declaring class OrgCreation

class OrgCreation
{
	
	//main method
	public static void main(String ...args)
	{
		Student s[] = new Student[5];
		
		s[0] = new Student(101,"joy",50);
		s[1] = new Student(102,"JOHN",100);
		s[2] = new Student(103,"SUDIP",89);
		s[3] = new Student(104,"ARPAN",90);
		s[4] = new Student(105,"SUBHA",95);
		
		for(int i=0;i<5;i++)
		{
			if((s[i].getMarks())<90)
			{
				System.out.println("Name :"+s[i].getStudentName());             
			}
			
		}
		
			
		
	}
		
		
	
	
}