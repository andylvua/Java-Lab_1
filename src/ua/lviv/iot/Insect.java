package ua.lviv.iot;

public record Insect(String name, Double speedInMetersPerSecond, Double massInGrams,
                     String order, String superFamily, String family) {

	private static final String INSECTCLASS = "Insect";

	Insect() {
		this("Fly", null, null, null, null, null);
	}

	Insect(String name, double speedInMetersPerSecond, double massInGrams) {
		this(name, speedInMetersPerSecond, massInGrams, null, null, null);
	}

	public static String getInsectClass() {
		return INSECTCLASS;
	}

	@Override
	public String toString() {
		if (order != null) {
			return
					"Name: " + name + "\n\n" +
							"Speed (mps): " + speedInMetersPerSecond + "\n" +
							"Mass (g): " + massInGrams + "\n" +
							"Order: " + order + "\n" +
							"Super family: " + superFamily + "\n" +
							"Family: " + family + "\n";
		}
		else if (speedInMetersPerSecond != null){
			return
					"Name: " + name + "\n\n" +
							"Speed (mps): " + speedInMetersPerSecond + "\n" +
							"Mass (g): " + massInGrams + "\n<No more information>\n";
		}
		else {
			return "Name: " + name + "\n\n<No more information>\n";
		}
	}
}
