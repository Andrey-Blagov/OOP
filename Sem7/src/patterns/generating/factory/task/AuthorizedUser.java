package patterns.generating.factory.task;

public class AuthorizedUser {
    private String login;
    private String password;

    public AuthorizedUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
