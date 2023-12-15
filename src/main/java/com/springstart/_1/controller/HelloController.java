/*
package com.springstart._1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    */
/*
    @GetMapping(path = "/hello")
    public String sayHello(@RequestParam(name="name", defaultValue = "world") String name){
        return "Hello " + name +"!";
    }
    *//*


    // GetMapping ile aynı amaçlı kullanım @RequestMapping ilede yapılabilir!

    @RequestMapping(path = {"/message1/{mesaj}","/message1"}, method = RequestMethod.GET)
    public String sayHello(@PathVariable(name="mesaj", required = false) String message) {
        return "Hello "+ message;
    }

    @GetMapping(path = "/message2")
    public String getMyMessage(@RequestParam(name="message", required = false) String message) {
        return "Hello " + message;
    }


    @PostMapping(path = "/save")
    public String save() {
        return "Veri Kaydedildi!";
    }

    @DeleteMapping(path = "/delete")
    public String delete(){
        return "veri silindi!";
    }



}
*/
