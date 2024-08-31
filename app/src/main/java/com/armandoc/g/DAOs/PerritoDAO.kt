package com.armandoc.g.DAOs
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.Gaplicacin.Entities.Perro

@Dao
interface perritoDAO {
impor
    @Insert
    fun insertperrito(nombre: Perrito)

    @Update
    fun updatePerrito(nombre: Perrito)

    @Delete
    fun deletePerrito(nombre: Perrito)

    @Query(" SELECT * FROM Perrito ")
    fun selectAllPerrito(): Flow<List<Perrito>>

    @Query(" SELECT * FROM perro WHERE id = :id ")
    fun selectPerrito(id: Int): Flow<Perrito>

}