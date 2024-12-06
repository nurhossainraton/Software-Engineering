public class Students extends Actions{
   ExamController examController;
    public Students(ExamController examController)
    {
          this.examController = examController;
          //examController.studentsList.add(this);
    }

    @Override
    public void sendRequest(int id) {
        System.out.println("---------------------------------------------");
        System.out.println("Student : Re Check Request sent from Student Id "+ id);
        examController.receiverequest(id);
    }

    public void notifyUpdatedMarks(int mark,int id) {
        System.out.println("Student Id "+id +"'s Updated mark  : "+ mark);
    }
}
