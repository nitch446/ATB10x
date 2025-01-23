package Ex_021_Enumeration;

enum TrafficLight{
    Red("Stop"),
    Yellow("Get Ready"),
    Green("Go");

    private String action;

    TrafficLight(String action)
    {
        this.action = action;
    }

    public String getAction()
    {
        return action;
    }

    public void printAction()
    {
        System.out.println("The light is: "+this+" action");
    }
}
public class _05_Methods_in_Enum {
    public static void main(String[] args) {
        for(TrafficLight light : TrafficLight.values())
        {
            light.printAction();
        }
    }
}
