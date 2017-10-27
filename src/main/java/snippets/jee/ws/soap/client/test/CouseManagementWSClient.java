package snippets.jee.ws.soap.client.test;

import snippets.jee.ws.soap.client.Course;
import snippets.jee.ws.soap.client.CourseManagementService;
import snippets.jee.ws.soap.client.CourseManagementServiceService;

public class CouseManagementWSClient {

    public static void main (String[] args) {
        CourseManagementServiceService courseManagementServiceService = new CourseManagementServiceService();

        CourseManagementService port = courseManagementServiceService.getCourseManagementServicePort();

        Course course = port.getCourse(1);
        System.out.println("Course name = " + course.getName());
    }

}
