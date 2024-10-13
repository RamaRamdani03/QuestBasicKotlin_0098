package com.example.noactivity

import android.provider.ContactsContract.Data


// Data class
// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString().
// Data class juga menyediakan fngsi copy() untuk membuat salinan objek dengan beberapa perubahan.


data class DataClass(
    val id: Int,
    var email: String
)