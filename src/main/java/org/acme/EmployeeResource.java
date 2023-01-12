package org.acme;

import javax.inject.Inject;
import javax.sql.DataSource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/employee")
public class EmployeeResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployees() {
        return Employee.listAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Employee employee) {
        employee.persist();
    }
}
