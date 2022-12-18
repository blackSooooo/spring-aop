package blacksooooo.aop

import org.junit.jupiter.api.Test

class ExampleServiceImplTest{

    @Test
    fun exampleTest() {
        val service = ExampleServiceImpl()
        service.start()
        service.process()
        service.end()
    }

}
