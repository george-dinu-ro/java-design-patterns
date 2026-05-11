package my.work.creational.builder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void whenUseBuilderWithStaticClass_thenCreateNewObject() {
        Person person = new Person
                .Builder("firstName", "lastName", 20)
                .phone("0777777777")
                .build();

        assertThat(person.getFirstName())
                .isEqualTo("firstName");

        assertThat(person.getLastName())
                .isEqualTo("lastName");

        assertThat(person.getAge())
                .isEqualTo(20);

        assertThat(person.getPhone())
                .isEqualTo("0777777777");

        assertThat(person.getCity())
                .isNull();

        assertThat(person.getAddress())
                .isNull();
    }

    @Test
    void whenUseBuilderWithStaticMethod_thenCreateNewObject() {
        Person person = Person
                .builder("firstName", "lastName", 20)
                .phone("0777777777")
                .build();

        assertThat(person.getFirstName())
                .isEqualTo("firstName");

        assertThat(person.getLastName())
                .isEqualTo("lastName");

        assertThat(person.getAge())
                .isEqualTo(20);

        assertThat(person.getPhone())
                .isEqualTo("0777777777");

        assertThat(person.getCity())
                .isNull();

        assertThat(person.getAddress())
                .isNull();
    }

}
