package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExpressionComparisonTask2 {

    public static void main(String[] args) {
        double x = 2.0; // Заданное значение X

        List<Optional<Double>> results = new ArrayList<>();

        // (x^3)/6/x^2
        if (x != 0) {
            results.add(Optional.of(Math.pow(x, 3) / 6 - Math.pow(x, 2)));
        } else {
            results.add(Optional.empty());
        }

        // ln(x)/x
        if (x > 0) {
            results.add(Optional.of(Math.log(x) / x));
        } else {
            results.add(Optional.empty());
        }

        // e^x-x^e
        results.add(Optional.of(Math.exp(x) - Math.pow(x, Math.exp(1))));

        Comparator<Optional<Double>> optionalComparator = Comparator.comparing(Optional::get);
        results.sort(optionalComparator);

        for (int i = 0; i < results.size(); i++) {
            Optional<Double> result = results.get(i);
            if (result.isPresent()) {
                System.out.printf("Значение выражения %d: %.6f%n", i + 1, result.get());
            } else {
                System.out.printf("Значение выражения %d не имеет смысла.%n", i + 1);
            }
        }
    }
}
