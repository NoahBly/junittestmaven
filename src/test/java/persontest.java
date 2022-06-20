import org.example.person;
import org.example.pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class persontest {

    @Test
    public void getName() {
        //arrange
person test = new person("barbara","Woensel","female", 30);
        //act

        String result = test.getName();

        //assert
        Assertions.assertEquals("barbara", result);
    }

    @Test
    public void getFather() {
        //arrange
        person test = new person("barbara","Woensel","female", 30);
        person testfather = new person("jan","Woensel","male", 80);
        test.setFather(testfather);

        //act
    person result = test.getFather();

        //assert
        Assertions.assertEquals(testfather, result);
    }
@Test
    public void getLastName() {

        //arrange
        person test = new person("piet","dope","male",31);
        //act
        String result = test.getLastName();
        //assert
        Assertions.assertEquals("dope",result);

    }
    @Test
    public void getSex() {

        //arrange
        person test = new person("jan","dope","male",31);
        //act
        String result = test.getSex();
        //assert
        Assertions.assertEquals("male",result);

    }
    @Test
    public void getAge() {

        person test = new person ("jan","dope","male",31);

        int result = test.getAge();

        Assertions.assertEquals(31,result);
    }

    @Test
    public void setName() {

        //arrange
        person test = new person ("jan","dope", "male",31);
        String name = "jan";
        //act
        test.setName(name);

        Assertions.assertEquals("jan",test.getName());

    }
    @Test
    public void setLastName() {

        //arrange
        person test = new person ("jan","dope","male",31);

        String lastname = "dope";

        //act

        test.setLastName(lastname);

        //assert

        Assertions.assertEquals("dope",test.getLastName());
    }
@Test
    public void setSex() {

        person test = new person ("jan","dope","male",31);

        String sex = "male";

        test.setSex(sex);

        Assertions.assertEquals("male",test.getSex());
}

@Test
public void setAge() {

        person test = new person("jan","dope","male",31);

        int age = 31;

        test.setAge(age);

        Assertions.assertEquals(31,test.getAge());
}


@Test
public void getMiddleName() {

        person test = new person ("jan","klaas","dope","male",31);

        String result = test.getMiddleName();

        Assertions.assertEquals("klaas",result);
}
@Test
public void setMiddleName() {
    person test = new person ("jan","klaas","dope","male",31);

    String middlename = "klaas";

    test.setMiddleName(middlename);

    Assertions.assertEquals("klaas",test.getMiddleName());

}
@Test
public void getMother() {
    person test = new person ("jan","klaas","dope","male",31);
    person testmother = new person ("an","sus","dope","female",45);
    test.setMother(testmother);

    person result = test.getMother();


    Assertions.assertEquals(testmother,result);
}
@Test
public void setMother() {
    person test = new person ("jan","klaas","dope","male",31);
    person testmother = new person ("an","sus","dope","female",45);

    test.setMother(testmother);

    Assertions.assertEquals(testmother,test.getMother());
}
@Test
public void setFather() {
    person test = new person ("jan","klaas","dope","male",31);
    person testfather = new person ("jan","sus","dope","male",45);

    test.setFather(testfather);

    Assertions.assertEquals(testfather,test.getFather());
}

@Test
    public void getChildren() {
    person test = new person ("jan","klaas","dope","male",31);
    person child = new person ("piet","pol","male",15);
    List<person> testlijst = new ArrayList<>();
    testlijst.add(child);
    test.setChildren(testlijst);

    List<person> result =  test.getChildren();

    Assertions.assertEquals(testlijst, result );
}
@Test
    public void setChildren() {
    person test = new person ("jan","klaas","dope","male",31);
    person child = new person ("piet","pol","male",15);
    List<person> testlijst = new ArrayList<>();
    testlijst.add(child);


    test.setChildren(testlijst);

    Assertions.assertEquals(testlijst, test.getChildren());



}
@Test
public void addParents() {
    person test = new person ("jan","klaas","dope","male",31);
    person testmother = new person ("an","pol","female",45);
    person testfather = new person ("piet","pol","male",45);

    test.addParents(testmother,testfather);


    Assertions.assertEquals(testmother, test.getMother());
    Assertions.assertEquals(testfather, test.getFather());

}
@Test
    public void addChild() {
    person test = new person ("jan","klaas","dope","male",31);
    person testchild = new person ("kees","pol","male",11);
    List<person> testchildren = new ArrayList<>();


    testchildren.add(testchild);
    test.setChildren(testchildren);

    Assertions.assertEquals(testchildren,test.getChildren());

}
@Test
public void addPet() {
    person test = new person ("jan","klaas","dope","male",31);
    pet testpet = new pet ("rufus", 10, "doberman");
    List<pet> testpets = new ArrayList<>();

    testpets.add(testpet);
    test.setPets(testpets);

    Assertions.assertEquals(testpets,test.getPets());


}

@Test
public void getGrandChildren() {
    person test = new person ("jan","klaas","dope","male",31);
    person testchild = new person ("jaap","klaas","male",30);
    person testgrandchild = new person ("jopie","koek","male",3);
    List<person> testchildren = new ArrayList<>();
    List<person> testgrandchildren = new ArrayList<>();

    testgrandchildren.add(testgrandchild);
    testchild.setChildren(testgrandchildren);
    testchildren.add(testchild);
    test.setChildren(testchildren);
    test.getGrandChildren();


    Assertions.assertEquals(testgrandchildren,test.getGrandChildren());
}
@Test
public void addSibling() {
    person test = new person ("jan","klaas","dope","male",31);
    person testsibling = new person ("jansen","klaas","dope","male",32);
    List<person> testsiblings = new ArrayList<>();

    testsiblings.add(testsibling);
    test.setSiblings(testsiblings);

    Assertions.assertEquals(testsiblings, test.getSiblings());


}

@Test
public void setOwner(){
        pet test = new pet("rufus",10,"doberman");
        person testowner = new person("jan", "drussel", "male", 31);

        test.setOwner(testowner);

        Assertions.assertEquals(testowner, test.getOwner());
}
}
