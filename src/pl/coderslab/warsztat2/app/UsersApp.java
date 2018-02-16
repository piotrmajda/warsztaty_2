package pl.coderslab.warsztat2.app;

import pl.coderslab.warsztat2.model.Users;

public class UsersApp {

	public static void main(String[] args) {
		test();

	}
static void test(){
	Users user = new Users("gal", "gal@anonim.pl", "hasło");
	System.out.println(user.getPassword());
	System.out.println(user.isPasswordCorrect("nowy"));
	System.out.println(user.isPasswordCorrect("hasło"));
}
}
