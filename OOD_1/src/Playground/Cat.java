package Playground;

import java.util.Objects;
public class Cat extends Animal {
	
	private final long id;
	private String name;
	private String sound;

	public Cat(long id) {
		// vertical constructor chaining
		super("Feline");
		this.id = id;
	}
	

	public Cat(long id, String name) {
		// Calling super class' constructor -- Object
		// When the super class has a no-args constructor super() is implicitly added
		// here if we do not add it ourselves
		this(id);
		this.name = name;
	}

	public Cat(long id, String name, String sound) {
		// horizontal constructor chaining
		this(id, name);
		this.sound = sound;
	}

	public void makeSound() {
		System.out.println(this.sound);
	}

	@Override
	public void sleep() {
		System.out.println(this.name + " sleeps on their cat tower.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public long getId() {
		return id;
	}

	// Coarse-grained equals
	// Used in collections that use hashing to group elements into buckets
	// [50] -> [element 1, element 3]
	// [71] -> [element 2]
	@Override
	public int hashCode() {
		return Objects.hash(id, name, sound);
	}

	// We know that only Cats with the same id + name + sound are going to be equal
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(sound, other.sound);
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", sound=" + sound + ", type=" + type + "]";
	}

}
