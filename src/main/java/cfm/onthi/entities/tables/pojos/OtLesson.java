/*
 * This file is generated by jOOQ.
 */
package cfm.onthi.entities.tables.pojos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "ot_lesson",
    schema = "s_onthi",
    indexes = {
        @Index(name = "ID_COURSE", columnList = "ID_COURSE ASC")
    }
)
public class OtLesson implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idLesson;
    private Long idCourse;
    private Long lessonParent;
    private String lessonName;
    private String linkVideo;
    private Double duration;
    private Long order;
    private Double continueTime;
    private Long view;
    private String description;
    private LocalDateTime createdDate;
    private String lastModifiedBy;
    private LocalDateTime lastModifiedDate;

    public OtLesson() {}

    public OtLesson(OtLesson value) {
        this.idLesson = value.idLesson;
        this.idCourse = value.idCourse;
        this.lessonParent = value.lessonParent;
        this.lessonName = value.lessonName;
        this.linkVideo = value.linkVideo;
        this.duration = value.duration;
        this.order = value.order;
        this.continueTime = value.continueTime;
        this.view = value.view;
        this.description = value.description;
        this.createdDate = value.createdDate;
        this.lastModifiedBy = value.lastModifiedBy;
        this.lastModifiedDate = value.lastModifiedDate;
    }

    public OtLesson(
        Long idLesson,
        Long idCourse,
        Long lessonParent,
        String lessonName,
        String linkVideo,
        Double duration,
        Long order,
        Double continueTime,
        Long view,
        String description,
        LocalDateTime createdDate,
        String lastModifiedBy,
        LocalDateTime lastModifiedDate
    ) {
        this.idLesson = idLesson;
        this.idCourse = idCourse;
        this.lessonParent = lessonParent;
        this.lessonName = lessonName;
        this.linkVideo = linkVideo;
        this.duration = duration;
        this.order = order;
        this.continueTime = continueTime;
        this.view = view;
        this.description = description;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.ID_LESSON</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LESSON", nullable = false)
    public Long getIdLesson() {
        return this.idLesson;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.ID_LESSON</code>.
     */
    public void setIdLesson(Long idLesson) {
        this.idLesson = idLesson;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.ID_COURSE</code>.
     */
    @Column(name = "ID_COURSE", nullable = false)
    public Long getIdCourse() {
        return this.idCourse;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.ID_COURSE</code>.
     */
    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.LESSON_PARENT</code>.
     */
    @Column(name = "LESSON_PARENT")
    public Long getLessonParent() {
        return this.lessonParent;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.LESSON_PARENT</code>.
     */
    public void setLessonParent(Long lessonParent) {
        this.lessonParent = lessonParent;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.LESSON_NAME</code>.
     */
    @Column(name = "LESSON_NAME", nullable = false, length = 500)
    public String getLessonName() {
        return this.lessonName;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.LESSON_NAME</code>.
     */
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.LINK_VIDEO</code>.
     */
    @Column(name = "LINK_VIDEO", length = 5000)
    public String getLinkVideo() {
        return this.linkVideo;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.LINK_VIDEO</code>.
     */
    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.DURATION</code>.
     */
    @Column(name = "DURATION")
    public Double getDuration() {
        return this.duration;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.DURATION</code>.
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.ORDER</code>.
     */
    @Column(name = "ORDER")
    public Long getOrder() {
        return this.order;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.ORDER</code>.
     */
    public void setOrder(Long order) {
        this.order = order;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.CONTINUE_TIME</code>.
     */
    @Column(name = "CONTINUE_TIME")
    public Double getContinueTime() {
        return this.continueTime;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.CONTINUE_TIME</code>.
     */
    public void setContinueTime(Double continueTime) {
        this.continueTime = continueTime;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.VIEW</code>.
     */
    @Column(name = "VIEW", nullable = false)
    public Long getView() {
        return this.view;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.VIEW</code>.
     */
    public void setView(Long view) {
        this.view = view;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.DESCRIPTION</code>.
     */
    @Column(name = "DESCRIPTION", length = 1000)
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.DESCRIPTION</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.CREATED_DATE</code>.
     */
    @Column(name = "CREATED_DATE", precision = 6)
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.CREATED_DATE</code>.
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.LAST_MODIFIED_BY</code>.
     */
    @Column(name = "LAST_MODIFIED_BY", length = 50)
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.LAST_MODIFIED_BY</code>.
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Getter for <code>s_onthi.ot_lesson.LAST_MODIFIED_DATE</code>.
     */
    @Column(name = "LAST_MODIFIED_DATE", precision = 6)
    public LocalDateTime getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Setter for <code>s_onthi.ot_lesson.LAST_MODIFIED_DATE</code>.
     */
    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final OtLesson other = (OtLesson) obj;
        if (this.idLesson == null) {
            if (other.idLesson != null)
                return false;
        }
        else if (!this.idLesson.equals(other.idLesson))
            return false;
        if (this.idCourse == null) {
            if (other.idCourse != null)
                return false;
        }
        else if (!this.idCourse.equals(other.idCourse))
            return false;
        if (this.lessonParent == null) {
            if (other.lessonParent != null)
                return false;
        }
        else if (!this.lessonParent.equals(other.lessonParent))
            return false;
        if (this.lessonName == null) {
            if (other.lessonName != null)
                return false;
        }
        else if (!this.lessonName.equals(other.lessonName))
            return false;
        if (this.linkVideo == null) {
            if (other.linkVideo != null)
                return false;
        }
        else if (!this.linkVideo.equals(other.linkVideo))
            return false;
        if (this.duration == null) {
            if (other.duration != null)
                return false;
        }
        else if (!this.duration.equals(other.duration))
            return false;
        if (this.order == null) {
            if (other.order != null)
                return false;
        }
        else if (!this.order.equals(other.order))
            return false;
        if (this.continueTime == null) {
            if (other.continueTime != null)
                return false;
        }
        else if (!this.continueTime.equals(other.continueTime))
            return false;
        if (this.view == null) {
            if (other.view != null)
                return false;
        }
        else if (!this.view.equals(other.view))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.createdDate == null) {
            if (other.createdDate != null)
                return false;
        }
        else if (!this.createdDate.equals(other.createdDate))
            return false;
        if (this.lastModifiedBy == null) {
            if (other.lastModifiedBy != null)
                return false;
        }
        else if (!this.lastModifiedBy.equals(other.lastModifiedBy))
            return false;
        if (this.lastModifiedDate == null) {
            if (other.lastModifiedDate != null)
                return false;
        }
        else if (!this.lastModifiedDate.equals(other.lastModifiedDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.idLesson == null) ? 0 : this.idLesson.hashCode());
        result = prime * result + ((this.idCourse == null) ? 0 : this.idCourse.hashCode());
        result = prime * result + ((this.lessonParent == null) ? 0 : this.lessonParent.hashCode());
        result = prime * result + ((this.lessonName == null) ? 0 : this.lessonName.hashCode());
        result = prime * result + ((this.linkVideo == null) ? 0 : this.linkVideo.hashCode());
        result = prime * result + ((this.duration == null) ? 0 : this.duration.hashCode());
        result = prime * result + ((this.order == null) ? 0 : this.order.hashCode());
        result = prime * result + ((this.continueTime == null) ? 0 : this.continueTime.hashCode());
        result = prime * result + ((this.view == null) ? 0 : this.view.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.createdDate == null) ? 0 : this.createdDate.hashCode());
        result = prime * result + ((this.lastModifiedBy == null) ? 0 : this.lastModifiedBy.hashCode());
        result = prime * result + ((this.lastModifiedDate == null) ? 0 : this.lastModifiedDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OtLesson (");

        sb.append(idLesson);
        sb.append(", ").append(idCourse);
        sb.append(", ").append(lessonParent);
        sb.append(", ").append(lessonName);
        sb.append(", ").append(linkVideo);
        sb.append(", ").append(duration);
        sb.append(", ").append(order);
        sb.append(", ").append(continueTime);
        sb.append(", ").append(view);
        sb.append(", ").append(description);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(lastModifiedBy);
        sb.append(", ").append(lastModifiedDate);

        sb.append(")");
        return sb.toString();
    }
}
