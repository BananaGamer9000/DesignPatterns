package proxy.service;

import proxy.DatabaseAccess;
import proxy.User;

//Service
public class RealDatabaseAccess implements DatabaseAccess {

    private String dbName;

    public RealDatabaseAccess(String dbName) {
        this.dbName = dbName;
        connectToDatabase();
    }

    private void connectToDatabase() {
        System.out.println("Connecting to database: " + dbName);
        // Actual database connection logic here
    }

    @Override
    public void grantAccess(User user) {
        System.out.println("Granting access to database " + dbName + " for user: " + user.getUsername());
        // Actual access-granting logic here
    }
}
