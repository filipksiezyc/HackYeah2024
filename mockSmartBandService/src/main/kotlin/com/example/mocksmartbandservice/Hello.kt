package com.example.mocksmartbandservice

import com.example.mocksmartbandservice.responses.Heartbeat
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Hello {
    
    @GetMapping("/heartbeat")
    fun heartbeat(): Heartbeat {
        return Heartbeat(true)
    }
}
