db.getCollection("alumnos").find({})

db.alumnos.findOne({ "_id": ObjectId("65ef7031466e8f880d12eddc") })

db.libros.findOne({ "_id": ObjectId("65f0c7b5ed2412af979fd1c5") })

db.prestamos.aggregate([
    {
        $match: { "_id": ObjectId("66020009dfa0a618ca090ade") } // Filtro por el ID del préstamo si lo necesitas
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
        $unwind: "$alumno" // Deshacer el array resultante del lookup para obtener un solo objeto
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
        $unwind: "$libro" // Deshacer el array resultante del lookup para obtener un solo objeto
    }
]);

use biblioteca

db.alumnos.insertOne({
    "noCtrl": "21ISC008",
    "nombre": "Brisa Guadalupe Netro Ramon",
    "semestre": "Octavo",
    "carrera": "Ingenieria en Sistemas Computacionales"
})


db.prestamos.insertOne({
    alumno_id: ObjectId("65ef7031466e8f880d12eddc"),
    libro_id: ObjectId("65f246894da3da1d36c5add1"),
    fecha_prestamo: new Date(),
    fecha_devolucion: null
})

// db.prestamos.deleteOne({ _id: ObjectId("660203a180de9a8aae957be1") })


