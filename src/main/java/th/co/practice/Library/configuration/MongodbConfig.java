package th.co.practice.Library.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import th.co.practice.Library.document.BookS;
import th.co.practice.Library.repository.BookRepository;

@EnableMongoRepositories(basePackageClasses = BookRepository.class)
@Configuration
public class MongodbConfig {
    @Bean
    CommandLineRunner  commandLineRunner (BookRepository bookRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                bookRepository.save(new BookS(1,"Iron Man","Stan Lee",123L));
                bookRepository.save(new BookS(2,"Captain America","Stan Lee",234L));
            }
        };
    }
}
