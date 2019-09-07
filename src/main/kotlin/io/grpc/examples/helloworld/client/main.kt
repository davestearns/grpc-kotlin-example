package io.grpc.examples.helloworld.client

import io.grpc.ManagedChannelBuilder
import io.grpc.examples.helloworld.GreeterGrpc
import io.grpc.examples.helloworld.HelloRequest

fun main() {
    println("client started")
    val channel = ManagedChannelBuilder.forAddress("localhost", 5000).usePlaintext().build()
    val stub = GreeterGrpc.newBlockingStub(channel)
    val req = HelloRequest.newBuilder().setName("Dave").build()

    println("sending requests")
    println("received response: '${stub.sayHello(req).message}'")
    println("received response: '${stub.sayHello(req).message}'")
    println("received response: '${stub.sayHello(req).message}'")
    println("received response: '${stub.sayHello(req).message}'")
    println("received response: '${stub.sayHello(req).message}'")
    println("received response: '${stub.sayHello(req).message}'")
    println("received response: '${stub.sayHello(req).message}'")
}
