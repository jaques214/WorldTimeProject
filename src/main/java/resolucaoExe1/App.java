package resolucaoExe1;

public class App {
    /**
     *
     * @param args argumentos da consola main
     */
    public static void main(String[] args) {
        WorldTime wt = new WorldTime();
        String t = "Europe/Lisbon";
        System.out.println("Your current timezone is " + t + "\nTime (hh:mm) - " + wt.getTimeByCountry(t));
    }
}
