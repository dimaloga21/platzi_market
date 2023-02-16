package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto {

    @Id //Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Valor autogenerado. IDENTITY se usa porque la columna es la que le da identidad
    @Column(name= "id_producto") //Nombre de columna en la tabla diferente a nombre en la entity
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne //Anotacion para manejar la relacion muchos a uno existente entre tablas Producto y Categoria
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) //Atributo que las relaciona
    private Categoria categoria;

    public java.lang.Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(java.lang.Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public java.lang.Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(java.lang.Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
