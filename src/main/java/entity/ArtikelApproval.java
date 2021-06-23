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
@Table(name = "artikel_approval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ArtikelApproval.findAll", query = "SELECT a FROM ArtikelApproval a"),
    @NamedQuery(name = "ArtikelApproval.findByArtikelApproval", query = "SELECT a FROM ArtikelApproval a WHERE a.artikelApproval = :artikelApproval"),
    @NamedQuery(name = "ArtikelApproval.findByStatusApproval", query = "SELECT a FROM ArtikelApproval a WHERE a.statusApproval = :statusApproval"),
    @NamedQuery(name = "ArtikelApproval.findByTanggalApproval", query = "SELECT a FROM ArtikelApproval a WHERE a.tanggalApproval = :tanggalApproval")})
public class ArtikelApproval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "artikel_approval")
    private Integer artikelApproval;
    @Basic(optional = false)
    @Column(name = "status_approval")
    private String statusApproval;
    @Basic(optional = false)
    @Column(name = "tanggal_approval")
    @Temporal(TemporalType.DATE)
    private Date tanggalApproval;
    @JoinColumn(name = "artikel_id", referencedColumnName = "artikel_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Artikel artikelId;

    public ArtikelApproval() {
    }

    public ArtikelApproval(Integer artikelApproval) {
        this.artikelApproval = artikelApproval;
    }

    public ArtikelApproval(Integer artikelApproval, String statusApproval, Date tanggalApproval) {
        this.artikelApproval = artikelApproval;
        this.statusApproval = statusApproval;
        this.tanggalApproval = tanggalApproval;
    }

    public Integer getArtikelApproval() {
        return artikelApproval;
    }

    public void setArtikelApproval(Integer artikelApproval) {
        this.artikelApproval = artikelApproval;
    }

    public String getStatusApproval() {
        return statusApproval;
    }

    public void setStatusApproval(String statusApproval) {
        this.statusApproval = statusApproval;
    }

    public Date getTanggalApproval() {
        return tanggalApproval;
    }

    public void setTanggalApproval(Date tanggalApproval) {
        this.tanggalApproval = tanggalApproval;
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
        hash += (artikelApproval != null ? artikelApproval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArtikelApproval)) {
            return false;
        }
        ArtikelApproval other = (ArtikelApproval) object;
        if ((this.artikelApproval == null && other.artikelApproval != null) || (this.artikelApproval != null && !this.artikelApproval.equals(other.artikelApproval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ArtikelApproval[ artikelApproval=" + artikelApproval + " ]";
    }
    
}
