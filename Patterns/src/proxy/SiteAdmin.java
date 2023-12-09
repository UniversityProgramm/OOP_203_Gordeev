package proxy;

import java.util.HashMap;
import java.util.Map;

public class SiteAdmin {
    private static Map<String, String> allAdminsData = Map.of("admin", "12341", "admins", "12345");
    public static boolean authorize(String userLogin, String userPassword) {
        return allAdminsData.containsKey(userLogin) && (allAdminsData.get(userLogin) == userPassword);
    }
}
