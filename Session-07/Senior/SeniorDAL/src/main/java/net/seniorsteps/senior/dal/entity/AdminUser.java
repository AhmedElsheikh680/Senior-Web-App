package net.seniorsteps.senior.dal.entity;
// Generated Jan 6, 2020 9:40:03 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * AdminUser generated by hbm2java
 */
@Entity
@Table(name="admin_user"
    ,catalog="senior_app"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class AdminUser  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private byte active;

    public AdminUser() {
    }

    public AdminUser(String username, String password, byte active) {
       this.username = username;
       this.password = password;
       this.active = active;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="username", unique=true, nullable=false, length=100)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }




}


