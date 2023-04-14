package co.edu.uniquindio.proyecto.dto;

import co.edu.uniquindio.proyecto.model.Categoria;
<<<<<<< HEAD
<<<<<<< HEAD
import co.edu.uniquindio.proyecto.model.Imagen;
=======
=======
import co.edu.uniquindio.proyecto.model.Estado;
>>>>>>> 6073593cd537f092187fa2b6f6e7dd66327fe2c2
import jakarta.persistence.Column;
>>>>>>> ramaSebastian
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;
//Está hecho para guardar i
@AllArgsConstructor
@Getter
@Setter
public class ProductoDTO {

    @NotNull
    @NotBlank
    @Length(max = 100)
    @Column (nullable = false)
    private String nombre;
    @NotNull
    @Length(min=1,max = 300,message = "La descripción debe tener máximo 300 caracteres.")
    private String descripcion;

    @Column(nullable = false)
    @Positive
    private int unidades;

    @Positive
    @Column(nullable = false)
    private double precio;
    private int codigoVendedor;

    //Cómo parametrizo una lista ?
<<<<<<< HEAD
    private List<Imagen> imagenes;
    public List<Categoria> categorias;
=======
    private List<String> imagenes;
    private List<Categoria> categorias;

    private Estado estado;


>>>>>>> 6073593cd537f092187fa2b6f6e7dd66327fe2c2

}
