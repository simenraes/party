package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import be.thomasmore.party.repositories.VenueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    private VenueRepository venueRepository;
    private final LocalDate datum = LocalDate.now(); // controller moet eig stateless zijn dusmoet ditniet final
    // zijn ?
    private final Calendar c1 = Calendar.getInstance();


    @GetMapping({"/", "/home"})
    public String home(Model model) {

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {

        return "about";
    }



}

