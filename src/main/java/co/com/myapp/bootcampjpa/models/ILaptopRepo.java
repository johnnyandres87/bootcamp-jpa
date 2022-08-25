package co.com.myapp.bootcampjpa.models;

import java.util.List;
import java.util.Optional;

public interface ILaptopRepo {

    public void save(Laptop laptop);
    public List<Laptop> findAll();
    public Optional<Laptop> findById(Long id);
}
