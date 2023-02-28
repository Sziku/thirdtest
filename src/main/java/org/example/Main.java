package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       List<String> baok = List.of(new String[]{"mexican bean", "kebab", "borsó", "bean",
                "csicseriborsó", "sárgaborsó"});

        String strinType = "borsó";

        List<String> nulllist = new ArrayList<>();

        System.out.println(Arrays.toString(sortAndMeasureBeans(nulllist, strinType)));
        System.out.println(Arrays.toString(new int[]{}));




    }

   static int[] sortAndMeasureBeans(List<String> mixedBeans, String beanType) {

        if (beanType == null || beanType.equals("")) {
            return new int[]{};
        }
        return mixedBeans.stream()
                .filter(bab -> bab.length() <= 10 && bab.contains(beanType))
                .mapToInt(String::length)
                .toArray();
    }

}