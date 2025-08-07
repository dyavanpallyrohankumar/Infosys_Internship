package interfaceProjects;

interface EntertainmentControllable {
	void playMusic();

	void stopMusic();
}

interface LightControllable {
	int z = 1876;

	void turnOnLights();

	void turnOffLights();

	default void greetings() {
		System.out.println("welcome Home");
	}
}

interface SecurityControllable {
	void armSecurity();

	void disarmSecurity();
}

interface TempControllable {
	void setTemp(int degree);

	default void greetings() {
		System.out.println("superhome");
	}
}

public class SmartHomeController
		implements EntertainmentControllable, LightControllable, SecurityControllable, TempControllable {

	@Override
	public void setTemp(int degree) {
		System.out.println("Temperature set to " + degree + " degrees");
	}

	@Override
	public void armSecurity() {
		System.out.println("Security armed");
	}

	@Override
	public void disarmSecurity() {
		System.out.println("Security disarmed");

	}

	@Override
	public void turnOnLights() {
		System.out.println("Lights turned on");
	}

	@Override
	public void turnOffLights() {
		System.out.println("Lights turned off");

	}

	@Override
	public void playMusic() {
		System.out.println("Music started playing");
	}

	@Override
	public void stopMusic() {
		System.out.println("Music stopped playing");
	}

	@Override
	public void greetings() {
		LightControllable.super.greetings();
	}

}