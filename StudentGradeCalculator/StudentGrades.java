package StudentGradeCalculator;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String args[]){
        int n,total_marks=0,marks;
        String grade;
        double percentage;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter total number of subjects: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.printf("\nEnter subject-%d marks (out of 100):",i);
            marks=sc.nextInt();
            total_marks=total_marks+marks;
        }
        percentage=((double)total_marks/(n*100))*100;
        if(percentage>=90 && percentage <=100){
            grade="A+";
        }
        else if(percentage>=80){
            grade="A";
        }
        else if(percentage>=70){
            grade="B";
        }
        else if(percentage>=60){
            grade="C";
        }
        else if(percentage>=50){
            grade="D";
        }
        else if(percentage>=40){
            grade="E";
        }
        else{
            grade="F";
        }
        System.out.println("\nCongratulations!! You have achieved :");
        System.out.printf("\nTotal Marks: %d out of %d00",total_marks,n);
        System.out.printf("\nAverage Percentage: %.2f%%",percentage);
        System.out.printf("\nGrade Obtained: %s\n",grade);
        System.out.println();
    }
}
