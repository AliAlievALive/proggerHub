package tech.itpark.proggerhub;
import tech.itpark.di.Container;
import tech.itpark.proggerhub.repository.UserRepository;

public class Main {
    public static void main(String[] args) {
        Container myCont = new Container();
        myCont.register(UserRepository.class);
        myCont.wire();
        System.out.println("finish");
    }
}
