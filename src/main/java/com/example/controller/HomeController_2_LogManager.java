package com.example.controller;

import java.util.logging.LogManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.FileUploadForm;
@Controller
public class HomeController_2_LogManager {
    private static final LogManager log = LogManager.getLogger(HomeController_2_LogManager.class);
    
    @RequestMapping
    public String index() {
        return "index";
    }
    
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(FileUploadForm fileUploadForm) {
        log.info(fileUploadForm.getFileData().getName() + ", " + fileUploadForm.getFileData().getSize());
        return "index";
    }
}