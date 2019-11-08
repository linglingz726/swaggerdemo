package com.offcn.swaggerdemo.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //1、声明api 文档的属性 构建器
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("运动番").description("主要人物泽村荣纯，小鸟游天，越前龙马").termsOfServiceUrl("http://ujiuye.com/").contact("这个方法过时了横线代表，方法为内容")
                .version("0.0.1").build();
    }
    //配置核心配置信息
    public Docket creatRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.offcn.swaggerdemo.controller"))
                .paths(PathSelectors.any()).build();
    }
}
