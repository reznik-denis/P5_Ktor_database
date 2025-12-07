package com.example

import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.Database

fun Application.configureDatabases() {
  Database.connect(
          url = "jdbc:postgresql://localhost:5432/ktor_tutorial_db",
          driver = "org.postgresql.Driver",
          user = "postgres",
          password = "10988ltybc"
  )
}
