public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttribiutes();

        System.out.println("ziększamy prędkość do 3");

        spirit.speed = 3;
        spirit.showAttribiutes();

        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttribiutes();

        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTtemperature();
        spirit.showAttribiutes();
    }
    {
        MarsRobot opportunity = new MarsRobot();

        opportunity.status = "eksploracja";
        opportunity.speed = 200;
        opportunity.temperature = -600;

        opportunity.showAttribiutes();

        System.out.println("ziększamy prędkość do 3");

        opportunity.speed = 8883;
        opportunity.showAttribiutes();

        System.out.println("Zmiana temperatury na -90.");
        opportunity.temperature = -900;
        opportunity.showAttribiutes();

        System.out.println("Sprawdzenie temperatury.");
        opportunity.checkTtemperature();
        opportunity.showAttribiutes();
    }


}








