package ru.itpark.wallpaperservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.wallpaperservice.service.WallpaperService;

@Controller
public class PageController {
    private WallpaperService service;

    public PageController(WallpaperService service) {
        this.service = service;
    }

    @RequestMapping
    public String page(Model model) {
        model.addAttribute("title", "some value");
        return "mypage";
    }

   @RequestMapping (params = {"roomLength", "roomWidth", "roomHeight", "rollWidth", "rollLength"})
    public String calculate (Model model,
                             @RequestParam int roomLength,
                             @RequestParam int roomWidth,
                             @RequestParam int roomHeight,
                             @RequestParam int rollWidth,
                             @RequestParam int rollLength)
    {

        String rollAmount = calculate(model, roomLength, roomWidth, roomHeight, rollWidth, rollLength);
        model.addAttribute("result", rollAmount);
        return "mypage";
    }
}
/*  private BmiService service;

    // Dependency Injection - мы "просим" то, что нам надо
    // просим ru.itpark.bmiservice.service, т.к. сам Spring этот сервис создаст
    // пусть он нам его сюда и передаст
    public FrontpageController(BmiService service) {
        this.service = service;
    }

    @RequestMapping // привязываем запросы к методу
    public String index(Model model) { // <- Dependency Injection
        model.addAttribute("title", "Some value");
        return "frontpage"; // "строка без расширения" - искать в папке templates файл с таким же именем
    }

    @RequestMapping(params = {"weight", "height"}) // в запросе обязательно должны быть эти два параметра
    public String calculate(
            Model model,
            @RequestParam int weight,  // говорим, что аргумент нужно брать из запроса
            @RequestParam int height  // говорим, что аргумент нужно брать из запроса
    ) {
        // В контроллерах не должно быть логики -> Service
        // Толстые тупые контроллеры
        double bmi = service.calculate(weight, height);

        model.addAttribute("result", bmi); // "result" - название атрибута, bmi - значение
        return "frontpage";
    }
}
*/