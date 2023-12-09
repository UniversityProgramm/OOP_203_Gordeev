package proxy;

public interface SiteAdminPanel {
    public void banUser(User user, int howManySeconds);
    public String getUserMail(User user);
}
