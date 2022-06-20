package org.example;

public class pet {

    private String name;
    private int age;
    private String species;
    private person owner;



    public pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public person getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setOwner(person owner) {
        this.owner = owner;
    }

}
