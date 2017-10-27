package snippets.jee.ws.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCourse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getCourse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCourse", propOrder = {
    "courseId"
})
public class GetCourse {

    protected int courseId;

    /**
     * 获取courseId属性的值。
     * 
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * 设置courseId属性的值。
     * 
     */
    public void setCourseId(int value) {
        this.courseId = value;
    }
}
