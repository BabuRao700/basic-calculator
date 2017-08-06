import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Application {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int numberOfStudents=0;

        ArrayList<Student> studentDetails= new ArrayList<Student>();
        System.out.println("You want to enter student details? press 1:yes 0:no");
        int enterDetails=input.nextInt();
        while(enterDetails==1){
            System.out.println("Enter student name:\n");
            String name=input.next();
            System.out.println("Enter student ID:\n");
            long ID=input.nextLong();
            System.out.println("Enter student grades in subject1:\n");
            int subject1=input.nextInt();
            System.out.println("Enter student grades in subject2:\n");
            int subject2=input.nextInt();
            System.out.println("Enter student grades in subject3:\n");
            int subject3=input.nextInt();
            System.out.println("Enter student grades in subject4:\n");
            int subject4=input.nextInt();
            Student student=new Student(name,ID,subject1,subject2,subject3,subject4);
            studentDetails.add(student);
            System.out.println("You Want to enter student details again press 1 or 0?");
            int x=input.nextInt();
             if(x==1) {
                 enterDetails = 1;
                 numberOfStudents++;
             }
             else enterDetails=0;

        }

        System.out.println("Student Details:");
        System.out.println("Name     " + "ID       "+"Subject1 "+"Subject2 "+"Subject3 "+"Subject4 ");
        Iterator itr=studentDetails.iterator();
       while(itr.hasNext())
       {
           Student accessDetails=(Student)itr.next();
           System.out.println(accessDetails.name + " " + accessDetails.ID + " " +accessDetails.subject1 + " " +accessDetails.subject2+ " " +accessDetails.subject3 +" "+accessDetails.subject4);
       }
        System.out.println("Welcome to student progress report system:");
        System.out.println("Whose progress report you want to see? Please enter the student name:");
        String name=input.next();

        
        while(itr.hasNext()){
            Student i=(Student)itr.next();
            if(i.name.equals(name)){
                System.out.println("Details Found!!");
                GradePointAverage gpa=new GradePointAverage();
                System.out.println("gpa of the student is:"+gpa.calculateGPA(i.subject1,i.subject2,i.subject3,i.subject4));

            }
        }

    }
}
