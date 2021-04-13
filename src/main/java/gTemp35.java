import java.util.ArrayList;
import java.util.List;

public class gTemp35 {
    public static void addCat(List<? super Cat1> catList) {
        catList.add(new RedCat1());
        System.out.println("Cat Added");
    }

    public static void main(String[] args) {
        List<Animal1> animalList = new ArrayList<Animal1>();
        List<Cat1> catList = new ArrayList<Cat1>();
        List<RedCat1> redCatList = new ArrayList<RedCat1>();
        List<Dog1> dogList = new ArrayList<Dog1>();

        //add list of super class Animal of Cat class
        addCat(animalList);

        //add list of Cat class
        addCat(catList);

        //compile time error
        //can not add list of subclass RedCat of Cat class
        //addCat(redCatList);

        //compile time error
        //can not add list of subclass Dog of Superclass Animal of Cat class
        //addCat.addMethod(dogList);
    }
}

class Animal1 {
}

class Cat1 extends Animal1 {
}

class RedCat1 extends Cat1 {
}

class Dog1 extends Animal1 {
}
