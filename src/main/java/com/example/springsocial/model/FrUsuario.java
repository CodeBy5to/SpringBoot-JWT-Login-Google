package com.example.springsocial.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IDitroyer
 */
@Entity
@Table(name = "fr_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FrUsuario.findAll", query = "SELECT f FROM FrUsuario f"),
    @NamedQuery(name = "FrUsuario.findByIdUsuario", query = "SELECT f FROM FrUsuario f WHERE f.idUsuario = :idUsuario"),
    @NamedQuery(name = "FrUsuario.findByTipoIdentificacion", query = "SELECT f FROM FrUsuario f WHERE f.tipoIdentificacion = :tipoIdentificacion"),
    @NamedQuery(name = "FrUsuario.findByIdentificacion", query = "SELECT f FROM FrUsuario f WHERE f.identificacion = :identificacion"),
    @NamedQuery(name = "FrUsuario.findByName", query = "SELECT f FROM FrUsuario f WHERE f.name = :name"),
    @NamedQuery(name = "FrUsuario.findByRazonsocial", query = "SELECT f FROM FrUsuario f WHERE f.razonsocial = :razonsocial"),
    @NamedQuery(name = "FrUsuario.findBySexo", query = "SELECT f FROM FrUsuario f WHERE f.sexo = :sexo"),
    @NamedQuery(name = "FrUsuario.findByFechaNacimiento", query = "SELECT f FROM FrUsuario f WHERE f.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "FrUsuario.findByDireccion", query = "SELECT f FROM FrUsuario f WHERE f.direccion = :direccion"),
    @NamedQuery(name = "FrUsuario.findByTelefono", query = "SELECT f FROM FrUsuario f WHERE f.telefono = :telefono"),
    @NamedQuery(name = "FrUsuario.findByCelular", query = "SELECT f FROM FrUsuario f WHERE f.celular = :celular"),
    @NamedQuery(name = "FrUsuario.findByEmail", query = "SELECT f FROM FrUsuario f WHERE f.email = :email"),
    @NamedQuery(name = "FrUsuario.findByUsuario", query = "SELECT f FROM FrUsuario f WHERE f.usuario = :usuario"),
    @NamedQuery(name = "FrUsuario.findByPassword", query = "SELECT f FROM FrUsuario f WHERE f.password = :password"),
    @NamedQuery(name = "FrUsuario.findByTipousuario", query = "SELECT f FROM FrUsuario f WHERE f.tipousuario = :tipousuario"),
    @NamedQuery(name = "FrUsuario.findByEsadministrador", query = "SELECT f FROM FrUsuario f WHERE f.esadministrador = :esadministrador"),
    @NamedQuery(name = "FrUsuario.findByUltimaConexion", query = "SELECT f FROM FrUsuario f WHERE f.ultimaConexion = :ultimaConexion"),
    @NamedQuery(name = "FrUsuario.findByUltimaGeoposicion", query = "SELECT f FROM FrUsuario f WHERE f.ultimaGeoposicion = :ultimaGeoposicion"),
    @NamedQuery(name = "FrUsuario.findByUltimaIp", query = "SELECT f FROM FrUsuario f WHERE f.ultimaIp = :ultimaIp"),
    @NamedQuery(name = "FrUsuario.findByUltimoSo", query = "SELECT f FROM FrUsuario f WHERE f.ultimoSo = :ultimoSo"),
    @NamedQuery(name = "FrUsuario.findByUltimoNavegador", query = "SELECT f FROM FrUsuario f WHERE f.ultimoNavegador = :ultimoNavegador"),
    @NamedQuery(name = "FrUsuario.findByUltimasesion", query = "SELECT f FROM FrUsuario f WHERE f.ultimasesion = :ultimasesion"),
    @NamedQuery(name = "FrUsuario.findByAccesoMultiple", query = "SELECT f FROM FrUsuario f WHERE f.accesoMultiple = :accesoMultiple"),
    @NamedQuery(name = "FrUsuario.findByCodigoreinicio", query = "SELECT f FROM FrUsuario f WHERE f.codigoreinicio = :codigoreinicio"),
    @NamedQuery(name = "FrUsuario.findByFechahorareinicio", query = "SELECT f FROM FrUsuario f WHERE f.fechahorareinicio = :fechahorareinicio"),
    @NamedQuery(name = "FrUsuario.findByFechacreacion", query = "SELECT f FROM FrUsuario f WHERE f.fechacreacion = :fechacreacion"),
    @NamedQuery(name = "FrUsuario.findByFkMunicipio", query = "SELECT f FROM FrUsuario f WHERE f.fkMunicipio = :fkMunicipio"),
    @NamedQuery(name = "FrUsuario.findByTipocontribuyente", query = "SELECT f FROM FrUsuario f WHERE f.tipocontribuyente = :tipocontribuyente"),
    @NamedQuery(name = "FrUsuario.findByEstado", query = "SELECT f FROM FrUsuario f WHERE f.estado = :estado"),
    @NamedQuery(name = "FrUsuario.findByImageUrl", query = "SELECT f FROM FrUsuario f WHERE f.imageUrl = :imageUrl"),
    @NamedQuery(name = "FrUsuario.findByProvider", query = "SELECT f FROM FrUsuario f WHERE f.provider = :provider"),
    @NamedQuery(name = "FrUsuario.findByProviderId", query = "SELECT f FROM FrUsuario f WHERE f.providerId = :providerId"),
    @NamedQuery(name = "FrUsuario.findByEmailVerified", query = "SELECT f FROM FrUsuario f WHERE f.emailVerified = :emailVerified")})
