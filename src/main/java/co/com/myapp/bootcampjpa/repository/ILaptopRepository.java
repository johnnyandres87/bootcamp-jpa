package co.com.myapp.bootcampjpa.repository;

import co.com.myapp.bootcampjpa.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepository extends JpaRepository<Laptop,Long> {
}
