package com.elective.pojo;

import com.dosola.core.dao.interfaces.IPojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 选课记录
 * @author june
 * 2015年06月01日 23:59
 */
@SuppressWarnings("serial")
@Entity
@Table(name=Record.TABLENAME)
public class Record implements IPojo {

    public static final String TABLENAME = "e_record";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long courseId;//课程ID

    @Column(nullable = false)
    private Long studentId;//学生ID

    @Column
    private String remark;//备注

    @Column(length=4000)
    private String homework;//家庭作业

    @Column(length=2000)
    private String score;//作业评分

    @Column(nullable = false)
    private Date crTime;//创建时间

    @Column(nullable = false, length = 60)
    private String crUser;//创建人

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public Date getCrTime() {
        return crTime;
    }

    public void setCrTime(Date crTime) {
        this.crTime = crTime;
    }

    public String getCrUser() {
        return crUser;
    }

    public void setCrUser(String crUser) {
        this.crUser = crUser;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}