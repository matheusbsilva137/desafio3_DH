package com.digitalhouse.desafio3_dh.entities

data class Res(val data: Data)

data class Data(val offset: Int, var results: ArrayList<Comic>)