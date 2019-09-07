package io.grpc.examples.helloworld.server

import io.grpc.ServerBuilder

fun main() {
    val server = ServerBuilder.forPort(5000).addService(GreeterService()).build()
    println("starting server...")
    val tmp = server.start()
    println("server started, listening on port ${tmp.port}")
    tmp.awaitTermination()
    println("server stopped")
}
