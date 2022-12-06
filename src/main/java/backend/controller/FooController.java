package backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foos")
class FooController {

//    @Autowired
//    private IFooService service;

    @GetMapping
    public void findAll() {
        System.out.println("Done!");
    }

}
