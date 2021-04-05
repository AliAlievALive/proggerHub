package tech.itpark.proggerhub;
//import tech.itpark.proggerhub.di.Container;
import tech.itpark.proggerhub.model.User;
import tech.itpark.proggerhub.model.Video;
import tech.itpark.proggerhub.repository.UserRepository;

public class Main {
    // psvm + Tab -> main
    public static void main(String[] args) {

        Container myCont = new Container();
        myCont.register(User.class, Video.class, UserRepository.class);
        myCont.wire();
        System.out.println("finish");
    }
}
