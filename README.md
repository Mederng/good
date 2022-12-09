# good
스프링 부트와 AWS로 혼자 구현하는 웹 서비스

책을 따라가며 가장 신경쓰이는 문제는 버전 호환.
각종 애너테이션, 메서드 등이 어떤게 적절할지, 이것 말고 다른 책에서 봤던 최신 메서드를 써볼지 
테스트하고 고민하는 과정이다.


1. **[build.gradle]**   
: **JDK** 11    
: **boot** 2.6.8(머스테치 한글 깨짐 방지)   
: repositories만 **jcenter()** 추가했음   

<br>

2. **[.ignore]**   
: **.ignore 파일**은 인텔리제이 기본 제공인듯?   
: idea와 gradle은 기본 이그노어 인듯   

<br>


3. **assertThat vs assertTrue**   
: 스프링의 정석에서 쓰는 assertTrue 보단, **assertThat**이 더 낫다.   
 https://jongmin92.github.io/2020/03/31/Java/use-assertthat/   
 
 <br>
 
4. **p100 application.properties 설정 변경**     
spring.jpa.properties.hibernate.dialect=**org.hibernate.dialect.MySQL57Dialect**   
spring.jpa.properties.hibernate.dialect.storage_engine=**innodb**   
spring.datasource.hikari.jdbc-url=**jdbc:h2:mem:testdb;MODE=MYSQL**    
https://github.com/jojoldu/freelec-springboot2-webservice/issues/612

<br>   

5. **p.110 PostsApiControllerTests**   
: assertThat(responseEntity.getBody()).**isGreaterThan(0L)**;   
-> 둘의 차이는 뭘까? 아래가 인텔리제이 SonarLint에서 추천해주는 코드이긴한데..   
: assertThat(responseEntity.getBody()).**isPositive()**;   


<br>    

6. **변수 모두 final로 변경**      
 - p.112 **PostsResponseDTO**      
 - p.149 **PostsListResponseDTO**     
 - p.185 **OAuthAttributes**      


<br>    
   
   
7. 


