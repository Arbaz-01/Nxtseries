package com.example.Nxtseries;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class myservices {
    private myrepo connect;

    public myservices(myrepo connect) { 
        this.connect = connect;
    }
    public moviesentity save(moviesentity enter){
        return connect.save(enter);
    }

    public List<moviesentity> savebulk(List<moviesentity> insert){
        return connect.saveAll(insert);
    }


}
