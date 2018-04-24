package com.prac.spring;

import com.prac.spring.constants.PropertiesBean;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Project: myretail-parent
 * Package: my.retail.app
 * <p>
 * User: vthalapu
 * Date: 3/12/18
 * Time: 8:25 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Component
@NoArgsConstructor
public class WelcomeMessageBanner {


    @Autowired
    private PropertiesBean propertiesBean;

    public WelcomeMessageBanner(PropertiesBean propertiesBean) {
        this.propertiesBean = propertiesBean;
    }


    public void printWelcomeBanner() {
        System.out.println("***********************************************************************");
        System.out.println("$$$$$$\\            $$\\         $$$$$$$\\                               ");
        System.out.println("$$  __$$\\           $$ |        $$  __$$\\                              ");
        System.out.println("$$ /  \\__| $$$$$$\\  $$ |        $$ |  $$ |$$$$$$\\   $$$$$$\\   $$$$$$$\\ ");
        System.out.println("\\$$$$$$\\  $$  __$$\\ $$ |$$$$$$\\ $$$$$$$  |\\____$$\\ $$  __$$\\ $$  _____|");
        System.out.println("\\____$$\\ $$$$$$$$ |$$ |\\______|$$  ____/ $$$$$$$ |$$ |  \\__|$$ /      ");
        System.out.println("$$\\   $$ |$$   ____|$$ |        $$ |     $$  __$$ |$$ |      $$ |      ");
        System.out.println("\\$$$$$$  |\\$$$$$$$\\ $$ |        $$ |     \\$$$$$$$ |$$ |      \\$$$$$$$\\ ");
        System.out.println("\\______/  \\_______|\\__|        \\__|      \\_______|\\__|       \\_______|");
        System.out.println("                                                                      ");
        System.out.println("                                                                      ");
        System.out.println("==>>");
        printAppProperties();
        System.out.println("***********************************************************************");

    }


    public void printAppProperties() {
        System.out.println("Server port             -> " + propertiesBean.getServerPort());
        System.out.println("Spring active profile   -> " + propertiesBean.getSpringProfilesActive());
        System.out.println("Log file name           -> " + propertiesBean.getLoggingFile());
        System.out.println("Log Root Status         -> " + propertiesBean.getLoggingLevelRoot());
    }
}
