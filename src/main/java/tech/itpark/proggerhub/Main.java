package tech.itpark.proggerhub;
import tech.itpark.proggerhub.model.User;
import tech.itpark.proggerhub.model.Video;
import tech.itpark.proggerhub.repository.UserRepository;
import tech.itpark.proggerhub.di.*;

public class Main {
    // psvm + Tab -> main
    public static void main(String[] args) {

        Container.register(User.class, Video.class, UserRepository.class);
        Container.wire();
        System.out.println("finish");
        // TODO: MVP -> Minimal Valuable Product
        // videos
        // users/owners <-> consumers
        // Domain Model -> предметная область

        // 0. Plain Java (manual)
        // 1. Dependency Lookup -> Service Registry
        // 2. Dependency Injection -> Container:
        // 2.1 Сам делал new
        // 2.2 Найти нужные зависимости, если они требуются для new
    }
}
