package io.grpc.examples.helloworld.client

import io.grpc.ManagedChannelBuilder
import io.grpc.examples.helloworld.GreeterGrpc
import io.grpc.examples.helloworld.HelloRequest

fun main() {
    println("client started")
    val channel = ManagedChannelBuilder.forAddress("localhost", 5000).usePlaintext().build()
    val stub = GreeterGrpc.newBlockingStub(channel)

    println("sending requests")
    for (i in 0..99) {
        val req = HelloRequest.newBuilder().setFirstName("Dave").setLastName(("$i")).build()
        println("received response: '${stub.sayHello(req).message}'")
    }
}
