import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    private Faker faker;



    public RegistrationByPersonalData generateByPersonalInfo() {
        faker = new Faker(new Locale("ru"));
        return new RegistrationByPersonalData(
        faker.address().city(),
        faker.name().fullName(),
        faker.phoneNumber().phoneNumber()
        );



    }


}
