package helloworld;

import java.util.Scanner;
import java.util.Random;


   

public class Hello {
	public static void main(String[] args) {
		
		Film terminator = new Film("Terminator", "James cameron", 1998);
		Film Harrypotter = new Film("Harry Potter", "Zach Snider", 2021);
		Film Scream = new Film("Scream", "Wes Craven", 2011);

		Film[] filmArray = new Film[3];
        filmArray[0] = terminator;
        filmArray[1] = Harrypotter;
        filmArray[2] = Scream;
        
        for(Film film : filmArray) {
        	System.out.println(film);
        }
		
		
	}
}