public class FrUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Long idUsuario;
    @Size(max = 50)
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Size(max = 100)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Size(max = 255)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 50)
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 255)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 100)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "celular")
    private String celular;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 100)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 255)
    @Column(name = "password")
    private String password;
    @Size(max = 2)
    @Column(name = "tipousuario")
    private String tipousuario;
    @Column(name = "esadministrador")
    private Boolean esadministrador;
    @Column(name = "ultima_conexion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaConexion;
    @Size(max = 255)
    @Column(name = "ultima_geoposicion")
    private String ultimaGeoposicion;
    @Size(max = 100)
    @Column(name = "ultima_ip")
    private String ultimaIp;
    @Size(max = 255)
    @Column(name = "ultimo_so")
    private String ultimoSo;
    @Size(max = 255)
    @Column(name = "ultimo_navegador")
    private String ultimoNavegador;
    @Size(max = 255)
    @Column(name = "ultimasesion")
    private String ultimasesion;
    @Column(name = "acceso_multiple")
    private Boolean accesoMultiple;
    @Size(max = 255)
    @Column(name = "codigoreinicio")
    private String codigoreinicio;
    @Column(name = "fechahorareinicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechahorareinicio;
    @Column(name = "fechacreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "fk_municipio")
    private Integer fkMunicipio;
    @Size(max = 4)
    @Column(name = "tipocontribuyente")
    private String tipocontribuyente;
    @Size(max = 4)
    @Column(name = "estado")
    private String estado;
    @Size(max = 255)
    @Column(name = "image_url")
    private String imageUrl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provider")
    private AuthProvider provider;
    @Size(max = 255)
    @Column(name = "provider_id")
    private String providerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "email_verified")
    private boolean emailVerified;
   

    public FrUsuario() {
    }

    public FrUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public FrUsuario(Long idUsuario, String name, String email, AuthProvider provider, boolean emailVerified, String nombreCompleto) {
        this.idUsuario = idUsuario;
        this.name = name;
        this.email = email;
        this.provider = provider;
        this.emailVerified = emailVerified;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public Boolean getEsadministrador() {
        return esadministrador;
    }

    public void setEsadministrador(Boolean esadministrador) {
        this.esadministrador = esadministrador;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public String getUltimaGeoposicion() {
        return ultimaGeoposicion;
    }

    public void setUltimaGeoposicion(String ultimaGeoposicion) {
        this.ultimaGeoposicion = ultimaGeoposicion;
    }

    public String getUltimaIp() {
        return ultimaIp;
    }

    public void setUltimaIp(String ultimaIp) {
        this.ultimaIp = ultimaIp;
    }

    public String getUltimoSo() {
        return ultimoSo;
    }

    public void setUltimoSo(String ultimoSo) {
        this.ultimoSo = ultimoSo;
    }

    public String getUltimoNavegador() {
        return ultimoNavegador;
    }

    public void setUltimoNavegador(String ultimoNavegador) {
        this.ultimoNavegador = ultimoNavegador;
    }

    public String getUltimasesion() {
        return ultimasesion;
    }

    public void setUltimasesion(String ultimasesion) {
        this.ultimasesion = ultimasesion;
    }

    public Boolean getAccesoMultiple() {
        return accesoMultiple;
    }

    public void setAccesoMultiple(Boolean accesoMultiple) {
        this.accesoMultiple = accesoMultiple;
    }

    public String getCodigoreinicio() {
        return codigoreinicio;
    }

    public void setCodigoreinicio(String codigoreinicio) {
        this.codigoreinicio = codigoreinicio;
    }

    public Date getFechahorareinicio() {
        return fechahorareinicio;
    }

    public void setFechahorareinicio(Date fechahorareinicio) {
        this.fechahorareinicio = fechahorareinicio;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Integer getFkMunicipio() {
        return fkMunicipio;
    }

    public void setFkMunicipio(Integer fkMunicipio) {
        this.fkMunicipio = fkMunicipio;
    }

    public String getTipocontribuyente() {
        return tipocontribuyente;
    }

    public void setTipocontribuyente(String tipocontribuyente) {
        this.tipocontribuyente = tipocontribuyente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public AuthProvider getProvider() {
        return provider;
    }

    public void setProvider(AuthProvider provider) {
        this.provider = provider;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FrUsuario)) {
            return false;
        }
        FrUsuario other = (FrUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adsi.rest.modelo.FrUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
