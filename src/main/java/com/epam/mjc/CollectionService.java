package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Comparator.comparing(ft -> ft));
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream().flatMap(List::stream).min(Comparator.comparing(ft -> ft));
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
