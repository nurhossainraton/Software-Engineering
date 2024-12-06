import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediatorPattern {
    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int num = scanner.nextInt();
        ExamController examController = new ExamController(num);
        Examiner examiner =  new Examiner(examController,num);


        for(int i=0;i<num;i++)
        {
            studentsList.add(new Students(examController));
        }
        examController.setStudentsList(studentsList);
        examiner.sendNumbers();

        int i=0;
        while(i !=num)
        {
            System.out.println("----------------------------------------");
            System.out.println("Do you want to recheck for id  : "+ (i+1) + " ?");
            System.out.println("Press y to yes ,n to no");
            String input = scanner.next();
            if(input.equalsIgnoreCase("y"))
            {
                studentsList.get(i).sendRequest((i+1));
            }
            i++;
        }



    }
}
