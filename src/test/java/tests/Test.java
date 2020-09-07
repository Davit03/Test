package tests;

import data.Data;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Page;

public class Test extends Data {
    @BeforeClass
    public void setUP() {
        beforeMethod();
        driver.get("https://www.staff.am/");

    }

    @org.testng.annotations.Test
    public void verify_header_text(){
        Page log = new Page();
        Assert.assertEquals("CAREER SEARCH STARTS HERE", log.header_text());


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        getWaitTime2();
        driver.quit();
    }
}
