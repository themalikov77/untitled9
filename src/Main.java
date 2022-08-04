public class Main {
    public static void main(String[] args) {

        System.out.println(youCanWolk(25, 35));
        System.out.println(youCanWolk(30, 45));
        System.out.println(youCanWolk(41, 28));
        System.out.println(youCanWolk(33, 30));
        System.out.println(youCanWolk(24, 24));
        System.out.println(generateRandomAge(23, 10));
        System.out.println(youWolk(23, 10));
    }

    public static String youCanWolk(int personsAge, int outsideTemperature) {
        if (personsAge >= 20 && personsAge <= 45 && outsideTemperature >= -20 && outsideTemperature <= 30)

            return "Mojno idti guliat";

        else if (personsAge < 20 && outsideTemperature >= 0 && outsideTemperature <= 28)

            return "Mojno idti guliat";

        else if (personsAge > 45 && outsideTemperature >= -10 && outsideTemperature <= 25)

            return "Mojno idti guliat";

        else

            return "Ostavaites doma";
    }

    public static int generateRandomAge(int min, int max) {
        int Random = (min + max);

        return min + Random % (max + 1 - min);

    }

    public static String youWolk (int min, int max) {
        return "Mojno li idti guliat";
    }
}
