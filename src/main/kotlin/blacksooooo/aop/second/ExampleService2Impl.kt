package blacksooooo.aop.second

import blacksooooo.aop.ExampleService
import org.springframework.stereotype.Service

@Service
class ExampleService2Impl: ExampleService {
    override fun start() {
        Thread.sleep(1000)
        println("start")
    }

    override fun process() {
        Thread.sleep(1000)
        println("processing")
    }

    override fun end() {
        Thread.sleep(1000)
        println("end")
    }
}