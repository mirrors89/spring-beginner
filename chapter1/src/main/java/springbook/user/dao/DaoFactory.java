package springbook.user.dao;

public class DaoFactory {
    public UserDao userDao() {
        // 팩토리 메소드는 UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지를 결정한다.
        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);

        return userDao;
    }
}
