package ua.lviv.iot;

public class Main {
	public static void main(String[] args) {
		Insect fly = new Insect();
		Insect mosquito = new Insect("Mosquito", 0.56, 0.005);
		Insect tsetse = new Insect("Tsetse fly", 6.94, 1.2,
				"Diptera", "Hippoboscoidea", "Glossinidae");

		System.out.println("\033[1m" + "\nClass: " + Insect.getInsectClass() + "\033[0m" + "\n");
		System.out.println("#1 ---------------\n" + fly + "\n");
		System.out.println("#2 ---------------\n" + mosquito + "\n");
		System.out.println("#3 ---------------\n" + tsetse);
	}
}