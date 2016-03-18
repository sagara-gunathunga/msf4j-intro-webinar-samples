/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package samples.studentmgt;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/students")
public class StudentService {

    private static Map<String, Student> students = new HashMap<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllStudent() {
        return Response.status(Response.Status.ACCEPTED).entity(students.values()).build();

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent(@PathParam("id") String id) {
        Student student = students.get(id);
        if (student != null) {
            return Response.status(Response.Status.ACCEPTED).entity(student).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }


    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(Student student) {
        students.put(student.getId(), student);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modifyStudent(Student student) {
        students.put(student.getId(), student);
        return Response.status(Response.Status.ACCEPTED).build();

    }

    @DELETE
    @Path("/{id}")
    public Response removeStudent(@PathParam("id") String id) {
        students.remove(id);
        return Response.status(Response.Status.ACCEPTED).build();

    }
}
