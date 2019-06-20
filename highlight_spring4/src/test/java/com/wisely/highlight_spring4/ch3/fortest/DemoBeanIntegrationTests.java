package com.wisely.highlight_spring4.ch3.fortest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //1 SpringJUnit4ClassRunner在Junit环境下提供Spring TestContext Framework的功能
@ContextConfiguration(classes = {TestConfig.class}) //2 @ContextConfiguration用来加载配置ApplicationContext,其中classes属性用来加载注解了@Configuration的配置类
@ActiveProfiles("prod") //3 @ActiveProfiles用来声明活动的profile
public class DemoBeanIntegrationTests {

    @Autowired //4 使用@Autowired注入bean
    private TestBean testBean;

    @Test //5 使用@Test声明为可运行的测试方法
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }

}
