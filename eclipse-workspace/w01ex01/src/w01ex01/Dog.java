package w01ex01;

public class Dog {
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
  
    // Constructor Declaration of Class
    public Dog(String name, String breed,
                   int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
  
    // method 1
    public String getName()
    {
        return name;
    }
  
    // method 2
    public String getBreed()
    {
        return breed;
    }
  
    // method 3
    public int getAge()
    {
        return age;
    }
  
    // method 4
    public String getColor()
    {
        return color;
    }
  
    @Override
    /* By overriding the toString( ) method, we are customizing the string representation of the object rather than just printing the default implementation. */
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge()+
               ","+ this.getColor());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
	}

}
