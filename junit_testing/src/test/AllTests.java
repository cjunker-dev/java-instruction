package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.CountATest;
import test.SquareTest;

	@RunWith(Suite.class)
	@SuiteClasses({ CountATest.class, SquareTest.class })
	public class AllTests {
}