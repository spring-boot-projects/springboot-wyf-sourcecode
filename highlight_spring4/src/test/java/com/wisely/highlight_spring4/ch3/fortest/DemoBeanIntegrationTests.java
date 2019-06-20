package com.wisely.highlight_spring4.ch3.fortest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //1 SpringJUnit4ClassRunner��Junit�������ṩSpring TestContext Framework�Ĺ���
@ContextConfiguration(classes = {TestConfig.class}) //2 @ContextConfiguration������������ApplicationContext,����classes������������ע����@Configuration��������
@ActiveProfiles("prod") //3 @ActiveProfiles�����������profile
public class DemoBeanIntegrationTests {

    @Autowired //4 ʹ��@Autowiredע��bean
    private TestBean testBean;

    @Test //5 ʹ��@Test����Ϊ�����еĲ��Է���
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }

}
