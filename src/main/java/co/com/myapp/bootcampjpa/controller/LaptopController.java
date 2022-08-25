package co.com.myapp.bootcampjpa.controller;

import co.com.myapp.bootcampjpa.models.ILaptopRepo;
import co.com.myapp.bootcampjpa.models.Laptop;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class LaptopController {

    private final ILaptopRepo repo;

    @PostMapping("/save/laptop")
    public void save(@RequestBody Laptop laptop){
        repo.save(laptop);
    }

    @GetMapping("/laptop/list")
    public List<Laptop>findAll(){
        return repo.findAll();
    }

}
