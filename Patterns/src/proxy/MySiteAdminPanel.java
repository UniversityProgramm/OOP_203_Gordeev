package proxy;

public class MySiteAdminPanel implements SiteAdminPanel{
    @Override
    public void banUser(User user, int howManySeconds) {
        user.banUser(user, howManySeconds);
    }

    @Override
    public String getUserMail(User user) {
        return user.getUserMail();
    }
}
