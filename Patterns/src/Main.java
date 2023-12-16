import Bridge.GamePerson;
import Bridge.GamePersonCommonPlayer;
import proxy.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        Factory cat = CatsFactory.createCat(FactoryEnum.CAT);

        User user = new User("admin", "12341");
        SiteAdminPanel sitePanel = new MySiteAdminPanel();
        sitePanel = new SiteSecurityProxy(sitePanel);
        sitePanel.banUser(user, 0);

        GamePerson Player = new GamePerson(new GamePersonCommonPlayer());
        Player.transformToAdmin();
    }
}