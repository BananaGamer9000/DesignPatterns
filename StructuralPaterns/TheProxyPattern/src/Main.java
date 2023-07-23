import proxy.DatabaseAccess;
import proxy.User;
import proxy.service.ProxyDatabaseAccess;

public class Main {
    public static void main(String[] args) {

        /*
        The Proxy Pattern allows you to create a surrogate or placeholder
        for another object to control access to it.
        This can be useful when you want to add extra functionality, control,
        or security to the real object without changing its code
         */


        User adminUser = new User("admin", true);
        User regularUser = new User("user123", false);

        // Only the admin user has access to the real database
        DatabaseAccess adminDatabaseAccess = new ProxyDatabaseAccess("main_db", adminUser);
        adminDatabaseAccess.grantAccess(adminUser);
        adminDatabaseAccess.grantAccess(regularUser);

        // Regular users have no access to the real database
        DatabaseAccess regularDatabaseAccess = new ProxyDatabaseAccess("main_db", regularUser);
        regularDatabaseAccess.grantAccess(adminUser);
        regularDatabaseAccess.grantAccess(regularUser);
    }
}