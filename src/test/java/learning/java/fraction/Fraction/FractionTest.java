package learning.java.fraction.Fraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import learning.java.fraction.Fraction.Fraction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class FractionTest {

	@Test
	void add_twoFifthsPlusThreeHalvesIsNineteenTenths() {
		Fraction f1 = new Fraction(2, 5);
		Fraction f2 = new Fraction(3, 2);
		Fraction result = new Fraction(19, 10);
		assertThat(f1.add(f2), is(equalTo(result)));
	}

}
