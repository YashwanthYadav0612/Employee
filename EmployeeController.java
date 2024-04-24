@RestController
@RequestMapping("/api/employees")

public class EmployeeController {

    @PostMapping
    public ResponseEntity<String> storeEmployeeDetails(@Valid @RequestBody Employee employee) {
        // Validate the data
        // Save employee details to database
        return ResponseEntity.ok("Employee details stored successfully");
    }

    @GetMapping("/{employeeId}/tax-deduction")
    public ResponseEntity<Map<String, Object>> calculateTaxDeduction(@PathVariable String employeeId) {
        // Calculate tax deduction for the employee
        // Return tax deduction details
        return ResponseEntity.ok(Map.of("message", "Tax deduction calculated successfully"));
    }
}

