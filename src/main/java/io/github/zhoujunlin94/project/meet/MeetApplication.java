package io.github.zhoujunlin94.project.meet;

import io.github.zhoujunlin94.meet.tk_mybatis.MeetTKMybatisAutoConfiguration;
import org.redisson.spring.starter.RedissonAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhoujunlin
 * @date 2024-11-13-14:49
 */
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication(exclude = {
        /*不要redis自动注入  后续使用redis功能需要删除这两行*/
        RedisAutoConfiguration.class,
        RedissonAutoConfiguration.class,
        MeetTKMybatisAutoConfiguration.class
})
public class MeetApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetApplication.class, args);
    }

}
