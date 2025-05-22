package Springboot.example.SpringbootFirstApplication.controller;


import Springboot.example.SpringbootFirstApplication.dto.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from BridgeLabz";
    }

    @GetMapping("/hello/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/hello/param/{name}")
    public String sayHelloGet(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/hello/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/hello/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName,
                              @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}
