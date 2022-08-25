package co.com.myapp.bootcampjpa;

import co.com.myapp.bootcampjpa.models.ILaptopRepo;
import co.com.myapp.bootcampjpa.models.Laptop;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class BootcampJpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootcampJpaApplication.class, args);
    }

    private final Logger log = LoggerFactory.getLogger(BootcampJpaApplication.class);
    private final ILaptopRepo repo;
    Laptop laptop = new Laptop(null,"hp",16000,"1tb","intel");
    Laptop laptop2 = new Laptop(null,"Asus",16000,"1tb-ssd","intel");
    @Override
    public void run(String... args) throws Exception {

        log.info("Inicia el proceso para guardar un archivo en la bd");
        repo.save(laptop);
        log.info("se guarda el archivo laptop en la bd " + laptop);
        repo.save(laptop2);
        log.info("se guarda el archivo laptop2 en la bd " + laptop2);

    }
}
