package com.k8s.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class K8sDemoRestController {

    @GetMapping("/health-check")
    public ResponseEntity<?> healthCheck(@RequestHeader Map<String, String> requestHeaders) {
        requestHeaders.forEach((key, value) -> log.info("requestHeaders key = {}, value = {}", key, value));
        return ResponseEntity.ok("requestHeaders => " + requestHeaders);
    }
}
