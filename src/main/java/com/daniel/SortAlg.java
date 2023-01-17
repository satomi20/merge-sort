package com.daniel;

import java.util.ArrayList;
import java.util.List;

public class SortAlg {

    public List<String> mergeSort(List<String> items, String sortType) {
        if (items.size() <= 1) {
            return items;
        }
        int middle = items.size() / 2;
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        for (int i = 0; i < middle; i++) {
            left.add(items.get(i));
        }
        for (int i = middle; i < items.size(); i++) {
            right.add(items.get(i));
        }
        left = mergeSort(left, sortType);
        right = mergeSort(right, sortType);
        return merge(left, right, sortType);
    }

    public static List<String> merge(List<String> left, List<String> right, String sortType) {
        List<String> result = new ArrayList<>();
        int i = 0, j = 0;
        if (sortType.equals("-a")) {
            while (i < left.size() && j < right.size()) {
                try {
                    int leftNum = Integer.parseInt(left.get(i));
                    int rightNum = Integer.parseInt(right.get(j));
                    if (leftNum < rightNum) {
                        result.add(left.get(i));
                        i++;
                    } else {
                        result.add(right.get(j));
                        j++;
                    }
                } catch (NumberFormatException e) {
                    if (left.get(i).compareTo(right.get(j)) < 0) {
                        result.add(left.get(i));
                        i++;
                    } else {
                        result.add(right.get(j));
                        j++;
                    }
                }
            }
        } else if (sortType.equals("-d")) {
            while (i < left.size() && j < right.size()) {
                try {
                    int leftNum = Integer.parseInt(left.get(i));
                    int rightNum = Integer.parseInt(right.get(j));
                    if (leftNum > rightNum) {
                        result.add(left.get(i));
                        i++;
                    } else {
                        result.add(right.get(j));
                        j++;
                    }
                } catch (NumberFormatException e) {
                    if (left.get(i).compareTo(right.get(j)) > 0) {
                        result.add(left.get(i));
                        i++;
                    } else {
                        result.add(right.get(j));
                        j++;
                    }
                }
            }
        }
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }
}
