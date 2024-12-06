public class BMW extends Car{
     Color color = new Black() ;
     EngineType engine = new ElectricCell();
     DriveTrainSystem trainSystem = new RearWheel();
     Country country = new Germany();
    @Override
    public void PrintDetails() {
        System.out.println("Details of BMW :");
        System.out.println( "Color : "+color.getColor()+","+"Country : " +country.getCountry()+","+ "Engine : "+engine.getEngineType()+ ","+" DriveTrain : " +trainSystem.getDriveTrain());
    }
}
