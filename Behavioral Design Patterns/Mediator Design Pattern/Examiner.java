import java.util.ArrayList;
import java.util.List;

public class Examiner {
    int idOfmistake,numOfStudents;
    ExamController examController;
    public Examiner(ExamController examController,int numOfStudents)
    {
        this.numOfStudents = numOfStudents;
        idOfmistake = (int) (Math.random()*numOfStudents);
        this.examController =examController;
        examController.examiner = this;
    }

    public void recheckRequest(int id) {
        System.out.println("Examiner : Received re-examine request sent from student id "+id +" by examiner");
        if(id % numOfStudents == idOfmistake)
            examController.updateMarks((int) (Math.random()*100),id);
        else
            System.out.println("Examiner : There is no update of the marks");

    }


    public void sendNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<numOfStudents;i++)
        {
            numbers.add((int) (Math.random()*100));
            //System.out.println(numbers.get(i));
        }
        System.out.println("Examiner : scripts and marks of all students  sent to exam controller office");
        examController.recieveMarks(numbers);
    }
}
