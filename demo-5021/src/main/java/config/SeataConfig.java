package config;


import org.springframework.context.annotation.Configuration;


@Configuration
public class SeataConfig {

//    @Bean
//    public AspectTransactionalInterceptor aspectTransactionalInterceptor() {
//        return new AspectTransactionalInterceptor();
//    }
//

    //TODO 使用这种方式报错切点表达式为0的位置少一个“（”
//    @Bean
//    public Advisor txAdviceAdvisor(AspectTransactionalInterceptor aspectTransactionalInterceptor) {
//        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
//        pointcut.setExpression("配置切点表达式");
//        return new DefaultPointcutAdvisor(pointcut, aspectTransactionalInterceptor);
//    }
}
