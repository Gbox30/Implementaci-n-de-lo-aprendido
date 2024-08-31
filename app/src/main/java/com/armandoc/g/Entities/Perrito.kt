package com.armandoc.g.Entities

class Perrito {
}
@Entity
data class Perrito (

    @PrimaryKey
    var perrito: Perrito : Int?,

    @ColumnInfo(name = "nombre")
    var raza : String,

    @ColumnInfo(name = "raza")
    var raza : String,

    @ColumnInfo(name = "edad")
    var edad : String,

    @ColumnInfo(name = "sexo")
var sexo : String,