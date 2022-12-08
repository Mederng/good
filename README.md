# good
스프링 부트와 AWS로 혼자 구현하는 웹 서비스

책을 따라가며 가장 신경쓰이는 문제는 버전 호환.
각종 애너테이션, 메서드 등이 어떤게 적절할지, 이것 말고 다른 책에서 봤던 최신 메서드를 써볼지 
테스트하고 고민하는 과정이다.


1. **[build.gradle]**
: **JDK 버전** 11 
: **Boot 버전** 2.7.6
: repositories만 **jcenter()** 추가했음


2. **[.ignore]**
: **.ignore 파일**은 인텔리제이 기본 제공인듯?
: idea와 gradle은 기본 이그노어 인듯



3. **assertThat vs assertTrue**
: 스프링의 정석에서 쓰는 assertTrue 보단, **assertThat**이 더 낫다.
: https://jongmin92.github.io/2020/03/31/Java/use-assertthat/
