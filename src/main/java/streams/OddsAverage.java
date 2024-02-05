package streams;
import java.util.*;
import java.util.stream.Collectors;

public class OddsAverage {
    public static double getAverageOfAllOdds(List<Integer> integerList) {
        OptionalDouble average = integerList.stream()
                .filter(number -> number % 2 != 0)
                .mapToInt(number -> number * number)
                .average();
        return average.isPresent() ? average.getAsDouble() : 0;
    }
}
