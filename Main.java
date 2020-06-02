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

/*class Sortbyroll implements Comparator<Student>
{
	//ascending in acending order of marks
	public int compare(Student a,Student b)
	{
	return a.marks-b.marks; //for decending order " return b.marks-a.marks"
}
}*/

class Sortbyname implements Comparator<Student>
{
	//ascending in acending order of marks
	public int compare(Student a,Student b)
	{
	return a.name.compareTo(b.name);  /*for decending order " return b.name.compareTo(a.name) " */
}
}


 class Main
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
             /*Arrays.sort(a,new Sortbyroll());
             System.out.println("Sorted by roll no");
             for(int i=0;i<n;i++)
             	System.out.println(a[i]);*/
              Arrays.sort(a,new Sortbyname());
             System.out.println("sort by marks & then Sort by name ascending order when marks are same");
             for(int i=0;i<n;i++)
             	System.out.println(a[i]);

 		}
 	}
 }
