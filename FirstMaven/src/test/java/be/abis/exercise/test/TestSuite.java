package be.abis.exercise.test;

import org.junit.platform.suite.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AddressTest.class, PersonTest.class, CompanyTest.class})
public class TestSuite {
}
