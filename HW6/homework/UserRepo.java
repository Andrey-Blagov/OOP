package homework;

import homework.Persister;
import homework.User;
import homework.Runner;

public class UserRepo {
   
   
   
    public void saveUser(){
        Persister persister = new Persister(this);
        persister.save();
    }

    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
}
