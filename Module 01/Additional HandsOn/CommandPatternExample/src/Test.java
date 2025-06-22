
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Light light = new Light();
	        RemoteControl remote = new RemoteControl();

	        remote.setCommand(new LightOnCommand(light));
	        remote.pressButton();

	        remote.setCommand(new LightOffCommand(light));
	        remote.pressButton();

	}

}
