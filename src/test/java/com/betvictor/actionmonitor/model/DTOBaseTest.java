package com.betvictor.actionmonitor.model;

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class DTOBaseTest {

    Configuration config = (new ConfigurationBuilder()).iterations(1).build();

    @Test
    public void dtoTest() {

        new BeanTester().testBean(Message.class, config);

    }

}