package blacksooooo.aop.second

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class ExampleService2ImplTest {

    @Autowired
    val service = ExampleService2Impl()

    @Test
    fun exampleAopTest() {
        service.start()
        service.process()
        service.end()
    }
}