package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;
import org.junit.After;
import org.junit.jupiter.api.BeforeAll;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.testng.Assert.assertTrue;


public class JobTest {

    // do not forget to declare variables here before using @Before
    Job job1;
    Job job2;
    Job job4;
    Job job5; //all fields equal to job4 except ID
    Job job6;


    @Before
    public void createObjectsForTest() {

        job1 = new Job();
        job2 = new Job();
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job6 = new Job("Product tester", new Employer(), new Location(), new PositionType(), new CoreCompetency());
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testSettingJobId() {
        assertTrue(job1.getId() + 1 == job2.getId());
    }

    @Test
    public void ifJob1IdEquals1() {
       assertEquals(1, job1.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields1() {
        assertTrue(job4.getEmployer() instanceof Employer);

    }

    @Test
    public void testJobConstructorSetsAllFields11() {
        assertTrue(job4.getEmployer().getValue() == "ACME");

    }
    @Test
    public void testJobConstructorSetsAllFields2() {
        assertTrue(job4.getLocation() instanceof Location);

    }

    @Test
    public void testJobConstructorSetsAllFields21() {
        assertTrue(job4.getLocation().getValue() == "Desert");

    }
    @Test
    public void testJobConstructorSetsAllFields3() {
        assertTrue(job4.getPositionType() instanceof PositionType);

    }

    @Test
    public void testJobConstructorSetsAllFields31() {
        assertTrue(job4.getPositionType().getValue() == "Quality control");

    }
    @Test
    public void testJobConstructorSetsAllFields4() {
        assertTrue(job4.getCoreCompetency() instanceof CoreCompetency);
        //assertTrue(job4.getCoreCompetency().getValue() == "Perggsistence"); // looks like we can put all tests in one test and IDE will show which sub-test failed


    }

    @Test
    public void testJobConstructorSetsAllFields41() {
        assertTrue(job4.getCoreCompetency().getValue() == "Persistence");

    }

    @Test
    public void testJobConstructorSetsAllFields5() {
        assertEquals("Product tester", job4.getName());
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false, job4.equals(job5));
    }

    //test for Job.toString()
    @Test
    public void testForToString() {
        //test if first line of output has empty line
        // pay attention that when you use .getEmployer() and .getEmployer().getValue(), you receive the same result because when you just do .getEmployer() it automatically calls for .toString() set in Employer, which returns just value!!!
        assertEquals("" + "\n" + "ID: " + job5.getId() + "\n" + "Name: " + job5.getName() + "\n" + "Employer: " + job5.getEmployer().getValue() +"\n" + "Location: " + job5.getLocation().getValue() + "\n" + "Position Type: " + job5.getPositionType() + "\n" + "Core Competency: " + job5.getCoreCompetency() + "\n" + "", job5.toString());
        assertEquals("" + "\n" + "ID: " + job6.getId() + "\n" + "Name: " + job6.getName() + "\n" + "Employer: " + "Data not available" +"\n" + "Location: " + "Data not available" + "\n" + "Position Type: " + "Data not available" + "\n" + "Core Competency: " + "Data not available" + "\n" + "", job6.toString());
    }


}
