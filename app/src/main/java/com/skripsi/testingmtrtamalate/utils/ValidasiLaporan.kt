package com.skripsi.testingmtrtamalate.utils

object ValidasiLaporan {

    fun validasiPhoto(img_url: String): Boolean {
        // code
        return !img_url.isEmpty()
    }

    // check ready koordinat
    fun validasiKoordinat(latitude: String, longitude: String): Boolean {
        // code
        return !(latitude.isEmpty() || longitude.isEmpty())
    }

    // check ready all
    fun validasiDataLaporan(idMasyarakat: Int, kelurahan: String, idArea: Int) {
        // code
//        return !(idMasyarakat <= 0 || kelurahan.isEmpty() || idArea <= 0)
    }

}