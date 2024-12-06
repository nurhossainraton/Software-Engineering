import java.util.List;

public interface Mediator {
   public void sendMsg();
   public void receiverequest(int id);
   public void updateMarks(int marks,int id);
   public void recieveMarks(List<Integer> marks);

}
