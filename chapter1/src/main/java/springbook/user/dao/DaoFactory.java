package springbook.user.dao;

public class DaoFactory {
    public UserDao userDao() {
        // 팩토리 메소드는 UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지를 결정한다.
        return new UserDao(connectionMaker());
    }

    public ConnectionMaker connectionMaker() {
        // 분리해서 중복을 제거한 ConnectionMaker 타입 오브젝트 생성 코드
        return new DConnectionMaker();
    }
}
