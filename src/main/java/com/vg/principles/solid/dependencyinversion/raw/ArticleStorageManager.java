package com.vg.principles.solid.dependencyinversion.raw;

// principle states to Depend on abstraction, not on concretions
// but here ArticleStorageManager is forced to depend on OracleDBConnection
public class ArticleStorageManager {

    private OracleDBConnection oracleDBConnection;

    public ArticleStorageManager(OracleDBConnection oracleDBConnection) {

        this.oracleDBConnection = oracleDBConnection;

    }


}
