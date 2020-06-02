import java.io.*;
 import java.util.*;
 class Student
 {
      String name;
      int marks;
      //constructor
      Student(String n,int m)
      {
      	this.name=n;
      	this.marks=m;
      }
      //use to print in main
      public String toString()
      {
      	return this.name+" "+this.marks;
      }
 }

class Sortbyname implements Comparator<Student>
{
	//ascending in acending order of marks
	public int compare(Student a,Student b)
	{
	int namec=a.name.compareTo(b.name);
      int marksc=a.marks-b.marks;
      if(namec==0)
            return marksc==0?namec:marksc;
      else
            return namec;
      }
}

class Sortbymarks implements Comparator<Student>
{
      //ascending in acending order of marks
      public int compare(Student a,Student b)
      {
      int marksc=b.marks-a.marks;
      int namec=a.name.compareTo(b.name);
      if(marksc==0)
            return namec==0?namec:marksc;
      else
            return marksc;
      }
}



 class Main2
 {
 	public static void main(String args[])throws IOException
 	{
 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 		{
 			int n=Integer.parseInt(br.readLine());
 			Student a[]=new Student[n];
 			for(int i=0;i<n;i++)
 			{
 				String s[]=br.readLine().split(" ");
 				String name=s[0];
 				int marks=Integer.parseInt(s[1]);
 				a[i]=new Student(name,marks);
 			}
             System.out.println("Unsorted");
             for(int i=0;i<n;i++)
             	System.out.println(a[i]);
             Arrays.sort(a,new Sortbyname());
             System.out.println("Sorted by name if names are same then sort them a/c marks");
             for(int i=0;i<n;i++)
             	System.out.println(a[i]);
             Arrays.sort(a,new Sortbymarks());
             System.out.println("Sorted a/c to decreasing order of marks, if marks same then sort a/c name");
             for(int i=0;i<n;i++)
                  System.out.println(a[i]);
             

 		}
 	}
 }
