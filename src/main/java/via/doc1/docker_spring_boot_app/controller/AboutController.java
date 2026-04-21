package via.doc1.docker_spring_boot_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    @RequestMapping("/about")
    public String aboutMe() {
        return "<body bgcolor=\"#9FE2BF\">" +
                "<h1>DevOps and Cloud</h1>" +
                "<h2>Dockerizing Spring Boot Application.</h2>" +
                "<section>" +
                "<h2>About Me</h2>" +
                "<p>My name is Waqar Ahmed Khan. I would like to join <span style=\"color: blue;\">IoT/Frontend/Cloud</span> because ...</p>" +
                "</section>" +
                "<p>Team members</p>" +
                "<ul>" +
                "<li>Waqar</li>" +
                "<li>Piotr</li>" +
                "<li>Gean</li>" +
                "</ul>" +
                "</body>";
    }
}