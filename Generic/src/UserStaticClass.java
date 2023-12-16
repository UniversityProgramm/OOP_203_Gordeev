public class UserStaticClass {
    private static String login;
    private static String password;

    public static class Query{
        public void printToLog(){
            System.out.printf("Пользователь с логинном" + login +  "и паролем" + password + "отправил запрос");
        }
    }

    public static void initialize(String login, String password){
        UserStaticClass.login = login;
        UserStaticClass.password = password;
    }

    public static void main(String[] args)
    {
        initialize("Admin","qwerty228");

        UserStaticClass.Query query = new UserStaticClass.Query();
        query.printToLog();
    }
}
