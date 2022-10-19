package be.abis.exercise.test;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {

    Address address = new Address("Ham", "5", "9000", "Gent", "Belgium", "BE");
    Company company = new Company("ttl", address);

    @Test
    public void taxForBelgianCompaniesShouldBe51(){
        assertEquals(51.0, company.calculateTaxToPay());
    }

    @Test
    public void capital(){
        System.out.println(StringUtils.capitalize(company.getName()));
    }



}
