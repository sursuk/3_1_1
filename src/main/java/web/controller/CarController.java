package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.serice.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService carService;


	@GetMapping
	public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
		model.addAttribute("cars", carService.getSomeCars(count));
		return "cars";
	}
}
