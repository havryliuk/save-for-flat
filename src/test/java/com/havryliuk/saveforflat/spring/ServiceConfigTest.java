package com.havryliuk.saveforflat.spring;

import org.junit.Test;

public class ServiceConfigTest {
    @Test
    public void testServiceConfig() {
        DbConfig dbConfig = new DbConfig();
        ServiceConfig serviceConfig = new ServiceConfig(dbConfig);
        serviceConfig.expenseCategoryService();
    }
}
