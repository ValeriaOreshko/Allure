package ru.netology;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class PatternsCardDeliveryTest {

    private Faker faker;

    @BeforeEach
    void setUpAll() {
        faker = new Faker(new Locale("ru"));
    }

    @Test
    void shouldTest() {
        String city = faker.address().city();
        String name = faker.name().fullName();
        String phone = faker.numerify("+7" + "##########");
        

        System.out.println(city);
        System.out.println(name);
        System.out.println(phone);
    }

}