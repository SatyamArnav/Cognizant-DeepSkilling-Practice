
public class LiskovSubstitution {
	public static class Engine{
		public void on() {
			System.out.println("Engine is now on!!");
		}
		public void poweron(int level) {
			System.out.println("Accelerated at: "+level);
		}
	}
	public static class MotorCar implements Car,EnginePowered{
		private Engine engine;
		public MotorCar() {
			this.engine=new Engine();
		}
		@Override
		public void turnonEngine() {
			// TODO Auto-generated method stub
			engine.on();
		}

		@Override
		public void accelerate() {
			// TODO Auto-generated method stub
			engine.poweron(100);
		}
		
	}
	public static class ElectricCar implements Car{

		@Override
		public void accelerate() {
			// TODO Auto-generated method stub
			System.out.println("Silently Running");
		}
		
	}
	public static void testDrive(Car car) {
	        car.accelerate();
	    }

	public static void startEngine(EnginePowered vehicle) {
	        vehicle.turnonEngine();
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorCar mc=new MotorCar();
		ElectricCar ev=new ElectricCar();
		testDrive(mc);
		startEngine(mc);
		testDrive(ev);
		//startEngine(ev);

	}

}
