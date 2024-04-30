package control.biblioteca.model;

import org.bson.types.ObjectId;

public class Alumno {

    private ObjectId id;
    private String numControl;
    private String nombre;
    private String apellidos;
    private String carrera;
    private String semestre;

    public Alumno(ObjectId id, String noCtrl, String nombre, String apellidos, String carrera, String semestre) {
        this.id = id;
        this.numControl = noCtrl;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

}
