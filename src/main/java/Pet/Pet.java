package Pet;

public class Pet {
	private String name;
	private String ownerName;

	public Pet(String name, String ownerName) {
		this.name = name;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
