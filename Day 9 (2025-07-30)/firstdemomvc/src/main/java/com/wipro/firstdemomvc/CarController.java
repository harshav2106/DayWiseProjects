package com.wipro.firstdemomvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.firstdemomvc.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/car") 
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/list") 
    public String showCarList(Model model) {
        List<String> cars = carService.getCarList();
        model.addAttribute("carList", cars);
        return "carlist";
    }

}
