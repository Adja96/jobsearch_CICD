package sn.isi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sn.isi.dto.AppIEF;
import sn.isi.service.AppIEFService;

import java.util.List;

@RestController
@RequestMapping("/ief")
@AllArgsConstructor
public class AppIEFController {
    private AppIEFService appIEFService;

    @GetMapping
    public List<AppIEF> fechAll() {
        return appIEFService.fechAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AppIEF create(@Validated @RequestBody AppIEF appIEF) {
        return appIEFService.create(appIEF);
    }
}
