package com.vg.principles.solid.dependencyinversion.bydefinition;

// principle states to Depend on abstraction, not on concretions
// and here the Database Connection dependency is abstracted
public class ArticleStorageManager {

    private DBConnection dbConnection;

    public ArticleStorageManager(DBConnection dbConnection) {

        this.dbConnection = dbConnection;

    }


}
