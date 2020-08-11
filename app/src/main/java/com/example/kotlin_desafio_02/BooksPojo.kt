package com.example.kotlin_desafio_02

data class Books (val nombre:String, var isbn:Int, val añopublicación:Int, var editorial:String, var cantidadPáginas:Int,
                  var precio:Int, var autorLibro:String, var tipoLibro:String ){

    fun precioFormateado():String{
return "\$${this.precio}"
            }


        }


