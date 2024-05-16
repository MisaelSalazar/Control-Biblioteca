db.getCollection("alumnos").find({})

db.alumnos.findOne({ "_id": ObjectId("65ef7031466e8f880d12eddc") })

db.libros.findOne({ "_id": ObjectId("65f0c7b5ed2412af979fd1c5") })

db.prestamos.aggregate([
    {
        $match: { "_id": ObjectId("660203364526321402830251") } // Filtro por el ID del préstamo
    },
    {
        $lookup: {
            from: "alumnos", // Colección de alumnos
            localField: "alumno_id",
            foreignField: "_id",
            as: "alumno"
        }
    },
    {
        $unwind: "$alumno"
    },
    {
        $lookup: {
            from: "libros", // Colección de libros
            localField: "libro_id",
            foreignField: "_id",
            as: "libro"
        }
    },
    {
        $unwind: "$libro"
    }
]);

use biblioteca

db.alumnos.insertOne({
    "noCtrl": "20ISC008",
    "nombre": "Jose Antonio",
    "apellidos": "Patino Galicia",
    "semestre": "Octavo",
    "carrera": "Ingenieria en Sistemas Computacionales"
})

db.prestamos.insertOne({
    alumno_id: ObjectId(" id del alumno "),
    libro_id: ObjectId(" id del libro"),
    fecha_prestamo: new Date(),
    fecha_devolucion: null
})

// db.prestamos.deleteOne({ _id: ObjectId("660203a180de9a8aae957be1") })

db.prestamos.aggregate([
    {
        $match: { "alumno_id": ObjectId("65ef7031466e8f880d12eddc") } // 
    },
    {
        $lookup: {
            from: "alumnos", // Colección de alumnos
            localField: "alumno_id",
            foreignField: "_id",
            as: "alumno"
        }
    },
    {
        $unwind: "$alumno"
    },
    {
        $lookup: {
            from: "libros", // Colección de libros
            localField: "libro_id",
            foreignField: "_id",
            as: "libro"
        }
    },
    {
        $unwind: "$libro" 
    }
]);

// Vista de detalles de prestamos
db.createView(
  "prestamosDetalles",
  "prestamos",
  [
    {
      $lookup: {
        from: "alumnos",
        localField: "alumno_id",
        foreignField: "_id",
        as: "alumno"
      }
    },
    {
      $unwind: "$alumno"
    },
    {
      $lookup: {
        from: "libros",
        localField: "libro_id",
        foreignField: "_id",
        as: "libro"
      }
    },
    {
      $unwind: "$libro"
    }
  ]
);

