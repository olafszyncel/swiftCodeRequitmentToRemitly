package dev.ainz.swiftCodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/swift-codes")
public class SwiftController {

    @Autowired
    private SwiftService swiftService;

    // endpoint 1
    @GetMapping("/{swiftCode}")
    public ResponseEntity<List<Swift>> getSingleSwiftCode(@PathVariable String swiftCode) {
        return new ResponseEntity<List<Swift>>(swiftService.singleSwiftCode(swiftCode), HttpStatus.OK);
    }

    // endpoint 2
    @GetMapping("/country/{countryIso2Code}")
    public ResponseEntity<List<Swift>> getCountrySwiftCode(@PathVariable String countryIso2Code) {
        return new ResponseEntity<List<Swift>>(swiftService.countrySwiftCode(countryIso2Code), HttpStatus.OK);
    }

    // endpoint 3
    @PostMapping
    public ResponseEntity<Map<String, String>> createSwift(@RequestBody SwiftRequestDTO request) {
        swiftService.createSwiftCode(request);
        Map<String, String> response = new HashMap<String, String>();
        response.put("message", "SWIFT Code added successfully");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // endpoint 4
    @DeleteMapping("/{swiftCode}")
    public ResponseEntity<Map<String, String>> deleteSwift(@PathVariable String swiftCode) {
        boolean isDeleted = swiftService.deleteSwiftCode(swiftCode);

        Map<String, String> response = new HashMap<>();

        if (isDeleted) {
            response.put("message", "SWIFT Code deleted successfully");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("message", "SWIFT Code not found");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
}

