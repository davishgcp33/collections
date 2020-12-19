
import java.util.*;

public class CollectionsObj {


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

/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable<Student> {
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



    @Override
    public int compareTo(Student student) {
        if(this.getCGPA()>student.getCGPA())
        {
            return -1;
        }
        else if(this.getCGPA()<student.getCGPA())
        {
            return 1;
        }
        else
        {
            return this.getName().compareTo(student.getName());
        }



    }
}

class Priorities{
    public List<Student> getStudents(List<String> events){

        PriorityQueue<Student> pq=new PriorityQueue<>();
        for(String i:events)
        {
            String[] s=new String[4];
            s=i.split(" ");
            if(s.length>1){
                pq.add(new Student(Integer.parseInt(s[3]),s[1],Double.parseDouble(s[2])));
            }
            else
            {
                pq.poll();
            }
        }

        while(pq.size()>1)
        {
            System.out.println(pq.poll().getName());
        }
        return new ArrayList<Student>(pq);


    }
}

