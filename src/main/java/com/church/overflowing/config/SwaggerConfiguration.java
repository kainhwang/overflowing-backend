package com.church.overflowing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

  @Bean
  public Docket commonApi() {
	  
	  return new Docket(DocumentationType.SWAGGER_2)
			  .select()
			  .apis(RequestHandlerSelectors.any())
			  .paths(PathSelectors.any())
			  .build();
//    return new Docket(DocumentationType.SWAGGER_2)
//        .groupName("_COMMON")
//        .select()
//        .apis(RequestHandlerSelectors.basePackage("com.overflowing.church.controller"))
//        .paths(PathSelectors.any())
//        .build()
//        .useDefaultResponseMessages(false)
//        .globalResponseMessage(RequestMethod.GET, newArrayList())
//        .globalResponseMessage(RequestMethod.POST, newArrayList())
//        .globalResponseMessage(RequestMethod.PUT, newArrayList())
//        .globalResponseMessage(RequestMethod.DELETE, newArrayList())
//        .securitySchemes(newArrayList(apiKey()))
//        .securityContexts(Arrays.asList(securityContext()))
//        .apiInfo(apiInfo());
  }
//  private ApiInfo apiInfo() {
//    return new ApiInfoBuilder()
//        .title("CORUJA API")
//        .version("v1")
//        .build();
//  }
//
//  private ApiKey apiKey() {
//    return new ApiKey("X-Auth-Token", "X-Auth-Token", "header");
//  }
//
//  private SecurityContext securityContext() {
//    return SecurityContext.builder().securityReferences(defaultAuth())
//        .forPaths(PathSelectors.any()).build();
//  }
//
//  private List<SecurityReference> defaultAuth() {
//    AuthorizationScope authorizationScope = new AuthorizationScope(
//        "global", "accessEverything");
//    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//    authorizationScopes[0] = authorizationScope;
//    return Arrays.asList(new SecurityReference("X-Auth-Token",
//        authorizationScopes));
//  }
//
//  @Bean
//  public SecurityConfiguration security() {
//    return SecurityConfigurationBuilder.builder().scopeSeparator(",")
//        .additionalQueryStringParams(null)
//        .useBasicAuthenticationWithAccessCodeGrant(false).build();
//  }
//
//  @Bean
//  UiConfiguration uiConfig() {
//    return UiConfigurationBuilder.builder()
//        .deepLinking(true)
//        .displayOperationId(false)
//        .defaultModelsExpandDepth(1)
//        .defaultModelExpandDepth(1)
//        .defaultModelRendering(ModelRendering.EXAMPLE)
//        .displayRequestDuration(false)
//        .docExpansion(DocExpansion.NONE)
//        .filter(false)
//        .maxDisplayedTags(null)
//        .operationsSorter(OperationsSorter.ALPHA)
//        .showExtensions(false)
//        .tagsSorter(TagsSorter.ALPHA)
//        .validatorUrl(StringUtils.EMPTY)
//        .build();
//  }

}