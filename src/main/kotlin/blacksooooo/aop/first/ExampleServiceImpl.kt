package blacksooooo.aop.first

import blacksooooo.aop.ExampleService
import org.springframework.stereotype.Service
import org.springframework.util.StopWatch

@Service
class ExampleServiceImpl: ExampleService {
    override fun start() {
        val stopWatch = StopWatch()
        stopWatch.start()
        Thread.sleep(1000)
        println("start")
        stopWatch.stop()
        println(stopWatch.prettyPrint())
    }

    override fun process() {
        val stopWatch = StopWatch()
        stopWatch.start()
        Thread.sleep(1000)
        println("processing")
        stopWatch.stop()
        println(stopWatch.prettyPrint())
    }

    override fun end() {
        val stopWatch = StopWatch()
        stopWatch.start()
        Thread.sleep(1000)
        println("end")
        stopWatch.stop()
        println(stopWatch.prettyPrint())
    }
}