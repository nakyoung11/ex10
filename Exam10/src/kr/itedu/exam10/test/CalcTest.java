package kr.itedu.exam10.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;


class CalcTest {

	@Test
	void test() {
		Assert.assertEquals(2, Calc.sum(1, 1));
		Assert.assertEquals(7, Calc.sum(3, 4));
		Assert.assertEquals(100, Calc.sum(55, 45));
		Assert.assertEquals(9, Calc.sum(5, 4));
	}

}
