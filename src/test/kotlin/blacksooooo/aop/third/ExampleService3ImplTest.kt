package blacksooooo.aop.third

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ExampleService3ImplTest {
    @Autowired
    val service = ExampleService3Impl()

    @Test
    fun exampleAopTest() {
        service.start()
        service.process()
        service.end()
    }
}