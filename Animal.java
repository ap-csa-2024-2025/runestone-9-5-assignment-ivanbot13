public class Animal
{
    private String name;
    private String species;

    public Animal(){
        this.name = "kit";
        this.species = "cat";
    }

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }   

    public void matingCall(){
        System.out.println("generic sound");
    }
}