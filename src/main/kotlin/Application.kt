package com.example

import com.example.model.PostgresTaskRepository
import io.ktor.server.application.*

fun main(args: Array<String>) {
  io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
  configureDatabases()
  val repository = PostgresTaskRepository()

  configureSerialization(repository)
  configureRouting()
}
