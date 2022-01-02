/*
 * Copyright @2021 Team4
 */
package com.team4.demo.department.controller;

import com.team4.demo.department.model.Department;
import com.team4.demo.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * This controller class handles all the request come to User service.
 */

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "/adddepartment", consumes = "application/json")
    public Department addDepartment(@RequestBody Department department) {
        log.info("inside save dept");
        return departmentService.addDepartment(department);
    }

    @PutMapping(value = "/editdepartment", consumes = "application/json")
    public Department editDepartment(@RequestBody Department department) {
        return departmentService.editDepartment(department);
    }

    @GetMapping("/id")
    public Department findDepartmentById(@PathVariable Long id) {
        return departmentService.findDepartmentById(id);
    }

    /**
     * Edit user endpoint
     *
     * @param user
     * @throws UserServiceException
     *//*
     * @GetMapping(value = "/getuser") public void getUser() throws
     * UserServiceException { userService.addUser(); }
     *
     * @GetMapping(path="/all") public @ResponseBody Iterable<User> getAllUsers() {
     * // This returns a JSON or XML with the users return repository.findAll(); }
     */
}
