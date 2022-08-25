package co.com.myapp.bootcampjpa.service;

import co.com.myapp.bootcampjpa.models.ILaptopRepo;
import co.com.myapp.bootcampjpa.models.Laptop;
import co.com.myapp.bootcampjpa.repository.ILaptopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ILaptopRepoImpl implements ILaptopRepo {

    private final ILaptopRepository repository;

    @Override
    public void save(Laptop laptop) {
        repository.save(laptop);
    }

    @Override
    public List<Laptop> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Laptop> findById(Long id) {
        return repository.findById(id);
    }
}
