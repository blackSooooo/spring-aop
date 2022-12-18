package blacksooooo.aop.third

import blacksooooo.aop.ExampleService
import blacksooooo.aop.PerfLogging
import org.springframework.stereotype.Service

@Service
class ExampleService3Impl: ExampleService {
    @PerfLogging
    override fun start() {
        Thread.sleep(1000)
        println("start")
    }

    @PerfLogging
    override fun process() {
        Thread.sleep(1000)
        println("processing")
    }

    override fun end() {
        Thread.sleep(1000)
        println("end")
    }
}
