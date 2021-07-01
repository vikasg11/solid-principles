package com.vg.principles.solid.dependencyinversion.bydefinition;

public class MySQLDBConnection implements DBConnection {

    public String connect() {
        //takes some inputs and makes a connection
        return "Established connection.";
    }
}
