package com.havryliuk.saveforflat.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.junit.Test;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class DbConnectivityTest {

    @Test
    public void testMongoDbClusterConnectivity() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("src\\main\\resources\\db.properties")));

        String connectionString = properties.getProperty("db.url");

        MongoClientURI uri = new MongoClientURI(connectionString);
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");
        database.createCollection("expenseCategories");
    }
}
