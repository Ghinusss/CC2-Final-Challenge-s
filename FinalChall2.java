//Ambales Geneses L.
//CITCS -1N
//Final Challenge No. 2: Weather Data Tracker (2D array)

public class FinalChall2 {
    public static void main(String[] args) {
        
        int[][] temperatures = {
            {30, 32, 31, 29, 28, 33, 30}, // City 1
            {25, 26, 27, 26, 28, 27, 29}, // City 2
            {35, 34, 36, 37, 38, 37, 36}  // City 3
        };

        
        double[] averageTemperatures = new double[3];
        int[] highestTemperatures = new int[3];

        
        for (int city = 0; city < temperatures.length; city++) {
            int total = 0;
            int highest = Integer.MIN_VALUE;

            for (int day = 0; day < temperatures[city].length; day++) {
                int temp = temperatures[city][day];
                total += temp;
                if (temp > highest) {
                    highest = temp;
                }
            }

            
            averageTemperatures[city] = total / 7.0;
          
            highestTemperatures[city] = highest;
        }

        
        for (int city = 0; city < temperatures.length; city++) {
            System.out.println("City " + (city + 1) + ":");
            System.out.printf("  Average Temperature: %.2f°C%n", averageTemperatures[city]);
            System.out.println("  Highest Temperature: " + highestTemperatures[city] + "°C");
        }
    }
}