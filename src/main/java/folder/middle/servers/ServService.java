package folder.middle.servers;

import folder.middle.blockr.Baza;
import folder.middle.repository.BazaRep;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServService implements ServeNService {

    @Autowired
    private BazaRep repository;

    @Override
    public List<Baza> findAll() {

        var bazad = (List<Baza>) repository.findAll();

        return bazad;
    }
}