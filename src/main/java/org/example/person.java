package org.example;

import java.util.ArrayList;
import java.util.List;

public class person {

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private person mother;
    private person father;
    private List <person> children;
    private List<person> siblings;
    private List <pet> pets;

    public person (String name, String lastName,String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public List<person> getChildren() {
        return children;
    }

    public List<person> getSiblings() {
        return siblings;
    }

    public List<pet> getPets() {
        return pets;
    }

    public person getMother() {
        return mother;
    }

    public person getFather() {
        return father;
    }

    public void setMother(person mother) {
        this.mother = mother;
    }

    public void setFather(person father) {
        this.father = father;
    }

    public void setChildren(List<person> children) {
        this.children = children;
    }

    public void setSiblings(List<person> siblings) {
        this.siblings = siblings;
    }

    public void setPets(List<pet> pets) {
        this.pets = pets;
    }

    public void addParents(person mother, person father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(person child) {
        children.add(child);
    }
    public void addPet(pet pet) {
       pet.setOwner(this);
        pets.add(pet);

    }
    public void addSibling(person sibling) {
        siblings.add(sibling);
    }

    public List <person> getGrandChildren() {
        List <person> grandChildren = new ArrayList<>();
        for (person child  : children) {

        for( person grandchild :child.getChildren()) {
            grandChildren.add(grandchild);

            }
    }
        return grandChildren;

    }
}
