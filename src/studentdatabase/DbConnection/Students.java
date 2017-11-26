/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase.DbConnection;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dragan Krstic
 */
@Entity
@Table(name = "students", catalog = "bazapodataka", schema = "")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findByStudentId", query = "SELECT s FROM Students s WHERE s.studentId = :studentId")
    , @NamedQuery(name = "Students.findByName", query = "SELECT s FROM Students s WHERE s.name = :name")
    , @NamedQuery(name = "Students.findBySurname", query = "SELECT s FROM Students s WHERE s.surname = :surname")
    , @NamedQuery(name = "Students.findByContact", query = "SELECT s FROM Students s WHERE s.contact = :contact")
    , @NamedQuery(name = "Students.findByEmail", query = "SELECT s FROM Students s WHERE s.email = :email")
    , @NamedQuery(name = "Students.findByState", query = "SELECT s FROM Students s WHERE s.state = :state")
    , @NamedQuery(name = "Students.findByCity", query = "SELECT s FROM Students s WHERE s.city = :city")
    , @NamedQuery(name = "Students.findByAddress", query = "SELECT s FROM Students s WHERE s.address = :address")
    , @NamedQuery(name = "Students.findByCourse", query = "SELECT s FROM Students s WHERE s.course = :course")
    , @NamedQuery(name = "Students.findByDateofbirth", query = "SELECT s FROM Students s WHERE s.dateofbirth = :dateofbirth")})
public class Students implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "contact")
    private BigInteger contact;
    @Column(name = "email")
    private String email;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "address")
    private String address;
    @Column(name = "course")
    private String course;
    @Column(name = "dateofbirth")
    private String dateofbirth;

    public Students() {
    }

    public Students(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        Integer oldStudentId = this.studentId;
        this.studentId = studentId;
        changeSupport.firePropertyChange("studentId", oldStudentId, studentId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public BigInteger getContact() {
        return contact;
    }

    public void setContact(BigInteger contact) {
        BigInteger oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        String oldDateofbirth = this.dateofbirth;
        this.dateofbirth = dateofbirth;
        changeSupport.firePropertyChange("dateofbirth", oldDateofbirth, dateofbirth);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentdatabase.StudentForm.Students[ studentId=" + studentId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
