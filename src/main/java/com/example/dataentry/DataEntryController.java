package com.example.dataentry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DataEntryController {
    @Autowired
    private EntryRepository entryRepository;

    @GetMapping("/entry")
    // Add a new DataModel to "model"
    public String entry(Model model) {
        model.addAttribute("dataModel", new DataModel());
        return "entry";
    }

    @PostMapping("/confirmation")
    // Add the given "dataModel" and all previous models from persistent storage to "model",
    // then add the given "dataModel" to persistent storage
    public String entries(@ModelAttribute DataModel dataModel, Model model) {
        model.addAttribute("dataModels", entryRepository.findAll());
        model.addAttribute("topModel", dataModel);
        entryRepository.save(dataModel);
        return "confirmation";
    }
}