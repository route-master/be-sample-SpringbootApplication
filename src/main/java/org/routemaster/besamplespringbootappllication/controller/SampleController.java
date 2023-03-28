package org.routemaster.besamplespringbootappllication.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public String[] sample() {
        return new String[] {"Hello", "Sample"};
    }

}

