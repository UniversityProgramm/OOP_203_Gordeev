package Bridge;

public class GamePerson
{
    private GamePersonImpl realGamePerson;
    public GamePerson(GamePersonImpl impl)
    {
        realGamePerson = impl;
    }
    public void transformToAdmin()
    {
        realGamePerson = new GamePersonAdminImpl();
    }
    public void transformToCommonPlayer()
    {
        realGamePerson = new GamePersonCommonPlayerImpl();
    }
}
