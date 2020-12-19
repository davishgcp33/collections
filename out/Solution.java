import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
 class Student{
     int id;
     String name;
     double cgpa;
     
     Student(int id,String name, double cgpa){
         this.id=id;
         this.name=name;
         this.cgpa=cgpa;
     }
     
     public int getId()
     {
         return id;
     }
     
     public String getName(){

     return name;         
     }
     public double getCGPA()
     {
         return cgpa;
     }
 }
 
 
 class Priorities implements Comparator<Student>{
      @Override
    public int compareTo(Student s) {
        if(s.getCGPA()>this.getCGPA())
        {
            return 1;
        }
        else if(s.getCGPA()<this.getCGPA)
        {
            return -1;
            
        }
        else
        {
            
        }
            }
 }


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}