package blacksooooo.aop

import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.ProceedingJoinPoint
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch

@Component
@Aspect
class PerfAspect {

    @Around(value = "execution(* blacksooooo.aop.second.ExampleService2Impl.*(..))")
    fun logPerf(pjp: ProceedingJoinPoint): Any? {
        val stopWatch = StopWatch()
        stopWatch.start()
        val ret = pjp.proceed()
        stopWatch.stop()
        println(stopWatch.prettyPrint())
        return ret
    }
}