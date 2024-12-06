public class Tesla extends Car{
    protected Color color = new White() ;
    protected EngineType engine = new ElectricCell();
    protected DriveTrainSystem trainSystem = new AllWheels();
    protected Country country = new USA();
    public void PrintDetails() {
        System.out.println("Details of Tesla :");
        System.out.println( "Color : "+color.getColor()+","+"Country : " +country.getCountry()+","+ "Engine : "+engine.getEngineType()+ ","+" DriveTrain : " +trainSystem.getDriveTrain());
    }
}
