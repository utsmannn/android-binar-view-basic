package com.utsman.binarchap4

class Animals {
    var nama: String = ""
    val namaDefault = "kucing"

    init {
        // akan dijalankan ketika kelas nya di panggil

        nama = namaDefault
    }

    constructor(nama: String) {
        this.nama = nama
    }

    fun setNamaAnimal(nama: String) {
        this.nama = nama

    }

    companion object {
        val NAME_DEFAULT = "kucing"

        fun getNameOfAnimals() {

        }
    }

}