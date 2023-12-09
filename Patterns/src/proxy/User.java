package proxy;

public class User {
    private String userLogin;
    private String userPassword;
    private byte[] userAvatar;
    private String username;
    private String user_mail;
    public boolean isBan;
    private int timeOfBan;

    public User(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }
    public String getUserLogin() {
        return userLogin;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public byte[] getUserAvatar() {
        return userAvatar;
    }
    public String getUsername() {
        return username;
    }
    public String getUserMail() {
        return user_mail;
    }
    public String getTimeOfBan() {
        if (timeOfBan == 0) {
            return "Вы забанены навсегда";
        }
        else
            return "Вы забанены на " + timeOfBan + " секунд";
    }

    public void banUser(User user, int seconds) {
        isBan = true;
        timeOfBan = seconds;
    }
}
