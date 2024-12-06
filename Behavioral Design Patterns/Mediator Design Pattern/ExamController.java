import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamController implements Mediator{
    List<Students> studentsList ;
    private List <Integer> numbers;
    Examiner examiner ;
    int numOfStudents;
    ExamController(int num)
    {
        this.numOfStudents =num;
        studentsList = new ArrayList<>();
        numbers = new ArrayList<>();
    }
    public void setStudentsList(List<Students> students)
    {
        this.studentsList = students;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void sendMsg() {

    }

    @Override
    public void receiverequest(int id) {
        System.out.println("Examcontroller : re-examine request got from student id "+id);
        System.out.println("Examcontroller : re-examine request of student id "+id + " is sent to examiner");
        examiner.recheckRequest(id);

    }

    @Override
    public void updateMarks(int updatedmark,int id) {
        int prev = numbers.get(id-1);
        if(prev != updatedmark)
        {
            numbers.set(id-1,updatedmark);
            System.out.println("Examcontroller : Updated marks sent to the student");
            System.out.println("Student Id "+id +"'s previous mark was : "+ prev);
            studentsList.get(id-1).notifyUpdatedMarks(updatedmark,id);
        }


    }

    @Override
    public void recieveMarks(List<Integer> marks) {
        setNumbers(marks);
        for(int i=0;i<numOfStudents;i++)
        {
            System.out.println("Student Id "+ (i+1) + " got  marks :"+ numbers.get(i));


        }

    }
}
