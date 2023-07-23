package proxy.service;

import proxy.DatabaseAccess;
import proxy.User;

//Proxy
public class ProxyDatabaseAccess implements DatabaseAccess {

    private RealDatabaseAccess realDatabaseAccess;
    private User user;

    public ProxyDatabaseAccess(String dbName, User user) {
        this.user = user;
        if (user.isAdmin()) {
            realDatabaseAccess = new RealDatabaseAccess(dbName);
        }
    }

    @Override
    public void grantAccess(User user) {
        if (realDatabaseAccess != null) {
            realDatabaseAccess.grantAccess(user);
        } else {
            System.out.println("Access denied for user: " + user.getUsername());
        }
    }
}
