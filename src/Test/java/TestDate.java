import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDate {
    static Faker faker = new Faker(new Locale("ru"));
    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            address = faker.address().streetAddress(),
            email = faker.internet().emailAddress();



    public static String

    gander = "Male",
    phone = "9167838450",
    subject = "English",
    hobbi = "Reading, Music",
    fileName = "test.png",
    state = "NCR",
    city = "Delhi";



}
