package sn.isi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sn.isi.dto.AppUser;
import sn.isi.service.AppUserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class AppUserController {
    private AppUserService appUserService;
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AppUser createAppRoles(@Valid @RequestBody AppUser appUser) {
        return appUserService.create(appUser);
    }

    @GetMapping
    public List<AppUser> fechAll() {
        return appUserService.fechAll();
    }
}
