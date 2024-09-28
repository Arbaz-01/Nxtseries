package com.example.Nxtseries;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    private myservices pass;

    public controller(myservices pass) {
        this.pass = pass;
    }
    @PostMapping("/save")
public moviesentity saved(moviesentity type){
    return pass.save(type);
}
@PostMapping("/bulkdata")
public List<moviesentity> saved(List<moviesentity> type){
    return pass.savebulk(type);
}
}