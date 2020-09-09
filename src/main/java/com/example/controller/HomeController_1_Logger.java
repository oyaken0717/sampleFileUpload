package com.example.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.FileUploadForm;
@Controller
public class HomeController_1_Logger {
    private static final Logger log = Logger.getLogger(HomeController_1_Logger.class);
    
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