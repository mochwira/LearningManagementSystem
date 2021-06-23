/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mocha
 */
@Entity
@Table(name = "employee_activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeActivity.findAll", query = "SELECT e FROM EmployeeActivity e"),
    @NamedQuery(name = "EmployeeActivity.findByActivityId", query = "SELECT e FROM EmployeeActivity e WHERE e.activityId = :activityId"),
    @NamedQuery(name = "EmployeeActivity.findByProcessStatus", query = "SELECT e FROM EmployeeActivity e WHERE e.processStatus = :processStatus"),
    @NamedQuery(name = "EmployeeActivity.findByLastRead", query = "SELECT e FROM EmployeeActivity e WHERE e.lastRead = :lastRead")})
public class EmployeeActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "activity_id")
    private Integer activityId;
    @Basic(optional = false)
    @Column(name = "process_status")
    private boolean processStatus;
    @Basic(optional = false)
    @Column(name = "last_read")
    @Temporal(TemporalType.DATE)
    private Date lastRead;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User userId;
    @JoinColumn(name = "artikel_id", referencedColumnName = "artikel_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Artikel artikelId;

    public EmployeeActivity() {
    }

    public EmployeeActivity(Integer activityId) {
        this.activityId = activityId;
    }

    public EmployeeActivity(Integer activityId, boolean processStatus, Date lastRead) {
        this.activityId = activityId;
        this.processStatus = processStatus;
        this.lastRead = lastRead;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public boolean getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(boolean processStatus) {
        this.processStatus = processStatus;
    }

    public Date getLastRead() {
        return lastRead;
    }

    public void setLastRead(Date lastRead) {
        this.lastRead = lastRead;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Artikel getArtikelId() {
        return artikelId;
    }

    public void setArtikelId(Artikel artikelId) {
        this.artikelId = artikelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityId != null ? activityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeActivity)) {
            return false;
        }
        EmployeeActivity other = (EmployeeActivity) object;
        if ((this.activityId == null && other.activityId != null) || (this.activityId != null && !this.activityId.equals(other.activityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.EmployeeActivity[ activityId=" + activityId + " ]";
    }
    
}
