package uz.mirzokhidkh.demo2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/book")
@RestController
public class TestController {
    @GetMapping()
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Demo-2 Hello");
    }


    @PostMapping("/message/{id}")
    public ResponseEntity<?> message(@PathVariable Long id) {
        MessageDto messageDto = new MessageDto(id, "Message from DEMO-2");
        return ResponseEntity.ok(messageDto);
    }
}
