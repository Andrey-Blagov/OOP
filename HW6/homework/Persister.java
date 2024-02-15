package homework;

public class Persister{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public Persister(UserRepo userRepo) {
        //TODO Auto-generated constructor stub
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
