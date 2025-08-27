package interfaceProjects;

public class Main {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();
        controller.greetings();
        controller.armSecurity();
        controller.turnOnLights();
        controller.setTemp(18);
        controller.playMusic();
        controller.stopMusic();
        controller.turnOffLights();
        controller.disarmSecurity();

    }
}