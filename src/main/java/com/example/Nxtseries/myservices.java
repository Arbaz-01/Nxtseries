package com.example.Nxtseries;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MyServices {
    private final MyRepo connect;

    public MyServices(MyRepo connect) { 
        this.connect = connect;
    }

    public MoviesEntity save(MoviesEntity enter) {
        return connect.save(enter);
    }

    public List<MoviesEntity> saveBulk(List<MoviesEntity> insert) {
        return connect.saveAll(insert);
    }

    public List<MoviesEntity> get() {
        return connect.findAll();
    }

    public void updatingTitle(String oldTitle, String newTitle) {
        connect.updateTitle(oldTitle, newTitle);
    }
}
