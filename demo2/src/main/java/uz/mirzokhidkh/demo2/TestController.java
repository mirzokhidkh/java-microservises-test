package uz.mirzokhidkh.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping()
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("Demo2 Hello");
    }
}
