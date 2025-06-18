class logger{
	private static logger instance;
	private logger() {
		System.out.println("Private constructor instatiated!!");
	}
	public static logger getlogger() {
		if(instance==null) {
			instance=new logger();
		}
		return instance;
	}
	public void log(String msg) {
		System.out.println("Log: "+msg);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger obj1=logger.getlogger();
		logger obj2=logger.getlogger();
		obj1.log("Object 1 is executed");
		obj2.log("Object 2 is executed");
		System.out.println("Is obj1==obj2 ? "+(obj1==obj2));


	}

}
