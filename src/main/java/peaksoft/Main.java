package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        // userDaoHibernate.createUsersTable();
        // userDaoHibernate.saveUser("Azatbek","Abdurasilov",(byte) 19);
        // System.out.println(userDaoHibernate.getAllUsers());
        // userDaoHibernate.cleanUsersTable();
        // userDaoHibernate.removeUserById(1);
        // System.out.println(userDaoHibernate.existsByFirstName("Azatbek"));
        // userDaoHibernate.dropUsersTable();

    }
}
