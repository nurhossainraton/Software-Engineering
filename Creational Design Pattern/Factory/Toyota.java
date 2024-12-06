public class Toyota extends Car {
     Color color = new Red() ;
     EngineType engine = new FullCell();
     DriveTrainSystem trainSystem = new RearWheel();
     Country country = new Japan();

    public void PrintDetails() {
        System.out.println("Details of Toyota :");
        System.out.println( "Color : "+color.getColor()+","+"Country : " +country.getCountry()+","+ "Engine : "+engine.getEngineType()+ ","+" DriveTrain : " +trainSystem.getDriveTrain());
    }
}
