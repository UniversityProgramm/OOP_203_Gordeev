package proxy;

public class SiteSecurityProxy implements SiteAdminPanel{
    private SiteAdminPanel adminPanel;
    public SiteSecurityProxy(SiteAdminPanel adminPanel) {
        this.adminPanel = adminPanel;
    }

    @Override
    public void banUser(User user, int howManySeconds) {
        if (!SiteAdmin.authorize(user.getUserLogin(), user.getUserPassword())) {
            throw new SecurityException("У пользователя нет доступпа к этой функции");
        }
        adminPanel.banUser(user, howManySeconds);
        System.out.println(user.getTimeOfBan());
    }
    @Override
    public String getUserMail(User user) {
        if (!SiteAdmin.authorize(user.getUserLogin(), user.getUserPassword())) {
            throw new SecurityException("У пользователя нет доступпа к этой функции");
        }
        return adminPanel.getUserMail(user);
    }
}
