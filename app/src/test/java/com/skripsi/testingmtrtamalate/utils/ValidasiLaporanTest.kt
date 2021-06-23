package com.skripsi.testingmtrtamalate.utils

//import org.junit.Assert.*
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidasiLaporanTest{
    // Before
    val validasi = ValidasiLaporan
    // code test validasi data laporan
    @Test
    fun whenDataIsValid(){
        val idMasyarakat = 10
        val kelurahan = "Mangasa"
        val idArea = 1
        val data_laporan = validasi.validasiDataLaporan(idMasyarakat,kelurahan,idArea)
        assertThat(data_laporan).isEqualTo(true)
    }

    // code test validasi Photo
    @Test
    fun whenPhotoIsReady(){
        val img_url = "https://mtrTamalate.id/laporan/photos/img_0097.jpg"
        val fun_photo = validasi.validasiPhoto(img_url)
        assertThat(fun_photo).isEqualTo(true)
    }

    // code test validasi koordinat
    @Test
    fun whenKoordinatIsReady(){

        val latitude = "-5.170858"
        val longitude = "119.430527"

        val fun_koordinat = validasi.validasiKoordinat(latitude, longitude)
        assertThat(fun_koordinat).isEqualTo(true)

    }




}