package org.mytests.glue.code;

import cucumber.api.java8.En;
import org.junit.Assert;

/**
 * Project: java-selenium-practice-parent
 * Package: PACKAGE_NAME
 * <p>
 * User: vamshi
 * Date: 4/23/18
 * Time: 3:46 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CommonGlueCode implements En {

    {
        System.out.println("Test");
    }

    public CommonGlueCode() {

        Given("^when a test passes$", () -> {
            Assert.assertTrue("Pass a step",true);
        });


    }
}
