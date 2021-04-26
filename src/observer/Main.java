package observer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Post post = new Post();
		
		System.out.println("What is username?");
		Scanner scan = new Scanner(System.in);
	    String name = scan.nextLine();
		
        Observer friend1 = (Observer) new Friend("Pesho ");
        Observer friend2 = (Observer) new Friend("Gosho ");
        post.subscribe(friend1);
        post.subscribe(friend2);

        post.setPost("the new post of " + name + ": Good morning friends"); 
        post.setPost("the new post of " + name + ": Good afternoon friends");
        post.setPost("the new post of " + name + ": Good evening friends" ); 

	}

}
