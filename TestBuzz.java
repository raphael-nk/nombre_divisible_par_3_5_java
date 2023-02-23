package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        System.out.println("Saisissez la taille de la liste: ");
        Integer size = input.nextInt();

        for(int i=0; i < size; i++){
            numbers.add(rand.nextInt(100));
        }

        for (int n: numbers){
            if(n % 3 == 0 && n % 5 == 0) System.out.println(n + ": FluzzGratz");
            else if(n % 3 == 0) System.out.println(n +": Fluzz");
            else if(n % 5 == 0) System.out.println(n +": Gratz");
            else System.out.println(n);
        }
    }
}
