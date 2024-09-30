package com.example.Nxtseries;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Controller {
    private final MyServices pass;

    public Controller(MyServices pass) {
        this.pass = pass;
    }

    @PostMapping("/save")
    public MoviesEntity save(@RequestBody MoviesEntity type) {
        return pass.save(type);
    }

    @PostMapping("/bulkdata")
    public List<MoviesEntity> saveBulk(@RequestBody List<MoviesEntity> type) {
        return pass.saveBulk(type);
    }

    @GetMapping("/getdata")
    public List<MoviesEntity> getAllMovies() {
        return pass.get();
    }

    @PutMapping("/updatetitle/{oldTitle}/{newTitle}")
    public String updateTitle(@PathVariable String oldTitle, @PathVariable String newTitle) {
        pass.updatingTitle(oldTitle, newTitle);
        return "successfully updated";
    }
}
