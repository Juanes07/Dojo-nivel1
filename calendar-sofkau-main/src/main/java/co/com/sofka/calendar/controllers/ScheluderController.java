package co.com.sofka.calendar.controllers;

import co.com.sofka.calendar.model.ProgramDate;
import co.com.sofka.calendar.services.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.LocalDate;

@RestController
@RequestMapping("api/calendario")
public class ScheluderController {

    @Autowired
    private SchedulerService schedulerService;

    @GetMapping("/crearcalendario")
    public Flux<ProgramDate> generarCalendario(){
        LocalDate startDate = LocalDate.of(2022,01,03);
        Flux<ProgramDate> calendario = schedulerService.generateCalendar("DDD",startDate);
        return calendario;
    }
}
