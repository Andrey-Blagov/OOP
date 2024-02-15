package homework;

import homework.User;
import homework.Persister;
import homework.UserRepo;


public class Runner {
    private Runner() {
        User user = new User("Bob");
        UserRepo userRepo = new UserRepo();
        Persister persister = new Persister(user);


        userRepo.report(user);
        persister.save();
    }

    public static void run() {
        new Runner();
    }
}
