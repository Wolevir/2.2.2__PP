package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.serves.ServesCar;

import java.util.Optional;

@Controller
public class CarController {
    private final ServesCar servesCar = new ServesCar();

    @GetMapping("/cars")
    public String getCars(@RequestParam("count") Optional<Integer> value, Model model) {
        model.addAttribute("m", servesCar.list_cars(value.orElse(0)));
        return "cars";
    }

}
