package org.example.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    Logger logger = LogManager.getLogger(Index.class);

    @GetMapping("/")
    public String index(@RequestBody String keyword) {
        logger.info("test bug,{}", keyword);
        return "success";
    }
}
