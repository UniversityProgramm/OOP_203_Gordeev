import java.util.Objects;

public class UserLocalClass {
    private String login;
    private String password;

    void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь с логинном " + login + " и паролем " + password + " отправил запрос");
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public UserLocalClass(String login, String password) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        UserLocalClass localUser = (UserLocalClass) o;
        return Objects.equals(login, localUser.login) && Objects.equals(password, localUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "UserLocalClass{" + "login='" + login + '\'' + ", password='" + password + '\'' + '}';
    }

    public static void main(String[] args)
    {
        UserLocalClass localNewUser = new UserLocalClass("localLogin","12434456qwer");
        localNewUser.createQuery();
    }
}
