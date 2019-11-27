package cz.maxa.ksp.r32.z2.prsi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int width = Integer.parseInt(SCANNER.nextLine());
        List<Integer> heights = Arrays.stream(
                SCANNER.nextLine().split(" ")
        ).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    }
}
