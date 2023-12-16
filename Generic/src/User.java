import java.util.Objects;

public class User {
    private String login;
    private String password;

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь с логинном" + login + "и паролем" + password + "отправил запрос");
        }
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User{" + "login='" + login + '\'' + ", password='" + password + '\'' + '}';
    }

    public static void main(String[] args)
    {
        User user = new User("somethingL0gin", "12341");
        user.createQuery();
        User.Query query1 = user.new Query();
        query1.printToLog();
        User.Query query2 = new User("somethingNewLog1n", "12378").new Query();
        query2.printToLog();
    }
}

