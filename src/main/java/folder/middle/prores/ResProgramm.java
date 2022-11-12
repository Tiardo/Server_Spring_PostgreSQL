package folder.middle.prores;

import folder.middle.blockr.Baza;
import folder.middle.servers.ServeNService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ResProgramm {

    @Autowired
    private ServeNService bazzService;

    @GetMapping("/zadacha")
    public String findBazad(Model model) {

        var bazad = (List<Baza>) bazzService.findAll();

        model.addAttribute("bazad", bazad);

        return "zadacha";
    }
}