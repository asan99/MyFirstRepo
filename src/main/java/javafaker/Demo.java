package javafaker;

import com.github.javafaker.Faker;

public class Demo {
    protected static Faker faker = new Faker();

    public static void main(String[] args) {
        System.out.println(generateFakerFirstName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeEmailAddress());
        System.out.println(generateFakeArtistName());
        System.out.println("bla bla" + generateFakeAnimalName());
        System.out.println(generateFake());
    }

    public static String generateFakerFirstName(){

        return "Hello my name is " + faker.name().firstName();
    }

    public static String generateFakeLastName(){
        return "Surname is " + faker.name().lastName();
    }

    public static String generateFakeEmailAddress(){
        return "Email is " + faker.internet().emailAddress();
    }

    public static String generateFakeArtistName(){
        return "Artist is " + faker.artist().name();
    }

    public static String generateFakeAnimalName(){
        return faker.animal().name();
    }

    public static String generateFake(){
        return faker.programmingLanguage().name();
    }
}
